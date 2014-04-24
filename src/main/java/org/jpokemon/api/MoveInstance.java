package org.jpokemon.api;

/**
 * Defines a move as it is owned and used by a Pokemon.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MoveInstance {
	/** Indicates the Move that this is an instance of */
	protected String move;

	/** Indicates the current PP of this move */
	protected int currentPP;

	/** Indicates the maximum PP of this move */
	protected int maxPP;

	/** Provides the default constructor */
	public MoveInstance() {
	}

	/** Gets the move associated with this instance */
	public String getMove() {
		return move;
	}

	/** Sets the move associated with this instance */
	public MoveInstance setMove(String move) {
		this.move = move;
		return this;
	}

	/** Gets the current PP of this move instance */
	public int getCurrentPP() {
		return currentPP;
	}

	/** Sets the current PP of this move instance */
	public MoveInstance setCurrentPP(int currentPP) {
		this.currentPP = currentPP;
		return this;
	}

	/** Gets the max PP of this move instance */
	public int getMaxPP() {
		return maxPP;
	}

	/** Sets the max PP of this move instance */
	public MoveInstance setMaxPP(int maxPP) {
		this.maxPP = maxPP;
		return this;
	}
}
