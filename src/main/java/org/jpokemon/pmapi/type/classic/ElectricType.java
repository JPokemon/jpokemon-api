package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Electric`.
 */
public class ElectricType extends PokemonType {

	public ElectricType() {
		super("Electric");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.WATER) || type.equals(ClassicTypes.FLYING)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.ELECTRIC) || type.equals(ClassicTypes.GRASS) || type.equals(ClassicTypes.DRAGON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.GROUND)) {
			return true;
		}
		return false;
	}
}