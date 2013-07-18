package org.jpokemon.api.managers;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Nature;

/**
 * Provides a basic implementation of the {@link Manager} interface for use with
 * {@link Nature}s. For a more generic version, see the {@link 
 * SimpleManager} class.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class SimpleNatureManager implements Manager<Nature> {
	private Map<String, Nature> natureMap = new HashMap<String, Nature>();

	/**
	 * Provides the default constructor.
	 *
	 * @throws JPokemonError if there is a conflict over management. That is, 
	 *         {@link Nature#manager} is not ``null``.
	 */
	public SimpleNatureManager() throws JPokemonError {
		if (Nature.manager != null) {
			throw new JPokemonError("A manager has already been defined for Natures!");
		}
		Nature.manager = new SimpleNatureManager();
	}

	@Override
	public boolean register(Nature nature) throws JPokemonError {
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
	public boolean isRegistered(Nature nature) {
		return natureMap.containsValue(nature);
	}

	@Override
	public Nature getByName(String name) {
		if (!natureMap.containsKey(name)) {
			return null;
		}
		return natureMap.get(name);
	}
}
