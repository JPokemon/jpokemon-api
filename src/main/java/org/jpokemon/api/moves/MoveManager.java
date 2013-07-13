package org.jpokemon.api.moves;

import org.jpokemon.api.JPokemonError;

/**
 * Provides an interface for keeping track of {@link Move}s in an application.
 * The most basic implementation is the {@link SimpleMoveManager} class. Classic
 * moves are not defined because their implementation is outside the scope of
 * this library.
 * 
 * @author Zach Taylor
 * 
 * @since  0.1
 */
public interface MoveManager {
	/**
	 * Registers a move with the manager so it can be looked up by name.
	 * 
	 * @param move The Move to be registered.
	 * 
	 * @throws JPokemonError if there is an error registering the move.
	 */
	public void registerAbility(Move move) throws JPokemonError;

	/**
	 * Checks if a move is registered with the manager.
	 * 
	 * @return `true` if the move is known to the manager.
	 */
	public boolean isRegistered(Move move);

	/**
	 * Gets a move registered with this manager by name.
	 * 
	 * @param name The name of the ability requested.
	 * @return The {@link Move} for this type.
	 */
	public Move getByName(String name);
}