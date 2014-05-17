package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Move#properties}. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class MovePropertyFactory {
	/**
	 * Indicates the manager used to register move property factories. May be
	 * null.
	 */
	public static Manager<MovePropertyFactory> manager;

	/** Gets the class of move properties that this factory produces */
	public abstract Class<?> getMovePropertyClass();

	/** Builds an item attribute, given the options provided */
	public abstract Object buildMoveProperty(String options) throws JPokemonException;

	/** Serializes a move property to a string for registration */
	public abstract String serializeMoveProperty(Object object) throws JPokemonException;
}
