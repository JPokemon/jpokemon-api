package org.jpokemon.api;

/**
 * A simple interface for managing calculations for stats
 * 
 * @author zach
 *
 * @since 0.1
 */
public abstract class StatCalculation {
	/** Indicates the manager used to register stat calculations. May be null. */
	public static Manager<StatCalculation> manager;

	/** Gets the name of this stat calculation */
	public abstract String getName();

	/** Calculates the value of the stat */
	public abstract int getValue(int baseValue, int iv, int ev);
}
