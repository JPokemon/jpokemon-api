package org.jpokemon.example;

import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;
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
public class ClassicEvolutionFactoryManager extends SimpleEvolutionFactoryManager {
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
