package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	/** Indicates the manager used to register contest categories. May be null. */
	public static Manager<ContestCategory> manager;

	/** Indicates the name of this category */
	protected String name;

	/** Indicates the flavor associated with this category */
	protected String flavor;

	/** Indicates the color associated with this category */
	protected String color;

	/** Indicates the stat that is associated with this category */
	protected String stat;

	/** Indicates how this category reacts to another category */
	protected Map<String, Reaction> reactions;

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
	public String getStat() {
		return stat;
	}

	/** Sets the stat that is associated with this contest category */
	public ContestCategory setStat(String stat) {
		this.stat = stat;
		return this;
	}

	/** Gets whether this contest will react excitedly to the specified category */
	public boolean isExcitementReaction(String contestCategory) {
		return isReaction(Reaction.EXCITEMENT, contestCategory);
	}

	/** Gets the list of categories that this contest will react excitedly to */
	public List<String> getExcitementReaction() {
		return getReaction(Reaction.EXCITEMENT);
	}

	/** Sets categories that this contest will react excitedly to */
	public ContestCategory setExcitementReaction(String... contestCategories) {
		setReaction(Reaction.EXCITEMENT, contestCategories);
		return this;
	}

	/** Gets whether this contest will react indifferent to the specified category */
	public boolean isIndifferenceReaction(String contestCategory) {
		return isReaction(Reaction.INDIFFERENCE, contestCategory);
	}

	/** Gets the list of categories that this contest will react indifferently to */
	public List<String> getIndifferenceReactions() {
		return getReaction(Reaction.INDIFFERENCE);
	}

	/** Sets the list of categories that this contest will react indifferently to */
	public ContestCategory setIndifferenceReaction(String... contestCategories) {
		setReaction(Reaction.INDIFFERENCE, contestCategories);
		return this;
	}

	/** Gets the list of categories that this contest will react discontent to */
	public boolean isDiscontentReaction(String contestCategory) {
		return isReaction(Reaction.DISCONTENT, contestCategory);
	}

	/** Gets the list of categories that this contest will react discontent to */
	public List<String> getDiscontentReaction() {
		return getReaction(Reaction.DISCONTENT);
	}

	/** Sets the list of categories that this contest will react discontent to */
	public ContestCategory setDiscontentReaction(String... contestCategories) {
		setReaction(Reaction.DISCONTENT, contestCategories);
		return this;
	}

	private boolean isReaction(Reaction reaction, String contestCategory) {
		if (this.reactions == null) {
			return false;
		}

		return reaction == this.reactions.get(contestCategory);
	}

	private List<String> getReaction(Reaction reaction) {
		List<String> reactionList = new ArrayList<String>();

		if (this.reactions != null) {
			for (Map.Entry<String, Reaction> reactionEntry : this.reactions.entrySet()) {
				if (reaction == reactionEntry.getValue()) {
					reactionList.add(reactionEntry.getKey());
				}
			}
		}

		return reactionList;
	}

	private void setReaction(Reaction reaction, String... contestCategories) {
		if (contestCategories == null || contestCategories.length < 1) {
			return;
		}
		if (this.reactions == null) {
			this.reactions = new HashMap<String, Reaction>();
		}

		for (String contestCategory : contestCategories) {
			this.reactions.put(contestCategory, reaction);
		}
	}

	protected enum Reaction {
		EXCITEMENT, INDIFFERENCE, DISCONTENT;
	}
}
