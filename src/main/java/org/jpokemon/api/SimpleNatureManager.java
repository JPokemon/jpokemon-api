package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a "simplest-possible" implementation of the {@link Nature#manager}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleNatureManager implements Manager<Nature> {
	protected Map<String, Nature> natures = new HashMap<String, Nature>();

	/** Provides the default constructor */
	public SimpleNatureManager() {
	}
	
	@Override
	public boolean isRegistered(String natureName) {
		return natures.containsKey(natureName);
	}

	@Override
	public void register(Nature nature) throws JPokemonException {
		if (nature == null) {
			throw new JPokemonException("Cannot register null nature");
		}
		if (nature.getName() == null) {
			throw new JPokemonException("Cannot register nature without a name: " + nature);
		}
		if (isRegistered(nature.getName())) {
			throw new JPokemonException("A nature is already registered with name: " + nature.getName());
		}

		natures.put(nature.getName(), nature);
	}

	@Override
	public Nature getByName(String name) {
		return natures.get(name);
	}

	@Override
	public void update(Nature nature) throws JPokemonException {
		if (nature == null) {
			throw new JPokemonException("Cannot register null nature");
		}
		if (nature.getName() == null) {
			throw new JPokemonException("Cannot register nature without a name: " + nature);
		}
		if (!isRegistered(nature.getName())) {
			throw new JPokemonException("A nature is not registered with name: " + nature.getName());
		}

		natures.put(nature.getName(), nature);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister nature without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A nature is not registered with name: " + name);
		}

		natures.remove(name);
	}

	/**
	 * Initializes a new SimpleNatureManager as the {@link Nature#manager}
	 * 
	 * @throws JPokemonException If the Nature.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Nature.manager != null) {
			throw new JPokemonException("Nature.manager is already defined");
		}

		Nature.manager = new SimpleNatureManager();
	}
}
