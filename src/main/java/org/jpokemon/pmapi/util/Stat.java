package org.jpokemon.pmapi.util;

/**
 * Defines the available stats for a Pokémon.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public enum Stat {
	
	/** Indicates the `HP` stat of a Pokémon. */
	HIT_POINTS,
	
	/** Indicates the `Attack` stat of a Pokémon. */
	ATTACK,

	/** Indicates the `Defense` stat of a Pokémon. */
	DEFENSE,

	/** Indicates the `Special Attack` stat of a Pokémon. */
	SPECIAL_ATTACK,

	/** Indicates the `Special Defense` stat of a Pokémon. */
	SPECIAL_DEFENSE,
	
	/** Indicates the `Speed` stat of a Pokémon.a` */
	SPEED,

	/** Indicates attributes specfic to no particular stat. */
	NONE;
}