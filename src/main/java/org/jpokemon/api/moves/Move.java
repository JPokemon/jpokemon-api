package org.jpokemon.api.moves;

import org.jpokemon.api.Manager;
import org.jpokemon.api.Type;

/**
 * Defines a move that can be learned and used by a Pokémon.
 *
 * <p> Moves that cause status ailments, affect stats, and so on are termed as 
 * having a "secondary effect".
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
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
	public void setName(String name) {
		this.name = name;
		if (manager != null) {
			manager.register(this);
		}
	}

	/** Gets the {@link Type} of this move. */
	public Type getType() {
		return type;
	}

	/** Sets the {@link Type} of this move. */
	public void setType(Type type) {
		this.type = type;
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
	public void setPower(int power) {
		this.power = power;
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
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	/** Gets the maximum PP for this move. */
	public int getMaxPP() {
		return maxPP;
	}

	/** Sets the maximum PP for this move. */
	public void setMaxPP(int maxPP) {
		this.maxPP = maxPP;
	}

	/** Check if this move uses the `Special` stats. */
	public boolean isSpecial() {
		return special;
	}

	/** Sets whether this move should use the `Special` stats. */
	public void setSpecial(boolean special) {
		this.special = special;
	}

	/** Gets the move priority. */
	public int getPriority() {
		return priority;
	}

	/** Sets the move priority. */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/** Checks whether this move targets the user instead of its opponent. */
	public boolean isSelfTargeting() {
		return selfTargeting;
	}

	/** Sets whether this move should target the user instead of its opponent. */
	public void setSelfTargeting(boolean selfTargeting) {
		this.selfTargeting = selfTargeting;
	}

	/** Checks whether this move has a secondary effect. */
	public boolean hasSecondaryEffect() {
		return false;
	}

	/** Sets whether this move should have a secondary effect. */
	public void setSecondaryEffect(boolean secondaryEffect) {
		this.secondaryEffect = secondaryEffect;
	}

	/** Checks whether the move can be used outside of battle. */
	public boolean isUsableOutsideBattle() {
		return usableOutsideBattle;
	}

	/** Sets whether the move should be usable outside of battle. */
	public void setUsableOutsideBattle(boolean usableOutsideBattle) {
		this.usableOutsideBattle = usableOutsideBattle;
	}
}
