package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;

/**
 * Provides a possible evolution type for happiness
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class HappinessEvolution implements Evolution {
	/** Indicates the happiness rating at which the Pokémon evolves */
	protected int happiness;

	/** Indicates the species the Pokémon will evolve into. */
	protected String species;

	/** Gets the happiness rating the Pokémon evolves at */
	public int getHappiness() {
		return happiness;
	}

	/** Sets the happiness rating the Pokémon evolves at */
	public HappinessEvolution setHappiness(int happiness) {
		this.happiness = happiness;
		return this;
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public void setSpecies(String species) {
		this.species = species;
	}
}