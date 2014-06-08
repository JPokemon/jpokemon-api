package org.jpokemon.api;

import java.util.List;

public interface PokemonManager {
	/**
	 * Registers a Pokémon with the manager so it can be looked up by original
	 * trainer id
	 * 
	 * @param pokemon The Pokémon to be registered
	 * @throws JPokemonException If there is an error registering the Pokémon
	 */
	public void register(Pokemon pokemon) throws JPokemonException;

	/**
	 * Gets the Pokémon from this manager for a trainer
	 * 
	 * @param trainerID The trainer id of the trainer to look up
	 * @return All Pokémon owned by the trainer
	 * @throws JPokemonException If there is an error retrieving Pokémon
	 */
	public List<Pokemon> getByTrainerID(int trainerID) throws JPokemonException;

	/**
	 * Re-registers a Pokémon with the manager, overriding any conflicts with the
	 * already registered version
	 * 
	 * @param pokemon The Pokémon to update
	 * @throws JPokemonException If there is an error registering the Pokémon
	 */
	public void update(Pokemon pokemon) throws JPokemonException;

	/**
	 * Removes a Pokémon from the registry
	 * 
	 * @param pokemon The pokemon to remove
	 * @throws JPokemonException If there is an error removing the object
	 */
	public void unregister(Pokemon pokemon) throws JPokemonException;
}
