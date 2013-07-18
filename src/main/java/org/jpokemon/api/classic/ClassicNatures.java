package org.jpokemon.api.classic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jpokemon.api.natures.PokemonNature;

/**
 * Defines the 25 classic natures (personalities) that a Pokémon may possess.
 * 
 * <p>If you wanted to add a series of new natures, the best way to do so might 
 * be to extend this class and add a few more static fields.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since  0.1
 *
 * @see  PokemonNature
 * @see  SimpleNatureManager
 */
public class ClassicNatures {
	private static final List<PokemonNature> natureList;

	// Neutral Natures:

	/** Provides the neutral nature `Bashful`. */
	public static final PokemonNature BASHFUL = new PokemonNature().setName("Bashful").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Docile`. */
	public static final PokemonNature DOCILE = new PokemonNature().setName("Docile").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Hardy`. */
	public static final PokemonNature HARDY = new PokemonNature().setName("Hardy").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Quirky`. */
	public static final PokemonNature QUIRKY = new PokemonNature().setName("Quirky").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Serious`. */
	public static final PokemonNature SERIOUS = new PokemonNature().setName("Serious").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	// Attack-Increasing, Spice-Loving Natures:

	/** Provides the spice-loving, attack increasing nature `Serious`. */
	public static final PokemonNature ADAMANT = new PokemonNature().setName("Adamant").setStatIncreased("Attack")
			.setStatDecreased("Special Attack").setTasteFavorite("Spicy").setTasteDisliked("Dry");

	/** Provides the spice-loving, attack increasing nature `Brave`. */
	public static final PokemonNature BRAVE = new PokemonNature().setName("Brave").setStatIncreased("Attack")
			.setStatDecreased("Speed").setTasteFavorite("Spicy").setTasteDisliked("Sweet");

	/** Provides the spice-loving, attack increasing nature `Loneley`. */
	public static final PokemonNature LONELY = new PokemonNature().setName("Lonely").setStatIncreased("Attack")
			.setStatDecreased("Defense").setTasteFavorite("Spicy").setTasteDisliked("Sour");

	/** Provides the spice-loving, attack increasing nature `Naughty`. */
	public static final PokemonNature NAUGHTY = new PokemonNature().setName("Naughty").setStatIncreased("Attack")
			.setStatDecreased("Special Defense").setTasteFavorite("Spicy").setTasteDisliked("Bitter");

	// Defense-Increasing, Sour-Loving Natures:

	/** Provides the sour-loving, defense increasing nature `Bold`. */
	public static final PokemonNature BOLD = new PokemonNature().setName("Bold").setStatIncreased("Defense")
			.setStatDecreased("Attack").setTasteFavorite("Sour").setTasteDisliked("Spicy");

	/** Provides the sour-loving, defense increasing nature `Relaxed`. */
	public static final PokemonNature RELAXED = new PokemonNature().setName("Relaxed").setStatIncreased("Defense")
			.setStatDecreased("Speed").setTasteFavorite("Sour").setTasteDisliked("Sweet");

	/** Provides the sour-loving, defense increasing nature `Impish`. */
	public static final PokemonNature IMPISH = new PokemonNature().setName("Impish").setStatIncreased("Defense")
			.setStatDecreased("Special Attack").setTasteFavorite("Sour").setTasteDisliked("Dry");

	/** Provides the sour-loving, defense increasing nature `Lax`. */
	public static final PokemonNature LAX = new PokemonNature().setName("Lax").setStatIncreased("Defense")
			.setStatDecreased("Special Defense").setTasteFavorite("Sour").setTasteDisliked("Bitter");

	// Special Attack-Increasing, Dry-Loving Natures:

	/** Provides the dry-loving, attack increasing nature `Modest`. */
	public static final PokemonNature MODEST = new PokemonNature().setName("Modest").setStatIncreased("Special Attack")
			.setStatDecreased("Attack").setTasteFavorite("Dry").setTasteDisliked("Spicy");

	/** Provides the dry-loving, attack increasing nature `Mild`. */
	public static final PokemonNature MILD = new PokemonNature().setName("Mild").setStatIncreased("Special Attack")
			.setStatDecreased("Defense").setTasteFavorite("Dry").setTasteDisliked("Sour");

	/** Provides the dry-loving, attack increasing nature `Quiet`. */
	public static final PokemonNature QUIET = new PokemonNature().setName("Quiet").setStatIncreased("Special Attack")
			.setStatDecreased("Speed").setTasteFavorite("Dry").setTasteDisliked("Sweet");

	/** Provides the dry-loving, attack increasing nature `Rash`. */
	public static final PokemonNature RASH = new PokemonNature().setName("Rash").setStatIncreased("Special Attack")
			.setStatDecreased("Special Defense").setTasteFavorite("Dry").setTasteDisliked("Bitter");

	// Special Defense-Increasing, Bitter-Loving Natures:

	/** Provides the bitter-loving, defense increasing nature `Calm`. */
	public static final PokemonNature CALM = new PokemonNature().setName("Calm").setStatIncreased("Special Defense")
			.setStatDecreased("Attack").setTasteFavorite("Bitter").setTasteDisliked("Spicy");

	/** Provides the bitter-loving, defense increasing nature `Gentle`. */
	public static final PokemonNature GENTLE = new PokemonNature().setName("Gentle").setStatIncreased("Special Defense")
			.setStatDecreased("Defense").setTasteFavorite("Bitter").setTasteDisliked("Sour");

	/** Provides the bitter-loving, defense increasing nature `Sassy`. */
	public static final PokemonNature SASSY = new PokemonNature().setName("Sassy").setStatIncreased("Special Defense")
			.setStatDecreased("Speed").setTasteFavorite("Bitter").setTasteDisliked("Sweet");

	/** Provides the bitter-loving, defense increasing nature `Careful`. */
	public static final PokemonNature CAREFUL = new PokemonNature().setName("Careful")
			.setStatIncreased("Special Defense").setStatDecreased("Special Attack").setTasteFavorite("Bitter")
			.setTasteDisliked("Dry");

	// Speed-Increasing, Sweet-Loving Natures:

	/** Provides the sweet-loving, speed increasing nature `Timid`. */
	public static final PokemonNature TIMID = new PokemonNature().setName("Timid").setStatIncreased("Speed")
			.setStatDecreased("Attack").setTasteFavorite("Sweet").setTasteDisliked("Spicy");

	/** Provides the sweet-loving, speed increasing nature `Hasty`. */
	public static final PokemonNature HASTY = new PokemonNature().setName("Hasty").setStatIncreased("Speed")
			.setStatDecreased("Defense").setTasteFavorite("Sweet").setTasteDisliked("Sour");

	/** Provides the sweet-loving, speed increasing nature `Jolly`. */
	public static final PokemonNature JOLLY = new PokemonNature().setName("Jolly").setStatIncreased("Speed")
			.setStatDecreased("Special Attack").setTasteFavorite("Sweet").setTasteDisliked("Dry");

	/** Provides the sweet-loving, speed increasing nature `Naive`. */
	public static final PokemonNature NAIVE = new PokemonNature().setName("Naive").setStatIncreased("Speed")
			.setStatDecreased("Special Defense").setTasteFavorite("Sweet").setTasteDisliked("Bitter");

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
		int pool = natureList.size();
		return natureList.get(random.nextInt(pool));
	}
}
