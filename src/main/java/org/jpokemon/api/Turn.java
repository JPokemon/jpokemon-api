package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

public class Turn {
	/** Indicates the priority of this turn for turn sorting */
	protected int priority;

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
