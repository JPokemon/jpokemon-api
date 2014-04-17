package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a particular instance of a Pokémon. Pokémon may have extra values
 * applied through the 'metaData.' Meta-data in this class is the same pattern
 * used elsewhere in the framework, to allow type extensibility.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class Pokemon {
	/** Indicates the name of this Pokémon */
	protected String name;

	/** Indicates the species of this Pokémon */
	protected String species;

	/** Indicates the gender of this Pokémon */
	protected String gender;

	/** Indicates the ability of this Pokémon */
	protected String ability;

	/**
	 * Indicates the primary type of this Pokémon, which may differ from it's
	 * species' primary type
	 */
	protected String primaryType;

	/**
	 * Indicates the secondary type of this Pokémon, which may differ from it's
	 * species' secondary type
	 */
	protected String secondaryType;

	/** Indicates the height of this Pokémon */
	protected float height;

	/** Indicates the weight of this Pokémon */
	protected float weight;

	/** Indicates the original trainer of this Pokémon. Probably 'null' for wild */
	protected String originalTrainer;

	/** Indicates the conditions affecting this Pokémon */
	protected List<String> statusConditions;

	/** Indicates the moves of this Pokémon */
	protected List<MoveInstance> moves;

	/** Indicates the stats of this Pokémon */
	protected Map<String, Stat> stats;

	/** Provides a hook for storing meta-data */
	protected List<Object> metaData;

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

	/** Gets the gender of this Pokémon */
	public String getGender() {
		return gender;
	}

	/** Sets the gender of this Pokémon */
	public Pokemon setGender(String gender) {
		this.gender = gender;
		return this;
	}

	/** Gets the ability of this Pokémon */
	public String getAbility() {
		return ability;
	}

	/** Sets the ability of this Pokémon */
	public Pokemon setAbility(String ability) {
		this.ability = ability;
		return this;
	}

	/** Gets the primary type of this Pokémon */
	public String getPrimaryType() {
		return primaryType;
	}

	/** Sets the primary type of this Pokémon */
	public Pokemon setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
		return this;
	}

	/** Gets the secondary type of this Pokémon */
	public String getSecondaryType() {
		return secondaryType;
	}

	/** Sets the secondary type of this Pokémon */
	public Pokemon setSecondaryType(String secondaryType) {
		this.secondaryType = secondaryType;
		return this;
	}

	/** Gets the height of this Pokémon */
	public float getHeight() {
		return height;
	}

	/** Sets the height of this Pokémon */
	public Pokemon setHeight(float height) {
		this.height = height;
		return this;
	}

	/** Gets the weight of this Pokémon */
	public float getWeight() {
		return weight;
	}

	/** Sets the weight of this Pokémon */
	public Pokemon setWeight(float weight) {
		this.weight = weight;
		return this;
	}

	/** Gets the original trainer of this Pokémon */
	public String getOriginalTrainer() {
		return originalTrainer;
	}

	/** Sets the original trainer of this Pokémon */
	public Pokemon setOriginalTrainer(String originalTrainer) {
		this.originalTrainer = originalTrainer;
		return this;
	}

	/** Gets all the status conditions affecting this Pokémon */
	public List<String> getStatusConditions() {
		return statusConditions;
	}

	/** Adds a condition to this Pokémon status */
	public Pokemon addStatusCondition(String condition) {
		if (statusConditions == null) {
			statusConditions = new ArrayList<String>();
		}

		statusConditions.add(condition);
		return this;
	}

	/** Adds all status conditions to those already affecting this Pokémon */
	public Pokemon addAllStatusConditions(List<String> extraConditions) {
		if (statusConditions == null) {
			statusConditions = new ArrayList<String>();
		}

		statusConditions.addAll(extraConditions);
		return this;
	}

	/** Removes a condition from this Pokémon status */
	public Pokemon removeStatusCondition(String condition) {
		if (statusConditions != null) {
			statusConditions.remove(condition);
		}
		return this;
	}

	/** Sets all status conditions affecting this Pokémon */
	public Pokemon setStatusConditions(List<String> conditions) {
		this.statusConditions = conditions;
		return this;
	}

	/** Gets the move with the specified index in this Pokémon's move set */
	public MoveInstance getMove(int index) {
		if (moves == null || index < 0 || index >= moves.size()) {
			return null;
		}

		return moves.get(index);
	}

	/** Gets the moves associated with this Pokemon as a list */
	public List<MoveInstance> getMoves() {
		return moves;
	}

	/** Adds a move to this Pokémon's move set */
	public Pokemon addMove(MoveInstance move) {
		if (moves == null) {
			moves = new ArrayList<MoveInstance>();
		}

		moves.add(move);
		return this;
	}

	/** Removes a move from this Pokémon's move set at the specified index */
	public Pokemon removeMove(int index) {
		if (index >= moves.size() || index < 0) {
			return null;
		}

		moves.remove(index);
		return this;
	}

	/** Removes the specified MoveInstance from this Pokémon's move set */
	public Pokemon removeMove(MoveInstance move) {
		moves.remove(move);
		return this;
	}

	/** Gets a Stat from this Pokémon using the specified name */
	public Stat getStat(String name) {
		if (stats == null) {
			return null;
		}

		return stats.get(name);
	}

	/** Gets the stats associated with this Pokémon as a list */
	public Map<String, Stat> getStats() {
		return stats;
	}

	/** Adds a Stat to this Pokémon with the specified name */
	public Pokemon putStat(String name, Stat stat) {
		if (stats == null) {
			stats = new HashMap<String, Stat>();
		}

		stats.put(name, stat);
		return this;
	}

	/** Removes a Stat with the specified name from this Pokémon */
	public Pokemon removeStat(String name) {
		if (stats != null) {
			stats.remove(name);
		}

		return this;
	}

	/** Gets all meta data of this Pokémon */
	public List<Object> getMetaData() {
		return this.metaData;
	}

	/** Adds a meta data item to this Pokémon */
	public Pokemon addMetaData(Object metaData) {
		if (this.metaData == null) {
			this.metaData = new ArrayList<Object>();
		}

		this.metaData.add(metaData);
		return this;
	}

	/** Removes a meta data item from this Pokémon */
	public Pokemon removeMetaData(Object metaData) {
		if (this.metaData != null) {
			this.metaData.remove(metaData);
		}

		return this;
	}

	/** Sets all meta data of this Pokémon */
	public Pokemon setMetaData(List<Object> metaData) {
		this.metaData = metaData;
		return this;
	}
}