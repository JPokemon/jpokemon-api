package org.jpokemon.pmapi.item;

/**
 * Defines a while-holding effect for an item.
 */
public abstract class HoldEffect {
	private EffectiveItem owner;

	/** Attaches this effect to a particular item. */
	public void attachTo(EffectiveItem owner) {
		this.owner = owner;
	}

	/** Gets the item this effect is attached to. */
	public EffectiveItem getOwner() {
		return owner;
	}
}