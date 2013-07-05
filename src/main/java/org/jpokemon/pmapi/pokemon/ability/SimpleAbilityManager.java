package org.jpokemon.pmapi.pokemon.ability;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.pmapi.JPokemonError;

public class SimpleAbilityManager {
	private static final Map<String, PokemonAbility> abilityMap = new HashMap<String, PokemonAbility>();

	public static void registerAbility(PokemonAbility ability) throws JPokemonError {
		if (ability == null) {
			throw new JPokemonError("Cannot register a null ability");
		}
		if (ability.getName() == null) {
			throw new JPokemonError("An ability cannot be registered if it has no name");
		}
		if (abilityMap.containsKey(ability.getName())) {
			throw new JPokemonError("An ability with the same name is already registered: " + ability.getName());
		}

		abilityMap.put(ability.getName(), ability);
	}

	public static boolean isRegistered(PokemonAbility ability) {
		return abilityMap.containsValue(ability);
	}

	public static PokemonAbility getByName(String name) {
		return abilityMap.get(name);
	}

	/** Provides a private constructor. */
	private SimpleAbilityManager() {
	}
}