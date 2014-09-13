package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a Pokémon species. Note that this refers to an object like
 * "Bulbasaur" as in "Seed Pokémon". Not "Bulbasaur" as in "Ash sent out
 * Bulbasaur!" This class defines a species of Pokémon.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Species {
	/** Indicates the manager being used to register species. May be null. */
	public static Manager<Species> manager;

	/** Indicates the unique id of this species */
	protected String id;

	/** Indicates the name of this species */
	protected String name;

	/** Indicates the tagline of this species */
	protected String tag;

	/** Indicates the description of the species */
	protected String description;

	/** Indicates this species' number in the Pokédex */
	protected int number;

	/** Indicates this species' types */
	protected List<String> types;

	/** Indicates abilities available to this species */
	protected List<String> abilities;

	/** Indicates the hidden ability of this species, if it has one */
	protected String hiddenAbility;

	/** Indicates whether this species is genderless */
	protected boolean genderless;

	/** Indicates what percentage of this species are male */
	protected double maleRatio;

	/** Indicates the difficulty in catching this species */
	protected int catchRate;

	/** Indicates whether this species is breedable in any way */
	protected boolean breedable;

	/** Indicates the egg groups of this species is a member of */
	protected List<String> eggGroups;

	/** Indicates the number of steps required to hatch an egg of this species */
	protected int eggCyles;

	/** Indicates the average height of the species */
	protected double height;

	/** Indicates the average weight of the species */
	protected double weight;

	/** Indicates the base experience awarded for defeating this species */
	protected int experienceYield;

	/** Indicates this species' experience gain behavior */
	protected String experienceCurve;

	/**
	 * Indicates the EVs gained (hp, atk, def, satk, sdef, spd) from defeating
	 * this species.
	 */
	protected Map<String, Integer> effortValues;

	/** Indicates the body style of this species */
	protected String bodyStyle;

	/** Indicates the color of the species */
	protected String color;

	/** Indicates the basic level of happiness of this species */
	protected int tameness;

	/**
	 * Indicates the base stats (hp, atk, def, satk, sdef, spd, exp) for this
	 * species.
	 */
	protected Map<String, Integer> baseStats;

	/** Indicates the possible evolutions of this species */
	protected List<Evolution> evolutions;

	/** Indicates the moves learned at a given level by this species */
	protected Map<Integer, List<String>> moveLists;

	/** Indicates the egg moves for this species */
	protected List<String> eggMoves;

	/** Indicates the moves that can be learned from machines by this species */
	protected List<String> machineMoves;

	/** Indicates the moves that can be learned from move tutors by this species */
	protected List<String> tutorMoves;

	/** Indicates the properties of this species */
	protected Map<String, Object> properties;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/** Gets the name of this species */
	public String getName() {
		return name;
	}

	/** Sets the name of this species */
	public Species setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the tagline of this species */
	public String getTag() {
		return tag;
	}

	/** Sets the tagline of this species */
	public Species setTag(String tag) {
		this.tag = tag;
		return this;
	}

	/** Gets the description of the species */
	public String getDescription() {
		return description;
	}

	/** Sets the description of the species */
	public Species setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets this species' number in the Pokédex */
	public int getNumber() {
		return number;
	}

	/** Sets this species' number in the Pokédex */
	public Species setNumber(int number) {
		this.number = number;
		return this;
	}

	/** Adds a type to this species */
	public Species addType(String type) {
		getTypes().add(type);
		return this;
	}

	/** Removes a type from this species */
	public Species removeType(String type) {
		getTypes().remove(type);
		return this;
	}

	/** Gets this species' types */
	public List<String> getTypes() {
		if (types == null) {
			types = new ArrayList<String>();
		}
		return types;
	}

	/** Sets this species' types */
	public Species setTypes(List<String> types) {
		this.types = types;
		return this;
	}

	/** Adds an ability to this species */
	public Species addAbility(String ability) {
		getAbilities().add(ability);
		return this;
	}

	/** Removes an ability from this species */
	public Species removeAbility(String ability) {
		getAbilities().remove(ability);
		return this;
	}

	/** Gets abilities available to this species */
	public List<String> getAbilities() {
		if (abilities == null) {
			abilities = new ArrayList<String>();
		}
		return abilities;
	}

	/** Sets abilities available to this species */
	public Species setAbilities(List<String> abilities) {
		this.abilities = abilities;
		return this;
	}

	/** Gets the hidden ability of this species, if it has one */
	public String getHiddenAbility() {
		return hiddenAbility;
	}

	/** Sets the hidden ability of this species */
	public Species setHiddenAbility(String hiddenAbility) {
		this.hiddenAbility = hiddenAbility;
		return this;
	}

	/** Gets whether this species is genderless */
	public boolean isGenderless() {
		return genderless;
	}

	/** Sets whether this species is genderless */
	public Species setGenderless(boolean genderless) {
		this.genderless = genderless;
		return this;
	}

	/** Gets what percentage of this species are male */
	public double getMaleRatio() {
		return maleRatio;
	}

	/** Sets what percentage of this species are male */
	public Species setMaleRatio(double maleRatio) {
		this.maleRatio = maleRatio;
		return this;
	}

	/** Gets the catch rate of this species */
	public int getCatchRate() {
		return catchRate;
	}

	/** Sets the catch rate of this species */
	public Species setCatchRate(int catchRate) {
		this.catchRate = catchRate;
		return this;
	}

	/** Gets whether this species is breedable in any way */
	public boolean isBreedable() {
		return breedable;
	}

	/** Sets whether this species is breedable in any way */
	public Species setBreedable(boolean breedable) {
		this.breedable = breedable;
		return this;
	}

	/** Adds an egg group to this species */
	public Species addEggGroup(String eggGroup) {
		getEggGroups().add(eggGroup);
		return this;
	}

	/** Removes an egg group from this species */
	public Species removeEggGroup(String eggGroup) {
		getEggGroups().remove(eggGroup);
		return this;
	}

	/** Gets the egg groups of this species is a member of */
	public List<String> getEggGroups() {
		if (eggGroups == null) {
			eggGroups = new ArrayList<String>();
		}
		return eggGroups;
	}

	/** Sets the egg groups of this species is a member of */
	public Species setEggGroups(List<String> eggGroups) {
		this.eggGroups = eggGroups;
		return this;
	}

	/** Gets the number of steps required to hatch an egg of this species */
	public int getEggCyles() {
		return eggCyles;
	}

	/** Sets the number of steps required to hatch an egg of this species */
	public Species setEggCyles(int eggCyles) {
		this.eggCyles = eggCyles;
		return this;
	}

	/** Gets the average height of the species */
	public double getHeight() {
		return height;
	}

	/** Sets the average height of the species */
	public Species setHeight(double height) {
		this.height = height;
		return this;
	}

	/** Gets the average weight of the species */
	public double getWeight() {
		return weight;
	}

	/** Sets the average weight of the species */
	public Species setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	/** Gets the base experience awarded for defeating this species */
	public int getExperienceYield() {
		return experienceYield;
	}

	/** Sets the base experience awarded for defeating this species */
	public Species setExperienceYield(int experienceYield) {
		this.experienceYield = experienceYield;
		return this;
	}

	/** Gets this species' experience gain behavior */
	public String getExperienceCurve() {
		return experienceCurve;
	}

	/** Sets this species' experience gain behavior */
	public Species setExperienceCurve(String experienceCurve) {
		this.experienceCurve = experienceCurve;
		return this;
	}

	/** Gets the effort value for defeating this species for a specified stat */
	public int getEffortValue(String stat) {
		return getEffortValues().get(stat);
	}

	/** Sets the effort value for defeating this species for a specified stat */
	public Species setEffortValue(String stat, int value) {
		getEffortValues().put(stat, value);
		return this;
	}

	/** Removes the effort value for a defeating this species for a specified stat */
	public Species removeEffortValue(String stat) {
		getEffortValues().remove(stat);
		return this;
	}

	/** Gets all effort values for defeating this species */
	public Map<String, Integer> getEffortValues() {
		if (effortValues == null) {
			effortValues = new HashMap<String, Integer>();
		}
		return effortValues;
	}

	/** Sets all effort values for defeating this species */
	public Species setEffortValues(Map<String, Integer> effortValues) {
		this.effortValues = effortValues;
		return this;
	}

	/** Gets the body style of this species */
	public String getBodyStyle() {
		return bodyStyle;
	}

	/** Sets the body style of this species */
	public Species setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		return this;
	}

	/** Gets the color of this species */
	public String getColor() {
		return color;
	}

	/** Sets the color of this species */
	public Species setColor(String color) {
		this.color = color;
		return this;
	}

	/** Gets the basic level of happiness of this species */
	public int getTameness() {
		return tameness;
	}

	/** Sets the basic level of happiness of this species */
	public Species setTameness(int tameness) {
		this.tameness = tameness;
		return this;
	}

	/** Gets this species' base value for the specified stat */
	public int getBaseStat(String stat) {
		return getBaseStats().get(stat);
	}

	/** Sets this species' base value for the specified stat */
	public Species setBaseStat(String stat, int value) {
		getBaseStats().put(stat, value);
		return this;
	}

	/** Removes a species' base value for the specified stat */
	public Species removeBaseStat(String stat) {
		getBaseStats().remove(stat);
		return this;
	}

	/** Gets this species' base values all stats */
	public Map<String, Integer> getBaseStats() {
		if (baseStats == null) {
			baseStats = new HashMap<String, Integer>();
		}
		return baseStats;
	}

	/** Sets this species' base values all stats */
	public Species setBaseStats(Map<String, Integer> baseStats) {
		this.baseStats = baseStats;
		return this;
	}

	/** Adds an evolution to this species */
	public Species addEvolution(Evolution evolution) {
		getEvolutions().add(evolution);
		return this;
	}

	/** Removes an evolution from this species */
	public Species removeEvolution(Evolution evolution) {
		getEvolutions().remove(evolution);
		return this;
	}

	/** Gets the possible evolutions of this species */
	public List<Evolution> getEvolutions() {
		if (evolutions == null) {
			evolutions = new ArrayList<Evolution>();
		}
		return evolutions;
	}

	/** Sets the possible evolutions of this species */
	public Species setEvolutions(List<Evolution> evolutions) {
		this.evolutions = evolutions;
		return this;
	}

	/** Adds a move for this species to learn at the specified level */
	public Species addMove(int level, String move) {
		getMoveList(level).add(move);
		return this;
	}

	/** Removes a move for this species to learn at the specified level */
	public Species removeMove(int level, String move) {
		getMoveList(level).remove(move);
		return this;
	}

	/** Gets the moves available to this species at the specified level */
	public List<String> getMoveList(int level) {
		if (getMoveLists().get(level) == null) {
			getMoveLists().put(level, new ArrayList<String>());
		}
		return getMoveLists().get(level);
	}

	/** Sets the moves available to this species at the specified level */
	public Species setMoveList(int level, List<String> moveList) {
		if (moveList != null) {
			getMoveLists().put(level, moveList);
		}
		else {
			removeMoveList(level);
		}
		return this;
	}

	/** Removes all moves available to this species for the specified level */
	public Species removeMoveList(int level) {
		getMoveLists().remove(level);
		return this;
	}

	/** Gets all moves available to this species, mapped by level available */
	public Map<Integer, List<String>> getMoveLists() {
		if (moveLists == null) {
			moveLists = new HashMap<Integer, List<String>>();
		}
		return moveLists;
	}

	/** Sets all moves available to this species, mapped by level available */
	public Species setMoveLists(Map<Integer, List<String>> moveLists) {
		this.moveLists = moveLists;
		return this;
	}

	/** Adds a move this species may know at birth */
	public Species addEggMove(String eggMove) {
		getEggMoves().add(eggMove);
		return this;
	}

	/** Removes a move this species may know at birth */
	public Species removeEggMove(String eggMove) {
		getEggMoves().remove(eggMove);
		return this;
	}

	/** Gets the moves this species may know at birth */
	public List<String> getEggMoves() {
		if (eggMoves == null) {
			eggMoves = new ArrayList<String>();
		}
		return eggMoves;
	}

	/** Sets the moves this species may know at birth */
	public Species setEggMoves(List<String> eggMoves) {
		this.eggMoves = eggMoves;
		return this;
	}

	/** Adds a move that can be learned from machines by this species */
	public Species addMachineMove(String machineMove) {
		getMachineMoves().add(machineMove);
		return this;
	}

	/** Removes a move that can be learned from machines by this species */
	public Species removeMachineMove(String machineMove) {
		getMachineMoves().remove(machineMove);
		return this;
	}

	/** Gets the moves that can be learned from machines by this species */
	public List<String> getMachineMoves() {
		if (machineMoves == null) {
			machineMoves = new ArrayList<String>();
		}
		return machineMoves;
	}

	/** Sets the moves that can be learned from machines by this species */
	public Species setMachineMoves(List<String> machineMoves) {
		this.machineMoves = machineMoves;
		return this;
	}

	/** Adds a move that can be learned from move tutors by this species */
	public Species addTutorMove(String tutorMove) {
		getTutorMoves().add(tutorMove);
		return this;
	}

	/** Removes a move that can be learned from move tutors by this species */
	public Species removeTutorMove(String tutorMove) {
		getTutorMoves().remove(tutorMove);
		return this;
	}

	/** Gets the moves that can be learned from move tutors by this species */
	public List<String> getTutorMoves() {
		if (tutorMoves == null) {
			tutorMoves = new ArrayList<String>();
		}
		return tutorMoves;
	}

	/** Sets the moves that can be learned from move tutors by this species */
	public Species setTutorMoves(List<String> tutorMoves) {
		this.tutorMoves = tutorMoves;
		return this;
	}

	/** Gets a property of this species using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this species by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this species using the class name as the key */
	public Species addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this species */
	public Species setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this species by name */
	public Species removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this species */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this species */
	public Species setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
