package org.ospokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the different categories of moves for the Pokémon Contests that
 * appear in some games
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ContestCategory {
	/** Indicates the manager used to register contest categories */
	public static Manager<ContestCategory> manager;

	/** Indicates the unique id of this category */
	protected String id;

	/** Indicates the name of this category */
	protected String name;

	/** Indicates the flavor associated with this category */
	protected String flavor;

	/** Indicates the color associated with this category */
	protected String color;

	/** Indicates the stat that is associated with this category */
	protected String stat;

	/** Indicates how this category reacts to another category */
	protected Map<String, String> reactions;

	/** Gets the unique id of this category */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this category */
	public void setId(String id) {
		this.id = id;
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
	public String getStat() {
		return stat;
	}

	/** Sets the stat that is associated with this contest category */
	public ContestCategory setStat(String stat) {
		this.stat = stat;
		return this;
	}

	public String getReaction(String contestCategory) {
		return getReactions().get(contestCategory);
	}

	public ContestCategory setReaction(String contestCategory, String reaction) {
		getReactions().put(contestCategory, reaction);
		return this;
	}

	/** Clears reactions for a list of categories, regardless of reaction */
	public ContestCategory removeReaction(String contestCategory) {
		getReactions().remove(contestCategory);
		return this;
	}

	/** Gets all reactions as a map of contest category name -> reaction */
	public Map<String, String> getReactions() {
		if (reactions == null) {
			reactions = new HashMap<String, String>();
		}

		return reactions;
	}

	/** Sets all reactions as a map of contest category name -> reaction */
	public ContestCategory setReactions(Map<String, String> reactions) throws JPokemonException {
		this.reactions = reactions;
		return this;
	}
}
