package org.jpokemon.api.classic;

import org.jpokemon.api.Type;

/**
 * Defines a "typeless" Pokémon type (the `????` type). This class will return
 * `false` for all checks against it, and is by default named "????".
 */
public class TypelessType extends Type {

	/** Provides the default constructor. */
	public TypelessType() {
		super();
		this.setName("????");
	}

	/**
	 * Checks if this type is super-effective against the given type.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isSuperEffectiveAgainst(Type type) {
		return false;
	}

	/**
	 * Checks if this type is super-effective against the type of a given name.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isSuperEffectiveAgainst(String typeName) {
		return false;
	}

	/**
	 * Checks if this type is not very effective against the given type.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isNotVeryEffectiveAgainst(Type type) {
		return false;
	}

	/**
	 * Checks if this type is not very effective against the type of the given 
	 * name.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isNotVeryEffectiveAgainst(String typeName) {
		return false;
	}

	/**
	 * Checks if this type is ineffective against the given type.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isIneffectiveAgainst(Type type) {
		return false;
	}

	/**
	 * Checks if this type is ineffective against the type of a given name.
	 * 
	 * @return      `false`
	 */
	@Override
	public boolean isIneffectiveAgainst(String typeName) {
		return false;
	}
}