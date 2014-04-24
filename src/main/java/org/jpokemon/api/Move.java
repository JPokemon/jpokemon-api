package org.jpokemon.api;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * Defines a move that can be learned and used by a Pokémon.
 * 
 * <p>
 * Moves that cause status ailments, affect stats, and so on, are termed as
 * having a "secondary effect". This effect is facilitated through use of the
 * {@link #properties}.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class Move {
	/** Indicates the manager being used to register moves. May be ``null``. */
	public static Manager<Move> manager;

	/** Indicates attributed properties of the item. */
	protected HashMap<String, String> properties = new HashMap<String, String>();

	/** Indicates the name of this move. */
	protected String name;

	/** Indicates the Type of this move. */
	protected String type;

	/** Indicates the power of this move. */
	protected int power;

	/** Indicates the accuracy of this move. */
	protected int accuracy;

	/** Indicates the maximum PP for this move. */
	protected int maxPP;

	/** Indicates the priority of this move. */
	protected int priority;

	/** Indicates the contest category this move belongs to */
	protected String contestCategory;

	/** Indicates the contest appeal of this move */
	protected int contestAppeal;

	/** Indicates the contest jam of this move */
	protected int contestJam;

	/** Indicates the contest appeal of this move */
	protected int superContestAppeal;

	/** Indicates the contest jam of this move */
	protected int superContestJam;

	/** Indicates whether this move uses `Special` stats. */
	protected boolean special;

	/** Indicates whether this move targets the user instead of the opponent. */
	protected boolean selfTargeting;

	/** Gets the name of this move. */
	public String getName() {
		return name;
	}

	/** Sets the name of this move. */
	public Move setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the type of this move. */
	public String getType() {
		return type;
	}

	/** Sets the type of this move. */
	public Move setType(String type) {
		this.type = type;
		return this;
	}

	/** Checks whether this move undergoes damage calculation. */
	public boolean hasPower() {
		return (power > 0) ? true : false;
	}

	/** Gets the power of this move. */
	public int getPower() {
		return power;
	}

	/** Sets the power of this move. */
	public Move setPower(int power) {
		this.power = power;
		return this;
	}

	/** Checks whether this move undergoes miss calculation. */
	public boolean hasAccuracy() {
		return (accuracy > 0) ? true : false;
	}

	/** Gets the accuracy of this move. */
	public int getAccuracy() {
		return accuracy;
	}

	/** Sets the accuracy of this move. */
	public Move setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	/** Gets the maximum PP for this move. */
	public int getMaxPP() {
		return maxPP;
	}

	/** Sets the maximum PP for this move. */
	public Move setMaxPP(int maxPP) {
		this.maxPP = maxPP;
		return this;
	}

	/** Check if this move uses the `Special` stats. */
	public boolean isSpecial() {
		return special;
	}

	/** Sets whether this move should use the `Special` stats. */
	public Move setSpecial(boolean special) {
		this.special = special;
		return this;
	}

	/** Gets the move priority. */
	public int getPriority() {
		return priority;
	}

	/** Sets the move priority. */
	public Move setPriority(int priority) {
		this.priority = priority;
		return this;
	}

	/** Gets the contest category this move belongs to */
	public String getContestCategory() {
		return contestCategory;
	}

	/** Sets the contest category this move belongs to */
	public Move setContestCategory(String contestCategory) {
		this.contestCategory = contestCategory;
		return this;
	}

	/** Gets the contest appeal of this move */
	public int getContestAppeal() {
		return contestAppeal;
	}

	/** Sets the contest appeal of this move */
	public Move setContestAppeal(int contestAppeal) {
		this.contestAppeal = contestAppeal;
		return this;
	}

	/** Gets the contest jam of this move */
	public int getContestJam() {
		return contestJam;
	}

	/** Sets the contest jam of this move */
	public Move setContestJam(int contestjam) {
		this.contestJam = contestjam;
		return this;
	}

	/** Gets the super contest appeal of this move */
	public int getSuperContestAppeal() {
		return superContestAppeal;
	}

	/** Sets the super contest appeal of this move */
	public Move setSuperContestAppeal(int superContestAppeal) {
		this.superContestAppeal = superContestAppeal;
		return this;
	}

	/** Gets the super contest jam of this move */
	public int getSuperContestJam() {
		return superContestJam;
	}

	/** Sets the super contest jam of this move */
	public Move setSuperContestJam(int superContestJam) {
		this.superContestJam = superContestJam;
		return this;
	}

	/** Checks whether this move targets the user instead of its opponent. */
	public boolean isSelfTargeting() {
		return selfTargeting;
	}

	/** Sets whether this move should target the user instead of its opponent. */
	public Move setSelfTargeting(boolean selfTargeting) {
		this.selfTargeting = selfTargeting;
		return this;
	}

	/** Checks if the move has a given property. */
	public boolean hasProperty(String key) {
		if (key == null) {
			return false;
		}

		return properties.containsKey(key);
	}

	/** Sets a property of this move. It must have a unique name. */
	public Move setProperty(String key, String value) {
		if (!properties.containsKey(key)) {
			properties.put(key, value);
		}

		return this;
	}

	/**
	 * Gets the property of this move for the given key
	 * 
	 * @param key The key of the property requested
	 * 
	 * @return The move's property under this name, or `null` if it does not
	 *         possess one
	 */
	public String getProperty(String key) {
		if (!properties.containsKey(key)) {
			return null;
		}

		return properties.get(key);
	}

	/**
	 * Gets all of the property keys of this Move as an UnmodifiableCollection
	 * 
	 * @return A collection of this Move's attribute keys
	 */
	public Collection<String> getAllProperties() {
		return Collections.unmodifiableCollection(properties.keySet());
	}

	/** Gets the properties of this move */
	public HashMap<String, String> getProperties() {
		return properties;
	}

	/** Sets the properties of this move */
	public Move setProperties(HashMap<String, String> properties) {
		this.properties = properties;
		return this;
	}
}
