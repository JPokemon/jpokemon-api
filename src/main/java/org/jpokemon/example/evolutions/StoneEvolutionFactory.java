package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;

/**
 * Provides an {@link EvolutionFactory} which builds {@link StoneEvolution}
 * instances. Assigns options as stone type.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class StoneEvolutionFactory extends EvolutionFactory {
	public static final String EVOLUTION_FACTORY_NAME = "stone";

	@Override
	public String getName() {
		return EVOLUTION_FACTORY_NAME;
	}

	@Override
	public Evolution buildEvolution(String options) {
		StoneEvolution stoneEvolution = new StoneEvolution();
		stoneEvolution.setType(options);
		return stoneEvolution;
	}
}