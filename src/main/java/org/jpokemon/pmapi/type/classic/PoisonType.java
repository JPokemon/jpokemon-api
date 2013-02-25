package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Poison`.
 */
public class PoisonType extends PokemonType {

	public PoisonType() {
		super("Poison");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GRASS)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.POISON) || type.equals(PokemonTypes.GROUND) || type.equals(PokemonTypes.ROCK)
				|| type.equals(PokemonTypes.GHOST)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}
}