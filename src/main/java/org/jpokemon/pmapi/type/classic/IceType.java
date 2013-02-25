package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Ice`.
 */
public class IceType extends PokemonType {

	public IceType() {
		super("Ice");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.GROUND) || type.equals(PokemonTypes.FLYING)
				|| type.equals(PokemonTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.WATER) || type.equals(PokemonTypes.ICE)
				|| type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}