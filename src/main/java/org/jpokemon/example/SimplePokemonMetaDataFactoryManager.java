package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.PokemonMetaDataFactory;

public class SimplePokemonMetaDataFactoryManager implements Manager<PokemonMetaDataFactory> {
	protected Map<String, PokemonMetaDataFactory> pokemonMetaDataFactories = new HashMap<String, PokemonMetaDataFactory>();

	/** Provides the default constructor */
	public SimplePokemonMetaDataFactoryManager() {
	}

	@Override
	public boolean isRegistered(String metaDataClass) {
		return pokemonMetaDataFactories.containsKey(metaDataClass);
	}

	@Override
	public void register(PokemonMetaDataFactory pokemonMetaDataFactory) throws JPokemonException {
		if (pokemonMetaDataFactory == null) {
			throw new JPokemonException("Cannot register null pokemon meta data factory");
		}
		if (pokemonMetaDataFactory.getMetaDataClass() == null) {
			throw new JPokemonException("Cannot register pokemon meta data factory without meta data class: "
					+ pokemonMetaDataFactory);
		}
		if (isRegistered(pokemonMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("A pokemon meta data factory is already registered with meta data class: "
					+ pokemonMetaDataFactory.getMetaDataClass().getName());
		}

		pokemonMetaDataFactories.put(pokemonMetaDataFactory.getMetaDataClass().getName(), pokemonMetaDataFactory);
	}

	@Override
	public PokemonMetaDataFactory getByName(String metaDataClass) {
		return pokemonMetaDataFactories.get(metaDataClass);
	}

	@Override
	public void update(PokemonMetaDataFactory pokemonMetaDataFactory) throws JPokemonException {
		if (pokemonMetaDataFactory == null) {
			throw new JPokemonException("Cannot register null pokemon meta data factory");
		}
		if (pokemonMetaDataFactory.getMetaDataClass() == null) {
			throw new JPokemonException("Cannot register pokemon meta data factory without meta data class: "
					+ pokemonMetaDataFactory);
		}
		if (!isRegistered(pokemonMetaDataFactory.getMetaDataClass().getName())) {
			throw new JPokemonException("A pokemon meta data factory is not registered with meta data class: "
					+ pokemonMetaDataFactory.getMetaDataClass().getName());
		}

		pokemonMetaDataFactories.put(pokemonMetaDataFactory.getMetaDataClass().getName(), pokemonMetaDataFactory);
	}

	@Override
	public void unregister(String metaDataClass) throws JPokemonException {
		if (metaDataClass == null) {
			throw new JPokemonException("Cannot unregister pokemon meta data factory without meta data class");
		}
		if (!isRegistered(metaDataClass)) {
			throw new JPokemonException("A pokemon meta data factory is not registered with meta data class: "
					+ metaDataClass);
		}

		pokemonMetaDataFactories.remove(metaDataClass);
	}

	/**
	 * Initializes a new SimplePokemonMetaDataFactoryManager as the
	 * {@link PokemonMetaDataFactory#manager}
	 * 
	 * @throws JPokemonException If the PokemonMetaDataFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (PokemonMetaDataFactory.manager != null) {
			throw new JPokemonException("PokemonMetaDataFactory.manager is already defined");
		}

		PokemonMetaDataFactory.manager = new SimplePokemonMetaDataFactoryManager();
	}
}
