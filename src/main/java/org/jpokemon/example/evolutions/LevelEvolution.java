package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;

/**
 * Provides a possible evolution type for level-up
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class LevelEvolution implements Evolution {
	/** Indicates the level at which the Pokémon evolves */
	protected int level;

	/** Indicates the species the Pokémon will evolve into. */
	protected String species;

	/** Gets the level the Pokémon will evolve at. */
	public int getLevel() {
		return this.level;
	}

	/** Sets the level the Pokémon will evolve at. */
	public LevelEvolution setLevel(int level) {
		this.level = level;
		return this;
	}

	@Override
	public String getSpecies() {
		return this.species;
	}

	@Override
	public void setSpecies(String species) {
		this.species = species;
	}
}