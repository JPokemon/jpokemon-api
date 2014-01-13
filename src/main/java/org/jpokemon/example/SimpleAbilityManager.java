package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Ability;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link Manager} for
 * abilities. Note that, as Abilities are extremely implementation-specific,
 * SimpleAbilityManager provides no "Classic" abilities.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleAbilityManager implements Manager<Ability> {
	private final Map<String, Ability> abilityMap = new HashMap<String, Ability>();

	/** Provides the default constructor. */
	public SimpleAbilityManager() {
	}

	@Override
	public boolean register(Ability ability) throws JPokemonError {
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
	public boolean isRegistered(Ability ability) {
		return abilityMap.containsValue(ability);
	}

	@Override
	public Ability getByName(String name) {
		return abilityMap.get(name);
	}

	public static void init() throws JPokemonError {
		if (Ability.manager != null) {
			throw new JPokemonError("Ability.manager is already defined");
		}

		Ability.manager = new SimpleAbilityManager();
	}
}