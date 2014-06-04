package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Move;

/**
 * Defines a "simplest-possible" implementation of the {@link Move#manager}.
 * Note that, as Moves are extremely implementation-specific, SimpleMoveManager
 * provides no "Classic" moves.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleMoveManager implements Manager<Move> {
	/** The map of Moves that have been registered by name */
	protected Map<String, Move> moves = new HashMap<String, Move>();

	/** Provides the default constructor */
	public SimpleMoveManager() {
	}

	@Override
	public boolean isRegistered(String moveName) {
		if (moveName == null) {
			return false;
		}

		return moves.get(moveName) != null;
	}

	@Override
	public void register(Move move) throws JPokemonException {
		if (move == null) {
			throw new JPokemonException("Cannot register null move");
		}
		if (move.getName() == null) {
			throw new JPokemonException("Cannot register move without a name: " + move);
		}
		if (moves.containsKey(move.getName())) {
			throw new JPokemonException("A move with the same name is already registered: " + move);
		}

		moves.put(move.getName(), move);
	}

	@Override
	public Move getByName(String name) {
		return moves.get(name);
	}

	@Override
	public void update(Move move) throws JPokemonException {
		if (move == null) {
			throw new JPokemonException("Cannot register null move");
		}
		if (move.getName() == null) {
			throw new JPokemonException("Cannot register move without a name: " + move);
		}
		if (!moves.containsKey(move.getName())) {
			throw new JPokemonException("A move with the same name is not registered: " + move);
		}

		moves.put(move.getName(), move);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister move without a name");
		}
		if (!moves.containsKey(name)) {
			throw new JPokemonException("There is no move with name: " + name);
		}

		moves.remove(name);
	}

	/**
	 * Initializes a new SimpleMoveManager as the {@link Move#manager}
	 * 
	 * @throws JPokemonException If the Move.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Move.manager != null) {
			throw new JPokemonException("Move.manager is already defined");
		}

		Move.manager = new SimpleMoveManager();
	}
}
