package org.jpokemon.example.experiencecurves;

import org.jpokemon.api.ExperienceCurve;

/**
 * Provides a possible ExperienceCurve which has medium-fast growth.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MediumFastExperienceCurve extends ExperienceCurve {
	/** Indicates the name of this experience curve */
	public static final String EXPERIENCE_CURVE_NAME = "medium-fast";

	@Override
	public String getName() {
		return EXPERIENCE_CURVE_NAME;
	}

	@Override
	public int experienceRequiredForLevel(int level) {
		return level * level * level;
	}
}
