package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Water`.
 */
public class WaterType extends PokemonType {

	public WaterType() {
		super("Water");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIRE) || type.equals(ClassicTypes.GROUND) || type.equals(ClassicTypes.ROCK)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.WATER) || type.equals(ClassicTypes.GRASS) || type.equals(ClassicTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}