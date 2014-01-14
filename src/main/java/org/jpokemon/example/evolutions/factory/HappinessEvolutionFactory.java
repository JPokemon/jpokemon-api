package org.jpokemon.example.evolutions.factory;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.example.evolutions.HappinessEvolution;

public class HappinessEvolutionFactory extends EvolutionFactory {
	@Override
	public String getName() {
		return "happiness";
	}

	@Override
	public Evolution buildEvolution(String options) {
		HappinessEvolution happinessEvolution = new HappinessEvolution();

		try {
			int happiness = Integer.parseInt(options);
			happinessEvolution.setHappiness(happiness);
		}
		catch (NumberFormatException e) { // TODO - log
		}

		return happinessEvolution;
	}
}