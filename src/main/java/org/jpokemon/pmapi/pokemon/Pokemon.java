package org.jpokemon.pmapi.pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jpokemon.pmapi.move.MoveInstance;

/**
 * Defines a particular instance of a Pokémon.
 * 
 * STUBBED.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class Pokemon {
	/** Indicates the name of this Pokémon. */
	protected String name;

	/** Indicates the species of this Pokémon. */
	protected PokemonSpecies species;

	/** Indicates the moves of this Pokémon */
	protected List<MoveInstance> moves = new ArrayList<MoveInstance>();

	/** Provides the default constructor. */
	public Pokemon() {
	}

	/** Gets the name of this Pokémon. */
	public String getName() {
		return name;
	}

	/** Sets the name of this Pokémon. */
	public Pokemon setName(String name) {
		this.name = name;
		return this;
	}

	/** Adds a move to this Pokémon's move set */
	public Pokemon addMove(MoveInstance move) {
		moves.add(move);
		return this;
	}

	/** Gets the move with the specified index in this Pokémon's move set */
	public MoveInstance getMove(int index) {
		if (index >= moves.size() || index < 0) {
			return null;
		}

		return moves.get(index);
	}

	/** Gets the moves associated with this Pokemon as a list */
	public List<MoveInstance> getMoves() {
		return Collections.unmodifiableList(moves);
	}

	public Pokemon removeMove(MoveInstance move) {
		moves.remove(move);
		return this;
	}
}