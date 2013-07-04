package org.jpokemon.pmapi.type;

import org.jpokemon.pmapi.JPokemonError;

/**
 * Provides an interface for keeping track of {@link PokemonTypes} in an 
 * application. The most basic implementation of this (devoid of types) is the
 * {@link SimpleTypeManager} class, and the 17 classic types are implemented in
 * the {@link ClassicTypes} class. It is not possible to use more than one 
 * manager for types at a time.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1.0-alpha
 */
public interface TypeManager {
	
	/**
	 * Registers a type with the manager so it can be looked up by name.
	 * 
	 * @param  type The type to be registered.
	 * 
	 * @return  `true` if the type is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if there is an error registering the type.
	 */
	public abstract boolean registerType(PokemonType type) throws JPokemonError;

	/**
	 * Checks if a type is registered with the manager.
	 *
	 * @return `true` if the type is known to the manager.
	 */
	public abstract boolean isRegistered(PokemonType type);

	/**
	 * Gets a type registered by this manager by name.
	 * 
	 * @param  name The name of the type requested.
	 * @return      The {@link PokemonType} for this type.
	 */
	public abstract PokemonType getTypeByName(String name);
}
