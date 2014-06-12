package org.jpokemon.api;

/**
 * Defines a unit which can be processed by a {@link BattleEngine}, and may be
 * attached to several Battle wrapper classes.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface BattleEffect {
	/**
	 * Gets the priority of this battle effect, for ordering by a
	 * {@link BattleEngine}
	 */
	public abstract int getPriority();

	/** Applies the effect to the Battle */
	public abstract void affect(Battle battle);

	/**
	 * Applies the effect to a battle effect, which is of lower priority than this
	 * battle effect. Facilitates modification of other BattleEffects.
	 */
	public abstract void affect(BattleEffect battleEffect);
}
