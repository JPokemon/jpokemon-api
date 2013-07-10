package org.jpokemon.pmapi.pokemon.nature;

/**
 * Defines a nature (personality) for a Pokémon. The 25 classic natures are
 * instantiated in the {@link ClassicNatures} class.
 * 
 * To define your own nature, construct instances of this class. If you want to
 * add attributes to the nature, it can also be extended.
 * 
 * @author Atheriel
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class PokemonNature {
	public static NatureManager manager;

	protected String name, increasedStat, decreasedStat, favoriteTaste, dislikedTaste;

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
	public String getTasteFavorite() {
		return favoriteTaste;
	}

	/** Sets the favorite taste of this nature. */
	public PokemonNature setTasteFavorite(String taste) {
		this.favoriteTaste = taste;
		return this;
	}

	/** Gets the disliked taste of this nature. */
	public String getTasteDisliked() {
		return dislikedTaste;
	}

	/** Sets the disliked taste of this nature. */
	public PokemonNature setTasteDisliked(String taste) {
		this.dislikedTaste = taste;
		return this;
	}

	/**
	 * Gets the stat modifier for a given stat as a float.
	 * 
	 * @deprecated Use {@link #getStatIncreased} or {@link #getStatDecreased}
	 *             instead.
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