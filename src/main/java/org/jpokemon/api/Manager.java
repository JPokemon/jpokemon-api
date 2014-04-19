package org.jpokemon.api;

import org.jpokemon.example.SimpleManager;

/**
 * Provides an interface for object management and lookup functionality. A
 * generic implementation is provided by the {@link SimpleManager} class that
 * works across all classes in the library.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public interface Manager<T> {

	/**
	 * Registers the object with the manager so it can be looked up by name
	 * 
	 * @param managed The object to be registered
	 * 
	 * @throws JPokemonException if there is an error registering the object
	 */
	public void register(T managed) throws JPokemonException;

	/**
	 * Checks if an object is registered with the manager
	 * 
	 * @param managed The name of the object to check for registration
	 * 
	 * @return Whether the object is known to the manager
	 */
	public boolean isRegistered(String name);

	/**
	 * Gets an object registered by this manager by name
	 * 
	 * @param name The name of the object requested
	 * 
	 * @return The object by this name, or null if it does not exist
	 */
	public T getByName(String name);
}
