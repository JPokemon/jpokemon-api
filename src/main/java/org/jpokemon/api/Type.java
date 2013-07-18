package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a Pokémon type (such as Grass or Dark). For convenience, the classic
 * 17 types are instantiated by the {@link ClassicTypes} class.
 * 
 * If a {@link Manager} has been defined, calling {@link #setName} will
 * automatically register it with the manager under that name.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since  0.1
 * 
 * @see Manager
 * @see ClassicTypes
 */
public class Type {
	/** Indicates the configured Manager for Types, if set */
	public static Manager<Type> manager;

	/** Indicates the name of the type. */
	protected String name;

	/** Defines a mapping of this type's effectiveness against others. */
	protected Map<String, TypeEffectiveness> effectivenessMap = new HashMap<String, TypeEffectiveness>();

	/** Provides the default constructor. */
	public Type() {
	}

	/** Gets the name of this type. */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this type, and registers it with the {@link TypeManager}
	 * if one is defined.
	 */
	public Type setName(String name) {
		this.name = name;
		if (manager != null) {
			manager.register(this);
		}
		return this;
	}

	/** Gets the list of types this type is super-effective against by name. */
	public List<String> getSuperEffectiveAgainst() {
		return this.getEffectivenessList(TypeEffectiveness.SUPER);
	}

	/** Sets the list of types this type is super-effective against by name. */
	public Type setSuperEffectiveAgainst(String... superEffectiveAgainst) {
		this.putEffectiveness(TypeEffectiveness.SUPER, superEffectiveAgainst);
		return this;
	}

	/**
	 * Gets the list of types this type is not very effective against by name.
	 */
	public List<String> getNotVeryEffectiveAgainst() {
		return this.getEffectivenessList(TypeEffectiveness.NOT_VERY);
	}

	/**
	 * Sets the list of types this type is not very effective against by name.
	 */
	public Type setNotVeryEffectiveAgainst(String... notVeryEffectiveAgainst) {
		this.putEffectiveness(TypeEffectiveness.NOT_VERY, notVeryEffectiveAgainst);
		return this;
	}

	/** Gets the list of types this type is ineffective against by name. */
	public List<String> getIneffectiveAgainst() {
		return this.getEffectivenessList(TypeEffectiveness.INEFFECTIVE);
	}

	/** Sets the list of types this type is ineffective against by name. */
	public Type setIneffectiveAgainst(String... ineffectiveAgainst) {
		this.putEffectiveness(TypeEffectiveness.INEFFECTIVE, ineffectiveAgainst);
		return this;
	}

	/** Checks whether this type is super-effective against a given type. */
	public boolean isSuperEffectiveAgainst(Type type) {
		return isSuperEffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is super-effective against a type of the given
	 * name.
	 */
	public boolean isSuperEffectiveAgainst(String typeName) {
		if (typeName == null) {
			return false;
		}
		if (this.effectivenessMap.get(typeName) != TypeEffectiveness.SUPER) {
			return false;
		}
		return true;
	}

	/** Checks whether this type is not very effective against a given type. */
	public boolean isNotVeryEffectiveAgainst(Type type) {
		return isNotVeryEffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is not very effective against a type of the 
	 * given name.
	 */
	public boolean isNotVeryEffectiveAgainst(String typeName) {
		if (typeName == null) {
			return false;
		}
		if (this.effectivenessMap.get(typeName) != TypeEffectiveness.NOT_VERY) {
			return false;
		}
		return true;
	}

	/** Checks whether this type is ineffective against a given type. */
	public boolean isIneffectiveAgainst(Type type) {
		return isIneffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is ineffective against a type of the given name.
	 */
	public boolean isIneffectiveAgainst(String typeName) {
		if (typeName == null) {
			return false;
		}
		if (this.effectivenessMap.get(typeName) != TypeEffectiveness.INEFFECTIVE) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	/** Retrieves a list of types for a given effectiveness from the mapping. */
	private List<String> getEffectivenessList(TypeEffectiveness effectiveness) {
		List<String> found = new ArrayList<String>();
		for (Map.Entry<String, TypeEffectiveness> effectivenessEntry : this.effectivenessMap.entrySet()) {
			if (effectivenessEntry.getValue() == effectiveness) {
				found.add(effectivenessEntry.getKey());
			}
		}
		return found;
	}

	/** Adds the name of the type to the effectiveness mapping. */
	private void putEffectiveness(TypeEffectiveness effectiveness, String... types) {
		if (types == null) {
			return;
		}
		for (String s : types) {
			this.effectivenessMap.put(s, effectiveness);
		}
	}

	/** Provides an internal enum for the available kinds of "effective". */
	private enum TypeEffectiveness {
		SUPER, NOT_VERY, INEFFECTIVE;
	}
}
