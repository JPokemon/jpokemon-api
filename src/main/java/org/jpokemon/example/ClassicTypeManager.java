package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Type;

/**
 * Provides a possible implementation of the {@link Type#manager}, using the 18
 * classic types
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
		register(new Type().setName("Poison").setSuperEffectiveAgainst("Grass", "Fairy")
				.setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost").setIneffectiveAgainst("Steel"));
		register(new Type().setName("Ground").setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel")
				.setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying"));
		register(new Type().setName("Flying").setSuperEffectiveAgainst("Grass", "Fighting", "Bug")
				.setNotVeryEffectiveAgainst("Electric", "Rock", "Steel"));
		register(new Type().setName("Psychic").setSuperEffectiveAgainst("Fighting", "Poison")
				.setNotVeryEffectiveAgainst("Psychic", "Steel").setIneffectiveAgainst("Dark"));
		register(new Type().setName("Bug").setSuperEffectiveAgainst("Grass", "Psychic", "Dark")
				.setNotVeryEffectiveAgainst("Fairy", "Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel"));
		register(new Type().setName("Rock").setSuperEffectiveAgainst("Fire", "Ice", "Flying", "Bug")
				.setNotVeryEffectiveAgainst("Fighting", "Ground", "Steel"));
		register(new Type().setName("Ghost").setSuperEffectiveAgainst("Ghost", "Psychic")
				.setNotVeryEffectiveAgainst("Dark", "Steel").setIneffectiveAgainst("Normal"));
		register(new Type().setName("Dragon").setSuperEffectiveAgainst("Dragon").setNotVeryEffectiveAgainst("Steel")
				.setIneffectiveAgainst("Fairy"));
		register(new Type().setName("Dark").setSuperEffectiveAgainst("Psychic", "Ghost")
				.setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel", "Fairy"));
		register(new Type().setName("Steel").setSuperEffectiveAgainst("Ice", "Rock", "Fairy")
				.setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel"));
		register(new Type().setName("Fairy").setSuperEffectiveAgainst("Dark", "Dragon", "Fighting")
				.setNotVeryEffectiveAgainst("Fire", "Poison", "Steel"));
	}

	@Override
	public void register(Type type) throws JPokemonException {
		if (type == null) {
			throw new JPokemonException("Cannot register null type");
		}
		else if (type.getName() == null) {
			throw new JPokemonException("Cannot register type without a name: " + type);
		}
		if (types.containsKey(type.getName()) && !type.equals(types.get(type.getName()))) {
			throw new JPokemonException("A type with the same name is already registered: " + type);
		}

		types.put(type.getName(), type);
	}

	@Override
	public boolean isRegistered(String typeName) {
		if (typeName == null) {
			return false;
		}

		return getByName(typeName) != null;
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