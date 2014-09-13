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
		return getItems().get(item);
	}

	/** Sets the quantity of an item the trainer has (by name) */
	public PokemonTrainer setItemQuantity(String item, int quantity) {
		getItems().put(item, quantity);
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
		getPokemon().add(pokemon);
		return this;
	}

	/** Removes a Pokémon from the trainer's collection */
	public PokemonTrainer removePokemon(Pokemon pokemon) {
		getPokemon().remove(pokemon);
		return this;
	}

	/** Gets the trainer's Pokémon */
	public List<Pokemon> getPokemon() {
		if (pokemon == null) {
			pokemon = new ArrayList<Pokemon>();
		}
		return pokemon;
	}

	/** Sets the trainer's Pokémon */
	public PokemonTrainer setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
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
	public <T> PokemonTrainer setProperty(Class<T> clazz, T property) {
		return setProperty(clazz.getName(), property);
	}

	/** Sets a property */
	public PokemonTrainer setProperty(String name, Object property) {
		getProperties().put(name, property);
		return this;
	}

	/** Removes a property */
	public PokemonTrainer removeProperty(String name) {
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
	public PokemonTrainer setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
