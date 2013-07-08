package org.jpokemon.pmapi.type;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.jpokemon.pmapi.JPokemonError;

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
 * @since 0.1
 */
public class ClassicTypes {
	/** Provides the classic type `????`. */
	public static final PokemonType TYPELESS = new TypelessType();

	/** Provides the classic type `NORMAL`. */
	public static final PokemonType NORMAL = new PokemonType().setName("Normal")
			.setNotVeryEffectiveAgainst("Rock", "Steel")
			.setIneffectiveAgainst("Ghost");

	/** Provides the classic type `FIRE`. */
	public static final PokemonType FIRE = new PokemonType().setName("Fire")
			.setSuperEffectiveAgainst("Grass", "Bug", "Steel")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");

	/** Provides the classic type `WATER`. */
	public static final PokemonType WATER = new PokemonType().setName("Water")
			.setSuperEffectiveAgainst("Fire", "Ground", "Rock")
			.setNotVeryEffectiveAgainst("Water", "Grass", "Dragon");;

	/** Provides the classic type `GRASS`. */
	public static final PokemonType GRASS = new PokemonType().setName("Grass")
			.setSuperEffectiveAgainst("Water", "Ground", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel");

	/** Provides the classic type `ELECTRIC`. */
	public static final PokemonType ELECTRIC = new PokemonType().setName("Electric")
			.setSuperEffectiveAgainst("Water", "Flying")
			.setNotVeryEffectiveAgainst("Electric", "Grass", "Dragon")
			.setIneffectiveAgainst("Ground");

	/** Provides the classic type `ICE`. */
	public static final PokemonType ICE = new PokemonType().setName("Ice")
			.setSuperEffectiveAgainst("Grass", "Ground", "Flying", "Dragon")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Ice", "Steel");

	/** Provides the classic type `FIGHTING`. */
	public static final PokemonType FIGHTING = new PokemonType().setName("Fighting")
			.setSuperEffectiveAgainst("Normal", "Ice", "Rock", "Dark", "Steel")
			.setNotVeryEffectiveAgainst("Poison", "Flying", "Psychic", "Bug")
			.setIneffectiveAgainst("Ghost");

	/** Provides the classic type `POISON`. */
	public static final PokemonType POISON = new PokemonType().setName("Poison")
			.setSuperEffectiveAgainst("Grass")
			.setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost")
			.setIneffectiveAgainst("Steel");

	/** Provides the classic type `GROUND`. */
	public static final PokemonType GROUND = new PokemonType().setName("Ground")
			.setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel")
			.setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying");

	/** Provides the classic type `FLYING`. */
	public static final PokemonType FLYING = new PokemonType().setName("Flying")
			.setSuperEffectiveAgainst("Grass", "Fighting", "Bug")
			.setNotVeryEffectiveAgainst("Electric", "Rock", "Steel");

	/** Provides the classic type `PSYCHIC`. */
	public static final PokemonType PSYCHIC = new PokemonType().setName("Psychic")
			.setSuperEffectiveAgainst("Fighting", "Poison")
			.setNotVeryEffectiveAgainst("Psychic", "Steel")
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
			.setSuperEffectiveAgainst("Ghost", "Psychic")
			.setNotVeryEffectiveAgainst("Dark", "Steel")
			.setIneffectiveAgainst("Normal");

	/** Provides the classic type `DRAGON`. */
	public static final PokemonType DRAGON = new PokemonType().setName("Dragon")
			.setSuperEffectiveAgainst("Dragon")
			.setNotVeryEffectiveAgainst("Steel");

	/** Provides the classic type `DARK`. */
	public static final PokemonType DARK = new PokemonType().setName("Dark")
			.setSuperEffectiveAgainst("Psychic", "Ghost")
			.setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel");

	/** Provides the classic type `STEEL`. */
	public static final PokemonType STEEL = new PokemonType().setName("Steel")
			.setSuperEffectiveAgainst("Ice", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel");

	/**
	 * Initializes the classic types, and registers them with the specified
	 * manager
	 * 
	 * @param manager The manager to register with
	 */
	public static void init(TypeManager manager) {
		for (Field field : ClassicTypes.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) > 0) {
					Object temp = field.get(null);

					if (temp instanceof PokemonType) {
						PokemonType type = (PokemonType) temp;
						manager.registerType(type);
					}
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides a private constructor. */
	private ClassicTypes() throws JPokemonError {
		super();
	}
}