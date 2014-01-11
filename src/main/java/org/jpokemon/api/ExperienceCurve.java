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
	public static Manager<ExperienceCurve> manager;

	public abstract int experienceRequiredForLevel(int level);
}