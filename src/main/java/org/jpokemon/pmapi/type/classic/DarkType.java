package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Dark`.
 */
public class DarkType extends PokemonType {

	public DarkType() {
		super("Dark");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.PSYCHIC) || type.equals(PokemonTypes.GHOST)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIGHTING) || type.equals(PokemonTypes.DARK) || type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}