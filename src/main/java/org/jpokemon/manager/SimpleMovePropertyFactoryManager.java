package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

public class SimpleMovePropertyFactoryManager implements Manager<MovePropertyFactory> {
	protected Map<String, MovePropertyFactory> movePropertyFactories = new HashMap<String, MovePropertyFactory>();

	/** Provides the default constructor */
	public SimpleMovePropertyFactoryManager() {
	}

	@Override
	public boolean isRegistered(String movePropertyFactoryName) {
		return movePropertyFactories.containsKey(movePropertyFactoryName);
	}

	@Override
	public void register(MovePropertyFactory movePropertyFactory) throws JPokemonException {
		if (movePropertyFactory == null) {
			throw new JPokemonException("Cannot register null move property factory");
		}
		if (movePropertyFactory.getMovePropertyClass() == null) {
			throw new JPokemonException("Cannot register move property factory without move property class: "
					+ movePropertyFactory);
		}
		if (isRegistered(movePropertyFactory.getMovePropertyClass().getName())) {
			throw new JPokemonException("A move property factory is already registered with move property class: "
					+ movePropertyFactory.getMovePropertyClass().getName());
		}

		movePropertyFactories.put(movePropertyFactory.getMovePropertyClass().getName(), movePropertyFactory);
	}

	@Override
	public List<MovePropertyFactory> getAll() {
		return new ArrayList<MovePropertyFactory>(movePropertyFactories.values());
	}

	@Override
	public MovePropertyFactory getByName(String name) {
		return movePropertyFactories.get(name);
	}

	@Override
	public void update(MovePropertyFactory movePropertyFactory) throws JPokemonException {
		if (movePropertyFactory == null) {
			throw new JPokemonException("Cannot register null move property factory");
		}
		if (movePropertyFactory.getMovePropertyClass() == null) {
			throw new JPokemonException("Cannot register move property factory without move property class: "
					+ movePropertyFactory);
		}
		if (!isRegistered(movePropertyFactory.getMovePropertyClass().getName())) {
			throw new JPokemonException("A move property factory is not registered with move property class: "
					+ movePropertyFactory.getClass().getName());
		}

		movePropertyFactories.put(movePropertyFactory.getMovePropertyClass().getName(), movePropertyFactory);
	}

	@Override
	public void unregister(String movePropertyFactoryClass) throws JPokemonException {
		if (movePropertyFactoryClass == null) {
			throw new JPokemonException("Cannot unregister move property factory without move property class");
		}
		if (!isRegistered(movePropertyFactoryClass)) {
			throw new JPokemonException("A move property factory is not registered with move property class: "
					+ movePropertyFactoryClass);
		}

		movePropertyFactories.remove(movePropertyFactoryClass);
	}

	/**
	 * Initializes a new SimpleMovePropertyFactoryManager as the
	 * {@link MovePropertyFactory#manager}
	 * 
	 * @throws JPokemonException If the MovePropertyFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (MovePropertyFactory.manager != null) {
			throw new JPokemonException("MovePropertyFactory.manager is already defined");
		}

		MovePropertyFactory.manager = new SimpleMovePropertyFactoryManager();
	}
}
