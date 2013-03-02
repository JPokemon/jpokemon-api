package org.jpokemon.pmapi.type;

/**
 * Defines an abstract Pokémon type (such as Grass or Dark) that must be 
 * extended to create a class for each type. The classic 17 types are 
 * instantiated by the {@link ClassicTypes} class.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public abstract class PokemonType {
	/** Indicates the name of the type. */
	protected final String name;

	/** Constructs a new Pokémon type with the given name. */
	protected PokemonType(String name) {
		this.name = name;
	}

	/** Gets the name of this type. */
	public String getName() {
		return name;
	}

	/** Checks whether this type is super-effective against a given type. */
	public abstract boolean isSuperEffectiveAgainst(PokemonType type);

	/** Checks whether this type is not very effective against a given type. */
	public abstract boolean isNotVeryEffectiveAgainst(PokemonType type);

	/** Checks whether this type is ineffective against a given type. */
	public abstract boolean isIneffectiveAgainst(PokemonType type);

	@Override
	public String toString() {
		return name;
	}
}