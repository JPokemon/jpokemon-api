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
	/** Indicates the manager used to register movement schemes builders */
	public static Manager<Builder<MovementScheme>> builders;

	/** Gets the name of this movement scheme */
	public abstract String getName();

	public abstract boolean isSolid();

	public abstract String getNextMove(String move);
}
