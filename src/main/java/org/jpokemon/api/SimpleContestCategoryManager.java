package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a "simplest-possible" implementation of the
 * {@link ContestCategory#manager}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class SimpleContestCategoryManager implements Manager<ContestCategory> {
	protected Map<String, ContestCategory> contestCategories = new HashMap<String, ContestCategory>();

	/** Provides the default constructor */
	public SimpleContestCategoryManager() {
	}

	@Override
	public boolean isRegistered(String name) {
		return contestCategories.containsKey(name);
	}

	@Override
	public void register(ContestCategory contestCategory) throws JPokemonException {
		if (contestCategory == null) {
			throw new JPokemonException("Cannot register null contest category");
		}
		if (contestCategory.getName() == null) {
			throw new JPokemonException("Cannot register contest category without a name: " + contestCategory);
		}
		if (isRegistered(contestCategory.getName())) {
			throw new JPokemonException("A contest category is already registered with name: " + contestCategory.getName());
		}

		contestCategories.put(contestCategory.getName(), contestCategory);
	}

	@Override
	public List<ContestCategory> getAll() {
		return new ArrayList<ContestCategory>(contestCategories.values());
	}

	@Override
	public ContestCategory getByName(String name) throws JPokemonException {
		return contestCategories.get(name);
	}

	@Override
	public void update(ContestCategory contestCategory) throws JPokemonException {
		if (contestCategory == null) {
			throw new JPokemonException("Cannot register null contest category");
		}
		if (contestCategory.getName() == null) {
			throw new JPokemonException("Cannot register contest category without a name: " + contestCategory);
		}
		if (!isRegistered(contestCategory.getName())) {
			throw new JPokemonException("A contest category is not registered with name: " + contestCategory.getName());
		}

		contestCategories.put(contestCategory.getName(), contestCategory);
	}

	@Override
	public void unregister(String name) throws JPokemonException {
		if (name == null) {
			throw new JPokemonException("Cannot register contest category without a name");
		}
		if (!isRegistered(name)) {
			throw new JPokemonException("A contest category is not registered with name: " + name);
		}

		contestCategories.remove(name);
	}

	/**
	 * Initializes a new SimpleContestCategoryManager as the
	 * {@link ContestCategory#manager}
	 * 
	 * @throws JPokemonException If the ContestCategory.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (ContestCategory.manager != null) {
			throw new JPokemonException("ContestCategory.manager is already defined");
		}

		ContestCategory.manager = new SimpleContestCategoryManager();
	}
}
