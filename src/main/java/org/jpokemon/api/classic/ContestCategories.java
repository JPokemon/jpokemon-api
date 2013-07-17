package org.jpokemon.api.classic;

/**
 * Defines the different categories of moves for the "Pokémon Contests" that 
 * appear in some of the original games.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public enum ContestCategories {

	/** Indicates that the move is in the "Beauty" category. */
	BEAUTY("Beauty"),

	/** Indicates that the move is in the "Cool" category. */
	COOL("Cool"),

	/** Indicates that the move is in the "Cute" category. */
	CUTE("Cute"),

	/** Indicates that the move is in the "Smart" category. */
	SMART("Smart"),

	/** Indicates that the move is in the "Tough" category. */
	TOUGH("Tough");

	private final String name;

	private ContestCategories(String name) {
		this.name = name;
	}

	/** Gets the name of this contest category. */
	public String getName() {
		return name;
	}
}
