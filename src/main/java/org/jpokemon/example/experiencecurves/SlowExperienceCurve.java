package org.jpokemon.example.experiencecurves;

import org.jpokemon.api.ExperienceCurve;

/**
 * Provides a possible ExperienceCurve which has slow growth.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SlowExperienceCurve extends ExperienceCurve {
	@Override
	public String getName() {
		return "slow";
	}

	@Override
	public int experienceRequiredForLevel(int level) {
		return 5 * level * level * level / 4;
	}
}