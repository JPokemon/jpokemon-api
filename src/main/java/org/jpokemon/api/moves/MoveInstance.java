package org.jpokemon.api.moves;

/**
 * Defines a move as it is owned and used by a Pokemon.
 * 
 * @author Zach Taylor
 * 
 * @since  0.1
 */
public class MoveInstance {
	/** Indicates the Move that this is an instance of */
	protected Move move;

	/** Indicates the current PP of this move */
	protected int currentPP;

	/** Indicates the maximum PP of this move */
	protected int maxPP;

	/** Provides the default constructor */
	public MoveInstance() {
	}

	/** Gets the move associated with this instance */
	public Move getMove() {
		return move;
	}

	/** Sets the move associated with this instance */
	public void setMove(Move move) {
		this.move = move;
	}

	/** Gets the current PP of this move instance */
	public int getCurrentPP() {
		return currentPP;
	}

	/** Sets the current PP of this move instance */
	public void setCurrentPP(int currentPP) {
		this.currentPP = currentPP;
	}

	/** Gets the max PP of this move instance */
	public int getMaxPP() {
		return maxPP;
	}

	/** Sets the max PP of this move instance */
	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}
}