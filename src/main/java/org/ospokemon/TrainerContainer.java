package org.ospokemon;

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

	/** Indicates the number of pokemon containers active in the battle */
	protected int activePokemonContainers;

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
	public TrainerContainer setPokemonTrainer(PokemonTrainer pokemonTrainer) {
		this.pokemonTrainer = pokemonTrainer;
		return this;
	}

	/** Gets the number of pokemon containers active in the battle */
	public int getActivePokemonContainers() {
		return activePokemonContainers;
	}

	/** Sets the number of pokemon containers active in the battle */
	public TrainerContainer setActivePokemonContainers(int activePokemonContainers) {
		this.activePokemonContainers = activePokemonContainers;
		return this;
	}

	/**
	 * Adds a Pokémon container to the Pokémon containers this trainer has
	 * available
	 */
	public TrainerContainer addPokemonContainer(PokemonContainer pokemonContainer) {
		getPokemonContainers().add(pokemonContainer);
		return this;
	}

	/**
	 * Removes a Pokémon container from the Pokémon containers this trainer has
	 * available
	 */
	public TrainerContainer removePokemonContainer(PokemonContainer pokemonContainer) {
		getPokemonContainers().remove(pokemonContainer);
		return this;
	}

	/** Gets the Pokémon containers this trainer has available */
	public List<PokemonContainer> getPokemonContainers() {
		return pokemonContainers;
	}

	/** Sets the Pokémon containers this trainer has available */
	public TrainerContainer setPokemonContainers(List<PokemonContainer> pokemonContainers) {
		this.pokemonContainers = pokemonContainers;
		return this;
	}

	/**
	 * Adds a battle effect to the battle effects which are applicable to this
	 * trainer container
	 */
	public TrainerContainer addBattleEffect(BattleEffect battleEffect) {
		if (battleEffects == null) {
			battleEffects = new ArrayList<BattleEffect>();
		}

		getBattleEffects().add(battleEffect);
		return this;
	}

	/**
	 * Removes a battle effect from the battle effects which are applicable to
	 * this trainer container
	 */
	public TrainerContainer removeBattleEffect(BattleEffect battleEffect) {
		getBattleEffects().remove(battleEffect);
		return this;
	}

	/** Gets the battle effects which are applicable to this trainer container */
	public List<BattleEffect> getBattleEffects() {
		return battleEffects;
	}

	/** Sets the battle effects which are applicable to this trainer container */
	public TrainerContainer setBattleEffects(List<BattleEffect> battleEffects) {
		this.battleEffects = battleEffects;
		return this;
	}
}
