package org.jpokemon.pmapi.item;

/**
 * Provides an interface for items that teach Pokémon specific moves.
 */
public interface Machine extends Item {	

	/** Gets the name of the move taught by this machine. */
	public abstract int getMoveName();

	/** Sets the name of the move taught by this machine. */
	public abstract void setMoveName(String moveName);
}