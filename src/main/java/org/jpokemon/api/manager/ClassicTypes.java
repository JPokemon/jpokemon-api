package org.jpokemon.api.manager;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.classic.TypelessType;
import org.jpokemon.api.types.PokemonType;

/**
 * Defines a "simplest-possible" implementation of the {@link Manager} interface
 * for types. This manager provides the classic types. See {@link #init}
 * 
 * Note that this class is final. If you want to add or remove natures, it
 * cannot be extended; you must write your own lookup class.
 */
public final class ClassicTypes implements Manager<PokemonType> {
	private final Map<String, PokemonType> typeList = new HashMap<String, PokemonType>();

	public static final PokemonType TYPELESS = new TypelessType();

	/** Provides the classic type `NORMAL`. */
	public static final PokemonType NORMAL = new PokemonType().setName("Normal")
			.setNotVeryEffectiveAgainst("Rock", "Steel").setIneffectiveAgainst("Ghost");

	/** Provides the classic type `FIRE`. */
	public static final PokemonType FIRE = new PokemonType().setName("Fire")
			.setSuperEffectiveAgainst("Grass", "Bug", "Steel").setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");

	/** Provides the classic type `WATER`. */
	public static final PokemonType WATER = new PokemonType().setName("Water")
			.setSuperEffectiveAgainst("Fire", "Ground", "Rock").setNotVeryEffectiveAgainst("Water", "Grass", "Dragon");;

	/** Provides the classic type `GRASS`. */
	public static final PokemonType GRASS = new PokemonType().setName("Grass")
			.setSuperEffectiveAgainst("Water", "Ground", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel");

	/** Provides the classic type `ELECTRIC`. */
	public static final PokemonType ELECTRIC = new PokemonType().setName("Electric")
			.setSuperEffectiveAgainst("Water", "Flying").setNotVeryEffectiveAgainst("Electric", "Grass", "Dragon")
			.setIneffectiveAgainst("Ground");

	/** Provides the classic type `ICE`. */
	public static final PokemonType ICE = new PokemonType().setName("Ice")
			.setSuperEffectiveAgainst("Grass", "Ground", "Flying", "Dragon")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Ice", "Steel");

	/** Provides the classic type `FIGHTING`. */
	public static final PokemonType FIGHTING = new PokemonType().setName("Fighting")
			.setSuperEffectiveAgainst("Normal", "Ice", "Rock", "Dark", "Steel")
			.setNotVeryEffectiveAgainst("Poison", "Flying", "Psychic", "Bug").setIneffectiveAgainst("Ghost");

	/** Provides the classic type `POISON`. */
	public static final PokemonType POISON = new PokemonType().setName("Poison").setSuperEffectiveAgainst("Grass")
			.setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost").setIneffectiveAgainst("Steel");

	/** Provides the classic type `GROUND`. */
	public static final PokemonType GROUND = new PokemonType().setName("Ground")
			.setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel")
			.setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying");

	/** Provides the classic type `FLYING`. */
	public static final PokemonType FLYING = new PokemonType().setName("Flying")
			.setSuperEffectiveAgainst("Grass", "Fighting", "Bug").setNotVeryEffectiveAgainst("Electric", "Rock", "Steel");

	/** Provides the classic type `PSYCHIC`. */
	public static final PokemonType PSYCHIC = new PokemonType().setName("Psychic")
			.setSuperEffectiveAgainst("Fighting", "Poison").setNotVeryEffectiveAgainst("Psychic", "Steel")
			.setIneffectiveAgainst("Dark");

	/** Provides the classic type `BUG`. */
	public static final PokemonType BUG = new PokemonType().setName("Bug")
			.setSuperEffectiveAgainst("Grass", "Psychic", "Dark")
			.setNotVeryEffectiveAgainst("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel");

	/** Provides the classic type `ROCK`. */
	public static final PokemonType ROCK = new PokemonType().setName("Rock")
			.setSuperEffectiveAgainst("Fire", "Ice", "Flying", "Bug")
			.setNotVeryEffectiveAgainst("Fighting", "Ground", "Steel");

	/** Provides the classic type `GHOST`. */
	public static final PokemonType GHOST = new PokemonType().setName("Ghost")
			.setSuperEffectiveAgainst("Ghost", "Psychic").setNotVeryEffectiveAgainst("Dark", "Steel")
			.setIneffectiveAgainst("Normal");

	/** Provides the classic type `DRAGON`. */
	public static final PokemonType DRAGON = new PokemonType().setName("Dragon").setSuperEffectiveAgainst("Dragon")
			.setNotVeryEffectiveAgainst("Steel");

	/** Provides the classic type `DARK`. */
	public static final PokemonType DARK = new PokemonType().setName("Dark").setSuperEffectiveAgainst("Psychic", "Ghost")
			.setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel");

	/** Provides the classic type `STEEL`. */
	public static final PokemonType STEEL = new PokemonType().setName("Steel").setSuperEffectiveAgainst("Ice", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel");

	@Override
	public boolean register(PokemonType type) throws JPokemonError {
		if (typeList.containsKey(type.getName())) {
			throw new JPokemonError("A type with the name " + type.getName() + " has already been registered!");
		}
		if (typeList.containsValue(type)) {
			throw new JPokemonError("This type is already registered!");
		}
		typeList.put(type.getName(), type);
		return true;
	}

	@Override
	public boolean isRegistered(PokemonType type) {
		return typeList.containsValue(type);
	}

	@Override
	public PokemonType getByName(String name) {
		if (!typeList.containsKey(name)) {
			return null;
		}
		return typeList.get(name);
	}

	/**
	 * Initializes {@link PokemonType#manager} to be an instance of ClassicTypes,
	 * with all classic types populated in the manager.
	 */
	public static void init() {
		if (PokemonType.manager != null) {
			throw new JPokemonError("PokemonType.manager already defined.");
		}

		PokemonType.manager = new ClassicTypes();

		for (Field field : ClassicTypes.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) <= 0) {
					continue;
				}

				Object temp = field.get(null);

				if (temp instanceof PokemonType) {
					PokemonType type = (PokemonType) temp;
					PokemonType.manager.register(type);
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides the private constructor. */
	private ClassicTypes() {
	}
}