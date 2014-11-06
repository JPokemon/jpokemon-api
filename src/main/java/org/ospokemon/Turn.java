package org.ospokemon;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a turn a Pokémon container may use in a {@link Round}.
 * 
 * @author zach
 *
 * @since 0.1
 */
public class Turn {
	/** Indicates the priority of this turn for turn sorting */
	protected int priority;

	/** Indicates the TrainerContainer this turn targets */
	protected TrainerContainer target;

	/** Indicates the PokemonContainer that this turn targets */
	protected int targetIndex;

	/** Indicates the battle effects this turn contains */
	protected List<BattleEffect> battleEffects;

	/** Gets the priority of this turn for turn sorting */
	public int getPriority() {
		return priority;
	}

	/** Sets the priority of this turn for turn sorting */
	public Turn setPriority(int priority) {
		this.priority = priority;
		return this;
	}

	/** Gets the TrainerContainer this turn targets */
	public TrainerContainer getTarget() {
		return target;
	}

	/** Sets the TrainerContainer this turn targets */
	public Turn setTarget(TrainerContainer target) {
		this.target = target;
		return this;
	}

	/** Gets the PokemonContainer that this turn targets */
	public int getTargetIndex() {
		return targetIndex;
	}

	/** Sets the PokemonContainer that this turn targets */
	public Turn setTargetIndex(int targetIndex) {
		this.targetIndex = targetIndex;
		return this;
	}

	/** Adds a battle effect to the battle effects this turn contains */
	public Turn addBattleEffect(BattleEffect battleEffect) {
		getBattleEffects().add(battleEffect);
		return this;
	}

	/** Removes a battle effect from the battle effects this turn contains */
	public Turn removeBattleEffect(BattleEffect battleEffect) {
		getBattleEffects().remove(battleEffect);
		return this;
	}

	/** Gets the battle effects this turn contains */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		return battleEffects;
	}

	/** Sets the battle effects this turn contains */
	public Turn setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}
}
