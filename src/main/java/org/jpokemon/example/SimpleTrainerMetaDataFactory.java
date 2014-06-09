package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.TrainerMetaDataFactory;

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
		if (trainerMetaDataFactories.containsKey(trainerMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("A trainer meta data factory with the same meta data class is already registered: "
					+ trainerMetaDataFactory);
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
		if (!trainerMetaDataFactories.containsKey(trainerMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("An trainer meta data factory is not registered with meta data class: "
					+ trainerMetaDataFactory.getClass().getName());
		}

		trainerMetaDataFactories.put(trainerMetaDataFactory.getMetaDataClass().getName(), trainerMetaDataFactory);
	}

	@Override
	public void unregister(String metaDataClass) throws JPokemonException {
		if (metaDataClass == null) {
			throw new JPokemonException("Cannot unregister trainer meta data factory without meta data class");
		}
		if (!trainerMetaDataFactories.containsKey(metaDataClass)) {
			throw new JPokemonException("An trainer meta data factory is not registered with meta data class: "
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
