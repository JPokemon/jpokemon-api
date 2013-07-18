package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Manager;
import org.jpokemon.api.abilities.PokemonAbility;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link AbilityManager}
 * interface.<br>
 * <br>
 * Important: this manager loads no types by default.
 */
public class SimpleAbilityManager implements Manager<PokemonAbility> {
	private final Map<String, PokemonAbility> abilityMap = new HashMap<String, PokemonAbility>();

	@Override
	public boolean register(PokemonAbility ability) throws JPokemonError {
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
		return true;
	}

	@Override
	public boolean isRegistered(PokemonAbility ability) {
		return abilityMap.containsValue(ability);
	}

	@Override
	public PokemonAbility getByName(String name) {
		return abilityMap.get(name);
	}

	/** Provides a private constructor. */
	public SimpleAbilityManager() {
	}
}