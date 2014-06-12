package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link EvolutionFactory#manager}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleEvolutionFactoryManager implements Manager<EvolutionFactory> {
	protected Map<String, EvolutionFactory> evolutionFactories = new HashMap<String, EvolutionFactory>();

	/** Provides the default constructor */
	public SimpleEvolutionFactoryManager() {
	}

	@Override
	public boolean isRegistered(String evolutionFactoryName) {
		return evolutionFactories.containsKey(evolutionFactoryName);
	}

	@Override
	public void register(EvolutionFactory evolutionFactory) throws JPokemonException {
		if (evolutionFactory == null) {
			throw new JPokemonException("Cannot register null evolution factory");
		}
		if (evolutionFactory.getEvolutionClass() == null) {
			throw new JPokemonException("Cannot register evolution factory without evolution class: " + evolutionFactory);
		}
		if (isRegistered(evolutionFactory.getEvolutionClass().getName())) {
			throw new JPokemonException("An evolution factory is already registered with evolution class: "
					+ evolutionFactory.getClass().getName());
		}

		evolutionFactories.put(evolutionFactory.getEvolutionClass().getName(), evolutionFactory);
	}

	@Override
	public EvolutionFactory getByName(String name) {
		return evolutionFactories.get(name);
	}

	@Override
	public void update(EvolutionFactory evolutionFactory) throws JPokemonException {
		if (evolutionFactory == null) {
			throw new JPokemonException("Cannot register null evolution factory");
		}
		if (evolutionFactory.getEvolutionClass() == null) {
			throw new JPokemonException("Cannot register evolution factory without evolution class: " + evolutionFactory);
		}
		if (!isRegistered(evolutionFactory.getEvolutionClass().getName())) {
			throw new JPokemonException("An evolution factory is not registered with evolution class: "
					+ evolutionFactory.getClass().getName());
		}

		evolutionFactories.put(evolutionFactory.getEvolutionClass().getName(), evolutionFactory);
	}

	@Override
	public void unregister(String evolutionClass) throws JPokemonException {
		if (evolutionClass == null) {
			throw new JPokemonException("Cannot unregister evolution factory without evolution class");
		}
		if (!isRegistered(evolutionClass)) {
			throw new JPokemonException("An evolution factory is not registered with evolution class: " + evolutionClass);
		}

		evolutionFactories.remove(evolutionClass);
	}

	/**
	 * Initializes a new SimpleEvolutionFactoryManager as the
	 * {@link EvolutionFactory#manager}
	 * 
	 * @throws JPokemonException If the EvolutionFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (EvolutionFactory.manager != null) {
			throw new JPokemonException("EvolutionFactory.manager is already defined");
		}

		EvolutionFactory.manager = new SimpleEvolutionFactoryManager();
	}
}
