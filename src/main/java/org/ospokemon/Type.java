package org.ospokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a Pokémon type (such as Grass or Dark)
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Type {
	/** Indicates the manager used to register types. May be null. */
	public static Manager<Type> manager;

	/** Indicates the unique id of the type */
	protected String id;

	/** Indicates the name of the type */
	protected String name;

	/** Defines a mapping of this type's effectiveness against others */
	protected Map<String, String> effectiveness;

	/** Gets the name of this type */
	public String getId() {
		return id;
	}

	/** Sets the name of this type */
	public Type setId(String id) {
		this.id = id;
		return this;
	}

	/** Gets the name of the type */
	public String getName() {
		return name;
	}

	/** Sets the name of the type */
	public Type setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the effectiveness of this type against another */
	public String getEffectiveness(String type) {
		return getEffectiveness().get(type);
	}

	/** Sets the effectiveness of this type against another */
	public Type setEffectiveness(String type, String effectiveness) {
		getEffectiveness().put(type, effectiveness);
		return this;
	}

	/** Removes the effectiveness mapping of this type against another */
	public Type removeEffectiveness(String type) {
		getEffectiveness().remove(type);
		return this;
	}

	/** Gets all effectiveness as a map of type name -> effectiveness */
	public Map<String, String> getEffectiveness() {
		if (effectiveness == null) {
			effectiveness = new HashMap<String, String>();
		}
		return effectiveness;
	}

	/** Sets all effectiveness as a map of type name -> effectiveness */
	public Type setEffectiveness(Map<String, String> effectiveness) {
		this.effectiveness = effectiveness;
		return this;
	}
}
