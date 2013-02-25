package org.jpokemon.pmapi.entitysystem;

import java.lang.Exception;

/**
 * Provides an exception that can be thrown if an entity is put into an 
 * impermissible state.
 */
public class EntityException extends Exception {

	/** Constructs a new EntityException. */
	public EntityException() {
		super();
	}

	/** Constructs a new EntityException with the given error message. */
	public EntityException(String message) {
		super(message);
	}
}