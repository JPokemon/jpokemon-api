package org.jpokemon.pmapi.pokemon.ability;

/**
 * Defines an ability that a Pokémon may possess. Since in practice these 
 * abilities are so widely different, this class contains only a name and 
 * description field.
 *
 * @author Atheriel
 *
 * @since Alpha
 */
public class PokemonAbility {
	/** Indicates the name of the ability. */
	protected String name;

	/** Indicates the description of the ability as it would appear in an info tab. */
	protected String description;

	/** Gets the name of this ability. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this ability. */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the description of this ability. */
	public String getDescription() {
		return this.description;
	}

	/** Sets the description of this ability. */
	public void setDescription(String description) {
		this.description = description;
	}
}