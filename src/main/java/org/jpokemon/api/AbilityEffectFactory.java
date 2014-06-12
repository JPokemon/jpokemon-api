package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Ability#effects}. Provides a
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

	/** Gets the class of ability effects that this factory produces */
	public abstract Class<?> getAbilityEffectClass();

	/** Builds an ability effect, given the options provided */
	public abstract Object buildAbilityEffect(String options) throws JPokemonException;

	/** Serializes an ability effect to a string for registration */
	public abstract String serializeAbilityEffect(Object object) throws JPokemonException;
}
