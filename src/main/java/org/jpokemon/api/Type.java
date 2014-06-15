package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Defines a Pokémon type (such as Grass or Dark)
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Type {
	/** Indicates the manager used to register types. May be null. */
	public static Manager<Type> manager;

	/** Indicates the value used to represent super effectiveness */
	public static final String SUPER_EFFECTIVENESS = "SUPER";

	/** Indicates the value used to represent not very effectiveness */
	public static final String NOT_VERY_EFFECTIVENESS = "NOT_VERY";

	/** Indicates the value used to represent ineffective effectiveness */
	public static final String INEFFECTIVE_EFFECTIVENESS = "INEFFECTIVE";

	/** Indicates the name of the type */
	protected String name;

	/** Defines a mapping of this type's effectiveness against others */
	protected Map<String, String> effectiveness;

	/** Provides the default constructor */
	public Type() {
	}

	/** Gets the name of this type */
	public String getName() {
		return name;
	}

	/** Sets the name of this type */
	public Type setName(String name) {
		this.name = name;
		return this;
	}

	/** Checks whether this type is super-effective against a given type */
	public boolean isSuperEffectiveAgainst(Type type) {
		return isSuperEffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is super-effective against a type of the given
	 * name
	 */
	public boolean isSuperEffectiveAgainst(String typeName) {
		return isEffectivenessAgainst(SUPER_EFFECTIVENESS, typeName);
	}

	/** Gets the list of types this type is super-effective against by name */
	public List<String> getSuperEffectiveAgainst() {
		return getEffectivenessList(SUPER_EFFECTIVENESS);
	}

	/** Sets the list of types this type is super-effective against by name */
	public Type setSuperEffectiveAgainst(String... types) {
		putEffectiveness(SUPER_EFFECTIVENESS, types);
		return this;
	}

	/** Checks whether this type is not very effective against a given type */
	public boolean isNotVeryEffectiveAgainst(Type type) {
		return isNotVeryEffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is not very effective against a type of the given
	 * name
	 */
	public boolean isNotVeryEffectiveAgainst(String typeName) {
		return isEffectivenessAgainst(NOT_VERY_EFFECTIVENESS, typeName);
	}

	/** Gets the list of types this type is not very effective against by name */
	public List<String> getNotVeryEffectiveAgainst() {
		return getEffectivenessList(NOT_VERY_EFFECTIVENESS);
	}

	/** Sets the list of types this type is not very effective against by name */
	public Type setNotVeryEffectiveAgainst(String... types) {
		putEffectiveness(NOT_VERY_EFFECTIVENESS, types);
		return this;
	}

	/** Gets the list of types this type is ineffective against by name */
	public List<String> getIneffectiveAgainst() {
		return getEffectivenessList(INEFFECTIVE_EFFECTIVENESS);
	}

	/** Sets the list of types this type is ineffective against by name */
	public Type setIneffectiveAgainst(String... types) {
		putEffectiveness(INEFFECTIVE_EFFECTIVENESS, types);
		return this;
	}

	/** Checks whether this type is ineffective against a given type */
	public boolean isIneffectiveAgainst(Type type) {
		return isIneffectiveAgainst(type.getName());
	}

	/** Checks whether this type is ineffective against a type of the given name */
	public boolean isIneffectiveAgainst(String typeName) {
		return isEffectivenessAgainst(INEFFECTIVE_EFFECTIVENESS, typeName);
	}

	/** Removes effectiveness measurements for a list of types */
	public Type removeEffectiveness(String... types) {
		if (types != null && effectiveness != null) {
			for (String type : types) {
				effectiveness.remove(type);
			}
		}

		return this;
	}

	/** Gets all effectiveness as a map of type name -> effectiveness */
	public Map<String, String> getEffectiveness() {
		if (effectiveness == null) {
			effectiveness = new HashMap<String, String>();
		}

		return effectiveness;
	}

	/** Sets all effectiveness as a map of type name -> effectiveness */
	public Type setEffectiveness(Map<String, String> effectiveness) {
		Set<String> effectivenessValues = new HashSet<String>();
		effectivenessValues.addAll(effectiveness.values());
		effectivenessValues.remove(SUPER_EFFECTIVENESS);
		effectivenessValues.remove(NOT_VERY_EFFECTIVENESS);
		effectivenessValues.remove(INEFFECTIVE_EFFECTIVENESS);

		if (effectivenessValues.size() > 0) {
			throw new JPokemonException("Effectiveness map contains invalid effectiveness: " + effectivenessValues.toString());
		}

		this.effectiveness = effectiveness;
		return this;
	}

	/**
	 * Indicates whether this type is the specified effectiveness against the type
	 * specified
	 */
	private boolean isEffectivenessAgainst(String effectiveness, String type) {
		if (type == null || this.effectiveness == null) {
			return false;
		}

		return this.effectiveness.get(type) == effectiveness;
	}

	/** Retrieves a list of types for a given effectiveness from the mapping */
	private List<String> getEffectivenessList(String effectiveness) {
		List<String> types = new ArrayList<String>();

		if (this.effectiveness != null) {
			for (Map.Entry<String, String> effectivenessEntry : this.effectiveness.entrySet()) {
				if (effectivenessEntry.getValue() == effectiveness) {
					types.add(effectivenessEntry.getKey());
				}
			}
		}

		return types;
	}

	/** Adds the name of the type to the effectiveness mapping */
	private void putEffectiveness(String effectiveness, String... types) {
		if (types == null) {
			return;
		}
		if (this.effectiveness == null) {
			this.effectiveness = new HashMap<String, String>();
		}

		for (String type : types) {
			this.effectiveness.put(type, effectiveness);
		}
	}
}
