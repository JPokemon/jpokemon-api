package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Fighting`.
 */
public class FightingType extends PokemonType {

	public FightingType() {
		super("Fighting");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.NORMAL) || type.equals(ClassicTypes.ICE) || type.equals(ClassicTypes.ROCK)
				|| type.equals(ClassicTypes.DARK) || type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.POISON) || type.equals(ClassicTypes.FLYING) || type.equals(ClassicTypes.PSYCHIC)
				|| type.equals(ClassicTypes.BUG)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.GHOST)) {
			return true;
		}
		return false;
	}
}