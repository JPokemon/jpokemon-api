package org.jpokemon.api;

/**
 * Provides an exception that can be thrown when this library is misused.
 */
public class JPokemonException extends RuntimeException {
	/** Constructs a new JPokemonException */
	public JPokemonException() {
		super();
	}

	/** Constructs a new JPokemonException with the given error message */
	public JPokemonException(String message) {
		super(message);
	}

	/** Constructs a new JPokemonException with the given nested exception */
	public JPokemonException(Exception e) {
		super(e);
	}

	private static final long serialVersionUID = 1L;
}
