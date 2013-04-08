package org.jpokemon.pmapi.pokemon;

import java.util.ArrayList;
import java.util.HashMap;

import org.jpokemon.pmapi.pokemon.evolution.PokemonEvolution;
import org.jpokemon.pmapi.type.PokemonType;
import org.jpokemon.pmapi.util.ExperienceCurve;

/**
 * Defines a Pokémon species. Note that this refers to an object like 
 * `Bublasaur` and not the tag `Seed Pokémon`.
 *
 * To reduce clutter, `base stats` are kept in a seven-element array.
 *
 * @author Atheriel
 *
 * @since  Alpha
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
	protected int[] baseStats;

	/** Indicates the EVs gained (hp, atk, def, satk, sdef, spd) from defeating this species. */
	protected int[] eVals;

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


	/** Provides the default constructor. Initializes the base stats array. */
	public PokemonSpecies() {
		baseStats = new int[7];
		eVals = new int[6];
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
	
		/** Checks if this species has a secondary ability. */
	public boolean hasDreamAbility() {
		return (!dreamAbility.equalsIgnoreCase(primaryAbility);
	}

	/** Gets this species' secondary ability. */
	public String getSecondaryAbility() {
		return dreamAbility;
	}

	/** Sets this species' secondary ability. */
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

	/** Gets the base HP stat for this species. */
	public int getBaseHp() {
		return baseStats[0];
	}

	/** Sets the base HP stat for this species. */
	public void setBaseHp(int hp) {
		baseStats[0] = hp;
	}

	/** Gets the base Attack stat for this species. */
	public int getBaseAtk() {
		return baseStats[1];
	}

	/** Sets the base Attack stat for this species. */
	public void setBaseAtk(int atk) {
		baseStats[1] = atk;
	}

	/** Gets the base Defense stat for this species. */
	public int getBaseDef() {
		return baseStats[2];
	}

	/** Sets the base Defense stat for this species. */
	public void setBaseDef(int def) {
		baseStats[2] = def;
	}

	/** Gets the base Special Attack stat for this species. */
	public int getBaseSpAtk() {
		return baseStats[3];
	}

	/** Sets the base Special Attack stat for this species. */
	public void setBaseSpAtk(int satk) {
		baseStats[3] = satk;
	}

	/** Gets the base Special Defense stat for this species. */
	public int getBaseSpDef() {
		return baseStats[4];
	}

	/** Sets the base Special Defense stat for this species. */
	public void setBaseSpDef(int sdef) {
		baseStats[4] = sdef;
	}

	/** Gets the base Speed stat for this species. */
	public int getBaseSpeed() {
		return baseStats[5];
	}

	/** Sets the base Speed stat for this species. */
	public void setBaseSpeed(int spd) {
		baseStats[5] = spd;
	}

	/** Gets the base experience awarded for defeating this species. */
	public int getBaseExp() {
		return baseStats[6];
	}

	/** Sets the base experience awarded for defeating this species. */
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
	 * Gets the effort values gained from defeating this species.
	 *
	 * @return An array of six integers: hp, atk, def, satk, sdef, and spd.
	 */
	public int[] getEVals() {
		return eVals;
	}

	/**
	 * Sets the effort values gained from defeating this species.
	 * 
	 * @param  eVals An array of six integers: hp, atk, def, satk, sdef, and
	 *               spd.
	 */
	public void setEVals(int[] eVals) {
		this.eVals = eVals;
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
		if(!dreamAbility.equalsIgnoreCase(primaryAbility)
			value += " " + dreamAbility
		return value;
	}
}
