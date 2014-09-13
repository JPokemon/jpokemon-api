package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a Battle, in the most generic sense. Provides an API in an effort to
 * support Pokémon battles.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class Battle {
	/** Indicates the history of rounds in this battle */
	protected List<Round> rounds;

	/** Indicates the round currently being built for execution */
	protected Round nextRound;

	/** Indicates the trainer containers belonging to this battle */
	protected List<TrainerContainer> trainerContainers;

	/** Indicates the things wagered on this battle */
	protected List<Object> wager;

	/** Indicates the battle effects which are applicable to the whole battle */
	protected List<BattleEffect> battleEffects;

	/** Indicates the battle engine associated with this battle */
	protected BattleEngine battleEngine;

	/** Indicates the targeting scheme associated with this battle */
	protected TargetingScheme targetingScheme;

	/** Adds a round to the history of rounds in this battle */
	public Battle addRound(Round round) {
		if (rounds == null) {
			rounds = new ArrayList<Round>();
		}

		rounds.add(round);
		return this;
	}

	/** Removes a round from the history of rounds in this battle */
	public Battle removeRound(Round round) {
		if (rounds != null) {
			rounds.remove(round);
		}

		return this;
	}

	/** Gets the history of rounds in this battle */
	public List<Round> getRounds() {
		if (rounds == null) {
			rounds = new ArrayList<Round>();
		}

		return rounds;
	}

	/** Sets the history of rounds in this battle */
	public Battle setRounds(List<Round> rounds) {
		this.rounds = rounds;
		return this;
	}

	/** Gets the round currently being built for execution */
	public Round getNextRound() {
		return nextRound;
	}

	/** Sets the round currently being built for execution */
	public Battle setNextRound(Round nextRound) {
		this.nextRound = nextRound;
		return this;
	}

	/** Adds a trainer container to those belonging to this battle */
	public Battle addTrainerContainer(TrainerContainer trainerContainer) {
		if (trainerContainers == null) {
			trainerContainers = new ArrayList<TrainerContainer>();
		}

		trainerContainers.add(trainerContainer);
		return this;
	}

	/** Removes a trainer container from those belonging to this battle */
	public Battle removeTrainerContainer(TrainerContainer trainerContainer) {
		if (trainerContainers != null) {
			trainerContainers.remove(trainerContainer);
		}

		return this;
	}

	/** Gets the trainer containers belonging to this battle */
	public List<TrainerContainer> getTrainerContainers() {
		if (trainerContainers == null) {
			trainerContainers = new ArrayList<TrainerContainer>();
		}

		return trainerContainers;
	}

	/** Sets the trainer containers belonging to this battle */
	public void setTrainerContainers(List<TrainerContainer> trainerContainers) {
		this.trainerContainers = trainerContainers;
	}

	/** Adds an object to the things wagered on this battle */
	public Battle addWager(Object object) {
		if (wager == null) {
			wager = new ArrayList<Object>();
		}

		wager.add(object);
		return this;
	}

	/** Removes an object from the things wagered on this battle */
	public Battle removeWager(Object object) {
		if (wager != null) {
			wager.remove(object);
		}

		return this;
	}

	/** Gets the things wagered on this battle */
	public List<Object> getWager() {
		if (wager == null) {
			wager = new ArrayList<Object>();
		}

		return wager;
	}

	/** Sets the things wagered on this battle */
	public Battle setWager(List<Object> wager) {
		this.wager = wager;
		return this;
	}

	/**
	 * Adds a battle effect to the battle effects which are applicable to the
	 * whole battle
	 */
	public Battle addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to the
	 * whole battle
	 */
	public Battle removeBattleEffect(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

		return this;
	}

	/** Gets the battle effects which are applicable to the whole battle */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		return battleEffects;
	}

	/** Sets the battle effects which are applicable to the whole battle */
	public Battle setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}

	/** Gets the battle engine associated with this battle */
	public BattleEngine getBattleEngine() {
		return battleEngine;
	}

	/** Sets the battle engine associated with this battle */
	public Battle setBattleEngine(BattleEngine battleEngine) {
		this.battleEngine = battleEngine;
		return this;
	}

	/** Gets the targeting scheme associated with this battle */
	public TargetingScheme getTargetingScheme() {
		return targetingScheme;
	}

	/** Sets the targeting scheme associated with this battle */
	public void setTargetingScheme(TargetingScheme targetingScheme) {
		this.targetingScheme = targetingScheme;
	}
}
