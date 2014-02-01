package org.jpokemon.example.evolutions;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

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
	public static final String HAPPINESS_FACTORY = HappinessEvolutionFactory.EVOLUTION_NAME;

	/** Indicates the name of the level evolution factory */
	public static final String LEVEL_FACTORY = LevelEvolutionFactory.EVOLUTION_NAME;

	/** Indicates the name of the stone evolution factory */
	public static final String STONE_FACTORY = StoneEvolutionFactory.EVOLUTION_NAME;

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
		else if (evolutionFactory.getName() == null) {
			throw new JPokemonException("Cannot register evolution factory without a name: " + evolutionFactory);
		}
		else if (evolutionFactories.containsKey(evolutionFactory.getName())
				&& !evolutionFactory.equals(evolutionFactories.get(evolutionFactory.getName()))) {
			throw new JPokemonException("An evolution factory with the same name is already registered: " + evolutionFactory);
		}

		evolutionFactories.put(evolutionFactory.getName(), evolutionFactory);
	}

	@Override
	public boolean isRegistered(EvolutionFactory evolutionFactory) {
		if (evolutionFactory == null) {
			return false;
		}

		return getByName(evolutionFactory.getName()) != null;
	}

	@Override
	public EvolutionFactory getByName(String name) {
		return evolutionFactories.get(name);
	}

	/**
	 * Initializes a new ClassicEvolutionFactoryManager as the
	 * {@link EvolutionFactory#manager}
	 * 
	 * @throws JPokemonException If the Evolution.factory manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (EvolutionFactory.manager != null) {
			throw new JPokemonException("EvolutionFactory.manager is already defined");
		}

		EvolutionFactory.manager = new ClassicEvolutionFactoryManager();
	}
}
