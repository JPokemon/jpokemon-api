package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

public class Round {
	/** Indicates the turns registered in this round */
	protected Map<PokemonContainer, Turn> turns;

	/** Gets the turn registered to a pokemon container */
	public Turn getTurn(PokemonContainer pokemonContainer) {
		if (turns != null) {
			return turns.get(pokemonContainer);
		}

		return null;
	}

	/** Sets the turn registered to a pokemon container */
	public Round setTurn(PokemonContainer pokemonContainer, Turn turn) {
		if (turns == null) {
			turns = new HashMap<PokemonContainer, Turn>();
		}

		turns.put(pokemonContainer, turn);
		return this;
	}

	/** Removes the turn registered to a pokemon container */
	public Round removeTurn(PokemonContainer pokemonContainer) {
		if (turns != null) {
			turns.remove(pokemonContainer);
		}

		return this;
	}

	/** Gets the turns registered in this round */
	public Map<PokemonContainer, Turn> getTurns() {
		if (turns == null) {
			turns = new HashMap<PokemonContainer, Turn>();
		}

		return turns;
	}

	/** Sets the turns registered in this round */
	public void setTurns(Map<PokemonContainer, Turn> turns) {
		this.turns = turns;
	}
}
