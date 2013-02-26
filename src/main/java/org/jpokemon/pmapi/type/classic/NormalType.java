package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

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
		if (type.equals(ClassicTypes.ROCK) || type.equals(ClassicTypes.STEEL)) {
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
