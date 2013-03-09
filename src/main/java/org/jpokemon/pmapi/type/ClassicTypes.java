package org.jpokemon.pmapi.type;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.TreeMap;

import org.jpokemon.pmapi.JPokemonException;

/**
 * Defines the list of the 17 classic Pokémon types. This class functions very 
 * much like an enum, providing constants that can be referenced by Moves and 
 * Species, and also provides the functionality of a {@link TypeManager}
 *
 * If you wish to add a new type, simply instantiate one and give it a name. To
 * modify a type, you can modify the static field of this class that refers to 
 * it, or retrieve the instance by name with `getType`. Both are equivalent.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public class ClassicTypes extends SimpleTypeManager {
	private static ClassicTypes instance;

	/** Provides the classic type `????`. */
	public static PokemonType TYPELESS;

	/** Provides the classic type `NORMAL`. */
	public static PokemonType NORMAL;
	
	/** Provides the classic type `FIRE`. */
	public static PokemonType FIRE;
	
	/** Provides the classic type `WATER`. */
	public static PokemonType WATER;

	/** Provides the classic type `GRASS`. */
	public static PokemonType GRASS;

	/** Provides the classic type `ELECTRIC`. */
	public static PokemonType ELECTRIC;

	/** Provides the classic type `ICE`. */
	public static PokemonType ICE;

	/** Provides the classic type `FIGHTING`. */
	public static PokemonType FIGHTING;

	/** Provides the classic type `POISON`. */
	public static PokemonType POISON;

	/** Provides the classic type `GROUND`. */
	public static PokemonType GROUND;

	/** Provides the classic type `FLYING`. */
	public static PokemonType FLYING;

	/** Provides the classic type `PSYCHIC`. */
	public static PokemonType PSYCHIC;

	/** Provides the classic type `BUG`. */
	public static PokemonType BUG;

	/** Provides the classic type `ROCK`. */
	public static PokemonType ROCK;

	/** Provides the classic type `GHOST`. */
	public static PokemonType GHOST;

	/** Provides the classic type `DRAGON`. */
	public static PokemonType DRAGON;

	/** Provides the classic type `DARK`. */
	public static PokemonType DARK;

	/** Provides the classic type `STEEL`. */
	public static PokemonType STEEL;

	static {
		try {

			// Makes this class the manager for types.
			instance = new ClassicTypes();

			// Instantiates the classic types (via a reflection shortcut).
			for (Field field : ClassicTypes.class.getFields()) {
				try {
					if ((field.getModifiers() & (Modifier.STATIC | Modifier.PUBLIC)) > 0 && field.getType() == PokemonType.class && !field.getName().equals("TYPELESS")) {
 						field.set(null, new PokemonType());
					}
				} catch (Exception exception) {
					throw new RuntimeException(exception);
				}
			}

			// Defines the classic types
			TYPELESS = new TypelessType();
			NORMAL.setName("Normal").setNotVeryEffectiveAgainst("Rock", "Steel").setIneffectiveAgainst("Ghost");
			FIRE.setName("Fire").setSuperEffectiveAgainst("Grass", "Bug", "Steel").setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");
			WATER.setName("Water").setSuperEffectiveAgainst("Fire", "Ground", "Rock").setNotVeryEffectiveAgainst("Water", "Grass", "Dragon");
			GRASS.setName("Grass").setSuperEffectiveAgainst("Water", "Ground", "Rock").setNotVeryEffectiveAgainst("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel");
			ELECTRIC.setName("Electric").setSuperEffectiveAgainst("Water", "Flying").setNotVeryEffectiveAgainst("Electric", "Grass", "Dragon").setIneffectiveAgainst("Ground");
			ICE.setName("Ice").setSuperEffectiveAgainst("Grass", "Ground", "Flying", "Dragon").setNotVeryEffectiveAgainst("Fire", "Water", "Ice", "Steel");
			FIGHTING.setName("Fighting").setSuperEffectiveAgainst("Normal", "Ice", "Rock", "Dark", "Steel").setNotVeryEffectiveAgainst("Poison", "Flying", "Psychic", "Bug").setIneffectiveAgainst("Ghost");
			POISON.setName("Poison").setSuperEffectiveAgainst("Grass").setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost").setIneffectiveAgainst("Steel");
			GROUND.setName("Ground").setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel").setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying");
			FLYING.setName("Flying").setSuperEffectiveAgainst("Grass", "Fighting", "Bug").setNotVeryEffectiveAgainst("Electric", "Rock", "Steel");
			PSYCHIC.setName("Psychic").setSuperEffectiveAgainst("Fighting", "Poison").setNotVeryEffectiveAgainst("Psychic", "Steel").setIneffectiveAgainst("Dark");
			BUG.setName("Bug").setSuperEffectiveAgainst("Grass", "Psychic", "Dark").setNotVeryEffectiveAgainst("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel");
			ROCK.setName("Rock").setSuperEffectiveAgainst("Fire", "Ice", "Flying", "Bug").setNotVeryEffectiveAgainst("Fighting", "Ground", "Steel");
			GHOST.setName("Ghost").setSuperEffectiveAgainst("Ghost", "Psychic").setNotVeryEffectiveAgainst("Dark", "Steel").setIneffectiveAgainst("Normal");
			DRAGON.setName("Dragon").setSuperEffectiveAgainst("Dragon").setNotVeryEffectiveAgainst("Steel");
			DARK.setName("Dark").setSuperEffectiveAgainst("Psychic", "Ghost").setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel");
			STEEL.setName("Steel").setSuperEffectiveAgainst("Ice", "Rock").setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel");			
		} catch (JPokemonException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Checks if a type is as known by ClassicTypes.
	 *
	 * @return `true` if the type is known.
	 */
	public static boolean isKnown(PokemonType type) {
		return instance.isRegistered(type);
	}

	/**
	 * Checks if a type is as known by ClassicTypes.
	 *
	 * @return `true` if the type is known.
	 */
	public static boolean isKnown(String typeName) {
		return (instance.getType(typeName) != null);
	}

	/**
	 * Gets a known type by name, including additional ones.
	 * 
	 * @param  name The name of the type requested.
	 * 
	 * @return      The {@link PokemonType} for this type.
	 */
	public static PokemonType getType(String name) {
		return instance.getTypeByName(name);
	}

	/**
	 * Initializes the classic types. This method can be called if you do not 
	 * want to rely on this singleton class being initialized by the first call
	 * to one of its fields or methods. 
	 */
	public static void init() {
	}

	/** Provides a private constructor. */
	private ClassicTypes() throws JPokemonException {
		super();
	}
}