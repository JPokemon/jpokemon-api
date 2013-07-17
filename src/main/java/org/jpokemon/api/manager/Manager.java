package org.jpokemon.api.manager;

import org.jpokemon.api.JPokemonError;

public interface Manager<T> {
	
	/**
	 * Registers the object with the manager so it can be looked up by name.
	 * 
	 * @param managed The object to be registered.
	 * 
	 * @return `true` if the object is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if there is an error registering the object.
	 */
	public boolean register(T managed) throws JPokemonError;

	/**
	 * Checks if an item is registered with the manager.
	 *
	 * @return `true` if the item is known to the manager.
	 */
	public boolean isRegistered(T managed);

	/**
	 * Gets an item registered by this manager by name.
	 * 
	 * @param  name The name of the item requested.
	 * 
	 * @return      The {@link Item} instance for this item.
	 */
	public T getByName(String name);
}
