package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

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

	/** Provides the default constructor */
	public SimpleAbilityManager() {
	}

	@Override
	public boolean isRegistered(String abilityName) {
		return abilities.containsKey(abilityName);
	}

	@Override
	public void register(Ability ability) throws JPokemonException {
		if (ability == null) {
			throw new JPokemonException("Cannot register null ability");
		}
		if (ability.getName() == null) {
			throw new JPokemonException("Cannot register ability without a name: " + ability);
		}
		if (isRegistered(ability.getName())) {
			throw new JPokemonException("An ability is already registered with name: " + ability.getName());
		}

		abilities.put(ability.getName(), ability);
	}

	@Override
	public Ability getByName(String name) {
		return abilities.get(name);
	}

	@Override
	public void update(Ability ability) throws JPokemonException {
		if (ability == null) {
			throw new JPokemonException("Cannot register null ability");
		}
		if (ability.getName() == null) {
			throw new JPokemonException("Cannot register ability without a name: " + ability);
		}
		if (!isRegistered(ability.getName())) {
			throw new JPokemonException("An ability is not registered with name: " + ability.getName());
		}

		abilities.put(ability.getName(), ability);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister ability without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("An ability is not registered with name: " + name);
		}

		abilities.remove(name);
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
