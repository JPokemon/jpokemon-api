package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;

/**
 * Provides a possible evolution type for evolution stone usage
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class StoneEvolution implements Evolution {
	/** Indicates the stone type applicable to this evolution */
	protected String type;

	/** Indicates the species the Pokémon will evolve into. */
	protected String species;

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