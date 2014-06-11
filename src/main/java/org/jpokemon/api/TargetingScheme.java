package org.jpokemon.api;

import java.util.List;

public abstract class TargetingScheme {
	public static Manager<TargetingScheme> manager;

	public abstract String getName();

	public abstract List<PokemonContainer> getPotentialTargets(PokemonContainer pokemonContainer, String target);
}
