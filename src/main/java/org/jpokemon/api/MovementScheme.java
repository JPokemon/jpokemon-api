package org.jpokemon.api;

/**
 * Provides an API for movement effects through the overworld indicated by
 * {@link OverworldEntity#movement}
 * 
 * @author zach
 *
 * @since 0.1
 */
public abstract class MovementScheme {
	/** Indicates the manager used to register movement schemes. May be null. */
	public static Manager<MovementScheme> manager;

	/** Gets whether a PokemonTrainer can enter the entity from a direction */
	public abstract boolean canEnterFrom(String direction);

	/** Gets whether a PokemonTrainer can exit the entity moving a direction */
	public abstract boolean canExitToward(String direction);

	/** Gets the movement that being inside this entity enforces */
	public abstract String mustExitToward();
}
