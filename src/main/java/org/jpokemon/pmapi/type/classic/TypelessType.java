package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines a "typeless" Pokémon type (the classic `????` type).
 */
public class TypelessType extends PokemonType {

	public TypelessType() {
		super("????");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}