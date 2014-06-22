package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleTypeManager implements Manager<Type> {
	protected Map<String, Type> types = new HashMap<String, Type>();

	/** Provides the default constructor */
	public SimpleTypeManager() {
	}

	@Override
	public boolean isRegistered(String typeName) {
		return types.containsKey(typeName);
	}

	@Override
	public void register(Type type) throws JPokemonException {
		if (type == null) {
			throw new JPokemonException("Cannot register null type");
		}
		if (type.getName() == null) {
			throw new JPokemonException("Cannot register type without a name: " + type);
		}
		if (isRegistered(type.getName())) {
			throw new JPokemonException("A type is already registered with name: " + type.getName());
		}

		types.put(type.getName(), type);
	}

	@Override
	public List<Type> getAll() {
		return new ArrayList<Type>(types.values());
	}

	@Override
	public Type getByName(String name) {
		return types.get(name);
	}

	@Override
	public void update(Type type) throws JPokemonException {
		if (type == null) {
			throw new JPokemonException("Cannot register null type");
		}
		if (type.getName() == null) {
			throw new JPokemonException("Cannot register type without a name: " + type);
		}
		if (!isRegistered(type.getName())) {
			throw new JPokemonException("A type is not registered with name: " + type.getName());
		}

		types.put(type.getName(), type);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister type without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A type is not registered with name: " + name);
		}

		types.remove(name);
	}

	/**
	 * Initializes a new SimpleTypeManager as the {@link Type#manager}
	 * 
	 * @throws JPokemonException If the Type.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Type.manager != null) {
			throw new JPokemonException("Type.manager is already defined");
		}

		Type.manager = new SimpleTypeManager();
	}
}
