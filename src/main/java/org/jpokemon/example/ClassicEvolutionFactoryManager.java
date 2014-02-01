package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
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
	public void register(EvolutionFactory evolutionFactory) throws JPokemonException {
		if (evolutionFactory == null) {
			throw new JPokemonException("Cannot register null evolution factory");
		}
		if (isRegistered(evolutionFactory)) {
			throw new JPokemonException("Evolution Factory already registered: " + evolutionFactory.toString());
		}

		evolutionFactories.put(evolutionFactory.getName(), evolutionFactory);
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

	public static void init() throws JPokemonException {
		if (EvolutionFactory.manager != null) {
			throw new JPokemonException("EvolutionFactory.manager is already defined");
		}

		EvolutionFactory.manager = new ClassicEvolutionFactoryManager();
	}
}
