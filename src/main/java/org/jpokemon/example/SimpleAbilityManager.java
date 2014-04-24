package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Ability;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the {@link Ability#manager}.
 * Note that, as Abilities are extremely implementation-specific,
 * SimpleAbilityManager provides no "Classic" abilities.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleAbilityManager implements Manager<Ability> {
	protected Map<String, Ability> abilities = new HashMap<String, Ability>();

	/** Provides the default constructor. */
	public SimpleAbilityManager() {
	}

	@Override
	public void register(Ability ability) throws JPokemonException {
		if (ability == null) {
			throw new JPokemonException("Cannot register null ability");
		}
		else if (ability.getName() == null) {
			throw new JPokemonException("Cannot register ability without a name: " + ability);
		}
		else if (abilities.containsKey(ability.getName()) && !ability.equals(abilities.get(ability.getName()))) {
			throw new JPokemonException("An ability with the same name is already registered: " + ability);
		}

		abilities.put(ability.getName(), ability);
	}

	@Override
	public boolean isRegistered(String abilityName) {
		if (abilityName == null) {
			return false;
		}

		return getByName(abilityName) != null;
	}

	@Override
	public Ability getByName(String name) {
		return abilities.get(name);
	}

	/**
	 * Initializes a new SimpleAbilityManager as the {@link Ability#manager}
	 * 
	 * @throws JPokemonException If the Ability.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Ability.manager != null) {
			throw new JPokemonException("Ability.manager is already defined");
		}

		Ability.manager = new SimpleAbilityManager();
	}
}
