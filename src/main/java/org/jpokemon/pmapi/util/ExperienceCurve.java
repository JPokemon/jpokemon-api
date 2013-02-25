package org.jpokemon.pmapi.util;

/**
 * Defines the available experience curves for a Pokémon. For justification, 
 * see the entry in [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience#Relation_to_level).
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
	 * Gets the amount of experience required by this curve for a given level.
	 *
	 * For `ERRATIC` curves, this is
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/b/ba/Expcalc_erratic.png">
	 *
	 * For `FAST` curves,
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/0/0e/Expcalc_fast.png">
	 *
	 * For `MEDIUM_FAST` curves,
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/0/01/Expcalc_mfast.png">
	 *
	 * For `MEDIUM_SLOW` curves,
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/8/89/Expcalc_mslow.png">
	 *
	 * For `SLOW` curves,
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/4/48/Expcalc_slow.png">
	 *
	 * And finally for `FLUCTUATING` curves,
	 *
	 * <img src="http://cdn.bulbagarden.net/upload/8/88/Expcalc_fluctuating.png">
	 *
	 * Where `n` is the level.
	 * 
	 */
	public int getExperienceAt(int level) {
		switch(this) {
			case FAST:
				return 4 * (level ^ 3) / 5;
			case MEDIUM_FAST:
				return level ^ 3;
			case MEDIUM_SLOW:
				return 6 * (level ^ 3) / 5 - 15 * (level ^ 2) + 100 * level - 140;
			case SLOW:
				return 5 * (level ^ 3) / 4;
			default:
				return 0;
		}
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