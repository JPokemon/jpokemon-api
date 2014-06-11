package org.jpokemon.api;

public abstract class BattleEngine {
	public static Manager<BattleEngine> manager;

	public abstract String getName();

	public abstract void processRound(Battle battle, Round round);
}
