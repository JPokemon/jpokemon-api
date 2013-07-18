package org.jpokemon.api.evolutions;

import org.jpokemon.api.Species;

/**
 * Defines an abstract evolution class.
 */
public abstract class PokemonEvolution {
	/** Indicates the species the Pokémon will evolve into. */
	protected Species species;
	
	/** Gets the species the Pokémon will evolve into. */
	public Species getSpecies() {
		return this.species;
	}

	/** Sets the species the Pokémon will evolve into. */
	public void setSpecies(Species species) {
		this.species = species;
	}
}
