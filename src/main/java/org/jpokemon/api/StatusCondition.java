package org.jpokemon.api;

/**
 * Defines a status condition that may affect a Pokemon. This may include
 * non-volatile, volatile, and battle-only conditions.
 * 
 * @author zach
 */
public class StatusCondition {
	/** Indicates the manager used to register status conditions. May be null. */
	public static Manager<StatusCondition> manager;

	/** Indicates the name of this condition */
	protected String name;

	/** Indicates whether this condition is volatile */
	protected boolean isVolatile;

	/** Indicates the chance this condition will randomly be cured */
	protected double cureChance;

	/** Indicates the chance that this condition prevents a move from being used */
	protected double preventMoveChance;

	/** Indicates whether this condition prevents switching out */
	protected boolean preventSwitchOut;

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
	public StatusCondition setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets whether this status condition is volatile */
	public boolean isVolatile() {
		return isVolatile;
	}

	/** Sets whether this status condition is volatile */
	public StatusCondition setVolatile(boolean isVolatile) {
		this.isVolatile = isVolatile;
		return this;
	}

	/** Gets the random cure chance of this status condition */
	public double getCureChance() {
		return cureChance;
	}

	/** Sets the random cure chance of this status condition */
	public StatusCondition setCureChance(double cureChance) {
		this.cureChance = cureChance;
		return this;
	}

	/** Gets the chance that this condition prevents a move from being used */
	public double getPreventMoveChance() {
		return preventMoveChance;
	}

	/** Sets the chance that this condition prevents a move from being used */
	public StatusCondition setPreventMoveChance(double preventMoveChance) {
		this.preventMoveChance = preventMoveChance;
		return this;
	}

	public boolean doesPreventSwitchOut() {
		return preventSwitchOut;
	}

	public StatusCondition setPreventSwitchOut(boolean preventSwitchOut) {
		this.preventSwitchOut = preventSwitchOut;
		return this;
	}

	/** Gets the catch rate modifier of this status condition */
	public int getCatchRateModifier() {
		return catchRateModifier;
	}

	/** Sets the catch rate modifier of this status condition */
	public StatusCondition setCatchRateModifier(int catchRateModifier) {
		this.catchRateModifier = catchRateModifier;
		return this;
	}

	/** Gets the minimum number of turns this status condition is applied */
	public int getTurnCountMinimum() {
		return turnCountMinimum;
	}

	/** Sets the minimum number of turns this status condition is applied */
	public StatusCondition setTurnCountMinimum(int turnCountMinimum) {
		this.turnCountMinimum = turnCountMinimum;
		return this;
	}

	/** Gets the maximum number of turns this status condition is applied */
	public int getTurnCountMaximum() {
		return turnCountMaximum;
	}

	/** Sets the maximum number of turns this status condition is applied */
	public StatusCondition setTurnCountMaximum(int turnCountMaximum) {
		this.turnCountMaximum = turnCountMaximum;
		return this;
	}
}
