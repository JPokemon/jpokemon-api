package org.jpokemon.api.manager;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.jpokemon.api.JPokemonError;
import org.jpokemon.api.natures.PokemonNature;

/**
 * Defines a "simplest-possible" implementation of the {@link Manager} interface
 * for natures. This manager provides the classic natures. See {@link #init}
 * 
 * Note that this class is final. If you want to add or remove natures, it
 * cannot be extended; you must write your own lookup class.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public final class ClassicNatures implements Manager<PokemonNature> {
	private Map<String, PokemonNature> natureMap = new HashMap<String, PokemonNature>();

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

	@Override
	public boolean register(PokemonNature nature) throws JPokemonError {
		if (natureMap.containsKey(nature.getName())) {
			throw new JPokemonError("A type with the name " + nature.getName() + " has already been registered!");
		}
		if (natureMap.containsValue(nature)) {
			throw new JPokemonError("This type is already registered!");
		}

		natureMap.put(nature.getName(), nature);
		return true;
	}

	@Override
	public boolean isRegistered(PokemonNature nature) {
		return natureMap.containsValue(nature);
	}

	@Override
	public PokemonNature getByName(String name) {
		if (!natureMap.containsKey(name)) {
			return null;
		}

		return natureMap.get(name);
	}

	/**
	 * Initializes {@link PokemonNature#manager} to be an instance of
	 * ClassicNatures, with all classic natures populated in the manager.
	 */
	public static void init() {
		if (PokemonNature.manager != null) {
			throw new JPokemonError("PokemonNature.manager already defined");
		}

		PokemonNature.manager = new ClassicNatures();

		for (Field field : ClassicNatures.class.getFields()) {
			try {
				if ((field.getModifiers() & (Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL)) <= 0) {
					continue;
				}

				Object temp = field.get(null);

				if (temp instanceof PokemonNature) {
					PokemonNature nature = (PokemonNature) temp;
					PokemonNature.manager.register(nature);
				}
			} catch (IllegalAccessException exception) {
			}
		}
	}

	/** Provides a private constructor */
	private ClassicNatures() {
	}

	/**
	 * Helper method to get a random nature, with a uniform probability
	 * distribution.
	 * 
	 * @param random The {@link Random} object to select the nature with.
	 */
	public PokemonNature getRandomNature(Random random) {
		return natureMap.get((short) random.nextInt(25));
	}
}
