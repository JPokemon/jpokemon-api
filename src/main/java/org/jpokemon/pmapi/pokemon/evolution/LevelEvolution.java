package org.jpokemon.pmapi.pokemon.evolution;

/**
 * Defines an evolution that occurs at a certain level.
 */
public class LevelEvolution extends PokemonEvolution {
	protected int level;	
	
	/** Gets the level the Pokémon will evolve at. */
	public int getLevel() {
		return this.level;
	}

	/** Sets the level the Pokémon will evolve at. */
	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Evolves into " + species + " at level " + level;
	}
}