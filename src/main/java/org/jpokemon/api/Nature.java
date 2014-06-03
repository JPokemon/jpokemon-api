package org.jpokemon.api;

/**
 * Defines a nature (personality) for a Pokémon
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Nature {
	/** Indicates the manager used to register natures. May be null. */
	public static Manager<Nature> manager;

	/** Indicates the name of this nature */
	protected String name;

	/** Indicates the stat increased by this nature */
	protected String statIncreased;

	/** Indicates the stat decreased by this nature */
	protected String statDecreased;

	/** Indicates the flavor favoured by Pokémon of this nature */
	protected String flavorFavorite;

	/** Indicates the flavor disliked by Pokémon of this nature */
	protected String flavorDisliked;

	/** Provides the default constructor */
	public Nature() {
	}

	/** Gets the name of this nature */
	public String getName() {
		return name;
	}

	/** Sets the name of this nature */
	public Nature setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the stat increased by this nature */
	public String getStatIncreased() {
		return statIncreased;
	}

	/** Sets the stat increased by this nature */
	public Nature setStatIncreased(String stat) {
		this.statIncreased = stat;
		return this;
	}

	/** Gets the stat decreased by this nature */
	public String getStatDecreased() {
		return statDecreased;
	}

	/** Sets the stat decreased by this nature */
	public Nature setStatDecreased(String stat) {
		this.statDecreased = stat;
		return this;
	}

	/** Gets the flavor preference of this nature */
	public String getFlavorFavorite() {
		return flavorFavorite;
	}

	/** Sets the favorite flavor of this nature */
	public Nature setFlavorFavorite(String flavor) {
		this.flavorFavorite = flavor;
		return this;
	}

	/** Gets the disliked flavor of this nature */
	public String getFlavorDisliked() {
		return flavorDisliked;
	}

	/** Sets the disliked flavor of this nature */
	public Nature setFlavorDisliked(String flavor) {
		this.flavorDisliked = flavor;
		return this;
	}
}
