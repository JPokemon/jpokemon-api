package org.jpokemon.api;

import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Provides an interface for object management and lookup functionality. A 
 * generic implementation is provided by the {@link SimpleManager} class that 
 * works across all classes in the library.
 * 
 * <p>
 * 
 * For implementations specific to each class, see:
 * 
 * @see  SimpleAbilityManager
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public interface Manager<T> {
	
	/**
	 * Registers the object with the manager so it can be looked up by name.
	 * 
	 * @param  managed The object to be registered.
	 * 
	 * @return 		   ``true`` if the object is in fact registered.
	 *
	 * @throws JPokemonError if there is an error registering the object.
	 */
	public boolean register(T managed) throws JPokemonError;

	/**
	 * Checks if an object is registered with the manager.
	 *
	 * @return ``true`` if the object is known to the manager.
	 */
	public boolean isRegistered(T managed);

	/**
	 * Gets an object registered by this manager by name.
	 * 
	 * @param  name The name of the object requested.
	 * 
	 * @return      The object by this name, or ``null`` if it does not exist.
	 */
	public T getByName(String name);
}
