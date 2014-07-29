package org.jpokemon.api;

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
	protected String movement;

	/** Indicates the x coordinate of this entity */
	protected int x;

	/** Indicates the y coordinate of this entity */
	protected int y;

	/** Indicates the width of this entity */
	protected int width;

	/** Indicates the height of this entity */
	protected int height;

	/**
	 * Indicates action sets associated with this entity, mapped by an overworld
	 * trigger, if applicable
	 */
	protected Map<String, List<ActionSet>> actionSets;

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
	public String getMovement() {
		return movement;
	}

	/** Sets the movement scheme applicable to this entity */
	public void setMovement(String movement) {
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
	public OverworldEntity addActionSet(String trigger, ActionSet move) {
		if (actionSets == null) {
			actionSets = new HashMap<String, List<ActionSet>>();
		}
		if (actionSets.get(trigger) == null) {
			actionSets.put(trigger, new ArrayList<ActionSet>());
		}

		actionSets.get(trigger).add(move);
		return this;
	}

	/** Removes an action set from this entity for the specified trigger */
	public OverworldEntity removeActionSet(String trigger, ActionSet actionSet) {
		if (actionSets != null && actionSets.containsKey(trigger)) {
			if (actionSets.get(trigger).remove(actionSet) && actionSets.get(trigger).size() < 1) {
				actionSets.remove(trigger);
			}
		}

		return this;
	}

	/** Gets the action sets of this entity for the specified trigger */
	public List<ActionSet> getActionSets(String trigger) {
		if (actionSets == null) {
			actionSets = new HashMap<String, List<ActionSet>>();
		}
		if (actionSets.get(trigger) == null) {
			actionSets.put(trigger, new ArrayList<ActionSet>());
		}

		return actionSets.get(trigger);
	}

	/** Sets the action sets of this entity for the specified trigger */
	public OverworldEntity setActionSets(String trigger, List<ActionSet> actionSet) {
		if (actionSets == null) {
			actionSets = new HashMap<String, List<ActionSet>>();
		}

		if (actionSet == null) {
			actionSets.remove(trigger);
		}
		else {
			actionSets.put(trigger, actionSet);
		}

		return this;
	}

	/** Removes the action sets from this entity for the specified trigger */
	public OverworldEntity removeActionSets(String trigger) {
		if (actionSets != null) {
			actionSets.remove(trigger);
		}

		return this;
	}

	/** Gets all action sets of this entity, mapped by overworld trigger */
	public Map<String, List<ActionSet>> getActionSets() {
		if (actionSets == null) {
			actionSets = new HashMap<String, List<ActionSet>>();
		}

		return actionSets;
	}

	/** Sets all action sets of this entity, mapped by overworld trigger */
	public OverworldEntity setActionSets(Map<String, List<ActionSet>> actionSets) {
		this.actionSets = actionSets;
		return this;
	}
}
