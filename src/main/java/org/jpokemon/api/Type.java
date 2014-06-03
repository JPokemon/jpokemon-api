package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/** Indicates the name of the type */
	protected String name;

	/** Defines a mapping of this type's effectiveness against others */
	protected Map<String, Effectiveness> effectivenessMap;

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
		return isEffectivenessAgainst(Effectiveness.SUPER, typeName);
	}

	/** Gets the list of types this type is super-effective against by name */
	public List<String> getSuperEffectiveAgainst() {
		return getEffectivenessList(Effectiveness.SUPER);
	}

	/** Sets the list of types this type is super-effective against by name */
	public Type setSuperEffectiveAgainst(String... types) {
		putEffectiveness(Effectiveness.SUPER, types);
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
		return isEffectivenessAgainst(Effectiveness.NOT_VERY, typeName);
	}

	/** Gets the list of types this type is not very effective against by name */
	public List<String> getNotVeryEffectiveAgainst() {
		return getEffectivenessList(Effectiveness.NOT_VERY);
	}

	/** Sets the list of types this type is not very effective against by name */
	public Type setNotVeryEffectiveAgainst(String... types) {
		putEffectiveness(Effectiveness.NOT_VERY, types);
		return this;
	}

	/** Gets the list of types this type is ineffective against by name */
	public List<String> getIneffectiveAgainst() {
		return getEffectivenessList(Effectiveness.INEFFECTIVE);
	}

	/** Sets the list of types this type is ineffective against by name */
	public Type setIneffectiveAgainst(String... types) {
		putEffectiveness(Effectiveness.INEFFECTIVE, types);
		return this;
	}

	/** Checks whether this type is ineffective against a given type */
	public boolean isIneffectiveAgainst(Type type) {
		return isIneffectiveAgainst(type.getName());
	}

	/** Checks whether this type is ineffective against a type of the given name */
	public boolean isIneffectiveAgainst(String typeName) {
		return isEffectivenessAgainst(Effectiveness.INEFFECTIVE, typeName);
	}

	/** Removes effectiveness measurements for a list of types */
	public Type removeEffectiveness(String... types) {
		if (types != null && effectivenessMap != null) {
			for (String type : types) {
				effectivenessMap.remove(type);
			}
		}

		return this;
	}

	/**
	 * Indicates whether this type is the specified effectiveness against the type
	 * specified
	 */
	private boolean isEffectivenessAgainst(Effectiveness effectiveness, String type) {
		if (type == null || effectivenessMap == null) {
			return false;
		}

		return effectivenessMap.get(type) == effectiveness;
	}

	/** Retrieves a list of types for a given effectiveness from the mapping */
	private List<String> getEffectivenessList(Effectiveness effectiveness) {
		List<String> types = new ArrayList<String>();

		if (effectivenessMap != null) {
			for (Map.Entry<String, Effectiveness> effectivenessEntry : effectivenessMap.entrySet()) {
				if (effectivenessEntry.getValue() == effectiveness) {
					types.add(effectivenessEntry.getKey());
				}
			}
		}

		return types;
	}

	/** Adds the name of the type to the effectiveness mapping */
	private void putEffectiveness(Effectiveness effectiveness, String... types) {
		if (types == null) {
			return;
		}
		if (effectivenessMap == null) {
			effectivenessMap = new HashMap<String, Effectiveness>();
		}

		for (String type : types) {
			effectivenessMap.put(type, effectiveness);
		}
	}

	protected enum Effectiveness {
		SUPER, NOT_VERY, INEFFECTIVE;
	}
}
