package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines an ability that a Pokémon may possess.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Ability {
	/** Indicates the manager used to register abilities. May be null. */
	public static Manager<Ability> manager;

	/** Indicates the name of the ability */
	protected String name;

	/** Indicates the description of the ability */
	protected String description;

	/** Indicates the effect(s) of the ability */
	protected List<Object> effects;

	/** Gets the name of this ability */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this ability */
	public Ability setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of this ability */
	public String getDescription() {
		return this.description;
	}

	/** Sets the description of this ability */
	public Ability setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Gets the effects of this ability */
	public List<Object> getEffects() {
		return effects;
	}

	/** Adds an effect to this ability */
	public Ability addEffect(Object effect) {
		if (effects == null) {
			effects = new ArrayList<Object>();
		}

		effects.add(effect);
		return this;
	}

	/** Removes an effect of this ability */
	public Ability removeEffect(Object effect) {
		if (effects != null) {
			effects.remove(effect);
		}

		return this;
	}

	/** Sets the effects of this ability */
	public Ability setEffects(List<Object> effects) {
		this.effects = effects;
		return this;
	}
}