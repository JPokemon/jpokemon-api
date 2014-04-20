package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.AbilityEffectFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link AbilityEffectFactory#manager}. Note that, as Abilities and their
 * effects are extremely implementation-specific,
 * SimpleAbilityEffectFactoryManager provides no "Classic" effects for any
 * abilities.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleAbilityEffectFactoryManager implements Manager<AbilityEffectFactory> {
	protected Map<String, AbilityEffectFactory> abilityEffectFactories = new HashMap<String, AbilityEffectFactory>();

	/** Provides the default constructor */
	public SimpleAbilityEffectFactoryManager() {
	}

	@Override
	public void register(AbilityEffectFactory abilityEffectFactory) throws JPokemonException {
		if (abilityEffectFactory == null) {
			throw new JPokemonException("Cannot register null ability effect factory");
		}
		else if (abilityEffectFactory.getName() == null) {
			throw new JPokemonException("Cannot register ability effect factory without a name: " + abilityEffectFactory);
		}
		else if (abilityEffectFactories.containsKey(abilityEffectFactory.getName())
				&& !abilityEffectFactory.equals(abilityEffectFactories.get(abilityEffectFactory.getName()))) {
			throw new JPokemonException("An ability effect factory with the same name is already registered: "
					+ abilityEffectFactory);
		}

		abilityEffectFactories.put(abilityEffectFactory.getName(), abilityEffectFactory);
	}

	@Override
	public boolean isRegistered(String abilityEffectFactoryName) {
		if (abilityEffectFactoryName == null) {
			return false;
		}

		return getByName(abilityEffectFactoryName) != null;
	}

	@Override
	public AbilityEffectFactory getByName(String name) {
		return abilityEffectFactories.get(name);
	}

	/**
	 * Initializes a new SimpleAbilityEffectFactoryManager as the
	 * {@link AbilityEffectFactory#manager}
	 * 
	 * @throws JPokemonException If the AbilityEffectFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (AbilityEffectFactory.manager != null) {
			throw new JPokemonException("AbilityEffectFactory.manager is already defined");
		}

		AbilityEffectFactory.manager = new SimpleAbilityEffectFactoryManager();
	}
}
