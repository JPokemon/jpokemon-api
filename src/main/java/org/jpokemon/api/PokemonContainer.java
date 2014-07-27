package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Defines a wrapper class for Pokémon participating in Battles
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class PokemonContainer {
	/** Indicates the Pokémon associated with this Pokémon container */
	protected Pokemon pokemon;

	/** Indicates the species of Pokémon associated with this Pokémon container */
	protected String species;

	/** Indicates the skill containers associated with this Pokémon container */
	protected List<SkillContainer> skillContainers;

	/** Indicates the Pokémon encountered during battle by this Pokémon */
	protected Set<PokemonContainer> pokemonEncountered;

	/** Indicates the battle effects which are applicable to this Pokémon */
	protected List<BattleEffect> battleEffects;

	/** Gets the Pokémon associated with this Pokémon container */
	public Pokemon getPokemon() {
		return pokemon;
	}

	/** Sets the Pokémon associated with this Pokémon container */
	public PokemonContainer setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
		return this;
	}

	/** Gets the species of Pokémon associated with this Pokémon container */
	public String getSpecies() {
		return species;
	}

	/** Sets the species of Pokémon associated with this Pokémon container */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Adds a skill container to the skill containers associated with this
	 * Pokémon container
	 */
	public PokemonContainer addSkillContainer(SkillContainer skillContainer) {
		if (skillContainers == null) {
			skillContainers = new ArrayList<SkillContainer>();
		}

		skillContainers.add(skillContainer);
		return this;
	}

	/**
	 * Removes a skill container from the skill containers associated with this
	 * Pokémon container
	 */
	public PokemonContainer removeSkillContainer(SkillContainer skillContainer) {
		if (skillContainers != null) {
			skillContainers.remove(skillContainer);
		}

		return this;
	}

	/** Gets the skill containers associated with this Pokémon container */
	public List<SkillContainer> getSkillContainers() {
		if (skillContainers == null) {
			skillContainers = new ArrayList<SkillContainer>();
		}

		return skillContainers;
	}

	/** Sets the skill containers associated with this Pokémon container */
	public void setSkillContainers(List<SkillContainer> skillContainers) {
		this.skillContainers = skillContainers;
	}

	/** Adds a Pokémon to those encountered during battle by this Pokémon */
	public PokemonContainer addPokemonEncountered(PokemonContainer pokemonContainer) {
		if (pokemonEncountered == null) {
			pokemonEncountered = new HashSet<PokemonContainer>();
		}

		pokemonEncountered.add(pokemonContainer);
		return this;
	}

	/** Removes a Pokémon from those encountered during battle by this Pokémon */
	public PokemonContainer removePokemonEncountered(PokemonContainer pokemonContainer) {
		if (pokemonEncountered != null) {
			pokemonEncountered.remove(pokemonContainer);
		}

		return this;
	}

	/** Gets the Pokémon encountered during battle by this Pokémon */
	public Set<PokemonContainer> getPokemonEncountered() {
		if (pokemonEncountered == null) {
			pokemonEncountered = new HashSet<PokemonContainer>();
		}

		return pokemonEncountered;
	}

	/** Sets the Pokémon encountered during battle by this Pokémon */
	public void setPokemonEncountered(Set<PokemonContainer> pokemonEncountered) {
		this.pokemonEncountered = pokemonEncountered;
	}

	/**
	 * Adds a battle effect to the battle effects which are applicable to this
	 * Pokémon
	 */
	public PokemonContainer addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to
	 * this Pokémon
	 */
	public PokemonContainer removeBattleEffect(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

		return this;
	}

	/** Gets the battle effects which are applicable to this Pokémon */
	public List<BattleEffect> getBattleEffects() {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		return battleEffects;
	}

	/** Sets the battle effects which are applicable to this Pokémon */
	public PokemonContainer setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}
}
