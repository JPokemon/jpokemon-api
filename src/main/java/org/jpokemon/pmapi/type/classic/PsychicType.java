package org.jpokemon.pmapi.type.classic;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.type.ClassicTypes;

/**
 * Defines the classic Pokémon type `Psychic`.
 */
public class PsychicType extends PokemonType {

	public PsychicType() {
		super("Psychic");
	}

	@Override
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.FIGHTING) || type.equals(ClassicTypes.POISON)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.PSYCHIC) || type.equals(ClassicTypes.STEEL)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isIneffectiveAgainst(PokemonType type) {
		if (type.equals(ClassicTypes.DARK)) {
			return true;
		}
		return false;
	}
}