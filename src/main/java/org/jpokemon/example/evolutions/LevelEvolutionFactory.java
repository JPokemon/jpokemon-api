package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an {@link EvolutionFactory} which builds {@link LevelEvolution}
 * instances. Expects integer level as options.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class LevelEvolutionFactory extends EvolutionFactory {
	public static final String EVOLUTION_FACTORY_NAME = "level";

	@Override
	public String getName() {
		return EVOLUTION_FACTORY_NAME;
	}

	@Override
	public Evolution buildEvolution(String options) throws JPokemonException {
		LevelEvolution levelEvolution = new LevelEvolution();

		try {
			int level = Integer.parseInt(options);
			levelEvolution.setLevel(level);
		} catch (NumberFormatException e) {
			throw new JPokemonException("Expected integer level: " + options);
		}

		return levelEvolution;
	}
}
