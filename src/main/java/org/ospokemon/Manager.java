package org.ospokemon;

import java.util.List;

import org.ospokemon.manager.SimpleManager;

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
	 * Creates an instance of the managed class. This may be a subclass, or have
	 * properties attached.
	 * 
	 * @return A new (empty) instance
	 */
	public T create() throws JPokemonException;

	/**
	 * Checks if an object is registered with the manager
	 * 
	 * @param id The name of the object to check for registration
	 * @return Whether the object is known to the manager
	 */
	public boolean isRegistered(String id);

	/**
	 * Gets all objects registered by this manager
	 * 
	 * @return All objects currently registered with this manager
	 * @throws JPokemonException If there is an error retrieving the objects
	 */
	public List<T> getAll() throws JPokemonException;

	/**
	 * Gets an object registered by this manager by name
	 * 
	 * @param id The name of the object requested
	 * @return The object by this name, or null if it does not exist
	 * @throws JPokemonException If there is an error retrieving the object
	 */
	public T get(String id) throws JPokemonException;

	/**
	 * Registers the object with the manager so it can be looked up by name
	 * 
	 * @param object The object to be registered
	 * @throws JPokemonException If there is an error registering the object
	 */
	public void register(T object) throws JPokemonException;

	/**
	 * Re-registers the object with the manager, overriding any conflicts with the
	 * already registered version
	 * 
	 * @param object The object to update
	 * @throws JPokemonException If there is an error registering the object
	 */
	public void update(T object) throws JPokemonException;

	/**
	 * Removes an object from the registry by name
	 * 
	 * @param id The name of the object to remove
	 * @throws JPokemonException If there is an error removing the object
	 */
	public void unregister(String id) throws JPokemonException;
}
