package org.jpokemon.api.managers;

import java.util.TreeMap;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;

/**
 * Defines a "simplest-possible" implementation of the {@link ItemManager}
 * interface.
 * 
 * @author atheriel@gmail.com
 * 
 * @since  0.1
 */
public class SimpleItemManager implements Manager<Item> {
	private final TreeMap<String, Item> itemList = new TreeMap<String, Item>();

	@Override
	public boolean register(Item item) throws JPokemonError {
		if (itemList.containsKey(item.getName())) {
			throw new JPokemonError("A item with the name " + item.getName() + " has already been registered!");
		}
		if (itemList.containsValue(item)) {
			throw new JPokemonError("This item is already registered!");
		}
		itemList.put(item.getName(), item);
		return true;
	}

	@Override
	public boolean isRegistered(Item item) {
		return itemList.containsValue(item);
	}

	@Override
	public Item getByName(String name) {
		if (!itemList.containsKey(name)) {
			return null;
		}
		return itemList.get(name);
	}
}
