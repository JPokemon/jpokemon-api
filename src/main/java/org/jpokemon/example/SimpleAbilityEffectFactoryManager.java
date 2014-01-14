package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.AbilityEffectFactory;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;

public class SimpleAbilityEffectFactoryManager implements Manager<AbilityEffectFactory> {
	protected Map<String, AbilityEffectFactory> abilityEffectFactories = new HashMap<String, AbilityEffectFactory>();

	public SimpleAbilityEffectFactoryManager() {
	}

	@Override
	public boolean register(AbilityEffectFactory abilityEffectFactory) throws JPokemonError {
		if (isRegistered(abilityEffectFactory)) {
			throw new JPokemonError("Ability Effect Factory already registered: " + abilityEffectFactory.toString());
		}

		abilityEffectFactories.put(abilityEffectFactory.getName(), abilityEffectFactory);
		return true;
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