package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Electric`.
 */
public class ElectricType extends PokemonType {

	public ElectricType() {
		super("Electric");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.WATER) || type.equals(PokemonTypes.FLYING)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.ELECTRIC) || type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GROUND)) {
			return true;
		}
		return false;
	}
}