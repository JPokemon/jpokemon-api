package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Ice`.
 */
public class IceType extends PokemonType {

	public IceType() {
		super("Ice");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.GRASS) || type.equals(ClassicTypes.GROUND) || type.equals(ClassicTypes.FLYING)
				|| type.equals(ClassicTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIRE) || type.equals(ClassicTypes.WATER) || type.equals(ClassicTypes.ICE)
				|| type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}