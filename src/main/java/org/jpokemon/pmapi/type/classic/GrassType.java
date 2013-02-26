package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Grass`.
 */
public class GrassType extends PokemonType {

	public GrassType() {
		super("Grass");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.WATER) || type.equals(ClassicTypes.GROUND) || type.equals(ClassicTypes.ROCK)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIRE) || type.equals(ClassicTypes.GRASS) || type.equals(ClassicTypes.POISON)
				|| type.equals(ClassicTypes.FLYING) || type.equals(ClassicTypes.BUG) || type.equals(ClassicTypes.DRAGON)
				|| type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}