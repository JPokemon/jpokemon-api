package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a wrapper class for Skills of Pokémon participating in battle
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SkillContainer {
	/** Indicates the skill associated with this skill container */
	protected Skill skill;

	/** Indicates the battle effects which are applicable to this skill container */
	protected List<BattleEffect> battleEffects;

	/** Gets the skill associated with this skill container */
	public Skill getSkill() {
		return skill;
	}

	/** Sets the skill associated with this skill container */
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/**
	 * Adds a battle effect to the battle effects which are applicable to this
	 * skill container
	 */
	public SkillContainer addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to
	 * this skill container
	 */
	public SkillContainer removeBattleEffects(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

		return this;
	}

	/** Gets the battle effects which are applicable to this skill container */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		return battleEffects;
	}

	/** Sets the battle effects which are applicable to this skill container */
	public SkillContainer setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}
}
