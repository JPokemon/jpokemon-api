package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleBattleEffectFactoryManager implements Manager<BattleEffectFactory> {
	protected Map<String, BattleEffectFactory> battleEffectFactories = new HashMap<String, BattleEffectFactory>();

	/** Provides the default constructor */
	public SimpleBattleEffectFactoryManager() {
	}

	@Override
	public boolean isRegistered(String battleEffectFactoryName) {
		return battleEffectFactories.containsKey(battleEffectFactoryName);
	}

	@Override
	public void register(BattleEffectFactory battleEffectFactory) throws JPokemonException {
		if (battleEffectFactory == null) {
			throw new JPokemonException("Cannot register null battle effect factory");
		}
		if (battleEffectFactory.getBattleEffectClass() == null) {
			throw new JPokemonException("Cannot register battle effect factory without battle effect class: "
					+ battleEffectFactory);
		}
		if (isRegistered(battleEffectFactory.getBattleEffectClass().getName())) {
			throw new JPokemonException("A battle effect factory is already registered with battle effect class: "
					+ battleEffectFactory.getBattleEffectClass().getName());
		}

		battleEffectFactories.put(battleEffectFactory.getBattleEffectClass().getName(), battleEffectFactory);
	}

	@Override
	public List<BattleEffectFactory> getAll() {
		return new ArrayList<BattleEffectFactory>(battleEffectFactories.values());
	}

	@Override
	public BattleEffectFactory getByName(String name) {
		return battleEffectFactories.get(name);
	}

	@Override
	public void update(BattleEffectFactory battleEffectFactory) throws JPokemonException {
		if (battleEffectFactory == null) {
			throw new JPokemonException("Cannot register null battle effect factory");
		}
		if (battleEffectFactory.getBattleEffectClass() == null) {
			throw new JPokemonException("Cannot register battle effect factory without battle effect class: "
					+ battleEffectFactory);
		}
		if (!isRegistered(battleEffectFactory.getBattleEffectClass().getName())) {
			throw new JPokemonException("A battle effect factory is not registered with battle effect class: "
					+ battleEffectFactory.getClass().getName());
		}

		battleEffectFactories.put(battleEffectFactory.getBattleEffectClass().getName(), battleEffectFactory);
	}

	@Override
	public void unregister(String battleEffectClass) throws JPokemonException {
		if (battleEffectClass == null) {
			throw new JPokemonException("Cannot unregister battle effect factory without battle effect class");
		}
		if (!isRegistered(battleEffectClass)) {
			throw new JPokemonException("A battle effect factory is not registered with battle effect class: "
					+ battleEffectClass);
		}

		battleEffectFactories.remove(battleEffectClass);
	}

	/**
	 * Initializes a new SimpleBattleEffectFactoryManager as the
	 * {@link BattleEffectFactory#manager}
	 * 
	 * @throws JPokemonException If the BattleEffectFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (BattleEffectFactory.manager != null) {
			throw new JPokemonException("BattleEffectFactory.manager is already defined");
		}

		BattleEffectFactory.manager = new SimpleBattleEffectFactoryManager();
	}
}
