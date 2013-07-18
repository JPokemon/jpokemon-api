package org.jpokemon.api.classic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import org.jpokemon.api.Type;

/**
 * Defines the 17 classic types.
 */
public class ClassicTypes {
	/** Provides the classic type `????`. */
	public static final Type TYPELESS = new TypelessType();

	/** Provides the classic type `NORMAL`. */
	public static final Type NORMAL = new Type().setName("Normal")
			.setNotVeryEffectiveAgainst("Rock", "Steel").setIneffectiveAgainst("Ghost");

	/** Provides the classic type `FIRE`. */
	public static final Type FIRE = new Type().setName("Fire")
			.setSuperEffectiveAgainst("Grass", "Bug", "Steel").setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");

	/** Provides the classic type `WATER`. */
	public static final Type WATER = new Type().setName("Water")
			.setSuperEffectiveAgainst("Fire", "Ground", "Rock").setNotVeryEffectiveAgainst("Water", "Grass", "Dragon");;

	/** Provides the classic type `GRASS`. */
	public static final Type GRASS = new Type().setName("Grass")
			.setSuperEffectiveAgainst("Water", "Ground", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel");

	/** Provides the classic type `ELECTRIC`. */
	public static final Type ELECTRIC = new Type().setName("Electric")
			.setSuperEffectiveAgainst("Water", "Flying").setNotVeryEffectiveAgainst("Electric", "Grass", "Dragon")
			.setIneffectiveAgainst("Ground");

	/** Provides the classic type `ICE`. */
	public static final Type ICE = new Type().setName("Ice")
			.setSuperEffectiveAgainst("Grass", "Ground", "Flying", "Dragon")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Ice", "Steel");

	/** Provides the classic type `FIGHTING`. */
	public static final Type FIGHTING = new Type().setName("Fighting")
			.setSuperEffectiveAgainst("Normal", "Ice", "Rock", "Dark", "Steel")
			.setNotVeryEffectiveAgainst("Poison", "Flying", "Psychic", "Bug").setIneffectiveAgainst("Ghost");

	/** Provides the classic type `POISON`. */
	public static final Type POISON = new Type().setName("Poison").setSuperEffectiveAgainst("Grass")
			.setNotVeryEffectiveAgainst("Poison", "Ground", "Rock", "Ghost").setIneffectiveAgainst("Steel");

	/** Provides the classic type `GROUND`. */
	public static final Type GROUND = new Type().setName("Ground")
			.setSuperEffectiveAgainst("Fire", "Electric", "Poison", "Rock", "Steel")
			.setNotVeryEffectiveAgainst("Bug", "Grass").setIneffectiveAgainst("Flying");

	/** Provides the classic type `FLYING`. */
	public static final Type FLYING = new Type().setName("Flying")
			.setSuperEffectiveAgainst("Grass", "Fighting", "Bug").setNotVeryEffectiveAgainst("Electric", "Rock", "Steel");

	/** Provides the classic type `PSYCHIC`. */
	public static final Type PSYCHIC = new Type().setName("Psychic")
			.setSuperEffectiveAgainst("Fighting", "Poison").setNotVeryEffectiveAgainst("Psychic", "Steel")
			.setIneffectiveAgainst("Dark");

	/** Provides the classic type `BUG`. */
	public static final Type BUG = new Type().setName("Bug")
			.setSuperEffectiveAgainst("Grass", "Psychic", "Dark")
			.setNotVeryEffectiveAgainst("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel");

	/** Provides the classic type `ROCK`. */
	public static final Type ROCK = new Type().setName("Rock")
			.setSuperEffectiveAgainst("Fire", "Ice", "Flying", "Bug")
			.setNotVeryEffectiveAgainst("Fighting", "Ground", "Steel");

	/** Provides the classic type `GHOST`. */
	public static final Type GHOST = new Type().setName("Ghost")
			.setSuperEffectiveAgainst("Ghost", "Psychic").setNotVeryEffectiveAgainst("Dark", "Steel")
			.setIneffectiveAgainst("Normal");

	/** Provides the classic type `DRAGON`. */
	public static final Type DRAGON = new Type().setName("Dragon").setSuperEffectiveAgainst("Dragon")
			.setNotVeryEffectiveAgainst("Steel");

	/** Provides the classic type `DARK`. */
	public static final Type DARK = new Type().setName("Dark").setSuperEffectiveAgainst("Psychic", "Ghost")
			.setNotVeryEffectiveAgainst("Fighting", "Dark", "Steel");

	/** Provides the classic type `STEEL`. */
	public static final Type STEEL = new Type().setName("Steel").setSuperEffectiveAgainst("Ice", "Rock")
			.setNotVeryEffectiveAgainst("Fire", "Water", "Electric", "Steel");

	static {
		for (Field field : ClassicTypes.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) <= 0) {
					continue;
				}
				Object temp = field.get(null);
				if (temp instanceof Type) {
					Type type = (Type) temp;
					Type.manager.register(type);
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides the private constructor, so it cannot be instantiated. */
	private ClassicTypes() {
	}
}