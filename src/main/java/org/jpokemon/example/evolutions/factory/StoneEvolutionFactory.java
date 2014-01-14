package org.jpokemon.example.evolutions.factory;

import org.jpokemon.api.Evolution;
import org.jpokemon.api.EvolutionFactory;
import org.jpokemon.example.evolutions.StoneEvolution;

public class StoneEvolutionFactory extends EvolutionFactory {
	@Override
	public String getName() {
		return "stone";
	}

	@Override
	public Evolution buildEvolution(String options) {
		StoneEvolution stoneEvolution = new StoneEvolution();
		stoneEvolution.setType(options);
		return stoneEvolution;
	}
}