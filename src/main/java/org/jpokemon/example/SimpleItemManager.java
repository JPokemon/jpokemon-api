package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Item;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the {@link Item#manager}.
 * Note that, as Items are extremely implementation-specific, SimpleItemManager
 * provides no "Classic" items.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleItemManager implements Manager<Item> {
	protected Map<String, Item> items = new HashMap<String, Item>();

	/** Provides the default constructor */
	public SimpleItemManager() {
	}

	@Override
	public void register(Item item) throws JPokemonException {
		if (item == null) {
			throw new JPokemonException("Cannot register null item");
		}
		else if (item.getName() == null) {
			throw new JPokemonException("Cannot register item without a name: " + item);
		}
		else if (items.containsKey(item.getName()) && !item.equals(items.get(item.getName()))) {
			throw new JPokemonException("An item witht he same name is already registered: " + item);
		}

		items.put(item.getName(), item);
	}

	@Override
	public boolean isRegistered(String itemName) {
		if (itemName == null) {
			return false;
		}

		return items.get(itemName) != null;
	}

	@Override
	public Item getByName(String name) {
		return items.get(name);
	}

	/**
	 * Initializes a new SimpleItemManager as the {@link Item#manager}
	 * 
	 * @throws JPokemonException If the Item.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Item.manager != null) {
			throw new JPokemonException("Item.manager is already defined");
		}

		Item.manager = new SimpleItemManager();
	}
}
