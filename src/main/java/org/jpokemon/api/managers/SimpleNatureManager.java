package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.Manager;
import org.jpokemon.api.natures.PokemonNature;

/**
 * Provides a basic implementation of the {@link Manager} interface for use with
 * {@link PokemonNature}s. For a more generic version, see the {@link 
 * SimpleManager} class.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class SimpleNatureManager implements Manager<PokemonNature> {
	private Map<String, PokemonNature> natureMap = new HashMap<String, PokemonNature>();

	/**
	 * Provides the default constructor.
	 *
	 * @throws JPokemonError if there is a conflict over management. That is, 
	 *         {@link PokemonNature#manager} is not ``null``.
	 */
	public SimpleNatureManager() throws JPokemonError {
		if (PokemonNature.manager != null) {
			throw new JPokemonError("A manager has already been defined for PokemonNatures!");
		}
		PokemonNature.manager = new SimpleNatureManager();
	}

	@Override
	public boolean register(PokemonNature nature) throws JPokemonError {
		String name = nature.getName();
		if (name == null) {
			throw new JPokemonError("The nature does not have a name to register under!");
		} else if (natureMap.containsKey(name) && natureMap.get(name) != nature) {
			throw new JPokemonError("A nature with the name " + name + " has already been registered!");
		} else {
			natureMap.put(name, nature);
			return true;
		}
	}

	@Override
	public boolean isRegistered(PokemonNature nature) {
		return natureMap.containsValue(nature);
	}

	@Override
	public PokemonNature getByName(String name) {
		if (!natureMap.containsKey(name)) {
			return null;
		}
		return natureMap.get(name);
	}
}
