package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Manager;
import org.jpokemon.api.Type;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link TypeManager}
 * interface. Important: this manager loads no types by default! For that, see
 * the {@link ClassicTypes} class.
 */
public class SimpleTypeManager implements Manager<Type> {
	private final Map<String, Type> typeList = new HashMap<String, Type>();

	@Override
	public boolean register(Type type) throws JPokemonError {
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
	public boolean isRegistered(Type type) {
		return typeList.containsValue(type);
	}

	@Override
	public Type getByName(String name) {
		if (!typeList.containsKey(name)) {
			return null;
		}
		return typeList.get(name);
	}

	public static void init() {
		if (Type.manager != null) {
			throw new JPokemonError("Type.manager already defined.");
		}

		Type.manager = new SimpleTypeManager();
	}
}