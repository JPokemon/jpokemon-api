package org.jpokemon.example.experiencecurves;

import org.jpokemon.api.ExperienceCurve;

/**
 * Provides a possible ExperienceCurve which has fast growth.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class FastExperienceCurve extends ExperienceCurve {
	/** Indicates the name of this experience curve */
	public static final String EXPERIENCE_CURVE_NAME = "fast";

	@Override
	public String getName() {
		return EXPERIENCE_CURVE_NAME;
	}

	@Override
	public int experienceRequiredForLevel(int level) {
		return 4 * level * level * level / 5;
	}
}
