package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Move;

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
	public void register(Move move) throws JPokemonException {
		if (move == null) {
			throw new JPokemonException("Cannot register a null move");
		}
		if (move.getName() == null) {
			throw new JPokemonException("A move cannot be registered if it has no name");
		}
		if (moveMap.containsKey(move.getName())) {
			throw new JPokemonException("A move with the same name is already registered: " + move.getName());
		}

		moveMap.put(move.getName(), move);
	}

	@Override
	public boolean isRegistered(Move move) {
		return moveMap.containsValue(move);
	}

	@Override
	public Move getByName(String name) {
		return moveMap.get(name);
	}

	public static void init() throws JPokemonException {
		if (Move.manager != null) {
			throw new JPokemonException("Move.manager is already defined");
		}

		Move.manager = new SimpleMoveManager();
	}
}