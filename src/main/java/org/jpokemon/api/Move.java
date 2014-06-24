package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a move that can be learned and used by a Pokémon.
 * 
 * <p>
 * Moves that cause status ailments, affect stats, and so on, are termed as
 * having a "secondary effect". This effect is facilitated through use of the
 * {@link #properties}.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Move {
	/** Indicates the manager used to register moves. May be null. */
	public static Manager<Move> manager;

	/** Indicates the name of this move */
	protected String name;

	/** Indicates the type of this move */
	protected String type;

	/** Indicates the category of this move */
	protected String category;

	/** Indicates the description of this move */
	protected String description;

	/** Indicates the base PP for this move */
	protected int PP;

	/** Indicates the power of this move */
	protected int power;

	/** Indicates the accuracy of this move */
	protected double accuracy;

	/** Indicates the targeting scheme of this move */
	protected String target;

	/** Indicates the contest category this move belongs to */
	protected String contestCategory;

	/** Indicates the contest appeal of this move */
	protected int appeal;

	/** Indicates the contest jam of this move */
	protected int jam;

	/** Indicates the contest description of this move */
	protected String contestDescription;

	/** Indicates the priority of this move */
	protected int priority;

	/** Indicates the properties of this move */
	protected Map<String, Object> properties;

	/** Gets the name of this move */
	public String getName() {
		return name;
	}

	/** Sets the name of this move */
	public Move setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the type of this move */
	public String getType() {
		return type;
	}

	/** Sets the type of this move */
	public Move setType(String type) {
		this.type = type;
		return this;
	}

	/** Gets the category of this move */
	public String getCategory() {
		return category;
	}

	/** Sets the category of this move */
	public Move setCategory(String category) {
		this.category = category;
		return this;
	}

	/** Gets the description of this move */
	public String getDescription() {
		return description;
	}

	/** Sets the description of this move */
	public Move setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets the base PP for this move */
	public int getPP() {
		return PP;
	}

	/** Sets the base PP for this move */
	public Move setPP(int PP) {
		this.PP = PP;
		return this;
	}

	/** Gets the power of this move */
	public int getPower() {
		return power;
	}

	/** Sets the power of this move */
	public Move setPower(int power) {
		this.power = power;
		return this;
	}

	/** Gets the accuracy of this move */
	public double getAccuracy() {
		return accuracy;
	}

	/** Sets the accuracy of this move */
	public Move setAccuracy(double accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	/** Gets the targeting scheme of this move */
	public String getTarget() {
		return target;
	}

	/** Sets the targeting scheme of this move */
	public Move setTarget(String target) {
		this.target = target;
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
	public int getAppeal() {
		return appeal;
	}

	/** Sets the contest appeal of this move */
	public Move setAppeal(int appeal) {
		this.appeal = appeal;
		return this;
	}

	/** Gets the contest jam of this move */
	public int getJam() {
		return jam;
	}

	/** Sets the contest jam of this move */
	public Move setJam(int jam) {
		this.jam = jam;
		return this;
	}

	/** Gets the contest description of this move */
	public String getContestDescription() {
		return contestDescription;
	}

	/** Sets the contest description of this move */
	public Move setContestDescription(String contestDescription) {
		this.contestDescription = contestDescription;
		return this;
	}

	/** Gets the priority of this move */
	public int getPriority() {
		return priority;
	}

	/** Sets the priority of this move */
	public Move setPriority(int priority) {
		this.priority = priority;
		return this;
	}

	/** Gets a property of this move using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this move by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this move using the class name as the key */
	public Move addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this move */
	public Move setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this move by name */
	public Move removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this move */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this move */
	public Move setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
