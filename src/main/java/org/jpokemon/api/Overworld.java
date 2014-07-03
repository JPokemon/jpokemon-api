package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines an Overworld that a Pokémon trainer may walk around in.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class Overworld {
	/** Indicates the manager used to register overworlds. May be null. */
	public static Manager<Overworld> manager;

	/** Indicates the name of this overworld */
	protected String name;

	/** Indicates the width of this overworld */
	protected int width;

	/** Indicates the height of this overworld */
	protected int height;

	/** Indicates the Pokémon trainer players currently in this overworld */
	protected List<String> pokemonTrainers;

	/** Indicates the entities in this overworld */
	protected List<OverworldEntity> entities;

	/** Indicates the properties of this overworld */
	protected Map<String, Object> properties;

	/** Gets the name of this overworld */
	public String getName() {
		return name;
	}

	/** Sets the name of this overworld */
	public Overworld setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the width of this overworld */
	public int getWidth() {
		return width;
	}

	/** Sets the width of this overworld */
	public Overworld setWidth(int width) {
		this.width = width;
		return this;
	}

	/** Gets the height of this overworld */
	public int getHeight() {
		return height;
	}

	/** Sets the height of this overworld */
	public Overworld setHeight(int height) {
		this.height = height;
		return this;
	}

	/** Adds a Pokémon trainer to this overworld */
	public Overworld addPokemonTrainer(String pokemonTrainer) {
		if (pokemonTrainers == null) {
			pokemonTrainers = new ArrayList<String>();
		}

		pokemonTrainers.add(pokemonTrainer);
		return this;
	}

	/** Removes a Pokémon trainer from this overworld */
	public Overworld removePokemonTrainer(String pokemonTrainer) {
		if (pokemonTrainers != null) {
			pokemonTrainers.remove(pokemonTrainer);
		}

		return this;
	}

	/** Gets the Pokémon trainer players currently in this overworld */
	public List<String> getPokemonTrainers() {
		if (pokemonTrainers == null) {
			pokemonTrainers = new ArrayList<String>();
		}

		return pokemonTrainers;
	}

	/** Sets the Pokémon trainer players currently in this overworld */
	public Overworld setPokemonTrainers(List<String> pokemonTrainers) {
		this.pokemonTrainers = pokemonTrainers;
		return this;
	}

	/** Adds an entity to this overworld */
	public Overworld addEntity(OverworldEntity entity) {
		if (entities == null) {
			entities = new ArrayList<OverworldEntity>();
		}

		entities.add(entity);
		return this;
	}

	/** Removes an entity from this overworld */
	public Overworld removeEntity(OverworldEntity entity) {
		if (entities != null) {
			entities.remove(entity);
		}

		return this;
	}

	/** Gets the entities in this overworld */
	public List<OverworldEntity> getEntities() {
		if (entities == null) {
			entities = new ArrayList<OverworldEntity>();
		}

		return entities;
	}

	/** Sets the entities in this overworld */
	public Overworld setEntities(List<OverworldEntity> entities) {
		this.entities = entities;
		return this;
	}

	/** Gets a property of this overworld using class name as the key */
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

	/** Adds a property to this overworld using the class name as the key */
	public Overworld addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this overworld */
	public Overworld setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this overworld by name */
	public Overworld removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this overworld */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this overworld */
	public Overworld setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
