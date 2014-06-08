package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Pokemon#metaData}. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class PokemonMetaDataFactory {
	/**
	 * Indicates the manager used to register Pokémon meta data factories. May be
	 * null.
	 */
	public static Manager<PokemonMetaDataFactory> manager;

	/** Gets the class of meta data that this factory produces */
	public abstract Class<?> getMetaDataClass();

	/** Builds an meta data, given the options provided */
	public abstract Object buildMetaData(String options) throws JPokemonException;

	/** Serializes a meta data to a string for registration */
	public abstract String serializeMetaData(Object object) throws JPokemonException;
}
