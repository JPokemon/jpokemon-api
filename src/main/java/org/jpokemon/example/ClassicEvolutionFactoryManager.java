package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.example.evolutions.HappinessEvolution;
import org.jpokemon.example.evolutions.HappinessEvolutionFactory;
import org.jpokemon.example.evolutions.LevelEvolution;
import org.jpokemon.example.evolutions.LevelEvolutionFactory;
import org.jpokemon.example.evolutions.StoneEvolution;
import org.jpokemon.example.evolutions.StoneEvolutionFactory;

/**
 * Provides an example implementation of the {@link EvolutionFactory#manager},
 * using several classic evolution types
 * 
 * @see HappinessEvolutionFactory
 * @see LevelEvolutionFactory
 * @see StoneEvolutionFactory
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicEvolutionFactoryManager implements Manager<EvolutionFactory> {
	protected Map<String, EvolutionFactory> evolutionFactories = new HashMap<String, EvolutionFactory>();

	/** Indicates the name of the happiness evolution factory */
	public static final String HAPPINESS_EVOLUTION_FACTORY = HappinessEvolution.class.getName();

	/** Indicates the name of the level evolution factory */
	public static final String LEVEL_EVOLUTION_FACTORY = LevelEvolution.class.getName();

	/** Indicates the name of the stone evolution factory */
	public static final String STONE_EVOLUTION_FACTORY = StoneEvolution.class.getName();

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
		else if (evolutionFactory.getEvolutionClass() == null) {
			throw new JPokemonException("Cannot register evolution factory without evolution class: " + evolutionFactory);
		}
		else if (evolutionFactories.containsKey(evolutionFactory.getEvolutionClass().getName())
				&& !evolutionFactory.equals(evolutionFactories.get(evolutionFactory.getEvolutionClass().getName()))) {
			throw new JPokemonException("An evolution factory with the same name is already registered: " + evolutionFactory);
		}

		evolutionFactories.put(evolutionFactory.getEvolutionClass().getName(), evolutionFactory);
	}

	@Override
	public boolean isRegistered(String evolutionFactoryName) {
		if (evolutionFactoryName == null) {
			return false;
		}

		return getByName(evolutionFactoryName) != null;
	}

	@Override
	public EvolutionFactory getByName(String name) {
		return evolutionFactories.get(name);
	}

	/**
	 * Initializes a new ClassicEvolutionFactoryManager as the
	 * {@link EvolutionFactory#manager}
	 * 
	 * @throws JPokemonException If the EvolutionFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (EvolutionFactory.manager != null) {
			throw new JPokemonException("EvolutionFactory.manager is already defined");
		}

		EvolutionFactory.manager = new ClassicEvolutionFactoryManager();
	}
}
