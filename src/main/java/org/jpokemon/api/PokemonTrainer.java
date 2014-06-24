package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a basic trainer class. Trainers possess a party of Pokemon instances
 * and a list of item names. They may also belong to a class of other trainers.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class PokemonTrainer {
	/** Indicates the manager used to register Pokémon trainers. May be null. */
	public static Manager<PokemonTrainer> manager;

	/** Indicates the name of the trainer */
	protected String name;

	/** Indicates the trainer's ID number */
	protected int trainerID;

	/** Indicates the name of the trainer's class */
	protected String trainerClass;

	/** Indicates the quantity of each item the trainer has (by name) */
	protected Map<String, Integer> items;

	/** Indicates the trainer's Pokémon */
	protected List<Pokemon> pokemon;

	/** Indicates the properties of this Pokémon trainer */
	protected Map<String, Object> properties;

	/** Gets the name of this trainer */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this trainer */
	public PokemonTrainer setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the trainer's ID number */
	public int getTrainerID() {
		return trainerID;
	}

	/** Sets the trainer's ID number */
	public PokemonTrainer setTrainerID(int trainerID) {
		this.trainerID = trainerID;
		return this;
	}

	/** Gets the name of the trainer's class */
	public String getTrainerClass() {
		return trainerClass;
	}

	/** Sets the name of the trainer's class */
	public PokemonTrainer setTrainerClass(String trainerClass) {
		this.trainerClass = trainerClass;
		return this;
	}

	/** Gets the quantity of an item the trainer has (by name) */
	public int getItemQuantity(String item) {
		if (items == null || !items.containsKey(item)) {
			return 0;
		}

		return items.get(item);
	}

	/** Sets the quantity of an item the trainer has (by name) */
	public PokemonTrainer setItemQuantity(String item, int quantity) {
		if (items == null) {
			items = new HashMap<String, Integer>();
		}

		items.put(item, quantity);
		return this;
	}

	/** Gets the quantity of each item the trainer has (by name) */
	public Map<String, Integer> getItems() {
		return items;
	}

	/** Sets the quantity of each item the trainer has (by name) */
	public PokemonTrainer setItems(Map<String, Integer> items) {
		this.items = items;
		return this;
	}

	/** Adds a Pokémon to the trainer's collection */
	public PokemonTrainer addPokemon(Pokemon pokemon) {
		if (this.pokemon == null) {
			this.pokemon = new ArrayList<Pokemon>();
		}

		this.pokemon.add(pokemon);
		return this;
	}

	/** Removes a Pokémon from the trainer's collection */
	public PokemonTrainer removePokemon(Pokemon pokemon) {
		if (this.pokemon != null) {
			this.pokemon.remove(pokemon);
		}

		return this;
	}

	/** Gets the trainer's Pokémon */
	public List<Pokemon> getPokemon() {
		return pokemon;
	}

	/** Sets the trainer's Pokémon */
	public PokemonTrainer setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	/** Gets a property of this Pokémon trainer using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this Pokémon trainer by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this Pokémon trainer using the class name as the key */
	public PokemonTrainer addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this Pokémon trainer */
	public PokemonTrainer setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this Pokémon trainer by name */
	public PokemonTrainer removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this Pokémon */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this Pokémon trainer */
	public PokemonTrainer setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
