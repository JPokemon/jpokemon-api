package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

public class SimpleTrainerClassManager implements Manager<TrainerClass> {
	protected Map<String, TrainerClass> trainerClasses = new HashMap<String, TrainerClass>();

	/** Provides the default constructor */
	public SimpleTrainerClassManager() {
	}

	@Override
	public boolean isRegistered(String trainerClassName) {
		return trainerClasses.containsKey(trainerClassName);
	}

	@Override
	public void register(TrainerClass trainerClass) throws JPokemonException {
		if (trainerClass == null) {
			throw new JPokemonException("Cannot register null trainer class");
		}
		if (trainerClass.getName() == null) {
			throw new JPokemonException("Cannot register trainer class without a name: " + trainerClass);
		}
		if (isRegistered(trainerClass.getName())) {
			throw new JPokemonException("A trainer class is already registered with name: " + trainerClass.getName());
		}

		trainerClasses.put(trainerClass.getName(), trainerClass);
	}

	@Override
	public TrainerClass getByName(String name) {
		return trainerClasses.get(name);
	}

	@Override
	public void update(TrainerClass trainerClass) throws JPokemonException {
		if (trainerClass == null) {
			throw new JPokemonException("Cannot register null trainer class");
		}
		if (trainerClass.getName() == null) {
			throw new JPokemonException("Cannot register trainer class without a name: " + trainerClass);
		}
		if (!isRegistered(trainerClass.getName())) {
			throw new JPokemonException("A trainer class is not registered with name: " + trainerClass.getName());
		}

		trainerClasses.put(trainerClass.getName(), trainerClass);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister trainer class without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A trainer class is not registered with name: " + name);
		}

		trainerClasses.remove(name);
	}

	/**
	 * Initializes a new SimpleTrainerClassManager as the
	 * {@link TrainerClass#manager}
	 * 
	 * @throws JPokemonException If the TrainerClass.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (TrainerClass.manager != null) {
			throw new JPokemonException("TrainerClass.manager is already defined");
		}

		TrainerClass.manager = new SimpleTrainerClassManager();
	}
}
