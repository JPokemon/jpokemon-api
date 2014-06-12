package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

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
	public boolean isRegistered(String itemName) {
		return items.containsKey(itemName);
	}

	@Override
	public void register(Item item) throws JPokemonException {
		if (item == null) {
			throw new JPokemonException("Cannot register null item");
		}
		if (item.getName() == null) {
			throw new JPokemonException("Cannot register item without a name: " + item);
		}
		if (isRegistered(item.getName())) {
			throw new JPokemonException("An item is already registered with name: " + item.getName());
		}

		items.put(item.getName(), item);
	}

	@Override
	public Item getByName(String name) {
		return items.get(name);
	}

	@Override
	public void update(Item item) throws JPokemonException {
		if (item == null) {
			throw new JPokemonException("Cannot register null item");
		}
		if (item.getName() == null) {
			throw new JPokemonException("Cannot register item without a name: " + item);
		}
		if (!isRegistered(item.getName())) {
			throw new JPokemonException("An item is not registered with name: " + item.getName());
		}

		items.put(item.getName(), item);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister item without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("An item is not registered with name: " + name);
		}

		items.remove(name);
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
