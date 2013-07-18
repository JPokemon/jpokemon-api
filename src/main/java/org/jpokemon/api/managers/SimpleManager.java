package org.jpokemon.api.managers;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.TreeMap;

import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;

/**
 * Provides type management and lookup functionality. In order for this class 
 * to function, the type ``T`` must have both
 * 
 * <ul>
 * 		<li>a static field ``manager`` of type {@link Manager} and
 * 		<li>a method ``getName()`` that returns a unique string that can 
 * 		identify the object of type ``T``.
 * </ul>
 *
 * The following classes fulfill these criteria: {@link PokemonAbility}, {@link 
 * Nature}, {@link Species}, {@link Type}, {@link Move}, 
 * and {@link Item}.<p> 
 *
 * <h2>Usage Example</h2> 
 * 
 * <p>For example, in conjunction with {@link Type}, which fulfills the 
 * requirements with its {@link Type#manager} field and {@link 
 * Type#getName()} method, we can instantiate a manager like so:
 * 
 * <pre>
 * SimpleManager&lt;Type&gt; typeManager = new SimpleManager&lt;Type&gt;(Type.class);
 * </pre>
 * 
 * To test that this manager is really looking after types, we can try
 *
 * <pre>
 * Type fire = new Type();
 * fire.setName("Fire");
 * fire.setSuperEffectiveAgainst("Grass", "Bug", "Steel");
 * fire.setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");
 * </pre>
 *
 * to set up some of the type's properties. The method {@link 
 * Type#setName()} does some of the work for us; if ``manager`` is 
 * defined, it will call {@link #register(fire)} automatically. Thus a call to
 *
 * <pre>
 * typeManager.getByName("Fire").isSuperEffectiveAgainst("Grass");
 * </pre>
 *
 * will at this point return ``true``.
 *
 * @note This class uses reflection. Pains have been taken to avoid producing 
 * errors, but in the case that they appear, they will be silently repressed.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 *
 * @param  T The type to be managed, e.g. {@link Nature}.
 */
public class SimpleManager<T> implements Manager<T> {
	private final TreeMap<String, T> objectMap = new TreeMap<String, T>();
	private final Class<T> managedClass; // Fucking type erasure...

	/**
	 * Constructs a new ``SimpleManager&lt;T&gt;`` for the given type, ``T``.
	 * 
	 * Due to type erasure, the class of the managed type needs to be passed 
	 * to the manager during construction.
	 * 
	 * @param  managedClass The class of the managed type, e.g. 
	 *                     ``MyObject.class``.
	 * @param  T 			The type to be managed.
	 *
	 * @throws JPokemonError if there is a conflict over type management. That 
	 *         is, the ``manager`` field of the type is not ``null``.
	 */
	public SimpleManager(Class<T> managedClass) throws JPokemonError {		
		this.managedClass = managedClass;
		
		// If the object has a "manager" field, set it to this; check for conflicts
		try {
			Field manager = managedClass.getField("manager");
			if (manager.get(null) != null) {
				throw new JPokemonError("This type already has a defined manager!");
			} else {
				manager.set(null, this);
			}
		} catch (IllegalAccessException e1) {
		} catch (NoSuchFieldException e2) {
		}
	}
	
	/**
	 * Registers the object of type ``T`` with the manager so it can be looked 
	 * up by name. There are two conditions under which registration will fail, 
	 * either:
	 * 
	 * <ul>
	 * 		<li>The name of the object of type ``T`` is ``null`` or
	 *   	<li>The name is already in use by another object known to the 
	 *    	manager (i.e. you are trying to register something called "Fire",
	 *    	while another known object is already called "Fire").
	 * </ul>
	 *
	 * So long as you have bothered to specify unique names, this method should 
	 * be successful.
	 * 
	 * @param  managed The object of type ``T`` to be registered.
	 * 
	 * @return 		   ``true`` if the object is in fact registered.
	 *
	 * @throws JPokemonError if there is an error registering the object.
	 */
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
		} else if (objectMap.containsKey(name) && objectMap.get(name) != managed) {
			throw new JPokemonError("A object with the name " + name + " has already been registered!");
		} else {
			objectMap.put(name, managed);
			return true;
		}
	}

	/**
	 * Checks if an object of type ``T`` is registered with the manager.
	 *
	 * @param  managed The object that may be registered.
	 *
	 * @return 		   ``true`` if the object is known to the manager.
	 */
	public boolean isRegistered(T managed) {
		return objectMap.containsValue(managed);
	}

	/**
	 * Checks if a name is known to the manager.
	 *
	 * @param  name The name that some object may be registered under.
	 *
	 * @return 		``true`` if the name is known to the manager.
	 */
	public boolean isRegistered(String name) {
		return objectMap.containsKey(name);
	}

	/**
	 * Gets an object of type ``T`` registered by this manager by name.
	 * 
	 * @param  name The name of the object requested.
	 * 
	 * @return 		The object by this name, or ``null`` if it does not exist.
	 */
	public T getByName(String name) {
		if (!objectMap.containsKey(name)) {
			return null;
		}
		return objectMap.get(name);
	}
}
