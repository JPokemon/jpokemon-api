package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines an algorithm for extending data types throughout the API.
 * 
 * @author zach
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public abstract class PropertyProvider<T> {
	/** Indicates the property providers available */
	private static final Map<String, PropertyProvider> propertyProviders = new HashMap<String, PropertyProvider>();

	/** Gets a PropertyProvider for the name of the class specified */
	public static final <T> PropertyProvider<T> get(Class<T> clazz) {
		return get(clazz.getName());
	}

	/** Gets a PropertyProvider for the name specified */
	public static final PropertyProvider get(String name) {
		return propertyProviders.get(name);
	}

	/** Registers a PropertyProvider */
	public static final void register(PropertyProvider<?> propertyProvider) {
		propertyProviders.put(propertyProvider.getName(), propertyProvider);
	}

	/** Gets the class of property that this factory produces */
	public abstract String getName();

	/** Builds a property, given the options provided */
	public abstract T build(String options) throws JPokemonException;

	/** Serializes a property built by this factory to String */
	public abstract String serialize(Object object) throws JPokemonException;
}
