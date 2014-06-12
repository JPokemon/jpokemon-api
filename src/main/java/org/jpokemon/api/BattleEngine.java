package org.jpokemon.api;

/**
 * Defines an engine which is capable of sorting and executing
 * {@link BattleEffect}s.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class BattleEngine {
	/** Indicates the manager used to register battle engines. May be null. */
	public static Manager<BattleEngine> manager;

	/** Gets the name of this battle engine */
	public abstract String getName();

	/** Executes the engine for a specified battle and round */
	public abstract void processRound(Battle battle, Round round);
}
