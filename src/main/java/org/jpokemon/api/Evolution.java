package org.jpokemon.api;

/**
 * Defines an abstract evolution class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface Evolution {
	/** Gets the species the Pokémon will evolve into. */
	public abstract String getSpecies();

	/** Sets the species the Pokémon will evolve into. */
	public abstract void setSpecies(String species);
}