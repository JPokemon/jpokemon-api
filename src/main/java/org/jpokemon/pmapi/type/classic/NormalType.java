package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Normal`.
 */
public class NormalType extends PokemonType {

	public NormalType() {
		super("Normal");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.ROCK) || type.equals(PokemonTypes.STEEL)) {
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
