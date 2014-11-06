package org.ospokemon;

/**
 * Defines a test of some kind. A requirement can test a PokemonTrainer, a
 * Pokemon, or both.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class Requirement {
	/** Indicates the manager used to register requirement builders */
	public static Manager<Builder<Requirement>> builders;

	/** Tests whether this requirement is satisfied */
	public abstract boolean test(PokemonTrainer pokemonTrainer, Pokemon pokemon);
}
