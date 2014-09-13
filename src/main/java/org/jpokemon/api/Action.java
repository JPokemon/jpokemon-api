package org.jpokemon.api;

/**
 * Defines an interface for interaction
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class Action {
	/** Indicates the manager used to register action builders */
	public static Manager<Builder<Action>> builders;

	/** Executes this action with the provided context */
	public abstract void execute(Overworld overworld, OverworldEntity entity, PokemonTrainer pokemonTrainer) throws JPokemonException;
}
