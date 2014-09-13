package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a set of {@link Action}s and {@link Requirement}s that represent an
 * atomic unit of interaction.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ActionSet {
	/** Indicates the manager used to register action sets */
	public static Manager<ActionSet> manager;

	/** Indicates the unique id of this action set */
	protected String id;

	/** Indicates the description of this action set */
	protected String description;

	/** Indicates the actions in this action set */
	protected List<Action> actions;

	/** Indicates the requirements of this action set */
	protected List<Requirement> requirements;

	/** Indicates the properties of this action set */
	protected Map<String, Object> properties;

	/** Gets the unique id of this action set */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this action set */
	public void setId(String id) {
		this.id = id;
	}

	/** Gets the description of this action set */
	public String getDescription() {
		return description;
	}

	/** Sets the description of this action set */
	public ActionSet setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Adds an action to this action set */
	public ActionSet addAction(Action action) {
		if (actions == null) {
			actions = new ArrayList<Action>();
		}

		actions.add(action);
		return this;
	}

	/** Removes an action from this action set */
	public ActionSet removeAction(Action action) {
		if (actions != null) {
			actions.remove(action);
		}

		return this;
	}

	/** Gets the actions in this action set */
	public List<Action> getActions() {
		if (actions == null) {
			actions = new ArrayList<Action>();
		}

		return actions;
	}

	/** Sets the actions in this action set */
	public ActionSet setActions(List<Action> actions) {
		this.actions = actions;
		return this;
	}

	/** Adds a requirement to this action set */
	public ActionSet addRequirement(Requirement requirement) {
		if (requirements == null) {
			requirements = new ArrayList<Requirement>();
		}

		requirements.add(requirement);
		return this;
	}

	/** Removes a requirement from this action set */
	public ActionSet removeRequirement(Requirement requirement) {
		if (requirements != null) {
			requirements.remove(requirement);
		}

		return this;
	}

	/** Gets the requirements of this action set */
	public List<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new ArrayList<Requirement>();
		}

		return requirements;
	}

	/** Sets the requirements of this action set */
	public ActionSet setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
		return this;
	}

	/** Gets an automatically casted property keyed by the class name */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property */
	public Object getProperty(String name) {
		return getProperties().get(name);
	}

	/** Sets a property keyed by the class name */
	public <T> ActionSet setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public ActionSet setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public ActionSet removeProperty(String name) {
		getProperties().remove(name);
		return this;
	}

	/** Gets all properties */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties */
	public ActionSet setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
