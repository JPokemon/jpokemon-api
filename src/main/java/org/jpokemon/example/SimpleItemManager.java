package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Item;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link Manager}
 * interface for items.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public class SimpleItemManager implements Manager<Item> {
	private final Map<String, Item> itemMap = new HashMap<String, Item>();

	/** Provides the default constructor */
	public SimpleItemManager() {
	}

	@Override
	public boolean register(Item item) throws JPokemonError {
		if (itemMap.containsKey(item.getName())) {
			throw new JPokemonError("A item with the name " + item.getName() + " has already been registered!");
		}
		if (itemMap.containsValue(item)) {
			throw new JPokemonError("This item is already registered!");
		}
		itemMap.put(item.getName(), item);
		return true;
	}

	@Override
	public boolean isRegistered(Item item) {
		return itemMap.containsValue(item);
	}

	@Override
	public Item getByName(String name) {
		if (!itemMap.containsKey(name)) {
			return null;
		}
		return itemMap.get(name);
	}

	public static void init() throws JPokemonError {
		if (Item.manager != null) {
			throw new JPokemonError("Item.manager is already defined");
		}

		Item.manager = new SimpleItemManager();
	}
}