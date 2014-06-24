package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link ItemAttributeFactory#manager}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleItemAttributeFactoryManager implements Manager<ItemAttributeFactory> {
	protected Map<String, ItemAttributeFactory> itemAttributeFactories = new HashMap<String, ItemAttributeFactory>();

	/** Provides the default constructor */
	public SimpleItemAttributeFactoryManager() {
	}

	@Override
	public boolean isRegistered(String itemAttributeFactoryName) {
		return itemAttributeFactories.containsKey(itemAttributeFactoryName);
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

		itemAttributeFactories.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public List<ItemAttributeFactory> getAll() {
		return new ArrayList<ItemAttributeFactory>(itemAttributeFactories.values());
	}

	@Override
	public ItemAttributeFactory getByName(String name) {
		return itemAttributeFactories.get(name);
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

		itemAttributeFactories.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public void unregister(String itemAttributeClass) throws JPokemonException {
		if (itemAttributeClass == null) {
			throw new JPokemonException("Cannot unregister item without item attribute class: " + itemAttributeClass);
		}
		if (!isRegistered(itemAttributeClass)) {
			throw new JPokemonException("An item is not registered with item attribute class: " + itemAttributeClass);
		}

		itemAttributeFactories.remove(itemAttributeClass);
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
