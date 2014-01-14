package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Ability} effects. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class AbilityEffectFactory {
	/**
	 * Indicates the manager used to register ability effect factories. May be
	 * 'null'
	 */
	public static Manager<AbilityEffectFactory> manager;

	/**
	 * Gets the unique name of this factory. Effectively, the class of ability
	 * effect that this factory produces.
	 */
	public abstract String getName();

	/** Builds an ability effect, given the options provided */
	public abstract Object buildAbilityEffect(String options);
}