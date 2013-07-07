package org.jpokemon.pmapi.pokemon;

/**
 * Defines a particular instance of a Pokémon.
 *
 * STUBBED.
 *
 * @author atheriel@gmail.com
 *
 * @since 0.1
 */
public class Pokemon {
	/** Indicates the name of this Pokémon. */
	protected String name;

	/** Indicates the species of this Pokémon. */
	protected PokemonSpecies species;

	/** Provides the default constructor. */
	public Pokemon() {
	}

	/** Gets the name of this Pokémon. */
	public String getName() {
		return name;
	}

	/** Sets the name of this Pokémon. */
	public void setName(String name) {
		this.name = name;
	}
}
