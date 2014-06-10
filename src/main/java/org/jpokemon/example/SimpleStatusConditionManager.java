package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.StatusCondition;

public class SimpleStatusConditionManager implements Manager<StatusCondition> {
	protected Map<String, StatusCondition> statusConditions = new HashMap<String, StatusCondition>();

	/** Provides the default constructor */
	public SimpleStatusConditionManager() {
	}

	@Override
	public boolean isRegistered(String statusConditionName) {
		return statusConditions.containsKey(statusConditionName);
	}

	@Override
	public void register(StatusCondition statusCondition) throws JPokemonException {
		if (statusCondition == null) {
			throw new JPokemonException("Cannot register null status condition");
		}
		if (statusCondition.getName() == null) {
			throw new JPokemonException("Cannot register status condition without a name: " + statusCondition);
		}
		if (isRegistered(statusCondition.getName())) {
			throw new JPokemonException("A status condition is already registered with name: " + statusCondition.getName());
		}

		statusConditions.put(statusCondition.getName(), statusCondition);
	}

	@Override
	public StatusCondition getByName(String name) {
		return statusConditions.get(name);
	}

	@Override
	public void update(StatusCondition statusCondition) throws JPokemonException {
		if (statusCondition == null) {
			throw new JPokemonException("Cannot register null status condition");
		}
		if (statusCondition.getName() == null) {
			throw new JPokemonException("Cannot register status condition without a name: " + statusCondition);
		}
		if (!isRegistered(statusCondition.getName())) {
			throw new JPokemonException("A status condition is not registered with name: " + statusCondition.getName());
		}

		statusConditions.put(statusCondition.getName(), statusCondition);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot unregister status condition without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A status condition is not registered with name: " + name);
		}

		statusConditions.remove(name);
	}

	/**
	 * Initializes a new SimpleStatusConditionManager as the
	 * {@link StatusCondition#manager}
	 * 
	 * @throws JPokemonException If the StatusCondition.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (StatusCondition.manager != null) {
			throw new JPokemonException("StatusCondition.manager is already defined");
		}

		StatusCondition.manager = new SimpleStatusConditionManager();
	}
}
