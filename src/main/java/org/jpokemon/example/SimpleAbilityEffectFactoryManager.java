package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.AbilityEffectFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

public class SimpleAbilityEffectFactoryManager implements Manager<AbilityEffectFactory> {
	protected Map<String, AbilityEffectFactory> abilityEffectFactories = new HashMap<String, AbilityEffectFactory>();

	public SimpleAbilityEffectFactoryManager() {
	}

	@Override
	public void register(AbilityEffectFactory abilityEffectFactory) throws JPokemonException {
		if (isRegistered(abilityEffectFactory)) {
			throw new JPokemonException("Ability Effect Factory already registered: " + abilityEffectFactory.toString());
		}

		abilityEffectFactories.put(abilityEffectFactory.getName(), abilityEffectFactory);
	}

	@Override
	public boolean isRegistered(AbilityEffectFactory abilityEffectFactory) {
		if (abilityEffectFactory == null) {
			return false;
		}

		return getByName(abilityEffectFactory.getName()) != null;
	}

	@Override
	public AbilityEffectFactory getByName(String name) {
		return abilityEffectFactories.get(name);
	}
}