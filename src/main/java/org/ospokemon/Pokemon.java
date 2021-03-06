package org.ospokemon;

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
	/** Indicates the manager used to register Pokémon */
	public static Manager<Pokemon> manager;

	/** Indicates the unique id of this Pokémon */
	protected String id;

	/** Indicates the name of this Pokémon */
	protected String name;

	/** Indicates the species of this Pokémon */
	protected String species;

	/** Indicates the gender of this Pokémon */
	protected String gender;

	/** Indicates the nature of this Pokémon */
	protected String nature;

	/** Indicates the ID of the original trainer of this Pokémon */
	protected int originalTrainerID;

	/** Indicates the name of the original trainer of this Pokémon */
	protected String originalTrainerName;

	/** Indicates the level of this Pokémon */
	protected int level;

	/** Indicates the experience points this Pokémon has */
	protected int experience;

	/** Indicates the friendship rating of this Pokémon */
	protected int friendship;

	/** Indicates the ability of this Pokémon */
	protected String ability;

	/** Indicates the height of this Pokémon */
	protected double height;

	/** Indicates the weight of this Pokémon */
	protected double weight;

	/** Indicates whether this Pokémon is shiny */
	protected boolean shiny;

	/** Indicates the item this Pokémon is holding */
	protected String heldItem;

	/** Indicates the conditions affecting this Pokémon */
	protected List<String> statusConditions;

	/** Indicates the moves of this Pokémon */
	protected List<Skill> skills;

	/** Indicates the stats of this Pokémon */
	protected Map<String, Stat> stats;

	/** Indicates the markings on this Pokémon */
	protected List<String> markings;

	/** Indicates the ribbons earned by this Pokémon */
	protected List<String> ribbons;

	/** Indicates the properties of this Pokémon */
	protected Map<String, Object> properties;

	/** Gets the unique id of this Pokémon */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this Pokémon */
	public void setId(String id) {
		this.id = id;
	}

	/** Gets the name of this Pokémon */
	public String getName() {
		return name;
	}

	/** Sets the name of this Pokémon */
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

	/** Gets the nature of this Pokémon */
	public String getNature() {
		return nature;
	}

	/** Sets the nature of this Pokémon */
	public void setNature(String nature) {
		this.nature = nature;
	}

	/** Gets the ID of the original trainer of this Pokémon */
	public int getOriginalTrainerID() {
		return originalTrainerID;
	}

	/** Sets the ID of the original trainer of this Pokémon */
	public Pokemon setOriginalTrainerID(int originalTrainerID) {
		this.originalTrainerID = originalTrainerID;
		return this;
	}

	/** Gets the name of the original trainer of this Pokémon */
	public String getOriginalTrainerName() {
		return originalTrainerName;
	}

	/** Sets the name of the original trainer of this Pokémon */
	public Pokemon setOriginalTrainerName(String originalTrainerName) {
		this.originalTrainerName = originalTrainerName;
		return this;
	}

	/** Gets the level of this Pokémon */
	public int getLevel() {
		return level;
	}

	/** Sets the level of this Pokémon */
	public Pokemon setLevel(int level) {
		this.level = level;
		return this;
	}

	/** Gets the experience points this Pokémon has */
	public int getExperience() {
		return experience;
	}

	/** Sets the experience points this Pokémon has */
	public Pokemon setExperience(int experience) {
		this.experience = experience;
		return this;
	}

	/** Gets the friendship rating of this Pokémon */
	public int getFriendship() {
		return friendship;
	}

	/** Sets the friendship rating of this Pokémon */
	public Pokemon setFriendship(int friendship) {
		this.friendship = friendship;
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

	/** Gets the height of this Pokémon */
	public double getHeight() {
		return height;
	}

	/** Sets the height of this Pokémon */
	public Pokemon setHeight(double height) {
		this.height = height;
		return this;
	}

	/** Gets the weight of this Pokémon */
	public double getWeight() {
		return weight;
	}

	/** Sets the weight of this Pokémon */
	public Pokemon setWeight(double weight) {
		this.weight = weight;
		return this;
	}

	/** Gets whether this Pokémon is shiny */
	public boolean isShiny() {
		return shiny;
	}

	/** Sets whether this Pokémon is shiny */
	public Pokemon setShiny(boolean shiny) {
		this.shiny = shiny;
		return this;
	}

	/** Gets the item this Pokémon is holding */
	public String getHeldItem() {
		return heldItem;
	}

	/** Sets the item this Pokémon is holding */
	public Pokemon setHeldItem(String heldItem) {
		this.heldItem = heldItem;
		return this;
	}

	/** Adds a condition to this Pokémon status */
	public Pokemon addStatusCondition(String condition) {
		if (statusConditions == null) {
			statusConditions = new ArrayList<String>();
		}

		statusConditions.add(condition);
		return this;
	}

	/** Removes a condition from this Pokémon status */
	public Pokemon removeStatusCondition(String condition) {
		if (statusConditions != null) {
			statusConditions.remove(condition);
		}

		return this;
	}

	/** Gets all the status conditions affecting this Pokémon */
	public List<String> getStatusConditions() {
		return statusConditions;
	}

	/** Sets all status conditions affecting this Pokémon */
	public Pokemon setStatusConditions(List<String> conditions) {
		this.statusConditions = conditions;
		return this;
	}

	/** Gets the skill with the specified index in this Pokémon's skill set */
	public Skill getSkill(int index) {
		if (skills == null || index < 0 || index >= skills.size()) {
			return null;
		}

		return skills.get(index);
	}

	/** Adds a skill to this Pokémon's skill set */
	public Pokemon addSkill(Skill skill) {
		if (skills == null) {
			skills = new ArrayList<Skill>();
		}

		skills.add(skill);
		return this;
	}

	/** Removes the specified skill from this Pokémon's skill set */
	public Pokemon removeSkill(Skill skill) {
		if (skills != null) {
			skills.remove(skill);
		}

		return this;
	}

	/** Gets the skills associated with this Pokemon */
	public List<Skill> getSkills() {
		return skills;
	}

	/** Sets all skills associated with this Pokemon */
	public Pokemon setSkills(List<Skill> skills) {
		this.skills = skills;
		return this;
	}

	/** Gets a Stat from this Pokémon using the specified name */
	public Stat getStat(String name) {
		if (stats == null) {
			return null;
		}

		return stats.get(name);
	}

	/** Adds a Stat to this Pokémon with the specified name */
	public Pokemon addStat(String name, Stat stat) {
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

	/** Gets the stats associated with this Pokémon */
	public Map<String, Stat> getStats() {
		return stats;
	}

	/** Sets the stats associated with this Pokémon */
	public Pokemon setStats(Map<String, Stat> stats) {
		this.stats = stats;
		return this;
	}

	/** Adds a marking to this Pokémon */
	public Pokemon addMarking(String marking) {
		if (markings == null) {
			markings = new ArrayList<String>();
		}

		markings.add(marking);
		return this;
	}

	/** Removes a marking from this Pokémon */
	public Pokemon removeMarking(String marking) {
		if (markings != null) {
			markings.remove(marking);
		}

		return this;
	}

	/** Gets the markings on this Pokémon */
	public List<String> getMarkings() {
		if (markings == null) {
			markings = new ArrayList<String>();
		}

		return markings;
	}

	/** Sets all the markings on this Pokémon */
	public Pokemon setMarkings(List<String> markings) {
		this.markings = markings;
		return this;
	}

	/** Adds a ribbon to those earned by this Pokémon */
	public Pokemon addRibbon(String ribbon) {
		if (ribbons == null) {
			ribbons = new ArrayList<String>();
		}

		ribbons.add(ribbon);
		return this;
	}

	/** Removes a ribbon from those earned by this Pokémon */
	public Pokemon removeRibbon(String ribbon) {
		if (ribbons != null) {
			ribbons.remove(ribbon);
		}

		return this;
	}

	/** Gets the ribbons earned by this Pokémon */
	public List<String> getRibbons() {
		if (ribbons == null) {
			ribbons = new ArrayList<String>();
		}

		return ribbons;
	}

	/** Sets the ribbons earned by this Pokémon */
	public Pokemon setRibbons(List<String> ribbons) {
		this.ribbons = ribbons;
		return this;
	}

	/** Gets a property of this Pokémon using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this Pokémon by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this Pokémon using the class name as the key */
	public Pokemon addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this Pokémon */
	public Pokemon setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this Pokémon by name */
	public Pokemon removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this Pokémon */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this Pokémon */
	public Pokemon setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
