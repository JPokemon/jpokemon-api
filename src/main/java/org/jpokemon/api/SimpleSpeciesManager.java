package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

public class SimpleSpeciesManager implements Manager<Species> {
	protected Map<String, Species> registeredSpecies = new HashMap<String, Species>();

	/** Provides the default constructor */
	public SimpleSpeciesManager() {
	}

	@Override
	public boolean isRegistered(String speciesName) {
		return registeredSpecies.containsKey(speciesName);
	}

	@Override
	public void register(Species species) throws JPokemonException {
		if (species == null) {
			throw new JPokemonException("Cannot register null species");
		}
		if (species.getName() == null) {
			throw new JPokemonException("Cannot register species without a name: " + species);
		}
		if (isRegistered(species.getName())) {
			throw new JPokemonException("A species is already registered with name: " + species.getName());
		}

		registeredSpecies.put(species.getName(), species);
	}

	@Override
	public Species getByName(String name) {
		return registeredSpecies.get(name);
	}

	@Override
	public void update(Species species) throws JPokemonException {
		if (species == null) {
			throw new JPokemonException("Cannot register null species");
		}
		if (species.getName() == null) {
			throw new JPokemonException("Cannot register species without a name: " + species);
		}
		if (!isRegistered(species.getName())) {
			throw new JPokemonException("A species is not registered with name: " + species.getName());
		}

		registeredSpecies.put(species.getName(), species);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister species without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A species is not registered with name: " + name);
		}

		registeredSpecies.remove(name);
	}

	/**
	 * Initializes a new SimpleSpeciesManager as the {@link Species#manager}
	 * 
	 * @throws JPokemonException If the Species.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Species.manager != null) {
			throw new JPokemonException("Species.manager is already defined");
		}

		Species.manager = new SimpleSpeciesManager();
	}
}
