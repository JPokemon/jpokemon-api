package org.ospokemon;

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

	/** Indicates the unique id of this overworld */
	protected String id;

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

	/** Indicates the unique id of this overworld */
	public String getId() {
		return id;
	}

	/** Indicates the unique id of this overworld */
	public void setId(String id) {
		this.id = id;
	}

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
	public <T> Overworld setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public Overworld setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public Overworld removeProperty(String name) {
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
	public Overworld setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
