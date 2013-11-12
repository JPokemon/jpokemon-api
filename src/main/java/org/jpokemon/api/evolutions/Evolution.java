package org.jpokemon.api.evolutions;

/**
 * Defines an abstract evolution class.
 */
public interface Evolution {
	/** Gets the species the Pokémon will evolve into. */
	public String getSpecies();

	/** Sets the species the Pokémon will evolve into. */
	public void setSpecies(String species);
}
