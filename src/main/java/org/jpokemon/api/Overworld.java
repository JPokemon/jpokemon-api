package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

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

	/** Gets the name of this overworld */
	public String getName() {
		return name;
	}

	/** Sets the name of this overworld */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the width of this overworld */
	public int getWidth() {
		return width;
	}

	/** Sets the width of this overworld */
	public void setWidth(int width) {
		this.width = width;
	}

	/** Gets the height of this overworld */
	public int getHeight() {
		return height;
	}

	/** Sets the height of this overworld */
	public void setHeight(int height) {
		this.height = height;
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
	public void setPokemonTrainers(List<String> pokemonTrainers) {
		this.pokemonTrainers = pokemonTrainers;
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
	public void setEntities(List<OverworldEntity> entities) {
		this.entities = entities;
	}
}
