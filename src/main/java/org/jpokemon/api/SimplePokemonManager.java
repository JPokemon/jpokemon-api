package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplePokemonManager implements PokemonManager {
	/** The map of Pokémon that have been registered by trainer id */
	protected Map<Integer, List<Pokemon>> pokemon = new HashMap<Integer, List<Pokemon>>();

	/** Provides the default constructor */
	public SimplePokemonManager() {
	}

	@Override
	public void register(Pokemon pokemon) throws JPokemonException {
		if (pokemon == null) {
			throw new JPokemonException("Cannot register null pokemon");
		}
		if (pokemon.getOriginalTrainerID() < 1) {
			throw new JPokemonException("Cannot register pokemon without a trainer id: " + pokemon);
		}
		if (this.pokemon.get(pokemon.getOriginalTrainerID()) == null) {
			this.pokemon.put(pokemon.getOriginalTrainerID(), new ArrayList<Pokemon>());
		}
		if (this.pokemon.get(pokemon.getOriginalTrainerID()).contains(pokemon)) {
			throw new JPokemonException("That pokemon is already registered: " + pokemon);
		}

		this.pokemon.get(pokemon.getOriginalTrainerID()).add(pokemon);
	}

	@Override
	public List<Pokemon> getByTrainerID(int trainerID) {
		if (!pokemon.containsKey(trainerID)) {
			pokemon.put(trainerID, new ArrayList<Pokemon>());
		}

		return pokemon.get(trainerID);
	}

	@Override
	public void update(Pokemon pokemon) {
		// Don't have to do anything here because of the way pointers work
	}

	@Override
	public void unregister(Pokemon pokemon) throws JPokemonException {
		if (pokemon == null) {
			throw new JPokemonException("Cannot unregister null pokemon");
		}
		if (pokemon.getOriginalTrainerID() < 1) {
			throw new JPokemonException("Cannot unregister pokemon without a trainer id: " + pokemon);
		}
		if (this.pokemon.get(pokemon.getOriginalTrainerID()) == null
				|| !this.pokemon.get(pokemon.getOriginalTrainerID()).contains(pokemon)) {
			throw new JPokemonException("That pokemon is not registered: " + pokemon);
		}

		this.pokemon.get(pokemon.getOriginalTrainerID()).remove(pokemon);
	}

	/**
	 * Initializes a new SimplePokemonManager as the {@link Pokemon#manager}
	 * 
	 * @throws JPokemonException If the Pokemon.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Pokemon.manager != null) {
			throw new JPokemonException("Pokemon.manager is already defined");
		}

		Pokemon.manager = new SimplePokemonManager();
	}
}
