package org.jpokemon.api;

/**
 * Defines an Action that an entity in the overworld may perform
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface Action {
	/** Executes this action on the available Pokémon trainer */
	public void execute(PokemonTrainer pokemonTrainer) throws JPokemonException;
}
