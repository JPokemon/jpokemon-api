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
	@Override
	public int experienceRequiredForLevel(int level) {
		return level * level * level;
	}
}