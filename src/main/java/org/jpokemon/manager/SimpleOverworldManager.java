package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Overworld;

public class SimpleOverworldManager implements Manager<Overworld> {
	protected Map<String, Overworld> overworlds = new HashMap<String, Overworld>();

	/** Provides the default constructor */
	public SimpleOverworldManager() {
	}

	@Override
	public boolean isRegistered(String name) {
		return overworlds.containsKey(name);
	}

	@Override
	public void register(Overworld overworld) throws JPokemonException {
		if (overworld == null) {
			throw new JPokemonException("Cannot register null overworld");
		}
		if (overworld.getName() == null) {
			throw new JPokemonException("Cannot register overworld without a name: " + overworld);
		}
		if (isRegistered(overworld.getName())) {
			throw new JPokemonException("An overworld is already registered with name: " + overworld.getName());
		}

		overworlds.put(overworld.getName(), overworld);

	}

	@Override
	public List<Overworld> getAll() throws JPokemonException {
		return new ArrayList<Overworld>(overworlds.values());
	}

	@Override
	public Overworld getByName(String name) throws JPokemonException {
		return overworlds.get(name);
	}

	@Override
	public void update(Overworld overworld) throws JPokemonException {
		if (overworld == null) {
			throw new JPokemonException("Cannot register null overworld");
		}
		if (overworld.getName() == null) {
			throw new JPokemonException("Cannot register overworld without a name: " + overworld);
		}
		if (!isRegistered(overworld.getName())) {
			throw new JPokemonException("An overworld is not registered with name: " + overworld.getName());
		}

		overworlds.put(overworld.getName(), overworld);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister overworld without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("An overworld is not registered with name: " + name);
		}

		overworlds.remove(name);
	}

	/**
	 * Initializes a new SimpleOverworldManager as the {@link Overworld#manager}
	 * 
	 * @throws JPokemonException If the Nature.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Overworld.manager != null) {
			throw new JPokemonException("Overworld.manager is already defined");
		}

		Overworld.manager = new SimpleOverworldManager();
	}
}
