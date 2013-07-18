package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.Manager;
import org.jpokemon.api.types.PokemonType;

/**
 * Defines a "simplest-possible" implementation of the {@link TypeManager}
 * interface. Important: this manager loads no types by default! For that, see
 * the {@link ClassicTypes} class.
 */
public class SimpleTypeManager implements Manager<PokemonType> {
	private final Map<String, PokemonType> typeList = new HashMap<String, PokemonType>();

	@Override
	public boolean register(PokemonType type) throws JPokemonError {
		if (typeList.containsKey(type.getName())) {
			throw new JPokemonError("A type with the name " + type.getName() + " has already been registered!");
		}
		if (typeList.containsValue(type)) {
			throw new JPokemonError("This type is already registered!");
		}
		typeList.put(type.getName(), type);
		return true;
	}

	@Override
	public boolean isRegistered(PokemonType type) {
		return typeList.containsValue(type);
	}

	@Override
	public PokemonType getByName(String name) {
		if (!typeList.containsKey(name)) {
			return null;
		}
		return typeList.get(name);
	}

	public static void init() {
		if (PokemonType.manager != null) {
			throw new JPokemonError("PokemonType.manager already defined.");
		}

		PokemonType.manager = new SimpleTypeManager();
	}
}