package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a "simplest-possible" implementation of the {@link ItemAttributeFactory#manager}
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleItemAttributeFactoryManager implements Manager<ItemAttributeFactory> {
	protected Map<String, ItemAttributeFactory> items = new HashMap<String, ItemAttributeFactory>();

	/** Provides the default constructor */
	public SimpleItemAttributeFactoryManager() {
	}

	@Override
	public boolean isRegistered(String itemName) {
		return items.containsKey(itemName);
	}

	@Override
	public void register(ItemAttributeFactory itemAttributeFactory) throws JPokemonException {
		if (itemAttributeFactory == null) {
			throw new JPokemonException("Cannot register null item");
		}
		if (itemAttributeFactory.getItemAttributeClass() == null) {
			throw new JPokemonException("Cannot register item without item attribute class: " + itemAttributeFactory);
		}
		if (isRegistered(itemAttributeFactory.getItemAttributeClass().getName())) {
			throw new JPokemonException("An item is already registered with item attribute class: "
					+ itemAttributeFactory.getItemAttributeClass().getName());
		}

		items.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public ItemAttributeFactory getByName(String name) {
		return items.get(name);
	}

	@Override
	public void update(ItemAttributeFactory itemAttributeFactory) throws JPokemonException {
		if (itemAttributeFactory == null) {
			throw new JPokemonException("Cannot register null item");
		}
		if (itemAttributeFactory.getItemAttributeClass() == null) {
			throw new JPokemonException("Cannot register item without item attribute class: " + itemAttributeFactory);
		}
		if (!isRegistered(itemAttributeFactory.getItemAttributeClass().getName())) {
			throw new JPokemonException("An item is not registered with item attribute class: "
					+ itemAttributeFactory.getItemAttributeClass().getName());
		}

		items.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public void unregister(String itemAttributeClass) throws JPokemonException {
		if (itemAttributeClass == null) {
			throw new JPokemonException("Cannot unregister item without item attribute class: " + itemAttributeClass);
		}
		if (!isRegistered(itemAttributeClass)) {
			throw new JPokemonException("An item is not registered with item attribute class: " + itemAttributeClass);
		}

		items.remove(itemAttributeClass);
	}

	/**
	 * Initializes a new SimpleItemManager as the
	 * {@link ItemAttributeFactory#manager}
	 * 
	 * @throws JPokemonException If the ItemAttributeFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (ItemAttributeFactory.manager != null) {
			throw new JPokemonException("ItemAttributeFactory.manager is already defined");
		}

		ItemAttributeFactory.manager = new SimpleItemAttributeFactoryManager();
	}
}
