package org.jpokemon.api;


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
	 * Checks if an object is registered with the manager
	 * 
	 * @param managed The name of the object to check for registration
	 * @return Whether the object is known to the manager
	 */
	public boolean isRegistered(String name);

	/**
	 * Registers the object with the manager so it can be looked up by name
	 * 
	 * @param managed The object to be registered
	 * @throws JPokemonException If there is an error registering the object
	 */
	public void register(T managed) throws JPokemonException;

	/**
	 * Gets an object registered by this manager by name
	 * 
	 * @param name The name of the object requested
	 * @return The object by this name, or null if it does not exist
	 * @throws JPokemonException If there is an error retrieving the object
	 */
	public T getByName(String name) throws JPokemonException;

	/**
	 * Re-registers the object with the manager, overriding any conflicts with the
	 * already registered version
	 * 
	 * @param managed The object to update
	 * @throws JPokemonException If there is an error registering the object
	 */
	public void update(T managed) throws JPokemonException;

	/**
	 * Removes an object from the registry by name
	 * 
	 * @param name The name of the object to remove
	 * @throws JPokemonException If there is an error removing the object
	 */
	public void unregister(String name) throws JPokemonException;
}
