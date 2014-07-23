package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link BattleEffect}s. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class BattleEffectFactory {
	/**
	 * Indicates the manager used to register battle effect factories. May be
	 * null.
	 */
	public static Manager<BattleEffectFactory> manager;

	/** Gets the class of battle effect that this factory produces */
	public abstract Class<? extends BattleEffect> getBattleEffectClass();

	/** Builds a battle effect, given the options provided */
	public abstract BattleEffect buildBattleEffect(String options);

	/** Serializes a battle effect to a string for registration */
	public abstract String serializeBattleEffect(BattleEffect battleEffect);
}
