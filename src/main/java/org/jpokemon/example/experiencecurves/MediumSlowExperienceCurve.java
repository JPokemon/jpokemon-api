package org.jpokemon.example.experiencecurves;

import org.jpokemon.api.ExperienceCurve;

/**
 * Provides a possible ExperienceCurve which has medium-slow growth.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MediumSlowExperienceCurve extends ExperienceCurve {
	@Override
	public int experienceRequiredForLevel(int level) {
		return 6 * level * level * level / 5 - 15 * level * level + 100 * level - 140;
	}
}