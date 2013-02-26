package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Bug`.
 */
public class BugType extends PokemonType {

	public BugType() {
		super("Bug");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.GRASS) || type.equals(ClassicTypes.PSYCHIC) || type.equals(ClassicTypes.DARK)) {
				return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIRE) || type.equals(ClassicTypes.FIGHTING) || type.equals(ClassicTypes.POISON)
				|| type.equals(ClassicTypes.FLYING) || type.equals(ClassicTypes.GHOST) || type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		return false;
	}
}