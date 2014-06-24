package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines an ability that a Pokémon may possess.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Ability {
	/** Indicates the manager used to register abilities. May be null. */
	public static Manager<Ability> manager;

	/** Indicates the name of the ability */
	protected String name;

	/** Indicates the description of the ability */
	protected String description;

	/** Indicates the properties of this ability */
	protected Map<String, Object> properties;

	/** Gets the name of this ability */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this ability */
	public Ability setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of this ability */
	public String getDescription() {
		return this.description;
	}

	/** Sets the description of this ability */
	public Ability setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets a property of this ability using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this ability by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this ability using the class name as the key */
	public Ability addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this ability */
	public Ability setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this ability by name */
	public Ability removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this ability */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this ability */
	public Ability setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
