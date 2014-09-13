package org.jpokemon.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.Builder;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

public class SimpleBuildersManager<T> implements Manager<Builder<T>> {
	protected Map<Class<?>, Builder<T>> builders = new HashMap<Class<?>, Builder<T>>();

	@Override
	public Builder<T> create() {
		throw new JPokemonException("Cannot create anonymous interface implementation");
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean isRegistered(String id) {
		Class<? extends T> clazz = null;

		try {
			clazz = (Class<? extends T>) Class.forName(id);
		} catch (Exception e) {
		}

		return builders.containsKey(clazz);
	}

	@Override
	public List<Builder<T>> getAll() throws JPokemonException {
		return new ArrayList<Builder<T>>(builders.values());
	}

	@Override
	@SuppressWarnings("unchecked")
	public Builder<T> get(String id) throws JPokemonException {
		Class<? extends T> clazz = null;

		try {
			clazz = (Class<? extends T>) Class.forName(id);
		} catch (Exception e) {
		}

		return builders.get(clazz);
	}

	@Override
	public void register(Builder<T> builder) throws JPokemonException {
		Class<?> clazz = builder.getOutputClass();
		builders.put(clazz, builder);
	}

	@Override
	public void update(Builder<T> builder) throws JPokemonException {
		register(builder);
	}

	@Override
	@SuppressWarnings("unchecked")
	public void unregister(String id) throws JPokemonException {
		Class<? extends T> clazz = null;

		try {
			clazz = (Class<? extends T>) Class.forName(id);
		} catch (Exception e) {
		}

		builders.remove(clazz);
	}
}
