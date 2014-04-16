package org.jpokemon.api;

/**
 * Defines the different categories of moves for the Pokémon Contests that
 * appear in some games.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ContestCategory {
	/** Indicates the manager used to register contest categories. May be null. */
	public static Manager<ContestCategory> manager;

	/** Indicates the name of this category */
	protected String name;

	/** Indicates the flavor associated with this category */
	protected String flavor;

	/** Indicates the color associated with this category */
	protected String color;

	/** Indicates the stat that is associated with this category */
	protected String enhancedStat;

	/** Provides the default constructor */
	public ContestCategory() {
	}

	/** Gets the name of this contest category */
	public String getName() {
		return name;
	}

	/** Sets the name of this contest category */
	public ContestCategory setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the flavor associated with this contest category */
	public String getFlavor() {
		return flavor;
	}

	/** Sets the flavor associated with this contest category */
	public ContestCategory setFlavor(String flavor) {
		this.flavor = flavor;
		return this;
	}

	/** Gets the color associated with this contest category */
	public String getColor() {
		return color;
	}

	/** Sets the color associated with this contest category */
	public ContestCategory setColor(String color) {
		this.color = color;
		return this;
	}

	/** Gets the stat that is associated with this contest category */
	public String getEnhancedStat() {
		return enhancedStat;
	}

	/** Sets the stat that is associated with this contest category */
	public ContestCategory setEnhancedStat(String enhancedStat) {
		this.enhancedStat = enhancedStat;
		return this;
	}
}
