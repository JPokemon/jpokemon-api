package org.jpokemon.api;

/**
 * Provides a common definition point for extending data types throughout the
 * API.
 * 
 * @author zach
 */
public final class Property {
	/** Indicates the manager used to register property builders */
	public static Manager<Builder<Object>> builders;
}
