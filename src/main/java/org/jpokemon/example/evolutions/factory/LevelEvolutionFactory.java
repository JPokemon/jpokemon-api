package org.jpokemon.example.evolutions.factory;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.example.evolutions.LevelEvolution;

public class LevelEvolutionFactory extends EvolutionFactory {
	@Override
	public String getName() {
		return "level";
	}

	@Override
	public Evolution buildEvolution(String options) {
		LevelEvolution levelEvolution = new LevelEvolution();

		try {
			int level = Integer.parseInt(options);
			levelEvolution.setLevel(level);
		}
		catch (NumberFormatException e) { // TODO - log
		}

		return levelEvolution;
	}
}