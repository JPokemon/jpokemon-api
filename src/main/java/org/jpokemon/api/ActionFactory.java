package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Action}s. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class ActionFactory {
	/** Indicates the manager used to register ActionFactories. May be null. */
	public static Manager<ActionFactory> manager;

	/** Gets the name of action that this factory produces */
	public abstract String getActionClass();

	/** Builds an action, given the options provided */
	public abstract Action buildAction(String options) throws JPokemonException;

	/** Serializes an action to a string for registration */
	public abstract String serializeAction(Action action) throws JPokemonException;
}
