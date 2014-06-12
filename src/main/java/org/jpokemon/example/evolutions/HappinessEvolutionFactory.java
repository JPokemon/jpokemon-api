package org.jpokemon.example.evolutions;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an {@link EvolutionFactory} which builds {@link HappinessEvolution}
 * instances. Expects integer happiness score as options.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class HappinessEvolutionFactory extends EvolutionFactory {
	@Override
	public Class<HappinessEvolution> getEvolutionClass() {
		return HappinessEvolution.class;
	}

	@Override
	public Evolution buildEvolution(String options) throws JPokemonException {
		HappinessEvolution happinessEvolution = new HappinessEvolution();

		try {
			int happiness = Integer.parseInt(options);
			happinessEvolution.setHappiness(happiness);
		} catch (NumberFormatException e) {
			throw new JPokemonException("Expected happiness integer score: " + options);
		}

		return happinessEvolution;
	}

	@Override
	public String serializeEvolution(Evolution evolution) throws JPokemonException {
		if (!(evolution instanceof HappinessEvolution)) {
			throw new JPokemonException("Expected happiness evolution object: " + evolution);
		}

		HappinessEvolution happinessEvolution = (HappinessEvolution) evolution;
		return Integer.toString(happinessEvolution.getHappiness());
	}
}
