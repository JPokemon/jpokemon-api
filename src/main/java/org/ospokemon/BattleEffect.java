package org.ospokemon;

/**
 * Defines a unit which can be processed by a {@link BattleEngine}, and may be
 * attached to several Battle wrapper classes. It is necessary to indicate that
 * the there is a recommended lifecycle for BattleEffects, which facilitates the
 * greatest utility. This lifecycle is, of course, not guaranteed, and wholly
 * dependent on the implementation of the {@link BattleEngine}.
 * 
 * <p>
 * 
 * At this time, no suggestion is offered for the creation of {@link Turn}s,
 * which may, in some implementations, contain a significant amount of
 * BattleEffects. Similarly, there is no suggestion for the pre-allocation of
 * effects on any wrapper classes, though both of these points may prove worth
 * considering.
 * 
 * <p>
 * 
 * <b>Proposed lifecycle</b> <br />
 * 1. {@link Battle#battleEffects} are applied to each {@link Round} via
 * {@link #affect(Round)}<br />
 * 2. {@link Round#battleEffects} are applied to each {@link TrainerContainer}
 * via {@link #affect(TrainerContainer)}<br />
 * 3. {@link TrainerContainer#battleEffects} are applied to each
 * {@link PokemonContainer} via {@link #affect(PokemonContainer)}<br />
 * 4. {@link PokemonContainer#battleEffects} are applied to each
 * {@link SkillContainer} via {@link #affect(SkillContainer)}<br />
 * 5. For each turn,<br />
 * &nbsp;&nbsp; 5.1. Compile and sort effects from the Round, TrainerContainer,
 * PokemonContainer, and those on the Turn itself<br />
 * &nbsp;&nbsp; 5.2. Apply each effect to every other of lower priority via
 * {@link #affect(BattleEffect, Battle, TrainerContainer, PokemonContainer, Turn)}
 * <br />
 * &nbsp;&nbsp; 5.3. Apply each effect to the Battle via
 * {@link #affect(Battle, TrainerContainer, PokemonContainer, Turn)}
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class BattleEffect {
	/** Indicates the manager used to register battle effect builders */
	public static Manager<Builder<BattleEffect>> builders;

	/**
	 * Gets the priority of this battle effect, for ordering by a
	 * {@link BattleEngine}
	 */
	public abstract int getPriority();

	/** Applies the effect to the Battle */
	public abstract void affect(Battle battle, TrainerContainer trainerContainer, PokemonContainer pokemonContainer, Turn turn);

	/** Applies the effect to a round in the battle */
	public abstract void affect(Round round);

	/**
	 * Applies the effect to each trainer container
	 */
	public abstract void affect(TrainerContainer trainerContainer);

	/**
	 * Applies the effect to each Pokémon container currently in use by a trainer
	 * container
	 */
	public abstract void affect(PokemonContainer pokemonContainer);

	/** Applies the effect to each Skill container of a Pokemon container */
	public abstract void affect(SkillContainer skillContainer);

	/**
	 * Applies the effect to a battle effect, which is of lower priority than this
	 * battle effect. Facilitates modification of other BattleEffects.
	 */
	public abstract void affect(BattleEffect battleEffect, Battle battle, TrainerContainer trainerContainer, PokemonContainer pokemonContainer, Turn turn);
}
