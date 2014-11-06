package org.ospokemon;

/**
 * Provides an interface for subclass construction and destruction. The
 * {@link #construct(String)} and {@link #destruct(Object)} methods are designed
 * to be counterparts.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface Builder<T> {
	/** Gets the subclass that this builder produces */
	public String getId();

	/** Builds an instance with the options provided */
	public T construct(String options);

	/** Serializes an instance to String */
	public String destruct(T object);
}
