package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Item;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the {@link Manager} interface
 * for items.
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
	public void register(Item item) throws JPokemonException {
		if (itemMap.containsKey(item.getName())) {
			throw new JPokemonException("A item with the name " + item.getName() + " has already been registered!");
		}
		else if (itemMap.containsKey(item.getName()) && !item.equals(itemMap.get(item.getName()))) {
			throw new JPokemonException("A item with the name " + item.getName() + " has already been registered!");
		}

		itemMap.put(item.getName(), item);
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

	public static void init() throws JPokemonException {
		if (Item.manager != null) {
			throw new JPokemonException("Item.manager is already defined");
		}

		Item.manager = new SimpleItemManager();
	}
}
