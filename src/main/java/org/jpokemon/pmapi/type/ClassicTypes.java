package org.jpokemon.pmapi.type;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

import org.jpokemon.pmapi.type.classic.*;

/**
 * Defines the list of the 17 classic Pokémon types. This class functions very 
 * much like an enum, providing constants that can be referenced by Moves and 
 * Species.
 *
 * Note that this class is final. If you want to add or remove types, it cannot
 * be extended; you must write your own lookup class.
 */
public final class ClassicTypes {
	private static final HashMap<String, PokemonType> typeList = new HashMap<String, PokemonType>(18);

	/** Provides the type `????`. */
	public static final PokemonType TYPELESS = new TypelessType();

	/** Provides the type `NORMAL`. */
	public static final PokemonType NORMAL = new NormalType();
	
	/** Provides the type `FIRE`. */
	public static final PokemonType FIRE = new FireType();
	
	/** Provides the type `WATER`. */
	public static final PokemonType WATER = new WaterType();

	/** Provides the type `GRASS`. */
	public static final PokemonType GRASS = new GrassType();

	/** Provides the type `ELECTRIC`. */
	public static final PokemonType ELECTRIC = new ElectricType();

	/** Provides the type `ICE`. */
	public static final PokemonType ICE = new IceType();

	/** Provides the type `FIGHTING`. */
	public static final PokemonType FIGHTING = new FightingType();

	/** Provides the type `POISON`. */
	public static final PokemonType POISON = new PoisonType();

	/** Provides the type `GROUND`. */
	public static final PokemonType GROUND = new GroundType();

	/** Provides the type `FLYING`. */
	public static final PokemonType FLYING = new FlyingType();

	/** Provides the type `PSYCHIC`. */
	public static final PokemonType PSYCHIC = new PsychicType();

	/** Provides the type `BUG`. */
	public static final PokemonType BUG = new BugType();

	/** Provides the type `ROCK`. */
	public static final PokemonType ROCK = new RockType();

	/** Provides the type `GHOST`. */
	public static final PokemonType GHOST = new GhostType();

	/** Provides the type `DRAGON`. */
	public static final PokemonType DRAGON = new DragonType();

	/** Provides the type `DARK`. */
	public static final PokemonType DARK = new DarkType();

	/** Provides the type `STEEL`. */
	public static final PokemonType STEEL = new SteelType();

	//Adds the types to a list for lookup
	static {
		for (Field field : PokemonTypes.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.STATIC | Modifier.PUBLIC)) > 0) {
					Object temp = field.get(null);
					if (temp instanceof PokemonType) {
						PokemonType type = (PokemonType) temp;
						typeList.put(type.getName(), type);
					}
				}
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}
	}

	/** Gets the appropriate PokemonType for the given name. */
	public static PokemonType getTypeByName(String name) {
		if (typeList.containsKey(name)) {
			return typeList.get(name);
		}
		return null;
	}
}