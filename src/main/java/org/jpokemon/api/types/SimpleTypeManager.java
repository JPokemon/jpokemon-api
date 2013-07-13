package org.jpokemon.api.types;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link TypeManager}
 * interface. Important: this manager loads no types by default! For that, see
 * the {@link ClassicTypes} class.
 */
public class SimpleTypeManager implements TypeManager {
	private final Map<String, PokemonType> typeList = new HashMap<String, PokemonType>();

	@Override
	public boolean registerType(PokemonType type) throws JPokemonError {
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
	public PokemonType getTypeByName(String name) {
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

	/** Provides the private constructor. */
	private SimpleTypeManager() {
	}
}