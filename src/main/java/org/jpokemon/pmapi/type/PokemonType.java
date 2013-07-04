package org.jpokemon.pmapi.type;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a Pokémon type (such as Grass or Dark). For convenience, the classic
 * 17 types are instantiated by the {@link ClassicTypes} class.
 *
 * If a {@link TypeManager} has been defined, calling {@link #setName} will 
 * automatically register it with the manager under that name.
 *
 * @author Atheriel
 *
 * @since  Alpha
 *
 * @see  TypeManager
 * @see  ClassicTypes
 */
public class PokemonType {
	/** Indicates the manager that registers types; must be set before types can be instantiated. */
	public static TypeManager manager = null;

	/** Indicates the name of the type. */
	protected String name;

	/** Indicates the names of types this type is super-effective against. */
	protected List<String> superEffectiveAgainst;

	/** Indicates the names of types this type is not very effective against. */
	protected List<String> notVeryEffectiveAgainst;

	/** Indicates the names of types this type is ineffective against (does not affect). */
	protected List<String> ineffectiveAgainst;

	/** Provides the default constructor. */
	public PokemonType() {
	}

	/** Gets the name of this type. */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of this type, and registers it with the {@link TypeManager}
	 * if one is defined.
	 */
	public PokemonType setName(String name) {
		this.name = name;
		if (manager != null) {
			manager.registerType(this);
		}
		return this;
	}

	/** Gets the list of types this type is super-effective against by name. */
	public String[] getSuperEffectiveAgainst() {
		return (String[]) superEffectiveAgainst.toArray();
	}

	/** Sets the list of types this type is super-effective against by name. */
	public PokemonType setSuperEffectiveAgainst(String... superEffectiveAgainst) {
		if (superEffectiveAgainst != null) {
			this.superEffectiveAgainst = new ArrayList<String>();
			for (String s : superEffectiveAgainst) {
				this.superEffectiveAgainst.add(s);
			}			
		}
		return this;
	}

	/** Gets the list of types this type is not very effective against by name. */
	public String[] getNotVeryEffectiveAgainst() {
		return (String[]) notVeryEffectiveAgainst.toArray();
	}

	/** Sets the list of types this type is not very effective against by name. */
	public PokemonType setNotVeryEffectiveAgainst(String... notVeryEffectiveAgainst) {
		if (notVeryEffectiveAgainst != null) {
			this.notVeryEffectiveAgainst = new ArrayList<String>();
			for (String s : notVeryEffectiveAgainst) {
				this.notVeryEffectiveAgainst.add(s);
			}
		}
		return this;
	}

	/** Gets the list of types this type is ineffective against by name. */
	public String[] getIneffectiveAgainst() {
		return (String[]) ineffectiveAgainst.toArray();
	}

	/** Sets the list of types this type is ineffective against by name. */
	public PokemonType setIneffectiveAgainst(String... ineffectiveAgainst) {
		if (ineffectiveAgainst != null) {
			this.ineffectiveAgainst = new ArrayList<String>();
			for (String s : ineffectiveAgainst) {
				this.ineffectiveAgainst.add(s);
			}
		}
		return this;
	}

	/** Checks whether this type is super-effective against a given type. */
	public boolean isSuperEffectiveAgainst(PokemonType type) {
		return isSuperEffectiveAgainst(type.getName());
	}

	/** Checks whether this type is super-effective against a type of the given name. */
	public boolean isSuperEffectiveAgainst(String typeName) {
		if (superEffectiveAgainst == null || typeName == null) {
			return false;
		}
		if (!superEffectiveAgainst.contains(typeName)) {
			return false;
		}
		return true;
	}

	/** Checks whether this type is not very effective against a given type. */
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		return isNotVeryEffectiveAgainst(type.getName());
	}

	/** Checks whether this type is not very effective against a type of the given name. */
	public boolean isNotVeryEffectiveAgainst(String typeName) {
		if (notVeryEffectiveAgainst == null || typeName == null) {
			return false;
		}
		if (!notVeryEffectiveAgainst.contains(typeName)) {
			return false;
		}
		return true;
	}

	/** Checks whether this type is ineffective against a given type. */
	public boolean isIneffectiveAgainst(PokemonType type) {
		return isIneffectiveAgainst(type.getName());
	}

	/** Checks whether this type is ineffective against a type of the given name. */
	public boolean isIneffectiveAgainst(String typeName) {
		if (ineffectiveAgainst == null || typeName == null) {
			return false;
		}
		if (!ineffectiveAgainst.contains(typeName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
}