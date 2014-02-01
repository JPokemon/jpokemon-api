package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.api.Nature;

/**
 * Defines the 25 classic natures (personalities) for a Pokémon.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicNatureManager implements Manager<Nature> {
	protected Map<String, Nature> natures = new HashMap<String, Nature>();

	public ClassicNatureManager() {
		// Neutral Natures
		register(new Nature().setName("Bashful").setStatIncreased("NONE").setStatDecreased("NONE").setTasteFavorite("NONE")
				.setTasteDisliked("NONE"));
		register(new Nature().setName("Docile").setStatIncreased("NONE").setStatDecreased("NONE").setTasteFavorite("NONE")
				.setTasteDisliked("NONE"));
		register(new Nature().setName("Hardy").setStatIncreased("NONE").setStatDecreased("NONE").setTasteFavorite("NONE")
				.setTasteDisliked("NONE"));
		register(new Nature().setName("Quirky").setStatIncreased("NONE").setStatDecreased("NONE").setTasteFavorite("NONE")
				.setTasteDisliked("NONE"));
		register(new Nature().setName("Serious").setStatIncreased("NONE").setStatDecreased("NONE").setTasteFavorite("NONE")
				.setTasteDisliked("NONE"));

		// Attack-Increasing, Spice-Loving Natures
		register(new Nature().setName("Adamant").setStatIncreased("Attack").setStatDecreased("Special Attack")
				.setTasteFavorite("Spicy").setTasteDisliked("Dry"));
		register(new Nature().setName("Brave").setStatIncreased("Attack").setStatDecreased("Speed")
				.setTasteFavorite("Spicy").setTasteDisliked("Sweet"));
		register(new Nature().setName("Lonely").setStatIncreased("Attack").setStatDecreased("Defense")
				.setTasteFavorite("Spicy").setTasteDisliked("Sour"));
		register(new Nature().setName("Naughty").setStatIncreased("Attack").setStatDecreased("Special Defense")
				.setTasteFavorite("Spicy").setTasteDisliked("Bitter"));

		// Defense-Increasing, Sour-Loving Natures
		register(new Nature().setName("Bold").setStatIncreased("Defense").setStatDecreased("Attack")
				.setTasteFavorite("Sour").setTasteDisliked("Spicy"));
		register(new Nature().setName("Relaxed").setStatIncreased("Defense").setStatDecreased("Speed")
				.setTasteFavorite("Sour").setTasteDisliked("Sweet"));
		register(new Nature().setName("Impish").setStatIncreased("Defense").setStatDecreased("Special Attack")
				.setTasteFavorite("Sour").setTasteDisliked("Dry"));
		register(new Nature().setName("Lax").setStatIncreased("Defense").setStatDecreased("Special Defense")
				.setTasteFavorite("Sour").setTasteDisliked("Bitter"));

		// Special Attack-Increasing, Dry-Loving Natures
		register(new Nature().setName("Modest").setStatIncreased("Special Attack").setStatDecreased("Attack")
				.setTasteFavorite("Dry").setTasteDisliked("Spicy"));
		register(new Nature().setName("Mild").setStatIncreased("Special Attack").setStatDecreased("Defense")
				.setTasteFavorite("Dry").setTasteDisliked("Sour"));
		register(new Nature().setName("Quiet").setStatIncreased("Special Attack").setStatDecreased("Speed")
				.setTasteFavorite("Dry").setTasteDisliked("Sweet"));
		register(new Nature().setName("Rash").setStatIncreased("Special Attack").setStatDecreased("Special Defense")
				.setTasteFavorite("Dry").setTasteDisliked("Bitter"));

		// Special Defense-Increasing, Bitter-Loving Natures
		register(new Nature().setName("Calm").setStatIncreased("Special Defense").setStatDecreased("Attack")
				.setTasteFavorite("Bitter").setTasteDisliked("Spicy"));
		register(new Nature().setName("Gentle").setStatIncreased("Special Defense").setStatDecreased("Defense")
				.setTasteFavorite("Bitter").setTasteDisliked("Sour"));
		register(new Nature().setName("Sassy").setStatIncreased("Special Defense").setStatDecreased("Speed")
				.setTasteFavorite("Bitter").setTasteDisliked("Sweet"));
		register(new Nature().setName("Careful").setStatIncreased("Special Defense").setStatDecreased("Special Attack")
				.setTasteFavorite("Bitter").setTasteDisliked("Dry"));

		// Speed-Increasing, Sweet-Loving Natures
		register(new Nature().setName("Timid").setStatIncreased("Speed").setStatDecreased("Attack")
				.setTasteFavorite("Sweet").setTasteDisliked("Spicy"));
		register(new Nature().setName("Hasty").setStatIncreased("Speed").setStatDecreased("Defense")
				.setTasteFavorite("Sweet").setTasteDisliked("Sour"));
		register(new Nature().setName("Jolly").setStatIncreased("Speed").setStatDecreased("Special Attack")
				.setTasteFavorite("Sweet").setTasteDisliked("Dry"));
		register(new Nature().setName("Naive").setStatIncreased("Speed").setStatDecreased("Special Defense")
				.setTasteFavorite("Sweet").setTasteDisliked("Bitter"));
	}

	@Override
	public void register(Nature nature) throws JPokemonException {
		if (isRegistered(nature)) {
			throw new JPokemonException("Nature already registered: " + nature.toString());
		}

		natures.put(nature.getName(), nature);
	}

	@Override
	public boolean isRegistered(Nature nature) {
		if (nature == null) {
			return false;
		}

		return getByName(nature.getName()) != null;
	}

	@Override
	public Nature getByName(String name) {
		return natures.get(name);
	}

	public static void init() throws JPokemonException {
		if (Nature.manager != null) {
			throw new JPokemonException("Nature.manager is already defined");
		}

		Nature.manager = new ClassicNatureManager();
	}
}