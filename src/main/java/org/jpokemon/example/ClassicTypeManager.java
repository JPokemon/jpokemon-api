package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Type;

/**
 * Defines the 17 classic types.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicTypeManager implements Manager<Type> {
	protected Map<String, Type> types = new HashMap<String, Type>();

	/** Provides the default constructor */
	public ClassicTypeManager() {
		register(new Type().setName("???"));
		register(new Type().setName("Normal").setNotVeryEffectiveAgainst("Rock", "Steel").setIneffectiveAgainst("Ghost"));
		register(new Type().setName("Fire").setSuperEffectiveAgainst("Grass", "Bug", "Steel")
				.setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon"));
		register(new Type().setName("Water").setSuperEffectiveAgainst("Fire", "Ground", "Rock")
				.setNotVeryEffectiveAgainst("Water", "Grass", "Dragon"));
		register(new Type().setName("Grass").setSuperEffectiveAgainst("Water", "Ground", "Rock")
				.setNotVeryEffectiveAgainst("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"));
		register(new Type().setName("Electric").setSuperEffectiveAgainst("Water", "Flying")
				.setNotVeryEffectiveAgainst("Electric", "Grass", "Dragon").setIneffectiveAgainst("Ground"));
		register(new Type().setName("Ice").setSuperEffectiveAgainst("Grass", "Ground", "Flying", "Dragon")
				.setNotVeryEffectiveAgainst("Fire", "Water", "Ice", "Steel"));
		register(new Type().setName("Fighting").setSuperEffectiveAgainst("Normal", "Ice", "Rock", "Dark", "Steel")
				.setNotVeryEffectiveAgainst("Poison", "Flying", "Psychic", "Bug").setIneffectiveAgainst("Ghost"));
		register(new Type().setName("Poison").setSuperEffectiveAgainst("Grass")
				.setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost").setIneffectiveAgainst("Steel"));
		register(new Type().setName("Ground").setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel")
				.setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying"));
		register(new Type().setName("Flying").setSuperEffectiveAgainst("Grass", "Fighting", "Bug")
				.setNotVeryEffectiveAgainst("Electric", "Rock", "Steel"));
		register(new Type().setName("Psychic").setSuperEffectiveAgainst("Fighting", "Poison")
				.setNotVeryEffectiveAgainst("Psychic", "Steel").setIneffectiveAgainst("Dark"));
		register(new Type().setName("Bug").setSuperEffectiveAgainst("Grass", "Psychic", "Dark")
				.setNotVeryEffectiveAgainst("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel"));
		register(new Type().setName("Rock").setSuperEffectiveAgainst("Fire", "Ice", "Flying", "Bug")
				.setNotVeryEffectiveAgainst("Fighting", "Ground", "Steel"));
		register(new Type().setName("Ghost").setSuperEffectiveAgainst("Ghost", "Psychic")
				.setNotVeryEffectiveAgainst("Dark", "Steel").setIneffectiveAgainst("Normal"));
		register(new Type().setName("Dragon").setSuperEffectiveAgainst("Dragon").setNotVeryEffectiveAgainst("Steel"));
		register(new Type().setName("Dark").setSuperEffectiveAgainst("Psychic", "Ghost")
				.setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel"));
		register(new Type().setName("Steel").setSuperEffectiveAgainst("Ice", "Rock")
				.setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel"));
	}

	@Override
	public void register(Type type) throws JPokemonException {
		if (isRegistered(type)) {
			throw new JPokemonException("Type already registered: " + type.toString());
		}

		types.put(type.getName(), type);
	}

	@Override
	public boolean isRegistered(Type type) {
		if (type == null) {
			return false;
		}

		return getByName(type.getName()) != null;
	}

	@Override
	public Type getByName(String name) {
		return types.get(name);
	}

	public static void init() throws JPokemonException {
		if (Type.manager != null) {
			throw new JPokemonException("Type.manager is already defined");
		}

		Type.manager = new ClassicTypeManager();
	}
}