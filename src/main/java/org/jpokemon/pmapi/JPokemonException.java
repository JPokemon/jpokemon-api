package org.jpokemon.pmapi;

import java.lang.Exception;

/**
 * Provides an exception that can be thrown when this library is misused.
 */
public class JPokemonException extends Exception {
	/** Constructs a new JPokemonException. */
	public JPokemonException() {
		super();
	}

	/** Constructs a new JPokemonException with the given error message. */
	public JPokemonException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;
}