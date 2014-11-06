package org.ospokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a status condition that may affect a Pokemon
 * 
 * @author zach
 */
public class StatusCondition {
	/** Indicates the manager used to register status conditions. May be null. */
	public static Manager<StatusCondition> manager;

	/** Indicates the unique id of this status condition */
	protected String id;

	/** Indicates the name of this condition */
	protected String name;

	/** Indicates whether this condition is volatile */
	protected boolean volatileCondition;

	/** Indicates any battle effects of this status condition */
	protected List<BattleEffect> battleEffects;

	/** Indicates the properties of this status condition */
	protected Map<String, Object> properties;

	/** Indicates the unique id of this status condition */
	public String getId() {
		return id;
	}

	/** Indicates the unique id of this status condition */
	public StatusCondition setId(String id) {
		this.id = id;
		return this;
	}

	/** Gets the name of this condition */
	public String getName() {
		return name;
	}

	/** Sets the name of this condition */
	public StatusCondition setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets whether this condition is volatile */
	public boolean isVolatileCondition() {
		return volatileCondition;
	}

	/** Sets whether this condition is volatile */
	public StatusCondition setVolatileCondition(boolean volatileCondition) {
		this.volatileCondition = volatileCondition;
		return this;
	}

	/** Adds a battle effects to this status condition */
	public StatusCondition addBattleEffect(BattleEffect battleEffect) {
		getBattleEffects().add(battleEffect);
		return this;
	}

	/** Removes a battle effects to this status condition */
	public StatusCondition remove(BattleEffect battleEffect) {
		getBattleEffects().remove(battleEffect);
		return this;
	}

	/** Gets any battle effects of this status condition */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}
		return battleEffects;
	}

	/** Sets any battle effects of this status condition */
	public StatusCondition setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}

	/** Gets a property of this species using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this species by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this species using the class name as the key */
	public StatusCondition addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this species */
	public StatusCondition setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this species by name */
	public StatusCondition removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this species */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this species */
	public StatusCondition setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
