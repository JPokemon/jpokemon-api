package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Poison`.
 */
public class PoisonType extends PokemonType {

	public PoisonType() {
		super("Poison");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.GRASS)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.POISON) || type.equals(ClassicTypes.GROUND) || type.equals(ClassicTypes.ROCK)
				|| type.equals(ClassicTypes.GHOST)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}
}