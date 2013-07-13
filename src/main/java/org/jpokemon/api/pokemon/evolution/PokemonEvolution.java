package org.jpokemon.api.pokemon.evolution;

import org.jpokemon.api.pokemon.PokemonSpecies;

/**
 * Defines an abstract evolution class.
 */
public abstract class PokemonEvolution {
	/** Indicates the species the Pokémon will evolve into. */
	protected PokemonSpecies species;
	
	/** Gets the species the Pokémon will evolve into. */
	public PokemonSpecies getSpecies() {
		return this.species;
	}

	/** Sets the species the Pokémon will evolve into. */
	public void setSpecies(PokemonSpecies species) {
		this.species = species;
	}
}