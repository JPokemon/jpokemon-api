package org.jpokemon.pmapi.item;

import java.util.HashMap;

/**
 * Defines an item that can have on-use and on-hold style effects as defined by
 * {@link UseEffect} and {@link HeldEffect}. This class effectively provides 
 * one possible approach to handling items with complex effects; there is no 
 * reason why another approach (such as the traditional inheritance scheme) 
 * might not fit your own project better.
 *
 * In addition, items can have an unlimited number of `attribute` properties, 
 * which do not have executable patterns. So a `Berry` item might have an `id` 
 * attribute, a `flavour` attribute, and so on. This would also be an easy way
 * to indicate what pocket an item belongs in. For example:
 *
 * >     EffectiveItem cherriBerry = new EffectiveItem();
 * >     cherryBerry.addAttribute(new IdentityAttribute(1));
 * >     cherryBerry.addAttribute(new FlavorAttribute(10, 0, 0, 0, 0));
 * >     cherryBerry.addAttribute(new PocketAttribute("Berries"));
 * 
 * This approach functions similarly to an entity-component system. Classic 
 * effects are found in the `effect` sub-package.
 *
 * To add other effects to items, one could simply extend this class.
 *
 * One final note: there are no removal methods for this class, because I don't
 * anticipate ever having to change an item's use or hold effects at runtime.
 *
 * @author Atheriel
 * 
 * @since alpha
 */
public class EffectiveItem extends Item {
	private HashMap<Class<? extends UseEffect>, UseEffect> useEffects;
	private HashMap<Class<? extends HoldEffect>, HoldEffect> holdEffects;

	/** Provides the default constructor. */
	public EffectiveItem() {
		super();
		useEffects = new HashMap<Class<? extends UseEffect>, UseEffect>();
		holdEffects = new HashMap<Class<? extends HoldEffect>, HoldEffect>();
	}

	/**
	 * Adds a {@link UseEffect} to this item. Also sets the item as `usable`.
	 * 
	 * @param  useEffectClass The class of the effect (use MyEffect.class).
	 * 
	 * @return                A new instance of the effect if it has not 
	 *                        already got one, and the known instance if it 
	 *                        does.
	 */
	public <T extends UseEffect> T addUseEffect(Class<T> useEffectClass) {
		this.usable = true;
		synchronized(useEffects) {
			T useEffect = (T) useEffects.get(useEffectClass);			
			
			// Return the known effect if the item already has one.
			if (useEffect != null) {
				return useEffect;
			}

			// Try to create a new instance of the effect.
			try {
				useEffect = (T) useEffectClass.newInstance();
			} catch(Exception e) {
				e.printStackTrace();
			}

			// If the instantiation is successful, add it to the item.
			if (useEffect != null) {
				useEffect.attachTo(this);
				useEffects.put(useEffectClass,useEffect);				
			}

			return useEffect;
		}
	}

	/**
	 * Adds a {@link HoldEffect} to this item. Also sets the item both as 
	 * `holdable` and having a `holdEffect`.
	 * 
	 * @param  holdEffectClass The class of the effect (use MyEffect.class).
	 * 
	 * @return                 A new instance of the effect if it has not 
	 *                         already got one, and the known instance if it 
	 *                         does.
	 */
	public <T extends HoldEffect> T addHoldEffect(Class<T> holdEffectClass) {
		this.holdable = true;
		this.holdEffect = true;
		synchronized(holdEffects) {
			T holdEffect = (T) holdEffects.get(holdEffectClass);			
			
			// Return the known effect if the item already has one.
			if (holdEffect != null) {
				return holdEffect;
			}

			// Try to create a new instance of the effect.
			try {
				holdEffect = (T) holdEffectClass.newInstance();
			} catch(Exception e) {
				e.printStackTrace();
			}

			// If the instantiation is successful, add it to the item.
			if (holdEffect != null) {
				holdEffect.attachTo(this);
				holdEffects.put(holdEffectClass,holdEffect);				
			}

			return holdEffect;
		}
	}
}