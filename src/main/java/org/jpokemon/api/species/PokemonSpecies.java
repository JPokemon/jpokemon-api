package org.jpokemon.api.species;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.evolution.PokemonEvolution;
import org.jpokemon.api.types.PokemonType;
import org.jpokemon.api.classic.ExperienceCurve;

/**
 * Defines a Pokemon species. Note that this refers to an object like 
 * `Bublasaur` and not the tag `Seed Pokemon`.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class PokemonSpecies {
	/** Indicates this species' number in the National Pokédex. */
	protected int pokedexNo;
	
	/** Indicates this species' number in the Regional Pokédex */
	protected int regionalNo;

	/** Indicates the name of this species. */
	protected String name;

	/** Indicates the primary type of this species. */
	protected PokemonType primaryType;

	/** Indicates the secondary type of this species (if it has one). */
	protected PokemonType secondaryType = null;

	/** Indicates the Genus (the "species" in the classic games) of this species. */
	protected String genus;

	/** Indicates the primary Ability of this species. */
	protected String primaryAbility;

	/** Indicates the secondary Ability of this species (if it has one). */
	protected String secondaryAbility = null;
	
	/** Indicates the dream world Ability of this species (If none, is set to primary ability) */
	protected String dreamAbility = primaryAbility;
	
	/** Indicates this species' experience gain behaviour. */
	protected ExperienceCurve expCurve;

	/** Indicates the average height of the species (as it appears in a Pokédex entry). */
	protected float height;

	/** Indicates the average weight of the species (as it appears in a Pokédex entry). */
	protected float weight;

	/** Indicates the colour of the species (as it appears in a Pokédex entry). */
	protected String colour;

	/** Indicates the description of the species (as it appears in a Pokédex entry). */
	protected String dexEntry;

	/** Indicates the base stats (hp, atk, def, satk, sdef, spd, exp) for this species. */
	protected Map<String, Integer> baseStats;

	/** Indicates the EVs gained (hp, atk, def, satk, sdef, spd) from defeating this species. */
	protected Map<String, Integer> effortValues;

	/** Indicates the number of steps required to hatch an egg of this species. */
	protected int steps;

	/** Indicates what percentage of this species are male. */
	protected float percentMale = 0.5f;

	/** Indicates whether this species is genderless. */
	protected boolean genderless;

	/** Indicates the difficulty in catching this species. */
	protected int catchRate;

	/** Indicates the basic level of happiness of this species. */
	protected int tameness;

	/** Indicates the first egg group of this species. */
	protected int eggGroup;

	/** Indicates the second egg group of this species (if it has one). */
	protected int secondEggGroup = -1;

	/** Indicates whether this species is breedable in any way. */
	protected boolean breedable;

	/** Indicates the evolutions for this species (if it has any). */
	protected ArrayList<PokemonEvolution> evolutions;

	/** Indicates the egg moves for this species. */
	protected String[] eggMoveList;
	
	/** Indicates the moves that can be learned from machines by this species. */
	protected String[] machineMoveList;

	/** Indicates the moves learned at a given level by this species. */
	protected HashMap<Integer, String> moveList;

	/** Provides the default constructor. */
	public PokemonSpecies() {
	}

	/** Get the Pokédex number for this species. */
	public int getPokedexNumber() {
		return pokedexNo;
	}

	/** Set the Pokédex number for this species. */
	public void setPokedexNumber(int dexNo) {
		this.pokedexNo = dexNo;
	}
	
	/** Get the Regional Pokédex number for this species. */
	public int getRegionalPokedexNumber() {
		return regionalNo;
	}

	/** Set the Regional Pokédex number for this species. */
	public void setRegionalPokedexNumber(int dexNo) {
		this.regionalNo = dexNo;
	}

	/** Gets the name of this species. */
	public String getName() {
		return name;
	}

	/** Sets the name of this species. */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the primary type for this species. */
	public PokemonType getPrimaryType() {
		return primaryType;
	}

	/** Sets the primary type for this species. */
	public void setPrimaryType(PokemonType type) {
		this.primaryType = type;
	}

	/** Checks whether this species has a secondary type. */
	public boolean hasSecondaryType() {
		return (secondaryType != null);
	}

	/** Gets the secondary type for this species (assuming it has one). */
	public PokemonType getSecondaryType() {
		return secondaryType;
	}

	/** Sets the secondary type for this species. */
	public void setSecondaryType(PokemonType type) {
		this.secondaryType = type;
	}

	/** Gets the genus of this species. */
	public String getGenus() {
		return genus;
	}

	/** Sets the genus of this species. */
	public void setGenus(String genus) {
		this.genus = genus;
	}

	/** Gets the primary ability of this species. */
	public String getPrimaryAbility() {
		return primaryAbility;
	}

	/** Sets the primary ability of this species. */
	public void setPrimaryAbility(String ability) {
		this.primaryAbility = ability;
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
	public void setSecondaryAbility(String ability) {
		this.secondaryAbility = ability;
	}
	
	/** Checks if this species has a dreamworld (hidden) ability. */
	public boolean hasDreamAbility() {
		return (!dreamAbility.equalsIgnoreCase(primaryAbility));
	}

	/** Gets this species' dreamworld (hidden) ability. */
	public String getDreamAbility() {
		return dreamAbility;
	}

	/** Sets this species' dreamworld (hidden) ability. */
	public void setDreamAbility(String ability) {
		this.dreamAbility = ability;
	}

	/** Gets the type of experience curve for this species. */
	public ExperienceCurve getExperienceCurveType() {
		return expCurve;
	}

	/** Sets the type of experience curve for this species. */
	public void setExperienceCurve(ExperienceCurve expCurve) {
		this.expCurve = expCurve;
	}

	/** Gets this species' average height. */
	public float getHeight() {
		return height;
	}

	/** Sets this species' average height. */
	public void setHeight(float height) {
		this.height = height;
	}

	/** Gets this species' average weight. */
	public float getWeight() {
		return weight;
	}

	/** Sets this species' average weight. */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/** Gets this species' colour classification. */
	public String getColour() {
		return colour;
	}

	/** Sets this species' colour classification. */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/** Gets the Pokédex entry for this species. */
	public String getPokedexEntry() {
		return dexEntry;
	}

	/** Sets the Pokédex entry for this species. */
	public void setPokedexEntry(String dexEntry) {
		this.dexEntry = dexEntry;
	}

	/** Get the number of steps required to hatch an egg for this species. */
	public int getSteps() {
		return steps;
	}

	/** Sets the number of steps required to hatch an egg for this species. */
	public void setSteps(int steps) {
		this.steps = steps;
	}

	/** 
	 * Gets a base stat with the given name for this species. Note that an 
	 * invalid key will retrieve a value of 0.
	 * 
	 * @param  name The name of the base stat, e.g. "Attack".
	 * @return      The integer value of the base stat, e.g. 47.
	 */
	public int getBaseStat(String name) {
		if (baseStats == null) {
			return 0;
		} else if (!baseStats.containsKey(name)) {
			return 0;
		}
		return baseStats.get(name);
	}

	/** 
	 * Sets a base stat with the given name for this species. Instantiates the 
	 * base stat map if necessary.
	 * 
	 * @param name  The name of the base stat, e.g. "Attack".
	 * @param value The integer value of the base stat, e.g. 47.
	 */
	public void setBaseStat(String name, int value) {
		if (baseStats == null) {
			baseStats = new HashMap<String, Integer>();
		}
		baseStats.put(name, value);
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
	 * @param  baseStats A map of name keys to integer values.
	 */
	public void setBaseStats(Map<String, Integer> baseStats) {
		this.baseStats = baseStats;
	}

	/** 
	 * Gets the effort value with a given name awarded for defeating this 
	 * species. Note that an invalid key will retrieve a value of 0.
	 * 
	 * @param  name The name of the effort value, typicaly a base stat.
	 * @return      The integer value of the EV, e.g. 3.
	 */
	public int getEffortValue(String name) {
		if (effortValues == null) {
			return 0;
		} else if (!effortValues.containsKey(name)) {
			return 0;
		}
		return effortValues.get(name);
	}

	/** 
	 * Sets the effort value with a given name awarded for defeating this 
	 * species. Instantiates the effort value map if necessary.
	 * 
	 * @param name  The name of the effort value, typicaly a base stat.
	 * @param value The integer value of the EV, e.g. 3.
	 */
	public void setEffortValue(String name, int value) {
		if (effortValues == null) {
			effortValues = new HashMap<String, Integer>();
		}
		effortValues.put(name, value);
	}

	/**
	 * Gets the effort values awarded for defeating this species as a map of 
	 * name keys to integer values.
	 */
	public Map<String, Integer> getEffortValues() {
		return effortValues;
	}

	/**
	 * Sets the effort values awarded for defeating this species.
	 * 
	 * @param  effortValues A map of name keys to integer values.
	 */
	public void setEffortValues(Map<String, Integer> effortValues) {
		this.effortValues = effortValues;
	}

	/** Checks whether this species is genderless. */
	public boolean isGenderless() {
		return genderless;
	}

	/** Sets whether this species should be genderless. */
	public void setGenderless(boolean genderless) {
		this.genderless = genderless;
	}

	/** Gets the proportion of this species that are male. */
	public float getMaleRatio() {
		return percentMale;
	}

	/** Sets the proportion of this species that should be male. */
	public void setMaleRatio(float percentMale) {
		this.percentMale = percentMale;
	}

	/** Gets the catch rate for this species. */
	public int getCatchRate() {
		return catchRate;
	}

	/** Sets the catch rate for this species. */
	public void setCatchRate(int catchRate) {
		this.catchRate = catchRate;
	}

	/** Gets the base level of happiness for this species. */
	public int getTameness() {
		return tameness;
	}

	/** Sets the base level of happiness for this species. */
	public void setTameness(int tameness) {
		this.tameness = tameness;
	}

	/** Gets the egg group for this species. */
	public int getEggGroup() {
		return eggGroup;
	}

	/** Sets the egg group for this species. */
	public void setEggGroup(int eggGroup) {
		this.eggGroup = eggGroup;
	}

	/** Checks if this species has a second egg group */
	public boolean hasSecondEggGroup() {
		return (secondEggGroup != -1);
	}

	/** Gets the second egg group for this species (if it has one). */
	public int getSecondEggGroup() {
		return secondEggGroup;
	}

	/** Sets the second egg group for this species. */
	public void setSecondEggGroup(int secondEggGroup) {
		this.secondEggGroup = secondEggGroup;
	}

	/** Checks whether this species can be bred at all. */
	public boolean isBreedable() {
		return breedable;
	}

	/** Sets whether this species can be bred at all. */
	public void setBreedable(boolean breedable) {
		this.breedable = breedable;
	}

	/** Sets the move list learned by levelling up. */
	public HashMap<Integer, String> getMoveList() {
		return moveList;
	}

	/** Sets the move list learned by levelling up. */
	public void setMoveList(HashMap<Integer, String> moveList) {
		this.moveList = moveList;
	}

	/** Gets the list of moves that can be learned by breeding. */
	public String[] getEggMoves() {
		return eggMoveList;
	}

	/** Sets the list of moves that can be learned by breeding. */
	public void setEggMoves(String[] eggMoveList) {
		this.eggMoveList = eggMoveList;
	}

	/** Gets the list of moves that can be learned by TMs and HMs. */
	public String[] getMachineMoves() {
		return machineMoveList;
	}

	/** Sets the list of moves that can be learned by TMs and HMs. */
	public void setMachineMoves(String[]  machineMoveList) {
		this.machineMoveList = machineMoveList;
	}

	/**
	 * Checks whether this species evolves into another at some point.
	 */
	public boolean hasEvolution() {
		return (evolutions != null);
	}

	@Override
	public String toString() {
		String value = 	"Species name: " + name +
						"\nBase stats: " + baseStats +
						"\nHeight: " + height + " Weight: " + weight;

		if (secondaryType != null) {
			value += "\nTypes: " + primaryType + " " + secondaryType;
		} else {
			value += "\nType: " + primaryType;
		}
		if (secondaryAbility != null) {
			value += "\nAbilities: " + primaryAbility + " " + secondaryAbility;
		} else {
			value += "\nAbility: " + primaryAbility;
		}
		if(!dreamAbility.equalsIgnoreCase(primaryAbility))
			value += " " + dreamAbility;
		return value;
	}
}
