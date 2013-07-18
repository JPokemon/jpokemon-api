package org.jpokemon.api.classic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jpokemon.api.Nature;
import org.jpokemon.api.managers.SimpleNatureManager;

/**
 * Defines the 25 classic natures (personalities) for a Pokémon.
 * 
 * <p>If you wanted to add a series of new natures, the best way to do so might 
 * be to extend this class and add a few more static fields.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since  0.1
 *
 * @see  Nature
 * @see  SimpleNatureManager
 */
public class ClassicNatures {
	private static final List<Nature> natureList = new ArrayList<Nature>(25);

	// Neutral Natures:

	/** Provides the neutral nature `Bashful`. */
	public static final Nature BASHFUL = new Nature().setName("Bashful").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Docile`. */
	public static final Nature DOCILE = new Nature().setName("Docile").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Hardy`. */
	public static final Nature HARDY = new Nature().setName("Hardy").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Quirky`. */
	public static final Nature QUIRKY = new Nature().setName("Quirky").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	/** Provides the neutral nature `Serious`. */
	public static final Nature SERIOUS = new Nature().setName("Serious").setStatIncreased("NONE")
			.setStatDecreased("NONE").setTasteFavorite("NONE").setTasteDisliked("NONE");

	// Attack-Increasing, Spice-Loving Natures:

	/** Provides the spice-loving, attack increasing nature `Serious`. */
	public static final Nature ADAMANT = new Nature().setName("Adamant").setStatIncreased("Attack")
			.setStatDecreased("Special Attack").setTasteFavorite("Spicy").setTasteDisliked("Dry");

	/** Provides the spice-loving, attack increasing nature `Brave`. */
	public static final Nature BRAVE = new Nature().setName("Brave").setStatIncreased("Attack")
			.setStatDecreased("Speed").setTasteFavorite("Spicy").setTasteDisliked("Sweet");

	/** Provides the spice-loving, attack increasing nature `Loneley`. */
	public static final Nature LONELY = new Nature().setName("Lonely").setStatIncreased("Attack")
			.setStatDecreased("Defense").setTasteFavorite("Spicy").setTasteDisliked("Sour");

	/** Provides the spice-loving, attack increasing nature `Naughty`. */
	public static final Nature NAUGHTY = new Nature().setName("Naughty").setStatIncreased("Attack")
			.setStatDecreased("Special Defense").setTasteFavorite("Spicy").setTasteDisliked("Bitter");

	// Defense-Increasing, Sour-Loving Natures:

	/** Provides the sour-loving, defense increasing nature `Bold`. */
	public static final Nature BOLD = new Nature().setName("Bold").setStatIncreased("Defense")
			.setStatDecreased("Attack").setTasteFavorite("Sour").setTasteDisliked("Spicy");

	/** Provides the sour-loving, defense increasing nature `Relaxed`. */
	public static final Nature RELAXED = new Nature().setName("Relaxed").setStatIncreased("Defense")
			.setStatDecreased("Speed").setTasteFavorite("Sour").setTasteDisliked("Sweet");

	/** Provides the sour-loving, defense increasing nature `Impish`. */
	public static final Nature IMPISH = new Nature().setName("Impish").setStatIncreased("Defense")
			.setStatDecreased("Special Attack").setTasteFavorite("Sour").setTasteDisliked("Dry");

	/** Provides the sour-loving, defense increasing nature `Lax`. */
	public static final Nature LAX = new Nature().setName("Lax").setStatIncreased("Defense")
			.setStatDecreased("Special Defense").setTasteFavorite("Sour").setTasteDisliked("Bitter");

	// Special Attack-Increasing, Dry-Loving Natures:

	/** Provides the dry-loving, attack increasing nature `Modest`. */
	public static final Nature MODEST = new Nature().setName("Modest").setStatIncreased("Special Attack")
			.setStatDecreased("Attack").setTasteFavorite("Dry").setTasteDisliked("Spicy");

	/** Provides the dry-loving, attack increasing nature `Mild`. */
	public static final Nature MILD = new Nature().setName("Mild").setStatIncreased("Special Attack")
			.setStatDecreased("Defense").setTasteFavorite("Dry").setTasteDisliked("Sour");

	/** Provides the dry-loving, attack increasing nature `Quiet`. */
	public static final Nature QUIET = new Nature().setName("Quiet").setStatIncreased("Special Attack")
			.setStatDecreased("Speed").setTasteFavorite("Dry").setTasteDisliked("Sweet");

	/** Provides the dry-loving, attack increasing nature `Rash`. */
	public static final Nature RASH = new Nature().setName("Rash").setStatIncreased("Special Attack")
			.setStatDecreased("Special Defense").setTasteFavorite("Dry").setTasteDisliked("Bitter");

	// Special Defense-Increasing, Bitter-Loving Natures:

	/** Provides the bitter-loving, defense increasing nature `Calm`. */
	public static final Nature CALM = new Nature().setName("Calm").setStatIncreased("Special Defense")
			.setStatDecreased("Attack").setTasteFavorite("Bitter").setTasteDisliked("Spicy");

	/** Provides the bitter-loving, defense increasing nature `Gentle`. */
	public static final Nature GENTLE = new Nature().setName("Gentle").setStatIncreased("Special Defense")
			.setStatDecreased("Defense").setTasteFavorite("Bitter").setTasteDisliked("Sour");

	/** Provides the bitter-loving, defense increasing nature `Sassy`. */
	public static final Nature SASSY = new Nature().setName("Sassy").setStatIncreased("Special Defense")
			.setStatDecreased("Speed").setTasteFavorite("Bitter").setTasteDisliked("Sweet");

	/** Provides the bitter-loving, defense increasing nature `Careful`. */
	public static final Nature CAREFUL = new Nature().setName("Careful")
			.setStatIncreased("Special Defense").setStatDecreased("Special Attack").setTasteFavorite("Bitter")
			.setTasteDisliked("Dry");

	// Speed-Increasing, Sweet-Loving Natures:

	/** Provides the sweet-loving, speed increasing nature `Timid`. */
	public static final Nature TIMID = new Nature().setName("Timid").setStatIncreased("Speed")
			.setStatDecreased("Attack").setTasteFavorite("Sweet").setTasteDisliked("Spicy");

	/** Provides the sweet-loving, speed increasing nature `Hasty`. */
	public static final Nature HASTY = new Nature().setName("Hasty").setStatIncreased("Speed")
			.setStatDecreased("Defense").setTasteFavorite("Sweet").setTasteDisliked("Sour");

	/** Provides the sweet-loving, speed increasing nature `Jolly`. */
	public static final Nature JOLLY = new Nature().setName("Jolly").setStatIncreased("Speed")
			.setStatDecreased("Special Attack").setTasteFavorite("Sweet").setTasteDisliked("Dry");

	/** Provides the sweet-loving, speed increasing nature `Naive`. */
	public static final Nature NAIVE = new Nature().setName("Naive").setStatIncreased("Speed")
			.setStatDecreased("Special Defense").setTasteFavorite("Sweet").setTasteDisliked("Bitter");

	static {
		for (Field field : ClassicNatures.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) <= 0) {
					continue;
				}
				Object temp = field.get(null);
				if (temp instanceof Nature) {
					Nature nature = (Nature) temp;
					natureList.add(nature);
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides a private constructor, so it cannot be instantiated. */
	private ClassicNatures() {
	}

	/**
	 * Helper method to get a random nature, with a uniform probability
	 * distribution.
	 * 
	 * @param random The {@link Random} object to select the nature with.
	 */
	public static Nature getRandomNature(Random random) {
		int pool = natureList.size();
		return natureList.get(random.nextInt(pool));
	}
}