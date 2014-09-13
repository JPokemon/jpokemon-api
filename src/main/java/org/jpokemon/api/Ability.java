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
	/** Indicates the manager used to register abilities */
	public static Manager<Ability> manager;

	/** Indicates the unique id of this ability */
	protected String id;

	/** Indicates the name of this ability */
	protected String name;

	/** Indicates the description of this ability */
	protected String description;

	/** Indicates the properties of this ability */
	protected Map<String, Object> properties;

	/** Gets the unique id of this ability */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this ability */
	public Ability setId(String id) {
		this.id = id;
		return this;
	}

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
	public <T> Ability setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public Ability setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public Ability removeProperty(String name) {
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
	public Ability setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
