package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.moves.Move;

/**
 * Defines a "simplest-possible" implementation of the {@link MoveManager}
 * interface for moves. Note that, as Moves are extremely
 * implementation-specific, SimpleMoveManager provides no "Classic" moves.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleMoveManager implements Manager<Move> {
	/** The map of Moves that have been registered by name */
	private Map<String, Move> moveMap = new HashMap<String, Move>();

	/** Provides the default constructor */
	public SimpleMoveManager() {
	}

	@Override
	public boolean register(Move move) throws JPokemonError {
		if (move == null) {
			throw new JPokemonError("Cannot register a null move");
		}
		if (move.getName() == null) {
			throw new JPokemonError("A move cannot be registered if it has no name");
		}
		if (moveMap.containsKey(move.getName())) {
			throw new JPokemonError("A move with the same name is already registered: " + move.getName());
		}

		moveMap.put(move.getName(), move);
		return true;
	}

	@Override
	public boolean isRegistered(Move move) {
		return moveMap.containsValue(move);
	}

	@Override
	public Move getByName(String name) {
		return moveMap.get(name);
	}

	public static void init() throws JPokemonError {
		if (Move.manager != null) {
			throw new JPokemonError("Move.manager is already defined");
		}

		Move.manager = new SimpleMoveManager();
	}
}