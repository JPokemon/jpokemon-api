package org.jpokemon.api.evolutions;


public class HappinessEvolution implements Evolution {
	/** Indicates the hapiness rating at which the Pokémon evolves */
	private int happiness;

	/** Indicates the species the Pokémon will evolve into. */
	private String species;

	/** Gets the happiness rating the Pokémon evolves at */
	public int getHappiness() {
		return happiness;
	}

	/** Sets the happiness rating the Pokémon evolves at */
	public HappinessEvolution setHappiness(int happiness) {
		this.happiness = happiness;
		return this;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
}
