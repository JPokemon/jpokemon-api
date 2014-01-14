package org.jpokemon.example.experiencecurves;

import org.jpokemon.api.ExperienceCurve;

/**
 * Provides a possible ExperienceCurve which has fluctuating growth.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class FluctuatingExperienceCurve extends ExperienceCurve {
	@Override
	public String getName() {
		return "fluctuating";
	}

	@Override
	public int experienceRequiredForLevel(int level) {
		if (level <= 15) {
			return (int) (level * level * level * ((Math.floor((level + 1) / 3) + 24) / 50));
		}
		else if (level <= 36) {
			return level * level * level * ((level + 14) / 50);
		}
		else {
			return (int) (level * level * level * ((Math.floor(level / 2) + 32) / 50));
		}
	}
}