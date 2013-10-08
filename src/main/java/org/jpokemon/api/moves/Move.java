package org.jpokemon.api.moves;

import org.jpokemon.api.Manager;
import org.jpokemon.api.Type;

/**
 * Defines a move that can be learned and used by a Pokémon.
 * 
 * <p>
 * Moves that cause status ailments, affect stats, and so on are termed as
 * having a "secondary effect".
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public class Move {
	/** Indicates the manager being used to register moves. May be ``null``. */
	public static Manager<Move> manager = null;

	/** Indicates the name of this move. */
	protected String name;

	/** Indicates the {@link Type} of this move. */
	protected Type type;

	/** Indicates the power of this move. */
	protected int power;

	/** Indicates the accuracy of this move. */
	protected int accuracy;

	/** Indicates the maximum PP for this move. */
	protected int maxPP;

	/** Indicates the priority of this move. */
	protected int priority;

	/** Indicates whether this move uses `Special` stats. */
	protected boolean special;

	/** Indicates whether this move has a secondary effect. */
	protected boolean secondaryEffect;

	/** Indicates whether this move targets the user instead of the opponent. */
	protected boolean selfTargeting;

	/** Indicates whether this move is usable outside of battle. */
	protected boolean usableOutsideBattle;

	/** Gets the name of this move. */
	public String getName() {
		return name;
	}

	/** Sets the name of this move. */
	public Move setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the {@link Type} of this move. */
	public Type getType() {
		return type;
	}

	/** Sets the {@link Type} of this move. */
	public Move setType(Type type) {
		this.type = type;
		return this;
	}

	/** Checks whether this move undergoes damage calculation. */
	public boolean hasPower() {
		return (power > 0) ? true : false;
	}

	/** Gets the power of this move. */
	public int getPower() {
		return power;
	}

	/** Sets the power of this move. */
	public Move setPower(int power) {
		this.power = power;
		return this;
	}

	/** Checks whether this move undergoes miss calculation. */
	public boolean hasAccuracy() {
		return (accuracy > 0) ? true : false;
	}

	/** Gets the accuracy of this move. */
	public int getAccuracy() {
		return accuracy;
	}

	/** Sets the accuracy of this move. */
	public Move setAccuracy(int accuracy) {
		this.accuracy = accuracy;
		return this;
	}

	/** Gets the maximum PP for this move. */
	public int getMaxPP() {
		return maxPP;
	}

	/** Sets the maximum PP for this move. */
	public Move setMaxPP(int maxPP) {
		this.maxPP = maxPP;
		return this;
	}

	/** Check if this move uses the `Special` stats. */
	public boolean isSpecial() {
		return special;
	}

	/** Sets whether this move should use the `Special` stats. */
	public Move setSpecial(boolean special) {
		this.special = special;
		return this;
	}

	/** Gets the move priority. */
	public int getPriority() {
		return priority;
	}

	/** Sets the move priority. */
	public Move setPriority(int priority) {
		this.priority = priority;
		return this;
	}

	/** Checks whether this move targets the user instead of its opponent. */
	public boolean isSelfTargeting() {
		return selfTargeting;
	}

	/** Sets whether this move should target the user instead of its opponent. */
	public Move setSelfTargeting(boolean selfTargeting) {
		this.selfTargeting = selfTargeting;
		return this;
	}

	/** Checks whether this move has a secondary effect. */
	public boolean hasSecondaryEffect() {
		return false;
	}

	/** Sets whether this move should have a secondary effect. */
	public Move setSecondaryEffect(boolean secondaryEffect) {
		this.secondaryEffect = secondaryEffect;
		return this;
	}

	/** Checks whether the move can be used outside of battle. */
	public boolean isUsableOutsideBattle() {
		return usableOutsideBattle;
	}

	/** Sets whether the move should be usable outside of battle. */
	public Move setUsableOutsideBattle(boolean usableOutsideBattle) {
		this.usableOutsideBattle = usableOutsideBattle;
		return this;
	}
}
