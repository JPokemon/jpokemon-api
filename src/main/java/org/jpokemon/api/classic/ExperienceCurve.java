package org.jpokemon.api.classic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/**
 * Defines the available experience curves for a Pokémon. For justification, 
 * see the entry in [Bulbapedia][l_1]. This class also contains static methods 
 * to retrieve the appropriate curve by name or byte identifier.
 *
 * [l_1]: http://bulbapedia.bulbagarden.net/wiki/Experience#Relation_to_level
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public final class ExperienceCurve {
	private static final HashMap<String, ExperienceCurve> names = new HashMap<String, ExperienceCurve>(6);
	private static final HashMap<Byte, ExperienceCurve> ids = new HashMap<Byte, ExperienceCurve>(6);
	
	/** Indicates the Pokémon has an `Erratic` experience curve. */
	public static final ExperienceCurve ERRATIC = new ExperienceCurve("Erratic", 1);

	/** Indicates the Pokémon has a `Fast` experience curve. */
	public static final ExperienceCurve FAST = new ExperienceCurve("Fast", 4);

	/** Indicates the Pokémon has a `Medium Fast` experience curve. */
	public static final ExperienceCurve MEDIUM_FAST = new ExperienceCurve("Medium Fast", 0);

	/** Indicates the Pokémon has a `Medium Slow` experience curve. */
	public static final ExperienceCurve MEDIUM_SLOW = new ExperienceCurve("Medium Slow", 3);

	/** Indicates the Pokémon has a `Slow` experience curve. */
	public static final ExperienceCurve SLOW = new ExperienceCurve("Slow", 5);

	/** Indicates the Pokémon has a `Fluctuating` experience curve. */
	public static final ExperienceCurve FLUCTUATING = new ExperienceCurve("Fluctuating", 2);

	// Adds the fields to the lookup lists
	static {
		for (Field field : ExperienceCurve.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.STATIC | Modifier.PUBLIC)) > 0) {
					Object temp = field.get(null);
					if (temp instanceof ExperienceCurve) {
						ExperienceCurve type = (ExperienceCurve) temp;
						names.put(type.getName(), type);
						ids.put(type.getAsByte(), type);
					}
				}
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}
	}

	/** Gets the experience curve with the given name. */
	public static ExperienceCurve getExperienceCurveByName(String name){
		if (names.containsKey(name)){
			return names.get(name);
		}
		return null;
	}

	/** Gets the experience curve with the given byte representation. */
	public static ExperienceCurve getExperienceCurveByByteId(byte byteId){
		if (ids.containsKey(byteId)){
			return ids.get(byteId);
		}
		return null;
	}

	private final String name;
	private final byte asByte;

	private ExperienceCurve(String name, int asByte) {
		this.name = name;
		this.asByte = (byte) asByte;
	}

	/** Gets the name of the experience curve. */
	public String getName() {
		return name;
	}

	/** Gets the experience curve as a byte. */
	public byte getAsByte() {
		return asByte;
	}

	/**
	 * Returns a String representation of the curve.
	 * 
	 * @return The name of the curve as a String.
	 */
	@Override
	public String toString() {
		return name;
	}
}
