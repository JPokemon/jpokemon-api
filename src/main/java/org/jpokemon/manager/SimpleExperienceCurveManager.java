package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.ExperienceCurve;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link ExperienceCurve#manager}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleExperienceCurveManager implements Manager<ExperienceCurve> {
	protected Map<String, ExperienceCurve> experienceCurves = new HashMap<String, ExperienceCurve>();

	/** Provides the default constructor */
	public SimpleExperienceCurveManager() {
	}

	@Override
	public boolean isRegistered(String experienceCurveName) {
		return experienceCurves.containsKey(experienceCurveName);
	}

	@Override
	public void register(ExperienceCurve experienceCurve) throws JPokemonException {
		if (experienceCurve == null) {
			throw new JPokemonException("Cannot register null experience curve");
		}
		if (experienceCurve.getName() == null) {
			throw new JPokemonException("Cannot register experience curve without a name: " + experienceCurve);
		}
		if (experienceCurves.containsKey(experienceCurve.getName())) {
			throw new JPokemonException("An experience curve with the same name is already registered: " + experienceCurve);
		}

		experienceCurves.put(experienceCurve.getName(), experienceCurve);
	}

	@Override
	public List<ExperienceCurve> getAll() {
		return new ArrayList<ExperienceCurve>(experienceCurves.values());
	}

	@Override
	public ExperienceCurve getByName(String name) {
		return experienceCurves.get(name);
	}

	@Override
	public void update(ExperienceCurve experienceCurve) throws JPokemonException {
		if (experienceCurve == null) {
			throw new JPokemonException("Cannot register null experience curve");
		}
		if (experienceCurve.getName() == null) {
			throw new JPokemonException("Cannot register experience curve without a name: " + experienceCurve);
		}
		if (!experienceCurves.containsKey(experienceCurve.getName())) {
			throw new JPokemonException("An experience curve with the same name is not registered: " + experienceCurve);
		}

		experienceCurves.put(experienceCurve.getName(), experienceCurve);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister experience curve without a name");
		}
		if (!experienceCurves.containsKey(name)) {
			throw new JPokemonException("There is no experience curve with name: " + name);
		}

		experienceCurves.remove(name);
	}

	/**
	 * Initializes a new SimpleExperienceCurveManager as the
	 * {@link ExperienceCurve#manager}
	 * 
	 * @throws JPokemonException If the ExperienceCurve.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (ExperienceCurve.manager != null) {
			throw new JPokemonException("ExperienceCurve.manager is already defined");
		}

		ExperienceCurve.manager = new SimpleExperienceCurveManager();
	}
}
