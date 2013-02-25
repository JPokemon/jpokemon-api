package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Grass`.
 */
public class GrassType extends PokemonType {

	public GrassType() {
		super("Grass");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.WATER) || type.equals(PokemonTypes.GROUND) || type.equals(PokemonTypes.ROCK)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.POISON)
				|| type.equals(PokemonTypes.FLYING) || type.equals(PokemonTypes.BUG) || type.equals(PokemonTypes.DRAGON)
				|| type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}