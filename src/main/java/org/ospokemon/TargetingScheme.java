package org.ospokemon;

import java.util.List;

/**
 * Defines a strategy for {@link Move#target} references to be resolved in a
 * battle
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class TargetingScheme {
	/** Indicates the manager used to register TargetingSchemes. May be null. */
	public static Manager<TargetingScheme> manager;

	/** Gets the name of this targeting scheme */
	public abstract String getId();

	/** Gets the potential targets, given the context */
	public abstract List<PokemonContainer> getPotentialTargets(PokemonContainer pokemonContainer, Battle battle);
}
