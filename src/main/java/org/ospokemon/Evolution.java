package org.ospokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines an evolution that is possible
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class Evolution {
	/** Indicates the species the Pokémon will evolve into */
	protected String species;

	/** Indicates the requirements of this evolution */
	protected List<Requirement> requirements;

	/** Indicates the properties of this evolution */
	protected Map<String, Object> properties;

	/** Gets the species the Pokémon will evolve into */
	public String getSpecies() {
		return species;
	}

	/** Sets the species the Pokémon will evolve into */
	public Evolution setSpecies(String species) {
		this.species = species;
		return this;
	}

	/** Adds a requirement to this evolution */
	public Evolution addRequirement(Requirement requirement) {
		getRequirements().add(requirement);
		return this;
	}

	/** Adds a requirement to this evolution */
	public Evolution removeRequirement(Requirement requirement) {
		getRequirements().remove(requirement);
		return this;
	}

	/** Gets the requirements of this evolution */
	public List<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new ArrayList<Requirement>();
		}
		return requirements;
	}

	/** Sets the requirements of this evolution */
	public Evolution setRequirements(List<Requirement> requirements) {
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
	public <T> Evolution setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public Evolution setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public Evolution removeProperty(String name) {
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
	public Evolution setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
