package org.jpokemon.pmapi.item;

import java.util.TreeMap;

import org.jpokemon.pmapi.JPokemonError;
import org.jpokemon.pmapi.JPokemonException;

/**
 * Defines a "simplest-possible" implementation of the {@link ItemManager} 
 * interface.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public class SimpleItemManager implements ItemManager {
	private final TreeMap<String, Item> itemList = new TreeMap<String, Item>();

	/**
	 * Provides the default constructor.
	 * 
	 * @throws JPokemonError if there is a conflict with another 
	 *         				 {@link ItemManager} in registering items.
	 */
	public SimpleItemManager() throws JPokemonError {
		if (Item.manager != null) {
			throw new JPokemonError("Item registration conflict: another item manager has already been defined!");
		} else {
			Item.manager = this;
		}
	}

	/**
	 * Registers an item with the manager so it can be looked up by name. Called 
	 * automatically for all named {@link Item} instances, so it should not 
	 * usually be called directly.
	 * 
	 * @param  item The item to be registered.
	 * 
	 * @return `true` if the item is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if there is an error registering the type.
	 */
	public boolean registerItem(Item item) throws JPokemonError {
		if (itemList.containsKey(item.getName())) {
			throw new JPokemonError("A item with the name " + item.getName() + " has already been registered!");
		}
		if (itemList.containsValue(item)) {
			throw new JPokemonError("This item is already registered!");
		}
		itemList.put(item.getName(), item);
		return true;
	}

	/**
	 * Checks if an item is registered with the manager.
	 *
	 * @return `true` if the item is known to the manager.
	 */
	public boolean isRegistered(Item item) {
		return itemList.containsValue(item);
	}

	/**
	 * Gets an item registered by this manager by name.
	 * 
	 * @param  name The name of the item requested.
	 * 
	 * @return      The {@link Item} instance for this item.
	 */
	public Item getItemByName(String name) {
		if (!itemList.containsKey(name)) {
			return null;
		}
		return itemList.get(name);
	}
}