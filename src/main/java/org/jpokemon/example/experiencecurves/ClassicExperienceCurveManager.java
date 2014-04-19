package org.jpokemon.example.experiencecurves;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.ExperienceCurve;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

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
public class ClassicExperienceCurveManager implements Manager<ExperienceCurve> {
	protected Map<String, ExperienceCurve> experienceCurves = new HashMap<String, ExperienceCurve>();

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

	@Override
	public void register(ExperienceCurve experienceCurve) throws JPokemonException {
		if (experienceCurve == null) {
			throw new JPokemonException("Cannot register null experience curve");
		}
		else if (experienceCurve.getName() == null) {
			throw new JPokemonException("Cannot register experience curve without a name: " + experienceCurve);
		}
		else if (experienceCurves.containsKey(experienceCurve.getName())
				&& !experienceCurve.equals(experienceCurves.get(experienceCurve.getName()))) {
			throw new JPokemonException("An experience curve with the same name is already registered: " + experienceCurve);
		}

		experienceCurves.put(experienceCurve.getName(), experienceCurve);
	}

	@Override
	public boolean isRegistered(String experienceCurveName) {
		if (experienceCurveName == null) {
			return false;
		}

		return getByName(experienceCurveName) != null;
	}

	@Override
	public ExperienceCurve getByName(String name) {
		return experienceCurves.get(name);
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
