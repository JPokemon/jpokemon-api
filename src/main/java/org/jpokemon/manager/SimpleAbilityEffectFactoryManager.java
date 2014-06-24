package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public boolean isRegistered(String abilityEffectFactoryName) {
		return abilityEffectFactories.containsKey(abilityEffectFactoryName);
	}

	@Override
	public void register(AbilityEffectFactory abilityEffectFactory) throws JPokemonException {
		if (abilityEffectFactory == null) {
			throw new JPokemonException("Cannot register null ability effect factory");
		}
		if (abilityEffectFactory.getAbilityEffectClass() == null) {
			throw new JPokemonException("Cannot register ability effect factory without ability effect class: "
					+ abilityEffectFactory);
		}
		if (isRegistered(abilityEffectFactory.getAbilityEffectClass().getName())) {
			throw new JPokemonException("An ability effect factory is already registered with ability effect class: "
					+ abilityEffectFactory.getAbilityEffectClass().getName());
		}

		abilityEffectFactories.put(abilityEffectFactory.getAbilityEffectClass().getName(), abilityEffectFactory);
	}

	@Override
	public List<AbilityEffectFactory> getAll() {
		return new ArrayList<AbilityEffectFactory>(abilityEffectFactories.values());
	}

	@Override
	public AbilityEffectFactory getByName(String name) {
		return abilityEffectFactories.get(name);
	}

	@Override
	public void update(AbilityEffectFactory abilityEffectFactory) throws JPokemonException {
		if (abilityEffectFactory == null) {
			throw new JPokemonException("Cannot register null ability effect factory");
		}
		if (abilityEffectFactory.getAbilityEffectClass() == null) {
			throw new JPokemonException("Cannot register ability effect factory without ability effect class: "
					+ abilityEffectFactory);
		}
		if (!isRegistered(abilityEffectFactory.getAbilityEffectClass().getName())) {
			throw new JPokemonException("An ability effect factory is not registered with ability effect class: "
					+ abilityEffectFactory.getClass().getName());
		}

		abilityEffectFactories.put(abilityEffectFactory.getAbilityEffectClass().getName(), abilityEffectFactory);
	}

	@Override
	public void unregister(String abilityEffectClass) throws JPokemonException {
		if (abilityEffectClass == null) {
			throw new JPokemonException("Cannot unregister ability effect factory without ability effect class");
		}
		if (!isRegistered(abilityEffectClass)) {
			throw new JPokemonException("An ability effect factory is not registered with ability effect class: "
					+ abilityEffectClass);
		}

		abilityEffectFactories.remove(abilityEffectClass);
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
