package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a wrapper class for Pokémon trainers participating in battles
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class TrainerContainer {
	/** Indicates the Pokémon trainer associated with this trainer container */
	protected PokemonTrainer pokemonTrainer;

	/** Indicates the Pokémon containers this trainer has available */
	protected List<PokemonContainer> pokemonContainers;

	/**
	 * Indicates the battle effects which are applicable to this trainer container
	 */
	protected List<BattleEffect> battleEffects;

	/** Gets the Pokémon trainer associated with this trainer container */
	public PokemonTrainer getPokemonTrainer() {
		return pokemonTrainer;
	}

	/** Sets the Pokémon trainer associated with this trainer container */
	public void setPokemonTrainer(PokemonTrainer pokemonTrainer) {
		this.pokemonTrainer = pokemonTrainer;
	}

	/**
	 * Adds a Pokémon container to the Pokémon containers this trainer has
	 * available
	 */
	public TrainerContainer addPokemonContainer(PokemonContainer pokemonContainer) {
		if (pokemonContainers == null) {
			pokemonContainers = new ArrayList<PokemonContainer>();
		}

		pokemonContainers.add(pokemonContainer);
		return this;
	}

	/**
	 * Removes a Pokémon container from the Pokémon containers this trainer has
	 * available
	 */
	public TrainerContainer removePokemonContainer(PokemonContainer pokemonContainer) {
		if (pokemonContainers != null) {
			pokemonContainers.remove(pokemonContainer);
		}

		return this;
	}

	/** Gets the Pokémon containers this trainer has available */
	public List<PokemonContainer> getPokemonContainers() {
		return pokemonContainers;
	}

	/** Sets the Pokémon containers this trainer has available */
	public void setPokemonContainers(List<PokemonContainer> pokemonContainers) {
		this.pokemonContainers = pokemonContainers;
	}

	/**
	 * Adds a battle effect to the battle effects which are applicable to this
	 * trainer container
	 */
	public TrainerContainer addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		battleEffects.add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to
	 * this trainer container
	 */
	public TrainerContainer removeBattleEffect(BattleEffect battleEffect) {
		if (battleEffects != null) {
			battleEffects.remove(battleEffect);
		}

		return this;
	}

	/** Gets the battle effects which are applicable to this trainer container */
	public List<BattleEffect> getBattleEffects() {
		return battleEffects;
	}

	/** Sets the battle effects which are applicable to this trainer container */
	public void setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
	}
}