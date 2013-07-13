package org.jpokemon.api.pokemon.nature;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.JPokemonError;

public class SimpleNatureManager implements NatureManager {

  private Map<String, PokemonNature> natureMap = new HashMap<String, PokemonNature>();

  @Override
  public void registerNature(PokemonNature nature) throws JPokemonError {
    if (natureMap.containsKey(nature.getName())) {
      throw new JPokemonError("A type with the name " + nature.getName() + " has already been registered!");
    }
    if (natureMap.containsValue(nature)) {
      throw new JPokemonError("This type is already registered!");
    }

    natureMap.put(nature.getName(), nature);
  }

  @Override
  public boolean isRegistered(PokemonNature nature) {
    return natureMap.containsValue(nature);
  }

  @Override
  public PokemonNature getNatureByName(String name) {
    if (!natureMap.containsKey(name)) {
      return null;
    }

    return natureMap.get(name);
  }

  public static void init() {
    if (PokemonNature.manager != null) {
      throw new JPokemonError("PokemonNature.manager already defined");
    }

    PokemonNature.manager = new SimpleNatureManager();
  }

  private SimpleNatureManager() {
  }
}