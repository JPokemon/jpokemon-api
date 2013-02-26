package org.jpokemon.pmapi.pokemon;

import java.util.ArrayList;
import java.util.HashMap;

import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.pokemon.evolution.PokemonEvolution;
import org.jpokemon.pmapi.util.ExperienceCurve;

/**
 * Defines a Pokémon species. Note that this refers to an object like 
 * `Bublasaur` and not the tag `Seed Pokémon`.
 *
 * To reduce clutter, `base stats` are kept in a seven-element array.
 */
public class PokemonSpecies {
	/** Indicates this species' number in the National Pokédex. */
	protected int pokedexNo;

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
	protected int[] baseStats;

	/** Indicates the number of steps required to hatch an egg of this species. */
	protected int steps;

	/** Indicates the evolutions for this species (if it has any). */
	protected ArrayList<PokemonEvolution> evolutions;

	/** Indicates whether this species is breedable in any way. */
	protected boolean breedable;

	/** Indicates what percentage of this species are male. */
	protected float percentMale = 0.5f;

	/** Indicates whether this species is genderless. */
	protected boolean genderless;

	/** Indicates the egg moves for this species. */
	protected ArrayList<String> eggMoveList = new ArrayList<String>();
	
	/** Indicates the moves that can be learned from machines by this species. */
	protected ArrayList<String> machineMoveList = new ArrayList<String>();

	/** Indicates the moves learned at a given level by this species. */
	protected HashMap<String, Integer> moveList = new HashMap<String, Integer>();

	/** Provides the default constructor. Initializes the base stats array. */
	public PokemonSpecies() {
		baseStats = new int[7];
	}

	/** Get the Pokédex number for this species. */
	public int getPokedexNumber() {
		return pokedexNo;
	}

	/** Set the Pokédex number for this species. */
	public void setPokedexNumber(int dexNo) {
		this.pokedexNo = dexNo;
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

	/**
	 * @brief Checks if this species has a secondary ability.
	 */
	public boolean hasSecondaryAbility() {
		return (secondaryAbility != null);
	}

	/**
	 * @brief Gets this species' secondary ability.
	 */
	public String getSecondaryAbility() {
		return secondaryAbility;
	}

	/**
	 * @brief Sets this species' secondary ability.
	 */
	public void setSecondaryAbility(String ability) {
		this.secondaryAbility = ability;
	}

	/**
	 * @brief Gets this species' average height.
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * @brief Sets this species' average height.
	 */
	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @brief Gets this species' average weight.
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * @brief Sets this species' average weight.
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @brief Gets this species' colour classification.
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @brief Sets this species' colour classification.
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @brief Gets the Pokédex entry for this species.
	 */
	public String getPokedexEntry() {
		return dexEntry;
	}

	/**
	 * @brief Sets the Pokédex entry for this species.
	 */
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

	/** Gets the base HP stat for this species. */
	public int getBaseHp() {
		return baseStats[0];
	}

	/** Sets the base HP stat for this species. */
	public void setBaseHp(int hp) {
		baseStats[0] = hp;
	}

	/**
	 * Gets the base Attack stat for this species.
	 */
	public int getBaseAtk() {
		return baseStats[1];
	}

	/**
	 * Sets the base Attack stat for this species.
	 */
	public void setBaseAtk(int atk) {
		baseStats[1] = atk;
	}

	/**
	 * Gets the base Defense stat for this species.
	 */
	public int getBaseDef() {
		return baseStats[2];
	}

	/**
	 * Sets the base Defense stat for this species.
	 */
	public void setBaseDef(int def) {
		baseStats[2] = def;
	}

	/**
	 * Gets the base Special Attack stat for this species.
	 */
	public int getBaseSpAtk() {
		return baseStats[3];
	}

	/**
	 * Sets the base Special Attack stat for this species.
	 */
	public void setBaseSpAtk(int satk) {
		baseStats[3] = satk;
	}

	/**
	 * Gets the base Special Defense stat for this species.
	 */
	public int getBaseSpDef() {
		return baseStats[4];
	}

	/**
	 * Sets the base Special Defense stat for this species.
	 */
	public void setBaseSpDef(int sdef) {
		baseStats[4] = sdef;
	}

	/**
	 * Gets the base Speed stat for this species.
	 */
	public int getBaseSpeed() {
		return baseStats[5];
	}

	/**
	 * Sets the base Speed stat for this species.
	 */
	public void setBaseSpeed(int spd) {
		baseStats[5] = spd;
	}

	/**
	 * Gets the base experience awarded for defeating this species.
	 */
	public int getBaseExp() {
		return baseStats[6];
	}

	/**
	 * Sets the base experience awarded for defeating this species.
	 */
	public void setBaseExp(int exp) {
		baseStats[6] = exp;
	}

	/**
	 * Gets the base stats for this species.
	 *
	 * @return An array of seven integers: hp, atk, def, satk, sdef, spd, and 
	 *         exp.
	 */
	public int[] getBaseStats() {
		return baseStats;
	}

	/**
	 * Sets the base stats for this species.
	 * 
	 * @param  baseStats An array of seven integers: hp, atk, def, satk, sdef, 
	 *                   spd, and exp.
	 */
	public void setBaseStats(int[] baseStats) {
		this.baseStats = baseStats;
	}

	/**
	 * Checks whether this species evolves into another at some point.
	 */
	public boolean hasEvolution() {
		return (evolutions != null);
	}

	/** Gets the type of experience curve for this species. */
	public ExperienceCurve getExperienceCurveType() {
		return expCurve;
	}

	/** Sets the type of experience curve for this species. */
	public void setExperienceCurve(ExperienceCurve expCurve) {
		this.expCurve = expCurve;
	}

	public HashMap<String, Integer> getMoveList() {
		return moveList;
	}

	public void addMove(String name, int level) {
		moveList.put(name, level);
	}

	public ArrayList<String> getEggMoves() {
		return eggMoveList;
	}

	public void addEggMove(String name) {
		eggMoveList.add(name);
	}

	public ArrayList<String> getMachineMoves() {
		return machineMoveList;
	}

	public void addMachineMove(String name) {
		machineMoveList.add(name);
	}

	/** Checks whether this species is genderless. */
	public boolean isGenderless() {
		return genderless;
	}

	/** Sets whether this species should be genderless. */
	public void setGenderless(boolean genderless) {
		this.genderless = genderless;
	}

	public float getMaleRatio() {
		return percentMale;
	}

	public void setMaleRatio(float percentMale) {
		this.percentMale = percentMale;
	}
}