package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;

/**
 * Defines the classic Pokémon type `Bug`.
 */
public class BugType extends PokemonType {

	public BugType() {
		super("Bug");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.GRASS) || type.equals(PokemonTypes.PSYCHIC) || type.equals(PokemonTypes.DARK)) {
				return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(PokemonTypes.FIRE) || type.equals(PokemonTypes.FIGHTING) || type.equals(PokemonTypes.POISON)
				|| type.equals(PokemonTypes.FLYING) || type.equals(PokemonTypes.GHOST) || type.equals(PokemonTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}