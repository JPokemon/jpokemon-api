package org.jpokemon.api.pokemon.ability;

import org.jpokemon.api.JPokemonError;

/**
 * Provides an interface for keeping track of {@link PokemonAbility}s. The most 
 * basic implementation of this is the {@link SimpleAbilityManager} class.
 * 
 * @author Zach Taylor
 * 
 * @since  0.1
 */
public interface AbilityManager {

	/**
	 * Registers an ability with this manager so it can be looked up by name.
	 * 
	 * @param ability The ability to be registered.
	 * 
	 * @throws JPokemonError if there is an error registering the ability.
	 */
	public void registerAbility(PokemonAbility ability) throws JPokemonError;

	/**
	 * Checks if an ability is registered with this manager.
	 * 
	 * @return `true` if the ability is known to the manager.
	 */
	public boolean isRegistered(PokemonAbility ability);

	/**
	 * Gets an ability registered with this manager by name.
	 * 
	 * @param name The name of the ability requested.
	 * 
	 * @return The {@link PokemonAbility} for this type.
	 */
	public PokemonAbility getByName(String name);
}
