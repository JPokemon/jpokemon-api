package org.jpokemon.pmapi.pokemon.ability;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.pmapi.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link AbilityManager}
 * interface.<br>
 * <br>
 * Important: this manager loads no types by default.
 */
public class SimpleAbilityManager implements AbilityManager {
	/** */
	private static final AbilityManager instance = new SimpleAbilityManager();

	private final Map<String, PokemonAbility> abilityMap = new HashMap<String, PokemonAbility>();

	@Override
	public void registerAbility(PokemonAbility ability) throws JPokemonError {
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

	@Override
	public boolean isRegistered(PokemonAbility ability) {
		return abilityMap.containsValue(ability);
	}

	@Override
	public PokemonAbility getByName(String name) {
		return abilityMap.get(name);
	}

	/** Gets the singleton instance of this class */
	public static AbilityManager getInstance() {
		return instance;
	}

	/** Provides a private constructor. */
	private SimpleAbilityManager() {
	}
}