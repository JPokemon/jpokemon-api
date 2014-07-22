package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a Round in a Battle, which is composed of 1 turn for each Pokémon
 * participating in the Battle
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class Round {
	/** Indicates the turns registered in this round */
	protected Map<PokemonContainer, Turn> turns;

	/** Indicates the battle effects which are applicable to this round */
	protected List<BattleEffect> battleEffects;

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

	/**
	 * Adds a battle effect to the battle effects which are applicable to this
	 * round
	 */
	public Round addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to
	 * this round
	 */
	public Round removeBattleEffects(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

		return this;
	}

	/** Gets the battle effects which are applicable to this round */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		return battleEffects;
	}

	/** Sets the battle effects which are applicable to this round */
	public Round setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}
}
