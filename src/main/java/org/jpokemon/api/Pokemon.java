package org.jpokemon.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.moves.MoveInstance;

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
	protected String species;

	/** Indicates the ability of this Pokémon. */
	protected String ability;

	/** Indicates the moves of this Pokémon */
	protected List<MoveInstance> moves = new ArrayList<MoveInstance>();

	/** Indicates the stats of this Pokémon */
	protected Map<String, Stat> stats = new HashMap<String, Stat>();

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

	/** Gets the species of this Pokémon */
	public String getSpecies() {
		return species;
	}

	/** Sets the species of this Pokémon */
	public Pokemon setSpecies(String species) {
		this.species = species;
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

	/** Adds a move to this Pokémon's move set */
	public Pokemon addMove(MoveInstance move) {
		moves.add(move);
		return this;
	}

	/** Removes a move from this Pokémon's move set at the specified index */
	public MoveInstance removeMove(int index) {
		if (index >= moves.size() || index < 0) {
			return null;
		}

		return moves.remove(index);
	}

	/** Removes the specified MoveInstance from this Pokémon's move set */
	public Pokemon removeMove(MoveInstance move) {
		moves.remove(move);
		return this;
	}

	/** Gets a Stat from this Pokémon using the specified name */
	public Stat getStat(String name) {
		return stats.get(name);
	}

	/** Gets the stats associated with this Pokémon as a list */
	public List<Stat> getStats() {
		List<Stat> statList = new ArrayList<Stat>();

		for (Stat s : stats.values()) {
			statList.add(s);
		}

		return Collections.unmodifiableList(statList);
	}

	/** Adds a Stat to this Pokémon with the specified name */
	public Pokemon putStat(String name, Stat stat) {
		stats.put(name, stat);
		return this;
	}

	/** Removes a Stat with the specified name from this Pokémon. */
	public Stat removeStat(String name) {
		return stats.remove(name);
	}
}
