package org.jpokemon.pmapi.pokemon.nature;

import org.jpokemon.pmapi.util.Stat;
import org.jpokemon.pmapi.util.Taste;

/**
 * Defines a nature (personality) for a Pokémon. The 25 classic natures are 
 * instantiated in the {@link ClassicNatures} class.
 *
 * To define your own nature, construct an instance of this class. If you want 
 * to add attributes to the nature, it can also be extended.
 */
public class PokemonNature {
	protected final String name;
	protected final Stat increased, decreased;
	protected final Taste preference;

	public PokemonNature(String name, Stat increased, Stat decreased, Taste preference) {
		this.name = name;
		this.increased = increased;
		this.decreased = decreased;
		this.preference = preference;
	}

	/** Gets the name of this nature. */
	public String getName() {
		return name;
	}

	/** Gets the stat increased by this nature. */
	public Stat getStatIncreased() {
		return increased;
	}

	/** Gets the stat decreased by this nature. */
	public Stat getStatDecreased() {
		return decreased;
	}

	/** Gets the taste preference of this nature. */
	public Taste getTastePreference() {
		return preference;
	}

	/** Gets the stat modifier for a given stat. */
	public float getStatModifier(Stat stat) {
		if (increased.equals(stat)) {
			return 1.1f;
		} else if (decreased.equals(stat)) {
			return 0.9f;
		}
		return 1.0f;
	}
}