package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Dark`.
 */
public class DarkType extends PokemonType {

	public DarkType() {
		super("Dark");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.PSYCHIC) || type.equals(ClassicTypes.GHOST)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIGHTING) || type.equals(ClassicTypes.DARK) || type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}