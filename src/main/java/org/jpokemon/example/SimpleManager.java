package org.jpokemon.example;

import java.lang.reflect.Method;
import java.util.TreeMap;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Provides generic management for any type, 'T'. In order for this class to
 * function properly, 'T' must have a method 'getName,' which returns a unique
 * string that can identify the object of type 'T'.
 * 
 * <p>
 * 
 * Note that this class uses reflection. Pains have been taken to avoid
 * producing errors, but in the case that they appear, they will be silently
 * repressed.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 * 
 * @param T The type to be managed
 */
public class SimpleManager<T> implements Manager<T> {
	protected final TreeMap<String, T> objectMap = new TreeMap<String, T>();
	protected final Class<T> managedClass;

	/**
	 * Constructs a new SimpleManager for the given type, 'T'
	 * 
	 * Due to type erasure, the class of the managed type needs to be passed to
	 * the manager during construction.
	 * 
	 * @param managedClass The class of the managed type, e.g. 'MyObject.class'
	 * 
	 * @throws JPokemonError In the case that T does not have a 'getName' method
	 */
	public SimpleManager(Class<T> managedClass) throws JPokemonError {
		this.managedClass = managedClass;

		try {
			managedClass.getMethod("getName");
		} catch (Exception e) {
			throw new JPokemonError("No method \"getName\" available for class: " + managedClass.toString());
		}
	}

	@Override
	public boolean register(T managed) throws JPokemonError {
		// Get the name via reflection
		String name = null;
		try {
			Method getName = managedClass.getMethod("getName");
			name = (String) getName.invoke(managed);
		} catch (Exception e) {
		}

		// Use the name to register, and check that it does not conflict
		if (name == null) {
			throw new JPokemonError("The object does not have a name to register under!");
		}
		else if (objectMap.containsKey(name) && objectMap.get(name) != managed) {
			throw new JPokemonError("A object with the name " + name + " has already been registered!");
		}
		else {
			objectMap.put(name, managed);
			return true;
		}
	}

	@Override
	public boolean isRegistered(T managed) {
		return objectMap.containsValue(managed);
	}

	@Override
	public T getByName(String name) {
		if (!objectMap.containsKey(name)) {
			return null;
		}
		return objectMap.get(name);
	}
}