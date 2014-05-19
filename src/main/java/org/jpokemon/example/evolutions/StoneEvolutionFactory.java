package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an {@link EvolutionFactory} which builds {@link StoneEvolution}
 * instances. Assigns options as stone type.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class StoneEvolutionFactory extends EvolutionFactory {
	@Override
	public Class<StoneEvolution> getEvolutionClass() {
		return StoneEvolution.class;
	}

	@Override
	public Evolution buildEvolution(String options) {
		StoneEvolution stoneEvolution = new StoneEvolution();
		stoneEvolution.setType(options);
		return stoneEvolution;
	}

	@Override
	public String serializeEvolution(Evolution evolution) throws JPokemonException {
		if (!(evolution instanceof StoneEvolution)) {
			throw new JPokemonException("Expected stone evolution object: " + evolution);
		}

		StoneEvolution stoneEvolution = (StoneEvolution) evolution;
		return stoneEvolution.getType();
	}
}
