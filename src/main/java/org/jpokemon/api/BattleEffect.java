package org.jpokemon.api;

public abstract class BattleEffect {
	public static Manager<TargetingScheme> manager;

	public abstract String getName();

	public abstract int getPriority();

	public abstract void affect(Battle battle);

	public abstract void affect(BattleEffect battleEffect);
}
