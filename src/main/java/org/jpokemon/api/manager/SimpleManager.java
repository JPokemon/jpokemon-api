package org.jpokemon.api.manager;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.TreeMap;

import org.jpokemon.api.JPokemonError;

/**
 * Provides object management and lookup functionality. In order for this class 
 * to function, the object T must have (a) a field "manager" of type Manager<T>,
 * and (b) a method "getName()" that will return a unique identifier.
 *
 * @note This class uses reflection. Consider that a warning.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class SimpleManager<T> implements Manager<T> {
	private final TreeMap<String, T> objectMap = new TreeMap<String, T>();
	private final Class<T> managedClass; // Fucking type erasure...

	/**
	 * Due to type erasure, the class of the managed object needs to be passed 
	 * to the manager during construction. This isn't the only possible solution
	 * to this problem, but it is the simplest.
	 * 
	 * @param managedClass The class of the managed object.
	 *
	 * @throws JPokemonError if there is a conflict over object management.
	 */
	public SimpleManager(Class<T> managedClass) throws JPokemonError {		
		this.managedClass = managedClass;
		
		// If the object has a "manager" field, set it to this; check for conflicts
		try {
			Field manager = managedClass.getField("manager");
			if (manager.get(null) != null) {
				throw new JPokemonError("This object already has a defined manager!");
			} else {
				manager.set(null, this);
			}
		} catch (IllegalAccessException e1) {
		} catch (NoSuchFieldException e2) {
		}
	}
	
	/**
	 * Registers the object with the manager so it can be looked up by name.
	 * 
	 * @param managed The object to be registered.
	 * 
	 * @return `true` if the object is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if there is an error registering the object.
	 */
	public boolean register(T managed) throws JPokemonError {
		if (objectMap.containsValue(managed)) {
			throw new JPokemonError("This object is already registered!");
		}

		// Get the name
		String name = null;
		try {
			Method getName = managedClass.getMethod("getName");
			name = (String) getName.invoke(managed);
		} catch (Exception e) {
		}

		// Use the name to register, and check that it does not conflict
		if (name == null) {
			throw new JPokemonError("The object does not have a name to register under!");
		} else if (objectMap.containsKey(name)) {
			throw new JPokemonError("A object with the name " + name + " has already been registered!");
		} else {
			objectMap.put(name, managed);
			return true;
		}
	}

	/**
	 * Checks if an object is registered with the manager.
	 *
	 * @return `true` if the object is known to the manager.
	 */
	public boolean isRegistered(T managed) {
		return objectMap.containsValue(managed);
	}

	/**
	 * Gets an object registered by this manager by name.
	 * 
	 * @param  name The name of the object requested.
	 * 
	 * @return The object by this name, or `null` if it does not exist.
	 */
	public T getByName(String name) {
		if (!objectMap.containsKey(name)) {
			return null;
		}
		return objectMap.get(name);
	}
}
