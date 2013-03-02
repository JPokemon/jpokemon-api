package org.jpokemon.pmapi.util;

/**
 * Defines the taste preferences a Pokémon may possess. This class functions 
 * very much like an enum. Note that this class cannot be extended, because 
 * it is relied on by the Nature-related classes.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public final class Taste {
	/** Provides the neutral taste preference. */
	public static final Taste NONE = new Taste("No particular");

	/** Provides the taste for spicy foods. */
	public static final Taste SPICY = new Taste("Spicy");

	/** Provides the taste for sour foods. */
	public static final Taste SOUR = new Taste("Sour");

	/** Provides the taste for dry foods. */
	public static final Taste DRY = new Taste("Dry");

	/** Provides the taste for bitter foods. */
	public static final Taste BITTER = new Taste("Bitter");

	/** Provides the taste for sweet foods. */
	public static final Taste SWEET = new Taste("Sweet");

	private final String name;

	private Taste(String name) {
		this.name = name;
	}

	/** Gets the name of this taste. */
	public String getName() {
		return name;
	}
}