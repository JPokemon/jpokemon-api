package org.jpokemon.api;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple class for tracking which Pokémon have been seen or caught by a
 * specific Player
 * 
 * @author zach
 */
public class Pokedex {
	/** Indicates the entries in this Pokédex by species */
	protected Map<String, String> entries;

	/** Indicates the entries in this Pokédex by number */
	public String getEntry(String species) {
		return getEntries().get(species);
	}

	/** Indicates the entries in this Pokédex by number */
	public Pokedex setEntry(String species, String entry) {
		getEntries().put(species, entry);
		return this;
	}

	/** Removes the seen or owned status of a Pokémon from this Pokédex */
	public Pokedex removeEntry(String species) {
		getEntries().remove(species);
		return this;
	}

	/** Gets all entries as a map of species name -> status */
	public Map<String, String> getEntries() {
		if (entries == null) {
			entries = new HashMap<String, String>();
		}
		return entries;
	}

	/** Sets all entries as a map of species name -> status */
	public Pokedex setEntries(Map<String, String> entries) {
		this.entries = entries;
		return this;
	}
}
