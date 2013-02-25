package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Fighting`.
 */
public class FightingType extends PokemonType {

	public FightingType() {
		super("Fighting");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.NORMAL) || type.equals(PokemonTypes.ICE) || type.equals(PokemonTypes.ROCK)
				|| type.equals(PokemonTypes.DARK) || type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.POISON) || type.equals(PokemonTypes.FLYING) || type.equals(PokemonTypes.PSYCHIC)
				|| type.equals(PokemonTypes.BUG)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GHOST)) {
			return true;
		}
		return false;
	}
}