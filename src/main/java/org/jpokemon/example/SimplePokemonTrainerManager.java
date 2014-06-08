package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.PokemonTrainer;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link PokemonTrainer#manager}. Note that, as PokemonTrainers are extremely
 * implementation-specific, SimplePokemonTrainerManager provides no "Classic"
 * trainers
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimplePokemonTrainerManager implements Manager<PokemonTrainer> {
	/** The map of Moves that have been registered by name */
	protected Map<String, PokemonTrainer> pokemonTrainers = new HashMap<String, PokemonTrainer>();

	/** Provides the default constructor */
	public SimplePokemonTrainerManager() {
	}

	@Override
	public boolean isRegistered(String trainerName) {
		if (trainerName == null) {
			return false;
		}

		return pokemonTrainers.get(trainerName) != null;
	}

	@Override
	public void register(PokemonTrainer pokemonTrainer) throws JPokemonException {
		if (pokemonTrainer == null) {
			throw new JPokemonException("Cannot register null pokemon trainer");
		}
		if (pokemonTrainer.getName() == null) {
			throw new JPokemonException("Cannot register pokemon trainer without a name: " + pokemonTrainer);
		}
		if (pokemonTrainers.containsKey(pokemonTrainer.getName())) {
			throw new JPokemonException("A pokemon trainer with the same name is already registered: " + pokemonTrainer);
		}

		pokemonTrainers.put(pokemonTrainer.getName(), pokemonTrainer);
	}

	@Override
	public PokemonTrainer getByName(String name) {
		return pokemonTrainers.get(name);
	}

	@Override
	public void update(PokemonTrainer pokemonTrainer) throws JPokemonException {
		if (pokemonTrainer == null) {
			throw new JPokemonException("Cannot register null pokemon trainer");
		}
		if (pokemonTrainer.getName() == null) {
			throw new JPokemonException("Cannot register pokemon trainer without a name: " + pokemonTrainer);
		}
		if (!pokemonTrainers.containsKey(pokemonTrainer.getName())) {
			throw new JPokemonException("A pokemon trainer with the same name is not registered: " + pokemonTrainer);
		}

		pokemonTrainers.put(pokemonTrainer.getName(), pokemonTrainer);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister pokemon trainer without a name");
		}
		if (!pokemonTrainers.containsKey(name)) {
			throw new JPokemonException("There is no pokemon trainer with name: " + name);
		}

		pokemonTrainers.remove(name);
	}

	/**
	 * Initializes a new SimplePokemonTrainerManager as the
	 * {@link PokemonTrainer#manager}
	 * 
	 * @throws JPokemonException If the PokemonTrainer.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (PokemonTrainer.manager != null) {
			throw new JPokemonException("PokemonTrainer.manager is already defined");
		}

		PokemonTrainer.manager = new SimplePokemonTrainerManager();
	}
}
