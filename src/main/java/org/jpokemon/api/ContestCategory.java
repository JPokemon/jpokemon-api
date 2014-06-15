package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	/** Indicates the value used to represent an excitement reaction */
	public static final String EXCITEMENT_REACTION = "EXCITEMENT";

	/** Indicates the value used to represent an indifference reaction */
	public static final String INDIFFERENCE_REACTION = "INDIFFERENCE";

	/** Indicates the value used to represent a discontent reaction */
	public static final String DISCONTENT_REACTION = "DISCONTENT";

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
		return isReaction(EXCITEMENT_REACTION, contestCategory);
	}

	/** Gets the list of categories that this contest will react excitedly to */
	public List<String> getExcitementReaction() {
		return getReaction(EXCITEMENT_REACTION);
	}

	/** Sets categories that this contest will react excitedly to */
	public ContestCategory setExcitementReaction(String... contestCategories) {
		setReaction(EXCITEMENT_REACTION, contestCategories);
		return this;
	}

	/** Gets whether this contest will react indifferent to the specified category */
	public boolean isIndifferenceReaction(String contestCategory) {
		return isReaction(INDIFFERENCE_REACTION, contestCategory);
	}

	/** Gets the list of categories that this contest will react indifferently to */
	public List<String> getIndifferenceReactions() {
		return getReaction(INDIFFERENCE_REACTION);
	}

	/** Sets the list of categories that this contest will react indifferently to */
	public ContestCategory setIndifferenceReaction(String... contestCategories) {
		setReaction(INDIFFERENCE_REACTION, contestCategories);
		return this;
	}

	/** Gets the list of categories that this contest will react discontent to */
	public boolean isDiscontentReaction(String contestCategory) {
		return isReaction(DISCONTENT_REACTION, contestCategory);
	}

	/** Gets the list of categories that this contest will react discontent to */
	public List<String> getDiscontentReaction() {
		return getReaction(DISCONTENT_REACTION);
	}

	/** Sets the list of categories that this contest will react discontent to */
	public ContestCategory setDiscontentReaction(String... contestCategories) {
		setReaction(DISCONTENT_REACTION, contestCategories);
		return this;
	}

	/** Clears reactions for a list of categories, regardless of reaction */
	public ContestCategory removeReaction(String... contestCategories) {
		if (reactions != null && contestCategories != null) {
			for (String contestCategory : contestCategories) {
				reactions.remove(contestCategory);
			}
		}

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
		Set<String> reactionValues = new HashSet<String>();
		reactionValues.addAll(reactions.values());
		reactionValues.remove(EXCITEMENT_REACTION);
		reactionValues.remove(INDIFFERENCE_REACTION);
		reactionValues.remove(DISCONTENT_REACTION);

		if (reactionValues.size() > 0) {
			throw new JPokemonException("Reaction map contains invalid reactions: " + reactionValues.toString());
		}

		this.reactions = reactions;
		return this;
	}

	private boolean isReaction(String reaction, String contestCategory) {
		if (reactions == null) {
			return false;
		}

		return reaction == reactions.get(contestCategory);
	}

	private List<String> getReaction(String reaction) {
		List<String> contestCategories = new ArrayList<String>();

		if (reactions != null) {
			for (Map.Entry<String, String> contestReaction : reactions.entrySet()) {
				if (reaction == contestReaction.getValue()) {
					contestCategories.add(contestReaction.getKey());
				}
			}
		}

		return contestCategories;
	}

	private void setReaction(String reaction, String... contestCategories) {
		if (contestCategories == null) {
			return;
		}
		if (reactions == null) {
			reactions = new HashMap<String, String>();
		}

		for (String contestCategory : contestCategories) {
			reactions.put(contestCategory, reaction);
		}
	}
}
