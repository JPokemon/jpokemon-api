package org.jpokemon.pmapi.util;

/**
 * Defines the available experience curves for a Pokémon. For justification, 
 * see the entry in [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience#Relation_to_level).
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public enum ExperienceCurve {
	
	/** Indicates the Pokémon has an `Erratic` experience curve. */
	ERRATIC("Erratic"),

	/** Indicates the Pokémon has a `Fast` experience curve. */
	FAST("Fast"),

	/** Indicates the Pokémon has a `Medium Fast` experience curve. */
	MEDIUM_FAST("Medium Fast"),

	/** Indicates the Pokémon has a `Medium Slow` experience curve. */
	MEDIUM_SLOW("Medium Slow"),

	/** Indicates the Pokémon has a `Slow` experience curve. */
	SLOW("Slow"),

	/** Indicates the Pokémon has a `Fluctuating` experience curve. */
	FLUCTUATING("Fluctuating");

	private final String name;

	private ExperienceCurve(String name) {
		this.name = name;
	}

	/**
	 * Returns a String representation of the enum.
	 * 
	 * @return The name of the enum as a String.
	 */
	@Override
	public String toString() {
		return name;
	}
}