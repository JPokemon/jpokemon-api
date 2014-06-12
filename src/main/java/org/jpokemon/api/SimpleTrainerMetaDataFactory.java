package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

public class SimpleTrainerMetaDataFactory implements Manager<TrainerMetaDataFactory> {
	protected Map<String, TrainerMetaDataFactory> trainerMetaDataFactories = new HashMap<String, TrainerMetaDataFactory>();

	/** Provides the default constructor */
	public SimpleTrainerMetaDataFactory() {
	}

	@Override
	public boolean isRegistered(String metaDataClass) {
		return trainerMetaDataFactories.containsKey(metaDataClass);
	}

	@Override
	public void register(TrainerMetaDataFactory trainerMetaDataFactory) throws JPokemonException {
		if (trainerMetaDataFactory == null) {
			throw new JPokemonException("Cannot register null trainer meta data factory");
		}
		if (trainerMetaDataFactory.getMetaDataClass() == null) {
			throw new JPokemonException("Cannot register trainer meta data factory without meta data class: "
					+ trainerMetaDataFactory);
		}
		if (isRegistered(trainerMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("A trainer meta data factory is already registered with meta data class: "
					+ trainerMetaDataFactory.getMetaDataClass().getName());
		}

		trainerMetaDataFactories.put(trainerMetaDataFactory.getMetaDataClass().getName(), trainerMetaDataFactory);
	}

	@Override
	public TrainerMetaDataFactory getByName(String metaDataClass) {
		return trainerMetaDataFactories.get(metaDataClass);
	}

	@Override
	public void update(TrainerMetaDataFactory trainerMetaDataFactory) throws JPokemonException {
		if (trainerMetaDataFactory == null) {
			throw new JPokemonException("Cannot register null v meta data factory");
		}
		if (trainerMetaDataFactory.getMetaDataClass() == null) {
			throw new JPokemonException("Cannot register v meta data factory without meta data class: "
					+ trainerMetaDataFactory);
		}
		if (!isRegistered(trainerMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("A trainer meta data factory is not registered with meta data class: "
					+ trainerMetaDataFactory.getMetaDataClass().getName());
		}

		trainerMetaDataFactories.put(trainerMetaDataFactory.getMetaDataClass().getName(), trainerMetaDataFactory);
	}

	@Override
	public void unregister(String metaDataClass) throws JPokemonException {
		if (metaDataClass == null) {
			throw new JPokemonException("Cannot unregister trainer meta data factory without meta data class");
		}
		if (!isRegistered(metaDataClass)) {
			throw new JPokemonException("A trainer meta data factory is not registered with meta data class: "
					+ metaDataClass);
		}

		trainerMetaDataFactories.remove(metaDataClass);
	}

	/**
	 * Initializes a new SimpleTrainerMetaDataFactory as the
	 * {@link TrainerMetaDataFactory#manager}
	 * 
	 * @throws JPokemonException If the TrainerMetaDataFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (TrainerMetaDataFactory.manager != null) {
			throw new JPokemonException("TrainerMetaDataFactory.manager is already defined");
		}

		TrainerMetaDataFactory.manager = new SimpleTrainerMetaDataFactory();
	}
}
