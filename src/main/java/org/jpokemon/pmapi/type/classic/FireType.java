package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Fire`.
 */
public class FireType extends PokemonType {

	public FireType() {
		super("Fire");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.ICE) || type.equals(PokemonTypes.BUG)
				|| type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.WATER) || type.equals(PokemonTypes.ROCK)
				|| type.equals(PokemonTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}