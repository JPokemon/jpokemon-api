package org.jpokemon.api.types;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.Manager;
import org.jpokemon.api.classic.ClassicTypes;

/**
 * Defines a "simplest-possible" implementation of the {@link Manger}
 * interface for types. This manager provides the classic types. See {@link #init}
 */
public class ClassicTypeManager implements Manager<PokemonType> {
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

		PokemonType.manager = new ClassicTypeManager();

		for (Field field : ClassicTypes.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) > 0) {
					Object temp = field.get(null);

					if (temp instanceof PokemonType) {
						PokemonType type = (PokemonType) temp;
						PokemonType.manager.register(type);
					}
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides the private constructor. */
	private ClassicTypeManager() {
	}
}