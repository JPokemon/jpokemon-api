package org.jpokemon.pmapi.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a Pokémon type (such as Grass or Dark). For convenience, the classic
 * 17 types are instantiated by the {@link ClassicTypes} class.
 * 
 * If a {@link TypeManager} has been defined, calling {@link #setName} will
 * automatically register it with the manager under that name.
 * 
 * @author Atheriel
 * 
 * @since Alpha
 * 
 * @see TypeManager
 * @see ClassicTypes
 */
public class PokemonType {
	/**
	 * Indicates the manager that registers types; must be set before types can be
	 * instantiated.
	 */
	public static TypeManager manager = null;

	/** Indicates the name of the type. */
	protected String name;

	/** Indicates the effectivity of against other types. */
	protected Map<String, PokemonTypeEffectivity> effectivity = new HashMap<String, PokemonTypeEffectivity>();

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
		return (String[]) this.getEffectivityList(PokemonTypeEffectivity.SUPER).toArray();
	}

	/** Sets the list of types this type is super-effective against by name. */
	public PokemonType setSuperEffectiveAgainst(String... superEffectiveAgainst) {
		this.putEffectivity(PokemonTypeEffectivity.SUPER, superEffectiveAgainst);
		return this;
	}

	/** Gets the list of types this type is not very effective against by name. */
	public String[] getNotVeryEffectiveAgainst() {
		return (String[]) this.getEffectivityList(PokemonTypeEffectivity.NOT_VERY).toArray();
	}

	/** Sets the list of types this type is not very effective against by name. */
	public PokemonType setNotVeryEffectiveAgainst(String... notVeryEffectiveAgainst) {
		this.putEffectivity(PokemonTypeEffectivity.NOT_VERY, notVeryEffectiveAgainst);
		return this;
	}

	/** Gets the list of types this type is ineffective against by name. */
	public String[] getIneffectiveAgainst() {
		return (String[]) this.getEffectivityList(PokemonTypeEffectivity.INEFFECTIVE).toArray();
	}

	/** Sets the list of types this type is ineffective against by name. */
	public PokemonType setIneffectiveAgainst(String... ineffectiveAgainst) {
		this.putEffectivity(PokemonTypeEffectivity.INEFFECTIVE, ineffectiveAgainst);
		return this;
	}

	/** Checks whether this type is super-effective against a given type. */
	public boolean isSuperEffectiveAgainst(PokemonType type) {
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
		if (this.effectivity.get(typeName) != PokemonTypeEffectivity.SUPER) {
			return false;
		}
		return true;
	}

	/** Checks whether this type is not very effective against a given type. */
	public boolean isNotVeryEffectiveAgainst(PokemonType type) {
		return isNotVeryEffectiveAgainst(type.getName());
	}

	/**
	 * Checks whether this type is not very effective against a type of the given
	 * name.
	 */
	public boolean isNotVeryEffectiveAgainst(String typeName) {
		if (typeName == null) {
			return false;
		}
		if (this.effectivity.get(typeName) != PokemonTypeEffectivity.NOT_VERY) {
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
		if (typeName == null) {
			return false;
		}
		if (this.effectivity.get(typeName) != PokemonTypeEffectivity.INEFFECTIVE) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	private List<String> getEffectivityList(PokemonTypeEffectivity pokemonTypeEffectivity) {
		List<String> found = new ArrayList<String>();

		for (Map.Entry<String, PokemonTypeEffectivity> effectivityEntry : this.effectivity.entrySet()) {
			if (effectivityEntry.getValue() == pokemonTypeEffectivity) {
				found.add(effectivityEntry.getKey());
			}
		}

		return found;
	}

	private void putEffectivity(PokemonTypeEffectivity pokemonTypeEffectivity, String... types) {
		if (types == null) {
			return;
		}

		for (String s : types) {
			this.effectivity.put(s, pokemonTypeEffectivity);
		}
	}

	private enum PokemonTypeEffectivity {
		SUPER, NOT_VERY, INEFFECTIVE;
	}
}