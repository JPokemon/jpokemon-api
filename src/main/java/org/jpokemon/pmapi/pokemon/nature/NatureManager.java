package org.jpokemon.pmapi.pokemon.nature;

import org.jpokemon.pmapi.JPokemonError;

/**
 * Provides an interface for keeping track of {@link PokemonNature}s in an
 * application. The most basic implementation is the {@link SimpleNatureManager}
 * class, and the 25 classic types are implemented in the {@link ClassicNatures}
 * class. It is not possible to use more than one manager for natures at a time.
 * 
 * @author atheriel@gmail.com
 * @since 0.1
 */
public interface NatureManager {

  /**
   * Registers a nature with the manager so it can be looked up by name.
   * 
   * @param nature The nature to be registered.
   * @throws JPokemonError if there is an error registering the nature.
   */
  public abstract void registerNature(PokemonNature nature) throws JPokemonError;

  /**
   * Checks if a nature is registered with the manager.
   * 
   * @return `true` if the nature is known to the manager.
   */
  public abstract boolean isRegistered(PokemonNature nature);

  /**
   * Gets a nature registered with this manager by name.
   * 
   * @param name The name of the nature requested.
   * @return The {@link PokemonNature} for this nature.
   */
  public abstract PokemonNature getNatureByName(String name);
}