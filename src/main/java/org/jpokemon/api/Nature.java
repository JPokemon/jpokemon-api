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

	/** Indicates the unique id of this nature */
	protected String id;

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

	/** Gets the unique id of this nature */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this nature */
	public Nature setId(String id) {
		this.id = id;
		return this;
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
	public Nature setStatIncreased(String statIncreased) {
		this.statIncreased = statIncreased;
		return this;
	}

	/** Gets the stat decreased by this nature */
	public String getStatDecreased() {
		return statDecreased;
	}

	/** Sets the stat decreased by this nature */
	public Nature setStatDecreased(String statDecreased) {
		this.statDecreased = statDecreased;
		return this;
	}

	/** Gets the flavor preference of this nature */
	public String getFlavorFavorite() {
		return flavorFavorite;
	}

	/** Sets the favorite flavor of this nature */
	public Nature setFlavorFavorite(String flavorFavorite) {
		this.flavorFavorite = flavorFavorite;
		return this;
	}

	/** Gets the disliked flavor of this nature */
	public String getFlavorDisliked() {
		return flavorDisliked;
	}

	/** Sets the disliked flavor of this nature */
	public Nature setFlavorDisliked(String flavorDisliked) {
		this.flavorDisliked = flavorDisliked;
		return this;
	}
}
