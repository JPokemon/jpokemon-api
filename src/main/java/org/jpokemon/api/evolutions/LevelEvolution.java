package org.jpokemon.api.evolutions;

import org.jpokemon.api.Manager;

/**
 * Defines an evolution that occurs at a certain level.
 */
public class LevelEvolution implements Evolution {
	/**
	 * Indicates the manager being used to register level evolutions. May be
	 * ``null``.
	 */
	public static Manager<StoneEvolution> manager;

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
