package org.jpokemon.api;

/**
 * Defines an algorithm for producing an {@link Item#attributes}. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class ItemAttributeFactory {
	/**
	 * Indicates the manager used to register item attribute factories. May be
	 * 'null'
	 */
	public static Manager<ItemAttributeFactory> manager;

	/**
	 * Gets the unique name of this factory. Effectively, the class of item
	 * attributes that this factory produces
	 */
	public abstract String getName();

	/** Builds an item attribute, given the options provided */
	public abstract Object buildItemAttribute(String options);
}