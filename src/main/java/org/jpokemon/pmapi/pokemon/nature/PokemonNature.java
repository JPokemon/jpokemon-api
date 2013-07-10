package org.jpokemon.pmapi.pokemon.nature;

import org.jpokemon.pmapi.util.Taste;

/**
 * Defines a nature (personality) for a Pokémon. The 25 classic natures are
 * instantiated in the {@link ClassicNatures} class.
 * 
 * To define your own nature, construct an instance of this class. If you want
 * to add attributes to the nature, it can also be extended.
 * 
 * @author Atheriel
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class PokemonNature {
	protected String name, increasedStat, decreasedStat;
	protected Taste favorite, disliked;

	/** Provides the default constructor. */
	public PokemonNature() {
	}

	/** Gets the name of this nature. */
	public String getName() {
		return name;
	}

	/** Sets the name of this nature. */
	public PokemonNature setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the stat increased by this nature. */
	public String getStatIncreased() {
		return increasedStat;
	}

	/** Sets the stat increased by this nature. */
	public PokemonNature setStatIncreased(String stat) {
		this.increasedStat = stat;
		return this;
	}

	/** Gets the stat decreased by this nature. */
	public String getStatDecreased() {
		return decreasedStat;
	}

	/** Sets the stat decreased by this nature. */
	public PokemonNature setStatDecreased(String stat) {
		this.decreasedStat = stat;
		return this;
	}

	/** Gets the taste preference of this nature. */
	public Taste getTasteFavorite() {
		return favorite;
	}

	/** Sets the favorite taste of this nature. */
	public PokemonNature setTasteFavorite(Taste taste) {
		this.favorite = taste;
		return this;
	}

	/** Gets the disliked taste of this nature. */
	public Taste getTasteDisliked() {
		return disliked;
	}

	/** Sets the disliked taste of this nature. */
	public PokemonNature setTasteDisliked(Taste taste) {
		this.disliked = taste;
		return this;
	}

	/**
	 * Gets the stat modifier for a given stat as a float.
	 * 
	 * @deprecated Use {@link #getStatIncreased} or
	 * 	       {@link #getStatDecreased} instead.
	 */
	public float getStatModifier(String stat) {
		if (increasedStat.equals(stat)) {
			return 1.1f;
		}
		else if (decreasedStat.equals(stat)) {
			return 0.9f;
		}
		return 1.0f;
	}
}
