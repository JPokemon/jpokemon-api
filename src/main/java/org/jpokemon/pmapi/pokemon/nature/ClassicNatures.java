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
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public final class ClassicNatures {
	private static final ArrayList<PokemonNature> natureList;

	// Neutral Natures:

	/** Provides the neutral nature `Bashful`. */
	public static final PokemonNature BASHFUL = new PokemonNature().setName("Bashful").setStatIncreased(Stat.NONE)
			.setStatDecreased(Stat.NONE).setTasteFavorite(Taste.NONE).setTasteDisliked(Taste.NONE);

	/** Provides the neutral nature `Docile`. */
	public static final PokemonNature DOCILE = new PokemonNature().setName("Docile").setStatIncreased(Stat.NONE)
			.setStatDecreased(Stat.NONE).setTasteFavorite(Taste.NONE).setTasteDisliked(Taste.NONE);

	/** Provides the neutral nature `Hardy`. */
	public static final PokemonNature HARDY = new PokemonNature().setName("Hardy").setStatIncreased(Stat.NONE)
			.setStatDecreased(Stat.NONE).setTasteFavorite(Taste.NONE).setTasteDisliked(Taste.NONE);

	/** Provides the neutral nature `Quirky`. */
	public static final PokemonNature QUIRKY = new PokemonNature().setName("Quirky").setStatIncreased(Stat.NONE)
			.setStatDecreased(Stat.NONE).setTasteFavorite(Taste.NONE).setTasteDisliked(Taste.NONE);

	/** Provides the neutral nature `Serious`. */
	public static final PokemonNature SERIOUS = new PokemonNature().setName("Serious").setStatIncreased(Stat.NONE)
			.setStatDecreased(Stat.NONE).setTasteFavorite(Taste.NONE).setTasteDisliked(Taste.NONE);

	// Attack-Increasing, Spice-Loving Natures:

	/** Provides the spice-loving, attack increasing nature `Serious`. */
	public static final PokemonNature ADAMANT = new PokemonNature().setName("Adamant").setStatIncreased(Stat.ATTACK)
			.setStatDecreased(Stat.SPECIAL_ATTACK).setTasteFavorite(Taste.SPICY).setTasteDisliked(Taste.DRY);

	/** Provides the spice-loving, attack increasing nature `Brave`. */
	public static final PokemonNature BRAVE = new PokemonNature().setName("Brave").setStatIncreased(Stat.ATTACK)
			.setStatDecreased(Stat.SPEED).setTasteFavorite(Taste.SPICY).setTasteDisliked(Taste.SWEET);

	/** Provides the spice-loving, attack increasing nature `Loneley`. */
	public static final PokemonNature LONELY = new PokemonNature().setName("Lonely").setStatIncreased(Stat.ATTACK)
			.setStatDecreased(Stat.DEFENSE).setTasteFavorite(Taste.SPICY).setTasteDisliked(Taste.SOUR);

	/** Provides the spice-loving, attack increasing nature `Naughty`. */
	public static final PokemonNature NAUGHTY = new PokemonNature().setName("Naughty").setStatIncreased(Stat.ATTACK)
			.setStatDecreased(Stat.SPECIAL_DEFENSE).setTasteFavorite(Taste.SPICY).setTasteDisliked(Taste.BITTER);

	// Defense-Increasing, Sour-Loving Natures:

	/** Provides the sour-loving, defense increasing nature `Bold`. */
	public static final PokemonNature BOLD = new PokemonNature().setName("Bold").setStatIncreased(Stat.DEFENSE)
			.setStatDecreased(Stat.ATTACK).setTasteFavorite(Taste.SOUR).setTasteDisliked(Taste.SPICY);

	/** Provides the sour-loving, defense increasing nature `Relaxed`. */
	public static final PokemonNature RELAXED = new PokemonNature().setName("Relaxed").setStatIncreased(Stat.DEFENSE)
			.setStatDecreased(Stat.SPEED).setTasteFavorite(Taste.SOUR).setTasteDisliked(Taste.SWEET);

	/** Provides the sour-loving, defense increasing nature `Impish`. */
	public static final PokemonNature IMPISH = new PokemonNature().setName("Impish").setStatIncreased(Stat.DEFENSE)
			.setStatDecreased(Stat.SPECIAL_ATTACK).setTasteFavorite(Taste.SOUR).setTasteDisliked(Taste.DRY);

	/** Provides the sour-loving, defense increasing nature `Lax`. */
	public static final PokemonNature LAX = new PokemonNature().setName("Lax").setStatIncreased(Stat.DEFENSE)
			.setStatDecreased(Stat.SPECIAL_DEFENSE).setTasteFavorite(Taste.SOUR).setTasteDisliked(Taste.BITTER);

	// Special Attack-Increasing, Dry-Loving Natures:

	/** Provides the dry-loving, attack increasing nature `Modest`. */
	public static final PokemonNature MODEST = new PokemonNature().setName("Modest").setStatIncreased(Stat.SPECIAL_ATTACK)
			.setStatDecreased(Stat.ATTACK).setTasteFavorite(Taste.DRY).setTasteDisliked(Taste.SPICY);

	/** Provides the dry-loving, attack increasing nature `Mild`. */
	public static final PokemonNature MILD = new PokemonNature().setName("Mild").setStatIncreased(Stat.SPECIAL_ATTACK)
			.setStatDecreased(Stat.DEFENSE).setTasteFavorite(Taste.DRY).setTasteDisliked(Taste.SOUR);

	/** Provides the dry-loving, attack increasing nature `Quiet`. */
	public static final PokemonNature QUIET = new PokemonNature().setName("Quiet").setStatIncreased(Stat.SPECIAL_ATTACK)
			.setStatDecreased(Stat.SPEED).setTasteFavorite(Taste.DRY).setTasteDisliked(Taste.SWEET);

	/** Provides the dry-loving, attack increasing nature `Rash`. */
	public static final PokemonNature RASH = new PokemonNature().setName("Rash").setStatIncreased(Stat.SPECIAL_ATTACK)
			.setStatDecreased(Stat.SPECIAL_DEFENSE).setTasteFavorite(Taste.DRY).setTasteDisliked(Taste.BITTER);

	// Special Defense-Increasing, Bitter-Loving Natures:

	/** Provides the bitter-loving, defense increasing nature `Calm`. */
	public static final PokemonNature CALM = new PokemonNature().setName("Calm").setStatIncreased(Stat.SPECIAL_DEFENSE)
			.setStatDecreased(Stat.ATTACK).setTasteFavorite(Taste.BITTER).setTasteDisliked(Taste.SPICY);

	/** Provides the bitter-loving, defense increasing nature `Gentle`. */
	public static final PokemonNature GENTLE = new PokemonNature().setName("Gentle").setStatIncreased(Stat.SPECIAL_DEFENSE)
			.setStatDecreased(Stat.DEFENSE).setTasteFavorite(Taste.BITTER).setTasteDisliked(Taste.SOUR);

	/** Provides the bitter-loving, defense increasing nature `Sassy`. */
	public static final PokemonNature SASSY = new PokemonNature().setName("Sassy").setStatIncreased(Stat.SPECIAL_DEFENSE)
			.setStatDecreased(Stat.SPEED).setTasteFavorite(Taste.BITTER).setTasteDisliked(Taste.SWEET);

	/** Provides the bitter-loving, defense increasing nature `Careful`. */
	public static final PokemonNature CAREFUL = new PokemonNature().setName("Careful").setStatIncreased(Stat.SPECIAL_DEFENSE)
			.setStatDecreased(Stat.SPECIAL_ATTACK).setTasteFavorite(Taste.BITTER).setTasteDisliked(Taste.DRY);

	// Speed-Increasing, Sweet-Loving Natures:

	/** Provides the sweet-loving, speed increasing nature `Timid`. */
	public static final PokemonNature TIMID = new PokemonNature().setName("Timid").setStatIncreased(Stat.SPEED)
			.setStatDecreased(Stat.ATTACK).setTasteFavorite(Taste.SWEET).setTasteDisliked(Taste.SPICY);

	/** Provides the sweet-loving, speed increasing nature `Hasty`. */
	public static final PokemonNature HASTY = new PokemonNature().setName("Hasty").setStatIncreased(Stat.SPEED)
			.setStatDecreased(Stat.DEFENSE).setTasteFavorite(Taste.SWEET).setTasteDisliked(Taste.SOUR);

	/** Provides the sweet-loving, speed increasing nature `Jolly`. */
	public static final PokemonNature JOLLY = new PokemonNature().setName("Jolly").setStatIncreased(Stat.SPEED)
			.setStatDecreased(Stat.SPECIAL_ATTACK).setTasteFavorite(Taste.SWEET).setTasteDisliked(Taste.DRY);

	/** Provides the sweet-loving, speed increasing nature `Naive`. */
	public static final PokemonNature NAIVE = new PokemonNature().setName("Naive").setStatIncreased(Stat.SPEED)
			.setStatDecreased(Stat.SPECIAL_DEFENSE).setTasteFavorite(Taste.SWEET).setTasteDisliked(Taste.BITTER);

	// Adds the natures listed above to a list for randomization purposes.
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