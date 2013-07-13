package org.jpokemon.api.item;

import org.jpokemon.api.JPokemonError;

/**
 * Provides an interface for storing and keeping track of items at runtime. The 
 * most basic implementation of this is the {@link SimpleItemManager} class.
 * 
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public interface ItemManager {

	/**
	 * Registers an item with the manager so it can be looked up by name.
	 * 
	 * @param  item The item to be registered.
	 * 
	 * @return  `true` if the item is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if there is an error registering the type.
	 */
	public boolean registerItem(Item item) throws JPokemonError;

	/**
	 * Checks if an item is registered with the manager.
	 *
	 * @return `true` if the item is known to the manager.
	 */
	public boolean isRegistered(Item item);

	/**
	 * Gets an item registered by this manager by name.
	 * 
	 * @param  name The name of the item requested.
	 * 
	 * @return      The {@link Item} instance for this item.
	 */
	public Item getItemByName(String name);
}