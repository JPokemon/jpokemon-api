package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.example.evolutions.factory.HappinessEvolutionFactory;
import org.jpokemon.example.evolutions.factory.LevelEvolutionFactory;
import org.jpokemon.example.evolutions.factory.StoneEvolutionFactory;

public class ClassicEvolutionFactoryManager implements Manager<EvolutionFactory> {
	protected Map<String, EvolutionFactory> evolutionFactories = new HashMap<String, EvolutionFactory>();

	public ClassicEvolutionFactoryManager() {
		register(new HappinessEvolutionFactory());
		register(new LevelEvolutionFactory());
		register(new StoneEvolutionFactory());
	}

	@Override
	public boolean register(EvolutionFactory evolutionFactory) throws JPokemonError {
		if (isRegistered(evolutionFactory)) {
			throw new JPokemonError("Evolution Factory already registered: " + evolutionFactory.toString());
		}

		evolutionFactories.put(evolutionFactory.getName(), evolutionFactory);
		return true;
	}

	@Override
	public boolean isRegistered(EvolutionFactory experienceCurve) {
		if (experienceCurve == null) {
			return false;
		}

		return getByName(experienceCurve.getName()) != null;
	}

	@Override
	public EvolutionFactory getByName(String name) {
		return evolutionFactories.get(name);
	}

	public static void init() throws JPokemonError {
		if (EvolutionFactory.manager != null) {
			throw new JPokemonError("EvolutionFactory.manager is already defined");
		}

		EvolutionFactory.manager = new ClassicEvolutionFactoryManager();
	}
}