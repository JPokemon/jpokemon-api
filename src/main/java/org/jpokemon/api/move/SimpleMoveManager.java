package org.jpokemon.api.move;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link MoveManager}
 * interface.<br>
 * <br>
 * Important: this manager loads no moves by default.
 */
public class SimpleMoveManager implements MoveManager {

	/** The singleton instance of this class */
	private static SimpleMoveManager instance = new SimpleMoveManager();

	/** The map of Moves that have been registered by name */
	private Map<String, Move> moveMap = new HashMap<String, Move>();

	@Override
	public void registerAbility(Move move) throws JPokemonError {
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
	}

	@Override
	public boolean isRegistered(Move move) {
		return moveMap.containsValue(move);
	}

	@Override
	public Move getByName(String name) {
		return moveMap.get(name);
	}

	/** Gets the singleton instance of this class */
	public static MoveManager getInstance() {
		return instance;
	}

	/** Provides a private constructor. */
	private SimpleMoveManager() {
	}
}