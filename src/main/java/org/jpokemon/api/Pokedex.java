package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A simple class for tracking which Pokémon have been seen or caught by a
 * specific Player
 * 
 * @author zach
 */
public class Pokedex {
	public static final String SEEN_STATUS = "SEEN";

	public static final String OWNED_STATUS = "OWNED";

	/** Indicates the entries in this Pokédex by number */
	protected Map<String, String> entries;

	/** Returns whether the specified Pokémon has been seen */
	public boolean isSeen(String species) {
		return isStatus(SEEN_STATUS, species);
	}

	/** Gets the list of Pokémon that have been seen */
	public List<String> getSeen() {
		return getStatus(SEEN_STATUS);
	}

	/** Sets whether the specified Pokémon has been seen */
	public Pokedex setSeen(String species) {
		setStatus(SEEN_STATUS, species);
		return this;
	}

	/** Returns whether the specified Pokémon has been caught */
	public boolean isOwned(String species) {
		return isStatus(OWNED_STATUS, species);
	}

	/** Gets the list of Pokémon that have been caught */
	public List<String> getOwned() {
		return getStatus(OWNED_STATUS);
	}

	/** Sets whether the specified Pokémon has been caught */
	public Pokedex setOwned(String species) {
		setStatus(OWNED_STATUS, species);
		return this;
	}

	/** Removes the seen or owned status of a Pokémon from this Pokédex */
	public Pokedex removeStatus(String species) {
		if (entries != null) {
			entries.remove(species);
		}

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
		Set<String> entryValues = new HashSet<String>();
		entryValues.addAll(entries.values());
		entryValues.remove(SEEN_STATUS);
		entryValues.remove(OWNED_STATUS);

		if (entryValues.size() > 0) {
			throw new JPokemonException("Entries map contains invalid status: " + entryValues.toString());
		}

		this.entries = entries;
		return this;
	}

	private boolean isStatus(String status, String species) {
		if (entries == null) {
			return false;
		}

		return entries.get(species) == status;
	}

	private List<String> getStatus(String status) {
		List<String> species = new ArrayList<String>();

		if (entries != null) {
			for (Map.Entry<String, String> statusEntry : entries.entrySet()) {
				if (statusEntry.getValue() == status) {
					species.add(statusEntry.getKey());
				}
			}
		}

		return species;
	}

	private void setStatus(String status, String species) {
		if (entries == null) {
			entries = new HashMap<String, String>();
		}

		entries.put(species, status);
	}
}
