package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.Manager;
import org.jpokemon.api.natures.PokemonNature;

public class SimpleNatureManager implements Manager<PokemonNature> {

	private Map<String, PokemonNature> natureMap = new HashMap<String, PokemonNature>();

	@Override
	public boolean register(PokemonNature nature) throws JPokemonError {
		if (natureMap.containsKey(nature.getName())) {
			throw new JPokemonError("A type with the name " + nature.getName() + " has already been registered!");
		}
		if (natureMap.containsValue(nature)) {
			throw new JPokemonError("This type is already registered!");
		}

		natureMap.put(nature.getName(), nature);
		return true;
	}

	@Override
	public boolean isRegistered(PokemonNature nature) {
		return natureMap.containsValue(nature);
	}

	@Override
	public PokemonNature getByName(String name) {
		if (!natureMap.containsKey(name)) {
			return null;
		}

		return natureMap.get(name);
	}

	public static void init() {
		if (PokemonNature.manager != null) {
			throw new JPokemonError("PokemonNature.manager already defined");
		}

		PokemonNature.manager = new SimpleNatureManager();
	}

	private SimpleNatureManager() {
	}
}
