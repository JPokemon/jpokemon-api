package org.jpokemon.api;

/**
 * Defines a requirement of executing an {@link ActionSet}. This may include,
 * but is not limited to, requiring that the trainer has never battled an Npc
 * before, requiring that the trainer has sufficient money, or requiring that
 * the trainer has a Pokémon eligible for trade.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface Requirement {
	/** Tests a Pokémon trainer for satisfying this requirement */
	public boolean isSatisfied(PokemonTrainer pokemonTrainer);
}
