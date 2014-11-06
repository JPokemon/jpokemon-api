package org.ospokemon;

/**
 * Defines an engine which is capable of sorting and executing
 * {@link BattleEffect}s.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class BattleEngine {
	/** Indicates the manager used to register battle engines */
	public static Manager<Builder<BattleEngine>> builders;

	/** Gets the name of this battle engine */
	public abstract String getName();

	/**
	 * Executes the engine for a specified battle to execute its' next round. This
	 * API must add the {@link Battle#nextRound} to the {@link Battle#rounds
	 * history}, and set a new Round as the next round. Additionally, this setup
	 * must be done before processing turns, as a turn may apply BattleEffects to
	 * the next round.
	 */
	public abstract void processRound(Battle battle);
}
