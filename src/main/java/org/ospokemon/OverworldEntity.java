package org.ospokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines an entity that may appear in the overworld. Entities may represent
 * things besides Npcs, although a Npc may be an Entity. An entity may affect
 * Pokémon trainer movement through the overworld, or react to any overworld
 * trigger with {@link ActionSet}s.
 * 
 * <p>
 * 
 * Note that OverworldEntity does not provide a {@link Manager}. This is because
 * it may be desirable for entities to appear in multiple instances of an
 * {@link Overworld}, to facilitate reusable objects (such as trees, or
 * recurring characters). Any such reusable object may be reused at a different
 * coordinate, or with different action set mappings. Therefore, entity name is
 * not a unique-enough property.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class OverworldEntity {
	/** Indicates the name of this entity */
	protected String name;

	/** Indicates the direction this entity is facing, if applicable */
	protected String direction;

	/** Indicates the movement scheme applicable to this entity */
	protected MovementScheme movement;

	/** Indicates the x coordinate of this entity */
	protected int x;

	/** Indicates the y coordinate of this entity */
	protected int y;

	/** Indicates the width of this entity */
	protected int width;

	/** Indicates the height of this entity */
	protected int height;

	/**
	 * Indicates action sets associated with this entity mapped by event, if
	 * applicable
	 */
	protected Map<String, List<String>> actionSets;

	/** Indicates the properties of this overworld */
	protected Map<String, Object> properties;

	/** Gets the name of this entity */
	public String getName() {
		return name;
	}

	/** Sets the name of this entity */
	public OverworldEntity setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the direction this entity is facing */
	public String getDirection() {
		return direction;
	}

	/** Sets the direction this entity is facing */
	public OverworldEntity setDirection(String direction) {
		this.direction = direction;
		return this;
	}

	/** Gets the movement scheme applicable to this entity */
	public MovementScheme getMovement() {
		return movement;
	}

	/** Sets the movement scheme applicable to this entity */
	public void setMovement(MovementScheme movement) {
		this.movement = movement;
	}

	/** Gets the x coordinate of this entity */
	public int getX() {
		return x;
	}

	/** Sets the x coordinate of this entity */
	public void setX(int x) {
		this.x = x;
	}

	/** Gets the y coordinate of this entity */
	public int getY() {
		return y;
	}

	/** Sets the y coordinate of this entity */
	public void setY(int y) {
		this.y = y;
	}

	/** Gets the width of this entity */
	public int getWidth() {
		return width;
	}

	/** Sets the width of this entity */
	public void setWidth(int width) {
		this.width = width;
	}

	/** Gets the height of this entity */
	public int getHeight() {
		return height;
	}

	/** Sets the height of this entity */
	public void setHeight(int height) {
		this.height = height;
	}

	/** Adds an action set to this entity for the specified trigger */
	public OverworldEntity addActionSet(String trigger, String actionSet) {
		getActionSets(trigger).add(actionSet);
		return this;
	}

	/** Removes an action set from this entity for the specified trigger */
	public OverworldEntity removeActionSet(String trigger, String actionSet) {
		getActionSets(trigger).remove(actionSet);
		return this;
	}

	/** Gets the action sets of this entity for the specified trigger */
	public List<String> getActionSets(String trigger) {
		if (getActionSets().get(trigger) == null) {
			getActionSets().put(trigger, new ArrayList<String>());
		}
		return getActionSets().get(trigger);
	}

	/** Sets the action sets of this entity for the specified trigger */
	public OverworldEntity setActionSets(String trigger, List<String> actionSets) {
		getActionSets().put(trigger, actionSets);
		return this;
	}

	/** Removes the action sets from this entity for the specified trigger */
	public OverworldEntity removeActionSets(String trigger) {
		getActionSets().remove(trigger);
		return this;
	}

	/** Gets all action sets of this entity, mapped by overworld trigger */
	public Map<String, List<String>> getActionSets() {
		if (actionSets == null) {
			actionSets = new HashMap<String, List<String>>();
		}
		return actionSets;
	}

	/** Sets all action sets of this entity, mapped by overworld trigger */
	public OverworldEntity setActionSets(Map<String, List<String>> actionSets) {
		this.actionSets = actionSets;
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
	public <T> OverworldEntity setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public OverworldEntity setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public OverworldEntity removeProperty(String name) {
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
	public OverworldEntity setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
