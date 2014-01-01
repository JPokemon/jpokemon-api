package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jpokemon.api.evolutions.Evolution;

/**
 * Defines a Pokémon species. Note that this refers to an object like
 * 'Bulbasaur' and not the tag 'Seed Pokémon'.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public class Species {
	/** Indicates the manager being used to register species. May be null. */
	public static Manager<Species> manager;

	/** Indicates this species' number in the National Pokédex. */
	protected int pokedexNumber;

	/** Indicates this species' number in the Regional Pokédex */
	protected int regionalPokedexNumber;

	/** Indicates the name of this species. */
	protected String name;

	/** Indicates the primary type of this species. */
	protected String primaryType;

	/** Indicates the secondary type of this species (if it has one). */
	protected String secondaryType;

	/** Indicates the Genus (the "species" in the classic games) of this species. */
	protected String genus;

	/** Indicates the primary Ability of this species. */
	protected String primaryAbility;

	/** Indicates the secondary Ability of this species (if it has one). */
	protected String secondaryAbility;

	/** Indicates the dream world Ability of this species */
	protected String dreamAbility;

	/** Indicates this species' experience gain behavior. */
	protected String experienceCurve;

	/** Indicates the average height of the species */
	protected float averageHeight;

	/** Indicates the average weight of the species */
	protected float averageWeight;

	/** Indicates the color of the species */
	protected String color;

	/** Indicates the description of the species */
	protected String description;

	/**
	 * Indicates the base stats (hp, atk, def, satk, sdef, spd, exp) for this
	 * species.
	 */
	protected Map<String, Integer> baseStats;

	/**
	 * Indicates the EVs gained (xp, hp, atk, def, satk, sdef, spd) from defeating
	 * this species.
	 */
	protected Map<String, Integer> effortValues;

	/** Indicates the number of steps required to hatch an egg of this species. */
	protected int eggSteps;

	/** Indicates what percentage of this species are male. */
	protected float maleRatio = 0.5f;

	/** Indicates whether this species is genderless. */
	protected boolean genderless;

	/** Indicates the difficulty in catching this species. */
	protected int catchRate;

	/** Indicates the basic level of happiness of this species. */
	protected int tameness;

	/** Indicates the first egg group of this species. */
	protected String primaryEggGroup;

	/** Indicates the second egg group of this species. */
	protected String secondaryEggGroup;

	/** Indicates whether this species is breedable in any way. */
	protected boolean breedable;

	/** Indicates the evolutions for this species (if it has any). */
	protected List<Evolution> evolutions;

	/** Indicates the egg moves for this species. */
	protected List<String> eggMoves;

	/** Indicates the moves that can be learned from machines by this species. */
	protected List<String> machineMoves;

	/** Indicates the moves learned at a given level by this species. */
	protected HashMap<Integer, List<String>> moveLists;

	/** Provides the default constructor. */
	public Species() {
	}

	/** Get the Pokédex number for this species. */
	public int getPokedexNumber() {
		return pokedexNumber;
	}

	/** Set the Pokédex number for this species. */
	public void setPokedexNumber(int dexNo) {
		this.pokedexNumber = dexNo;
	}

	/** Get the Regional Pokédex number for this species. */
	public int getRegionalPokedexNumber() {
		return regionalPokedexNumber;
	}

	/** Set the Regional Pokédex number for this species. */
	public Species setRegionalPokedexNumber(int dexNo) {
		this.regionalPokedexNumber = dexNo;
		return this;
	}

	/** Gets the name of this species. */
	public String getName() {
		return name;
	}

	/** Sets the name of this species. */
	public Species setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the primary type for this species. */
	public String getPrimaryType() {
		return primaryType;
	}

	/** Sets the primary type for this species. */
	public Species setPrimaryType(String type) {
		this.primaryType = type;
		return this;
	}

	/** Checks whether this species has a secondary type. */
	public boolean hasSecondaryType() {
		return (secondaryType != null);
	}

	/** Gets the secondary type for this species (assuming it has one). */
	public String getSecondaryType() {
		return secondaryType;
	}

	/** Sets the secondary type for this species. */
	public Species setSecondaryType(String type) {
		this.secondaryType = type;
		return this;
	}

	/** Gets the genus of this species. */
	public String getGenus() {
		return genus;
	}

	/** Sets the genus of this species. */
	public Species setGenus(String genus) {
		this.genus = genus;
		return this;
	}

	/** Gets the primary ability of this species. */
	public String getPrimaryAbility() {
		return primaryAbility;
	}

	/** Sets the primary ability of this species. */
	public Species setPrimaryAbility(String ability) {
		this.primaryAbility = ability;
		return this;
	}

	/** Checks if this species has a secondary ability. */
	public boolean hasSecondaryAbility() {
		return (secondaryAbility != null);
	}

	/** Gets this species' secondary ability. */
	public String getSecondaryAbility() {
		return secondaryAbility;
	}

	/** Sets this species' secondary ability. */
	public Species setSecondaryAbility(String ability) {
		this.secondaryAbility = ability;
		return this;
	}

	/** Checks if this species has a dreamworld (hidden) ability. */
	public boolean hasDreamAbility() {
		return (dreamAbility != null);
	}

	/** Gets this species' dreamworld (hidden) ability. */
	public String getDreamAbility() {
		return dreamAbility;
	}

	/** Sets this species' dreamworld (hidden) ability. */
	public Species setDreamAbility(String ability) {
		this.dreamAbility = ability;
		return this;
	}

	/** Gets the type of experience curve for this species. */
	public String getExperienceCurve() {
		return experienceCurve;
	}

	/** Sets the type of experience curve for this species. */
	public Species setExperienceCurve(String expCurve) {
		this.experienceCurve = expCurve;
		return this;
	}

	/** Gets this species' average height. */
	public float getAverageHeight() {
		return averageHeight;
	}

	/** Sets this species' average height. */
	public Species setAverageHeight(float height) {
		this.averageHeight = height;
		return this;
	}

	/** Gets this species' average weight. */
	public float getAverageWeight() {
		return averageWeight;
	}

	/** Sets this species' average weight. */
	public Species setAverageWeight(float weight) {
		this.averageWeight = weight;
		return this;
	}

	/** Gets this species' colour classification. */
	public String getColor() {
		return color;
	}

	/** Sets this species' colour classification. */
	public Species setColor(String color) {
		this.color = color;
		return this;
	}

	/** Gets the Pokédex entry for this species. */
	public String getDescription() {
		return description;
	}

	/** Sets the Pokédex entry for this species. */
	public Species setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Get the number of steps required to hatch an egg for this species. */
	public int getEggSteps() {
		return eggSteps;
	}

	/** Sets the number of steps required to hatch an egg for this species. */
	public Species setEggSteps(int steps) {
		this.eggSteps = steps;
		return this;
	}

	/**
	 * Gets a base stat with the given name for this species. Note that an invalid
	 * key will retrieve a value of -1.
	 * 
	 * @param name The name of the base stat, e.g. "Attack".
	 * @return The integer value of the base stat, e.g. 47.
	 */
	public int getBaseStat(String name) {
		if (baseStats == null) {
			return -1;
		}
		else if (!baseStats.containsKey(name)) {
			return -1;
		}
		return baseStats.get(name);
	}

	/**
	 * Sets a base stat with the given name for this species. Instantiates the
	 * base stat map if necessary.
	 * 
	 * @param name The name of the base stat, e.g. "Attack".
	 * @param value The integer value of the base stat, e.g. 47.
	 */
	public Species setBaseStat(String name, int value) {
		if (baseStats == null) {
			baseStats = new HashMap<String, Integer>();
		}
		baseStats.put(name, value);
		return this;
	}

	/**
	 * Gets the base stats for this species as a map of name keys to integer
	 * values.
	 */
	public Map<String, Integer> getBaseStats() {
		return baseStats;
	}

	/**
	 * Sets the base stats for this species.
	 * 
	 * @param baseStats A map of name keys to integer values.
	 */
	public Species setBaseStats(Map<String, Integer> baseStats) {
		this.baseStats = baseStats;
		return this;
	}

	/**
	 * Gets the effort value with a given name awarded for defeating this species.
	 * Note that an invalid key will retrieve a value of -1.
	 * 
	 * @param name The name of the effort value, typicaly a base stat.
	 * @return The integer value of the EV, e.g. 3.
	 */
	public int getEffortValue(String name) {
		if (effortValues == null) {
			return -1;
		}
		else if (!effortValues.containsKey(name)) {
			return -1;
		}
		return effortValues.get(name);
	}

	/**
	 * Sets the effort value with a given name awarded for defeating this species.
	 * Instantiates the effort value map if necessary.
	 * 
	 * @param name The name of the effort value, typicaly a base stat.
	 * @param value The integer value of the EV, e.g. 3.
	 */
	public Species setEffortValue(String name, int value) {
		if (effortValues == null) {
			effortValues = new HashMap<String, Integer>();
		}
		effortValues.put(name, value);
		return this;
	}

	/**
	 * Gets the effort values awarded for defeating this species as a map of name
	 * keys to integer values.
	 */
	public Map<String, Integer> getEffortValues() {
		return effortValues;
	}

	/**
	 * Sets the effort values awarded for defeating this species.
	 * 
	 * @param effortValues A map of name keys to integer values.
	 */
	public Species setEffortValues(Map<String, Integer> effortValues) {
		this.effortValues = effortValues;
		return this;
	}

	/** Checks whether this species is genderless. */
	public boolean isGenderless() {
		return genderless;
	}

	/** Sets whether this species should be genderless. */
	public Species setGenderless(boolean genderless) {
		this.genderless = genderless;
		return this;
	}

	/** Gets the proportion of this species that are male. */
	public float getMaleRatio() {
		return maleRatio;
	}

	/** Sets the proportion of this species that should be male. */
	public Species setMaleRatio(float percentMale) {
		this.maleRatio = percentMale;
		return this;
	}

	/** Gets the catch rate for this species. */
	public int getCatchRate() {
		return catchRate;
	}

	/** Sets the catch rate for this species. */
	public Species setCatchRate(int catchRate) {
		this.catchRate = catchRate;
		return this;
	}

	/** Gets the base level of happiness for this species. */
	public int getTameness() {
		return tameness;
	}

	/** Sets the base level of happiness for this species. */
	public Species setTameness(int tameness) {
		this.tameness = tameness;
		return this;
	}

	/** Gets the egg group for this species. */
	public String getPrimaryEggGroup() {
		return primaryEggGroup;
	}

	/** Sets the egg group for this species. */
	public Species setPrimaryEggGroup(String eggGroup) {
		this.primaryEggGroup = eggGroup;
		return this;
	}

	/** Checks if this species has a second egg group */
	public boolean hasSecondaryEggGroup() {
		return (secondaryEggGroup != null);
	}

	/** Gets the second egg group for this species (if it has one). */
	public String getSecondaryEggGroup() {
		return secondaryEggGroup;
	}

	/** Sets the second egg group for this species. */
	public Species setSecondaryEggGroup(String secondEggGroup) {
		this.secondaryEggGroup = secondEggGroup;
		return this;
	}

	/** Checks whether this species can be bred at all. */
	public boolean isBreedable() {
		return breedable;
	}

	/** Sets whether this species can be bred at all. */
	public Species setBreedable(boolean breedable) {
		this.breedable = breedable;
		return this;
	}

	/**
	 * Checks whether this species evolves into another at some point.
	 */
	public boolean hasEvolution() {
		return (evolutions != null && !evolutions.isEmpty());
	}

	/** Gets all the mapped evolutions of this species */
	public List<Evolution> getEvolutions() {
		return evolutions;
	}

	/** Maps an evolution from this species to another */
	public Species addEvolution(Evolution evolution) {
		if (evolutions == null) {
			evolutions = new ArrayList<Evolution>();
		}
		evolutions.add(evolution);
		return this;
	}

	/** Removes an evolution mapping from this species */
	public Species removeEvolution(Evolution evolution) {
		if (evolutions != null) {
			evolutions.remove(evolution);
		}
		return this;
	}

	/** Sets all evolutionary mappings of this species */
	public Species setEvolutions(List<Evolution> evolutions) {
		this.evolutions = evolutions;
		return this;
	}

	/** Gets the list of moves that can be learned by breeding. */
	public List<String> getEggMoves() {
		return eggMoves;
	}

	/** Adds a move that may be known automatically by this species */
	public Species addEggMove(String eggMove) {
		if (eggMoves == null) {
			eggMoves = new ArrayList<String>();
		}
		eggMoves.add(eggMove);
		return this;
	}

	/** Removes a move that may be known at birth by Pokémon of this species */
	public Species removeEggMove(String eggMove) {
		if (eggMoves != null) {
			eggMoves.remove(eggMove);
		}
		return this;
	}

	/** Sets the list of moves that can be learned by breeding. */
	public Species setEggMoves(List<String> eggMoves) {
		this.eggMoves = eggMoves;
		return this;
	}

	/** Gets the list of moves that can be learned by TMs and HMs. */
	public List<String> getMachineMoves() {
		return machineMoves;
	}

	/** Specifies that a move can be learned by TM or HM by this species */
	public Species addMachineMove(String move) {
		if (machineMoves == null) {
			machineMoves = new ArrayList<String>();
		}
		machineMoves.add(move);
		return this;
	}

	/** Removes a move from being learned by TM or HM */
	public Species removeMachineMove(String move) {
		if (machineMoves != null) {
			machineMoves.remove(move);
		}
		return this;
	}

	/** Sets the list of moves that can be learned by TMs and HMs */
	public Species setMachineMoves(List<String> machineMoves) {
		this.machineMoves = machineMoves;
		return this;
	}

	/**
	 * Gets the list of move names that this species learns at the specified level
	 * 
	 * @param level The level to check for available moves
	 * @return The list of move names, or null if no moves are available
	 */
	public List<String> getMoveList(int level) {
		if (this.moveLists == null) {
			return null;
		}
		if (!this.moveLists.containsKey(level)) {
			return null;
		}
		return this.moveLists.get(level);
	}

	/**
	 * Adds a move to the list of moves this species learns at the specified level
	 * 
	 * @param level The level at which the move is learned
	 * @param move The move to learn
	 * @return This species
	 */
	public Species addToMoveList(int level, String move) {
		if (this.moveLists == null) {
			this.moveLists = new HashMap<Integer, List<String>>();
		}
		if (!this.moveLists.containsKey(level)) {
			this.moveLists.put(level, new ArrayList<String>());
		}
		this.moveLists.get(level).add(move);
		return this;
	}

	/**
	 * Removes a move from the list of moves this species learns at the specified
	 * level
	 * 
	 * @param level The level at which the move is learned
	 * @param move The move to remove from the learn list
	 * @return This species
	 */
	public Species removeFromMoveList(int level, String move) {
		if (this.moveLists != null && this.moveLists.containsKey(level)) {
			this.moveLists.get(level).remove(move);
		}
		return this;
	}

	/**
	 * Sets the list of moves that this species learns at the specified level
	 * 
	 * @param level The level at which the list of moves is available
	 * @param moves The list of moves which is available
	 * @return This species
	 */
	public Species setMoveList(int level, List<String> moves) {
		if (this.moveLists == null) {
			this.moveLists = new HashMap<Integer, List<String>>();
		}
		this.moveLists.put(level, moves);
		return this;
	}

	/** Sets the move list learned by levelling up. */
	public HashMap<Integer, List<String>> getMoveLists() {
		return moveLists;
	}

	/** Sets the move list learned by levelling up. */
	public Species setMoveLists(HashMap<Integer, List<String>> moveList) {
		this.moveLists = moveList;
		return this;
	}
}
