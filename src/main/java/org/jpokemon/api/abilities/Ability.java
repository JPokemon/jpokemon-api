package org.jpokemon.api.abilities;

import org.jpokemon.api.Manager;

/**
 * Defines an ability that a Pokémon may possess.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class Ability {
	/** Indicates the configured Manager for PokemonAbilities, if set */
	public static Manager<Ability> manager;

	/** Indicates the name of the ability. */
	protected String name;

	/** Indicates the description of the ability */
	protected String description;

	/** Indicates the effect of the ability. */
	protected AbilityEffect effect;

	/** Gets the name of this ability. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this ability. */
	public Ability setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of this ability. */
	public String getDescription() {
		return this.description;
	}

	/** Sets the description of this ability. */
	public Ability setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets the effect of this ability. */
	public AbilityEffect getEffect() {
		return this.effect;
	}

	/** Sets the effect of this ability. */
	public Ability setEffect(AbilityEffect effect) {
		this.effect = effect;
		return this;
	}
}
