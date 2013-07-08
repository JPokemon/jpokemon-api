package org.jpokemon.pmapi;

import java.lang.Error;

/**
 * Provides an error that can be thrown when this library is misused, but not in
 * a completely fatal way.
 */
public class JPokemonError extends Error {
	/** Constructs a new JPokemonError. */
	public JPokemonError() {
		super();
	}

	/** Constructs a new JPokemonError with the given error message. */
	public JPokemonError(String message) {
		super(message);
	}

	private static final long serialVersionUID = 1L;
}