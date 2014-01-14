package org.jpokemon.api;

/**
 * A simple interface for managing calculations for experience required.
 * ExperienceCurve is an abstract class, to attach a {@link Manager}
 * 
 * See http://bulbapedia.bulbagarden.net/wiki/Experience for more information.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class ExperienceCurve {
	/** Indicates the manager used to register experience curves. May be 'null' */
	public static Manager<ExperienceCurve> manager;

	/** Gets the name of this Experience Curve */
	public abstract String getName();

	/** Gets the experience required for a level, using this calculation */
	public abstract int experienceRequiredForLevel(int level);
}