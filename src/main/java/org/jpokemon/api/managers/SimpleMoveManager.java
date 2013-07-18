package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.moves.Move;

/**
 * Defines a "simplest-possible" implementation of the {@link MoveManager}
 * interface.<br>
 * <br>
 * Important: this manager loads no moves by default.
 */
public class SimpleMoveManager implements Manager<Move> {
	/** The map of Moves that have been registered by name */
	private Map<String, Move> moveMap = new HashMap<String, Move>();

	@Override
	public boolean register(Move move) throws JPokemonError {
		if (move == null) {
			throw new JPokemonError("Cannot register a null move");
		}
		if (move.getName() == null) {
			throw new JPokemonError("An ability cannot be registered if it has no name");
		}
		if (moveMap.containsKey(move.getName())) {
			throw new JPokemonError("An ability with the same name is already registered: " + move.getName());
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
}