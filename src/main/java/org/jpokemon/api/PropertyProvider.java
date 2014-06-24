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
	private static final Map<Class<?>, PropertyProvider> propertyProviders = new HashMap<Class<?>, PropertyProvider>();

	/** Gets a PropertyProvider for the class specified */
	public static final <T> PropertyProvider<T> get(Class<T> clazz) {
		return propertyProviders.get(clazz);
	}

	/** Registers a PropertyProvider */
	public static final void register(PropertyProvider<?> propertyProvider) {
		propertyProviders.put(propertyProvider.getPropertyClass(), propertyProvider);
	}

	/** Gets the class of property that this factory produces */
	public abstract Class<T> getPropertyClass();

	/** Builds a property, given the options provided */
	public abstract T build(String options) throws JPokemonException;

	/** Serializes a property built by this factory to String */
	public abstract String serialize(Object object) throws JPokemonException;
}
