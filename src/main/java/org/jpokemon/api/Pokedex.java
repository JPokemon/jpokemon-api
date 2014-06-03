package org.jpokemon.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple class for tracking which Pokémon have been seen or caught by a
 * specific Player
 * 
 * @author zach
 */
public class Pokedex {
	/** Indicates the entries in this Pokédex by number */
	protected Map<String, Status> entries;

	/** Returns whether the specified Pokémon has been seen */
	public boolean isSeen(String species) {
		return isStatus(Status.SEEN, species);
	}

	/** Gets the list of Pokémon that have been seen */
	public List<String> getSeen() {
		return getStatus(Status.SEEN);
	}

	/** Sets whether the specified Pokémon has been seen */
	public Pokedex setSeen(String species) {
		setStatus(Status.SEEN, species);
		return this;
	}

	/** Returns whether the specified Pokémon has been caught */
	public boolean isOwned(String species) {
		return isStatus(Status.OWNED, species);
	}

	/** Gets the list of Pokémon that have been caught */
	public List<String> getOwned() {
		return getStatus(Status.OWNED);
	}

	/** Sets whether the specified Pokémon has been caught */
	public Pokedex setOwned(String species) {
		setStatus(Status.OWNED, species);
		return this;
	}

	/** Removes the seen or owned status of a Pokémon from this Pokédex */
	public Pokedex removeStatus(String species) {
		if (entries != null) {
			entries.remove(species);
		}

		return this;
	}

	private boolean isStatus(Status status, String species) {
		if (entries == null) {
			return false;
		}

		return entries.get(species) == status;
	}

	private List<String> getStatus(Status status) {
		List<String> species = new ArrayList<String>();

		if (entries != null) {
			for (Map.Entry<String, Status> statusEntry : entries.entrySet()) {
				if (statusEntry.getValue() == status) {
					species.add(statusEntry.getKey());
				}
			}
		}

		return species;
	}

	private void setStatus(Status status, String species) {
		if (entries == null) {
			entries = new HashMap<String, Status>();
		}

		entries.put(species, status);
	}

	protected enum Status {
		SEEN, OWNED;
	}
}
