package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleTargetingSchemeManager implements Manager<TargetingScheme> {
	protected Map<String, TargetingScheme> targetingSchemes = new HashMap<String, TargetingScheme>();

	/** Provides the default constructor */
	public SimpleTargetingSchemeManager() {
	}

	@Override
	public boolean isRegistered(String targetingSchemeName) {
		return targetingSchemes.containsKey(targetingSchemeName);
	}

	@Override
	public void register(TargetingScheme targetingScheme) throws JPokemonException {
		if (targetingScheme == null) {
			throw new JPokemonException("Cannot register null targeting scheme");
		}
		if (targetingScheme.getName() == null) {
			throw new JPokemonException("Cannot register targeting scheme without a name: " + targetingScheme);
		}
		if (isRegistered(targetingScheme.getName())) {
			throw new JPokemonException("A targeting scheme is already registered with name: " + targetingScheme.getName());
		}

		targetingSchemes.put(targetingScheme.getName(), targetingScheme);
	}

	@Override
	public List<TargetingScheme> getAll() {
		return new ArrayList<TargetingScheme>(targetingSchemes.values());
	}

	@Override
	public TargetingScheme getByName(String name) {
		return targetingSchemes.get(name);
	}

	@Override
	public void update(TargetingScheme targetingScheme) throws JPokemonException {
		if (targetingScheme == null) {
			throw new JPokemonException("Cannot register null targeting scheme");
		}
		if (targetingScheme.getName() == null) {
			throw new JPokemonException("Cannot register targetingScheme without a name: " + targetingScheme);
		}
		if (!isRegistered(targetingScheme.getName())) {
			throw new JPokemonException("A targetingScheme is not registered with name: " + targetingScheme.getName());
		}

		targetingSchemes.put(targetingScheme.getName(), targetingScheme);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister targeting scheme without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A targeting scheme is not registered with name: " + name);
		}

		targetingSchemes.remove(name);
	}

	/**
	 * Initializes a new SimpleTargetingSchemeManager as the
	 * {@link TargetingScheme#manager}
	 * 
	 * @throws JPokemonException If the TargetingScheme.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (TargetingScheme.manager != null) {
			throw new JPokemonException("TargetingScheme.manager is already defined");
		}

		TargetingScheme.manager = new SimpleTargetingSchemeManager();
	}
}
