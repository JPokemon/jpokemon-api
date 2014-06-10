package org.jpokemon.example;

import org.jpokemon.api.ExperienceCurve;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.example.experiencecurves.ErraticExperienceCurve;
import org.jpokemon.example.experiencecurves.FastExperienceCurve;
import org.jpokemon.example.experiencecurves.FluctuatingExperienceCurve;
import org.jpokemon.example.experiencecurves.MediumFastExperienceCurve;
import org.jpokemon.example.experiencecurves.MediumSlowExperienceCurve;
import org.jpokemon.example.experiencecurves.SlowExperienceCurve;

/**
 * Provides an example implementation of the {@link ExperienceCurve#manager},
 * using several classic experience curves
 * 
 * @see ErraticExperienceCurve
 * @see FastExperienceCurve
 * @see FluctuatingExperienceCurve
 * @see MediumFastExperienceCurve
 * @see MediumSlowExperienceCurve
 * @see SlowExperienceCurve
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicExperienceCurveManager extends SimpleExperienceCurveManager {
	/** Indicates the name of the erratic experience curve */
	public static final String ERRATIC_EXPERIENCE_CURVE = ErraticExperienceCurve.EXPERIENCE_CURVE_NAME;

	/** Indicates the name of the fast experience curve */
	public static final String FAST_EXPERIENCE_CURVE = FastExperienceCurve.EXPERIENCE_CURVE_NAME;

	/** Indicates the name of the fluctuating experience curve */
	public static final String FLUCTUATING_EXPERIENCE_CURVE = FluctuatingExperienceCurve.EXPERIENCE_CURVE_NAME;

	/** Indicates the name of the medium-fast experience curve */
	public static final String MEDIUM_FAST_EXPERIENCE_CURVE = MediumFastExperienceCurve.EXPERIENCE_CURVE_NAME;

	/** Indicates the name of the medium-slow experience curve */
	public static final String MEDIUM_SLOW_EXPERIENCE_CURVE = MediumSlowExperienceCurve.EXPERIENCE_CURVE_NAME;

	/** Indicates the name of the slow experience curve */
	public static final String SLOW_EXPERIENCE_CURVE = SlowExperienceCurve.EXPERIENCE_CURVE_NAME;

	public ClassicExperienceCurveManager() {
		register(new ErraticExperienceCurve());
		register(new FastExperienceCurve());
		register(new FluctuatingExperienceCurve());
		register(new MediumFastExperienceCurve());
		register(new MediumSlowExperienceCurve());
		register(new SlowExperienceCurve());
	}

	/**
	 * Initializes a new ClassicExperienceCurveManager as the
	 * {@link ExperienceCurve#manager}
	 * 
	 * @throws JPokemonException If the ExperienceCurve.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (ExperienceCurve.manager != null) {
			throw new JPokemonException("ExperienceCurve.manager is already defined");
		}

		ExperienceCurve.manager = new ClassicExperienceCurveManager();
	}
}
