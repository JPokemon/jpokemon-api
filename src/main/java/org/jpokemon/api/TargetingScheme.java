package org.jpokemon.api;

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
	public abstract String getName();

	/**
	 * Gets the potential targets for a Pokémon using a Move which has this
	 * targeting scheme
	 */
	public abstract List<PokemonContainer> getPotentialTargets(PokemonContainer pokemonContainer, Battle battle);
}
