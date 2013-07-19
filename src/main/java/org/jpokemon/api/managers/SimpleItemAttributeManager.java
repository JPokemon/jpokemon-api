package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.ItemAttribute;

public class SimpleItemAttributeManager implements Manager<ItemAttribute> {
	/** The map of ItemAttributes that have been registered by name */
	private Map<String, ItemAttribute> attributeMap = new HashMap<String, ItemAttribute>();

	@Override
	public boolean register(ItemAttribute move) throws JPokemonError {
		if (move == null) {
			throw new JPokemonError("Cannot register a null attribute");
		}
		if (move.getName() == null) {
			throw new JPokemonError("An attribute cannot be registered if it has no name");
		}
		if (attributeMap.containsKey(move.getName())) {
			throw new JPokemonError("An attribute with the same name is already registered: " + move.getName());
		}

		attributeMap.put(move.getName(), move);
		return true;
	}

	@Override
	public boolean isRegistered(ItemAttribute move) {
		return attributeMap.containsValue(move);
	}

	@Override
	public ItemAttribute getByName(String name) {
		return attributeMap.get(name);
	}
}