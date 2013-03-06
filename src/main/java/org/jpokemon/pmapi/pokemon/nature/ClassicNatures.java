package org.jpokemon.pmapi.pokemon.nature;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Random;

import org.jpokemon.pmapi.util.Stat;
import org.jpokemon.pmapi.util.Taste;

/**
 * Defines the 25 classic natures (personalities) that a Pokémon may possess.
 *
 * Note that this class is final. If you want to add or remove natures, it 
 * cannot be extended; you must write your own lookup class.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public final class ClassicNatures {
	private static final ArrayList<PokemonNature> natureList;

	// Neutral Natures:
	
	/** Provides the neutral nature `Bashful`. */
	public static final PokemonNature BASHFUL = new PokemonNature("Bashful", Stat.NONE, Stat.NONE, Taste.NONE);

	/** Provides the neutral nature `Docile`. */
	public static final PokemonNature DOCILE = new PokemonNature("Docile", Stat.NONE, Stat.NONE, Taste.NONE);

	/** Provides the neutral nature `Hardy`. */
	public static final PokemonNature HARDY = new PokemonNature("Hardy", Stat.NONE, Stat.NONE, Taste.NONE);

	/** Provides the neutral nature `Quirky`. */
	public static final PokemonNature QUIRKY = new PokemonNature("Quirky", Stat.NONE, Stat.NONE, Taste.NONE);

	/** Provides the neutral nature `Serious`. */
	public static final PokemonNature SERIOUS = new PokemonNature("Serious", Stat.NONE, Stat.NONE, Taste.NONE);

	// Attack-Increasing, Spice-Loving Natures:
	
	/** Provides the spice-loving, attack increasing nature `Serious`. */
	public static final PokemonNature ADAMANT = new PokemonNature("Adamant", Stat.ATTACK, Stat.SPECIAL_ATTACK, Taste.SPICY);

	/** Provides the spice-loving, attack increasing nature `Brave`. */
	public static final PokemonNature BRAVE = new PokemonNature("Brave", Stat.ATTACK, Stat.SPEED, Taste.SPICY);

	/** Provides the spice-loving, attack increasing nature `Loneley`. */
	public static final PokemonNature LONELY = new PokemonNature("Lonely", Stat.ATTACK, Stat.DEFENSE, Taste.SPICY);

	/** Provides the spice-loving, attack increasing nature `Naughty`. */
	public static final PokemonNature NAUGHTY = new PokemonNature("Naughty", Stat.ATTACK, Stat.SPECIAL_DEFENSE, Taste.SPICY);

	// Defense-Increasing, Sour-Loving Natures:
	
	/** Provides the sour-loving, defense increasing nature `Bold`. */
	public static final PokemonNature BOLD = new PokemonNature("Bold", Stat.DEFENSE, Stat.ATTACK, Taste.SOUR);

	/** Provides the sour-loving, defense increasing nature `Relaxed`. */
	public static final PokemonNature RELAXED = new PokemonNature("Relaxed", Stat.DEFENSE, Stat.SPEED, Taste.SOUR);

	/** Provides the sour-loving, defense increasing nature `Impish`. */
	public static final PokemonNature IMPISH = new PokemonNature("Impish", Stat.DEFENSE, Stat.SPECIAL_ATTACK, Taste.SOUR);

	/** Provides the sour-loving, defense increasing nature `Lax`. */
	public static final PokemonNature LAX = new PokemonNature("Lax", Stat.DEFENSE, Stat.SPECIAL_DEFENSE, Taste.SOUR);

	// Special Attack-Increasing, Dry-Loving Natures:
	
	/** Provides the dry-loving, attack increasing nature `Modest`. */
	public static final PokemonNature MODEST = new PokemonNature("Modest", Stat.DEFENSE, Stat.ATTACK, Taste.DRY);

	/** Provides the dry-loving, attack increasing nature `Mild`. */
	public static final PokemonNature MILD = new PokemonNature("Mild", Stat.DEFENSE, Stat.DEFENSE, Taste.DRY);

	/** Provides the dry-loving, attack increasing nature `Quiet`. */
	public static final PokemonNature QUIET = new PokemonNature("Quiet", Stat.DEFENSE, Stat.SPEED, Taste.DRY);

	/** Provides the dry-loving, attack increasing nature `Rash`. */
	public static final PokemonNature RASH = new PokemonNature("Rash", Stat.DEFENSE, Stat.SPECIAL_DEFENSE, Taste.DRY);

	// Special Defense-Increasing, Bitter-Loving Natures:
	
	/** Provides the bitter-loving, defense increasing nature `Calm`. */
	public static final PokemonNature CALM = new PokemonNature("Calm", Stat.SPECIAL_DEFENSE, Stat.ATTACK, Taste.BITTER);

	/** Provides the bitter-loving, defense increasing nature `Gentle`. */
	public static final PokemonNature GENTLE = new PokemonNature("Gentle", Stat.SPECIAL_DEFENSE, Stat.DEFENSE, Taste.BITTER);

	/** Provides the bitter-loving, defense increasing nature `Sassy`. */
	public static final PokemonNature SASSY = new PokemonNature("Sassy", Stat.SPECIAL_DEFENSE, Stat.SPEED, Taste.BITTER);

	/** Provides the bitter-loving, defense increasing nature `Careful`. */
	public static final PokemonNature CAREFUL = new PokemonNature("Careful", Stat.SPECIAL_DEFENSE, Stat.SPECIAL_ATTACK, Taste.BITTER);

	// Speed-Increasing, Sweet-Loving Natures:
	
	/** Provides the sweet-loving, speed increasing nature `Timid`. */
	public static final PokemonNature TIMID = new PokemonNature("Timid", Stat.SPEED, Stat.ATTACK, Taste.SWEET);

	/** Provides the sweet-loving, speed increasing nature `Hasty`. */
	public static final PokemonNature HASTY = new PokemonNature("Hasty", Stat.SPEED, Stat.DEFENSE, Taste.SWEET);

	/** Provides the sweet-loving, speed increasing nature `Jolly`. */
	public static final PokemonNature JOLLY = new PokemonNature("Jolly", Stat.SPEED, Stat.SPECIAL_ATTACK, Taste.SWEET);

	/** Provides the sweet-loving, speed increasing nature `Naive`. */
	public static final PokemonNature NAIVE = new PokemonNature("Naive", Stat.SPEED, Stat.SPECIAL_DEFENSE, Taste.SWEET);

	//Adds the natures listed above to a list for randomization purposes.
	static {
		natureList = new ArrayList<PokemonNature>(25);
		for (Field field : ClassicNatures.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.STATIC | Modifier.PUBLIC)) > 0) {
					Object temp = field.get(null);
					if (temp instanceof PokemonNature) {
						PokemonNature nature = (PokemonNature) temp;
						natureList.add(nature);
					}
				}
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		}
	}

	/**
	 * Helper method to get a random nature, with a uniform probability 
	 * distribution.
	 *
	 * @param random The {@link Random} object to select the nature with.
	 */
	public static PokemonNature getRandomNature(Random random) {
		return natureList.get((short) random.nextInt(25));
	}
}