package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Ability;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

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
	public void register(Ability ability) throws JPokemonException {
		if (ability == null) {
			throw new JPokemonException("Cannot register a null ability");
		}
		if (ability.getName() == null) {
			throw new JPokemonException("An ability cannot be registered if it has no name");
		}
		if (abilityMap.containsKey(ability.getName())) {
			throw new JPokemonException("An ability with the same name is already registered: " + ability.getName());
		}

		abilityMap.put(ability.getName(), ability);
	}

	@Override
	public boolean isRegistered(Ability ability) {
		return abilityMap.containsValue(ability);
	}

	@Override
	public Ability getByName(String name) {
		return abilityMap.get(name);
	}

	public static void init() throws JPokemonException {
		if (Ability.manager != null) {
			throw new JPokemonException("Ability.manager is already defined");
		}

		Ability.manager = new SimpleAbilityManager();
	}
}