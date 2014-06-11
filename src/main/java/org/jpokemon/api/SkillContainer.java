package org.jpokemon.api;

public class SkillContainer {
	/** Indicates the skill associated with this skill container */
	protected Skill skill;

	/** Indicates the battle effect which is disabling this skill container */
	protected BattleEffect disablingEffect;

	/** Gets the skill associated with this skill container */
	public Skill getSkill() {
		return skill;
	}

	/** Sets the skill associated with this skill container */
	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	/** Gets the battle effect which is disabling this skill container */
	public BattleEffect getDisablingEffect() {
		return disablingEffect;
	}

	/** Sets the battle effect which is disabling this skill container */
	public void setDisablingEffect(BattleEffect disablingEffect) {
		this.disablingEffect = disablingEffect;
	}
}
