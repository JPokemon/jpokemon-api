package org.jpokemon.api.evolutions;

import org.jpokemon.api.Manager;

public class StoneEvolution implements Evolution {
	/**
	 * Indicates the manager being used to register level evolutions. May be
	 * ``null``.
	 */
	public static Manager<LevelEvolution> manager;

	/** Indicates the stone type applicable to this evolution */
	private String type;

	/** Indicates the species the Pokémon will evolve into. */
	private String species;

	/** Getter for the stone type of this evolution */
	public String getType() {
		return this.type;
	}

	/** Setter for the stone type of this evolution */
	public StoneEvolution setType(String type) {
		this.type = type;
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
