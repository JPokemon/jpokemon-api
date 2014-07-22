package org.jpokemon.api;

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

	/** Indicates the PokemonContainer that this turn targets */
	protected PokemonContainer target;

	/** Indicates the battle effects this turn contains */
	protected List<BattleEffect> battleEffects;

	/** Gets the priority of this turn for turn sorting */
	public int getPriority() {
		return priority;
	}

	/** Sets the priority of this turn for turn sorting */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/** Gets the battle effects this turn contains */
	public PokemonContainer getTarget() {
		return target;
	}

	/** Sets the battle effects this turn contains */
	public Turn setTarget(PokemonContainer target) {
		this.target = target;
		return this;
	}

	/** Adds a battle effect to the battle effects this turn contains */
	public Turn addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/** Removes a battle effect from the battle effects this turn contains */
	public Turn removeBattleEffects(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

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
