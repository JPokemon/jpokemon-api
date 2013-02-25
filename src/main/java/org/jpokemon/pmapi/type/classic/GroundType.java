package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Ground`.
 */
public class GroundType extends PokemonType {

	public GroundType() {
		super("Ground");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.ELECTRIC) || type.equals(PokemonTypes.POISON)
				|| type.equals(PokemonTypes.ROCK) || type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.BUG) || type.equals(PokemonTypes.GRASS)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FLYING)) {
			return true;
		}
		return false;
	}
}