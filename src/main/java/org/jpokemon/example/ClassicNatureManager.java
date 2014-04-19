package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Nature;

/**
 * Provides a possible implementation of the {@link Nature#manager}, using the
 * 25 classic natures (personalities) for a Pokémon
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicNatureManager implements Manager<Nature> {
	protected Map<String, Nature> natures = new HashMap<String, Nature>();

	/** Indicates the name of the Bashful nature */
	public static final String BASHFUL_NATURE = "Bashful";

	/** Indicates the name of the Docile nature */
	public static final String DOCILE_NATURE = "Docile";

	/** Indicates the name of the Hardy nature */
	public static final String HARDY_NATURE = "Hardy";

	/** Indicates the name of the Quirky nature */
	public static final String QUIRKY_NATURE = "Quirky";

	/** Indicates the name of the Serious nature */
	public static final String SERIOUS_NATURE = "Serious";

	/** Indicates the name of the Adamant nature */
	public static final String ADAMANT_NATURE = "Adamant";

	/** Indicates the name of the Brave nature */
	public static final String BRAVE_NATURE = "Brave";

	/** Indicates the name of the Lonely nature */
	public static final String LONELY_NATURE = "Lonely";

	/** Indicates the name of the Naughty nature */
	public static final String NAUGHTY_NATURE = "Naughty";

	/** Indicates the name of the Bold nature */
	public static final String BOLD_NATURE = "Bold";

	/** Indicates the name of the Relaxed nature */
	public static final String RELAXED_NATURE = "Relaxed";

	/** Indicates the name of the Impish nature */
	public static final String IMPISH_NATURE = "Impish";

	/** Indicates the name of the Lax nature */
	public static final String LAX_NATURE = "Lax";

	/** Indicates the name of the Modest nature */
	public static final String MODEST_NATURE = "Modest";

	/** Indicates the name of the Mild nature */
	public static final String MILD_NATURE = "Mild";

	/** Indicates the name of the Quiet nature */
	public static final String QUIET_NATURE = "Quiet";

	/** Indicates the name of the Rash nature */
	public static final String RASH_NATURE = "Rash";

	/** Indicates the name of the Calm nature */
	public static final String CALM_NATURE = "Calm";

	/** Indicates the name of the Gentle nature */
	public static final String GENTLE_NATURE = "Gentle";

	/** Indicates the name of the Sassy nature */
	public static final String SASSY_NATURE = "Sassy";

	/** Indicates the name of the Careful nature */
	public static final String CAREFUL_NATURE = "Careful";

	/** Indicates the name of the Timid nature */
	public static final String TIMID_NATURE = "Timid";

	/** Indicates the name of the Hasty nature */
	public static final String HASTY_NATURE = "Hasty";

	/** Indicates the name of the Jolly nature */
	public static final String JOLLY_NATURE = "Jolly";

	/** Indicates the name of the Naive nature */
	public static final String NAIVE_NATURE = "Naive";

	public ClassicNatureManager() {
		// Neutral Natures
		register(new Nature().setName(BASHFUL_NATURE).setStatIncreased("NONE").setStatDecreased("NONE")
				.setFlavorFavorite("NONE").setFlavorDisliked("NONE"));
		register(new Nature().setName(DOCILE_NATURE).setStatIncreased("NONE").setStatDecreased("NONE")
				.setFlavorFavorite("NONE").setFlavorDisliked("NONE"));
		register(new Nature().setName(HARDY_NATURE).setStatIncreased("NONE").setStatDecreased("NONE")
				.setFlavorFavorite("NONE").setFlavorDisliked("NONE"));
		register(new Nature().setName(QUIRKY_NATURE).setStatIncreased("NONE").setStatDecreased("NONE")
				.setFlavorFavorite("NONE").setFlavorDisliked("NONE"));
		register(new Nature().setName(SERIOUS_NATURE).setStatIncreased("NONE").setStatDecreased("NONE")
				.setFlavorFavorite("NONE").setFlavorDisliked("NONE"));

		// Attack-Increasing, Spice-Loving Natures
		register(new Nature().setName(ADAMANT_NATURE).setStatIncreased("Attack").setStatDecreased("Special Attack")
				.setFlavorFavorite("Spicy").setFlavorDisliked("Dry"));
		register(new Nature().setName(BRAVE_NATURE).setStatIncreased("Attack").setStatDecreased("Speed")
				.setFlavorFavorite("Spicy").setFlavorDisliked("Sweet"));
		register(new Nature().setName(LONELY_NATURE).setStatIncreased("Attack").setStatDecreased("Defense")
				.setFlavorFavorite("Spicy").setFlavorDisliked("Sour"));
		register(new Nature().setName(NAUGHTY_NATURE).setStatIncreased("Attack").setStatDecreased("Special Defense")
				.setFlavorFavorite("Spicy").setFlavorDisliked("Bitter"));

		// Defense-Increasing, Sour-Loving Natures
		register(new Nature().setName(BOLD_NATURE).setStatIncreased("Defense").setStatDecreased("Attack")
				.setFlavorFavorite("Sour").setFlavorDisliked("Spicy"));
		register(new Nature().setName(RELAXED_NATURE).setStatIncreased("Defense").setStatDecreased("Speed")
				.setFlavorFavorite("Sour").setFlavorDisliked("Sweet"));
		register(new Nature().setName(IMPISH_NATURE).setStatIncreased("Defense").setStatDecreased("Special Attack")
				.setFlavorFavorite("Sour").setFlavorDisliked("Dry"));
		register(new Nature().setName(LAX_NATURE).setStatIncreased("Defense").setStatDecreased("Special Defense")
				.setFlavorFavorite("Sour").setFlavorDisliked("Bitter"));

		// Special Attack-Increasing, Dry-Loving Natures
		register(new Nature().setName(MODEST_NATURE).setStatIncreased("Special Attack").setStatDecreased("Attack")
				.setFlavorFavorite("Dry").setFlavorDisliked("Spicy"));
		register(new Nature().setName(MILD_NATURE).setStatIncreased("Special Attack").setStatDecreased("Defense")
				.setFlavorFavorite("Dry").setFlavorDisliked("Sour"));
		register(new Nature().setName(QUIET_NATURE).setStatIncreased("Special Attack").setStatDecreased("Speed")
				.setFlavorFavorite("Dry").setFlavorDisliked("Sweet"));
		register(new Nature().setName(RASH_NATURE).setStatIncreased("Special Attack").setStatDecreased("Special Defense")
				.setFlavorFavorite("Dry").setFlavorDisliked("Bitter"));

		// Special Defense-Increasing, Bitter-Loving Natures
		register(new Nature().setName(CALM_NATURE).setStatIncreased("Special Defense").setStatDecreased("Attack")
				.setFlavorFavorite("Bitter").setFlavorDisliked("Spicy"));
		register(new Nature().setName(GENTLE_NATURE).setStatIncreased("Special Defense").setStatDecreased("Defense")
				.setFlavorFavorite("Bitter").setFlavorDisliked("Sour"));
		register(new Nature().setName(SASSY_NATURE).setStatIncreased("Special Defense").setStatDecreased("Speed")
				.setFlavorFavorite("Bitter").setFlavorDisliked("Sweet"));
		register(new Nature().setName(CAREFUL_NATURE).setStatIncreased("Special Defense")
				.setStatDecreased("Special Attack").setFlavorFavorite("Bitter").setFlavorDisliked("Dry"));

		// Speed-Increasing, Sweet-Loving Natures
		register(new Nature().setName(TIMID_NATURE).setStatIncreased("Speed").setStatDecreased("Attack")
				.setFlavorFavorite("Sweet").setFlavorDisliked("Spicy"));
		register(new Nature().setName(HASTY_NATURE).setStatIncreased("Speed").setStatDecreased("Defense")
				.setFlavorFavorite("Sweet").setFlavorDisliked("Sour"));
		register(new Nature().setName(JOLLY_NATURE).setStatIncreased("Speed").setStatDecreased("Special Attack")
				.setFlavorFavorite("Sweet").setFlavorDisliked("Dry"));
		register(new Nature().setName(NAIVE_NATURE).setStatIncreased("Speed").setStatDecreased("Special Defense")
				.setFlavorFavorite("Sweet").setFlavorDisliked("Bitter"));
	}

	@Override
	public void register(Nature nature) throws JPokemonException {
		if (nature == null) {
			throw new JPokemonException("Cannot register null nature");
		}
		else if (nature.getName() == null) {
			throw new JPokemonException("Cannot register nature without a name: " + nature);
		}
		else if (natures.containsKey(nature.getName()) && !nature.equals(natures.get(nature.getName()))) {
			throw new JPokemonException("A nature with the same name is already registered: " + nature);
		}

		natures.put(nature.getName(), nature);
	}

	@Override
	public boolean isRegistered(String natureName) {
		if (natureName == null) {
			return false;
		}

		return getByName(natureName) != null;
	}

	@Override
	public Nature getByName(String name) {
		return natures.get(name);
	}

	/**
	 * Initializes a new ClassicNatureManager as the {@link Nature#manager}
	 * 
	 * @throws JPokemonException If the Nature.manager is already defined
	 */
	public static void init() throws JPokemonException {
		if (Nature.manager != null) {
			throw new JPokemonException("Nature.manager is already defined");
		}

		Nature.manager = new ClassicNatureManager();
	}
}
