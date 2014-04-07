package org.jpokemon.api;

/**
 * Defines a status condition that may affect a Pokemon. This may include
 * non-volatile, volatile, and battle-only conditions.
 * 
 * @author zach
 */
public class StatusCondition {
	/**
	 * Indicates the {@link Manager manager} used to reference StatusConditions.
	 * May be null.
	 */
	public static Manager<StatusCondition> manager;

	/** Indicates the name of this condition */
	protected String name;

	/** Indicates whether this condition is volatile */
	protected boolean isVolatile;

	/** Indicates the chance this condition will randomly be cured */
	protected double cureChance;

	/** Indicates the amount this condition affects catch rate */
	protected int catchRateModifier;

	/** Indicates the minimum number of turns this status condition is applied */
	protected int turnCountMinimum;

	/** Indicates the maximum number of turns this status condition is applied */
	protected int turnCountMaximum;

	/** Provides the default constructor */
	public StatusCondition() {
	}

	/** Gets the name of this status condition */
	public String getName() {
		return name;
	}

	/** Sets the name of this status condition */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets whether this status condition is volatile */
	public boolean isVolatile() {
		return isVolatile;
	}

	/** Sets whether this status condition is volatile */
	public void setVolatile(boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	/** Gets the random cure chance of this status condition */
	public double getCureChance() {
		return cureChance;
	}

	/** Sets the random cure chance of this status condition */
	public void setCureChance(double cureChance) {
		this.cureChance = cureChance;
	}

	/** Gets the catch rate modifier of this status condition */
	public int getCatchRateModifier() {
		return catchRateModifier;
	}

	/** Sets the catch rate modifier of this status condition */
	public void setCatchRateModifier(int catchRateModifier) {
		this.catchRateModifier = catchRateModifier;
	}

	/** Gets the minimum number of turns this status condition is applied */
	public int getTurnCountMinimum() {
		return turnCountMinimum;
	}

	/** Sets the minimum number of turns this status condition is applied */
	public void setTurnCountMinimum(int turnCountMinimum) {
		this.turnCountMinimum = turnCountMinimum;
	}

	/** Gets the maximum number of turns this status condition is applied */
	public int getTurnCountMaximum() {
		return turnCountMaximum;
	}

	/** Sets the maximum number of turns this status condition is applied */
	public void setTurnCountMaximum(int turnCountMaximum) {
		this.turnCountMaximum = turnCountMaximum;
	}
}
