package org.ospokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a class of trainers (such as Youngsters or Swimmers).
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class TrainerClass {
	/** Indicates the manager used to register Pokémon trainer classes */
	public static Manager<TrainerClass> manager;

	/** Indicates the unique id of this trainer class */
	protected String id;

	/** Indicates the name of the trainer class */
	protected String name;

	/** Indicates the description of the trainer class */
	protected String description;

	/** Indicates the properties of this trainer class */
	protected Map<String, Object> properties;

	/** Gets the unique id of this trainer class */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this trainer class */
	public void setId(String id) {
		this.id = id;
	}

	/** Gets the name of this trainer class. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this trainer class. */
	public TrainerClass setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of the trainer class */
	public String getDescription() {
		return description;
	}

	/** Sets the description of the trainer class */
	public TrainerClass setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets a property of this trainer class using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this trainer class by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this trainer class using the class name as the key */
	public TrainerClass addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this trainer class */
	public TrainerClass setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this trainer class by name */
	public TrainerClass removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this trainer class */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this trainer class */
	public TrainerClass setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
