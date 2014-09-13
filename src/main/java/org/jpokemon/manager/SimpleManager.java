package org.jpokemon.manager;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Provides generic management for any type, 'T'. In order for this class to
 * function properly, 'T' must have a method 'getName,' which returns a unique
 * string that can identify the object of type 'T'.
 * 
 * <p>
 * 
 * Note that this class uses reflection. Pains have been taken to avoid
 * producing errors, but in the case that they appear, they will be silently
 * repressed. Further note that SimpleManager cannot be used to manage any
 * interfaces or abstract classes.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 * 
 * @param T The type to be managed
 */
public class SimpleManager<T> implements Manager<T> {
	protected Map<String, T> objectMap = new HashMap<String, T>();

	protected Class<T> managedClass;

	protected Method getIdMethod;

	/**
	 * Constructs a new SimpleManager for the given type, 'T'
	 * 
	 * Due to type erasure, the class of the managed type needs to be passed to
	 * the manager during construction.
	 * 
	 * @param managedClass The class of the managed type, e.g. 'MyObject.class'
	 * 
	 * @throws JPokemonException In the case that T does not have a 'getName'
	 *           method
	 */
	public SimpleManager(Class<T> managedClass) throws JPokemonException {
		try {
			this.managedClass = managedClass;
			getIdMethod = managedClass.getMethod("getId");
		} catch (Exception e) {
			throw new JPokemonException("No method \"getId\" available for class: " + managedClass.getName());
		}
	}

	@Override
	public T create() {
		T object = null;
		try {
			object = managedClass.newInstance();
		} catch (Exception e) {
		}
		return object;
	}

	@Override
	public boolean isRegistered(String name) {
		return objectMap.containsKey(name);
	}

	@Override
	public List<T> getAll() {
		return new ArrayList<T>(objectMap.values());
	}

	@Override
	public T get(String id) {
		return objectMap.get(id);
	}

	@Override
	public void register(T object) throws JPokemonException {
		if (object == null) {
			throw new JPokemonException("Cannot register null object");
		}

		// Get the name via reflection
		String name = null;
		try {
			name = (String) getIdMethod.invoke(object);
		} catch (Exception e) {
		}

		if (name == null) {
			throw new JPokemonException("Cannot register object without a name: " + object);
		}
		if (objectMap.containsKey(name)) {
			throw new JPokemonException("A object with the same name is already registered: " + object);
		}

		objectMap.put(name, object);
	}

	@Override
	public void update(T object) throws JPokemonException {
		if (object == null) {
			throw new JPokemonException("Cannot register null object");
		}

		// Get the name via reflection
		String id = null;
		try {
			id = (String) getIdMethod.invoke(object);
		} catch (Exception e) {
		}

		if (id == null) {
			throw new JPokemonException("Cannot register object without a name: " + object);
		}
		if (!objectMap.containsKey(id)) {
			throw new JPokemonException("An object with the same name is not registered: " + object);
		}

		objectMap.put(id, object);
	}

	@Override
	public void unregister(String id) throws JPokemonException {
		if (id == null) {
			throw new JPokemonException("Cannot unregister object without a name");
		}
		if (!objectMap.containsKey(id)) {
			throw new JPokemonException("There is no object registered with name: " + id);
		}

		objectMap.remove(id);
	}
}
