package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Water`.
 */
public class WaterType extends PokemonType {

	public WaterType() {
		super("Water");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.GROUND) || type.equals(PokemonTypes.ROCK)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.WATER) || type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}