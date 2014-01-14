package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.ExperienceCurve;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.example.experiencecurves.ErraticExperienceCurve;
import org.jpokemon.example.experiencecurves.FastExperienceCurve;
import org.jpokemon.example.experiencecurves.FluctuatingExperienceCurve;
import org.jpokemon.example.experiencecurves.MediumFastExperienceCurve;
import org.jpokemon.example.experiencecurves.MediumSlowExperienceCurve;
import org.jpokemon.example.experiencecurves.SlowExperienceCurve;

public class ClassicExperienceCurveManager implements Manager<ExperienceCurve> {
	protected Map<String, ExperienceCurve> experienceCurves = new HashMap<String, ExperienceCurve>();

	public ClassicExperienceCurveManager() {
		register(new ErraticExperienceCurve());
		register(new FastExperienceCurve());
		register(new FluctuatingExperienceCurve());
		register(new MediumFastExperienceCurve());
		register(new MediumSlowExperienceCurve());
		register(new SlowExperienceCurve());
	}

	@Override
	public boolean register(ExperienceCurve experienceCurve) throws JPokemonError {
		if (isRegistered(experienceCurve)) {
			throw new JPokemonError("Experience Curve already registered: " + experienceCurve.toString());
		}

		experienceCurves.put(experienceCurve.getName(), experienceCurve);
		return true;
	}

	@Override
	public boolean isRegistered(ExperienceCurve experienceCurve) {
		if (experienceCurve == null) {
			return false;
		}

		return getByName(experienceCurve.getName()) != null;
	}

	@Override
	public ExperienceCurve getByName(String name) {
		return experienceCurves.get(name);
	}

	public static void init() throws JPokemonError {
		if (ExperienceCurve.manager != null) {
			throw new JPokemonError("ExperienceCurve.manager is already defined");
		}

		ExperienceCurve.manager = new ClassicExperienceCurveManager();
	}
}