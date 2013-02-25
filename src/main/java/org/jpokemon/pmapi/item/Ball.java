package org.jpokemon.pmapi.item;

/**
 * Provides an interface for ball items that catch Pokémon.
 */
public interface Ball extends Item {

	/** Gets the modifier for this ball's catch rate. */
	public abstract float getCatchRateModifier();

	/** Sets the modifier for this ball's catch rate. */
	public abstract void setCatchRateModifier(float catchRateModifier);
}