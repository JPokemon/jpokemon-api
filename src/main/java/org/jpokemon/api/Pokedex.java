package org.jpokemon.api;

/**
 * A simple class for tracking which Pokemon have been seen or caught by a
 * specific Player
 * 
 * @author zach
 */
public class Pokedex {
	/** Indicates the entries in this Pokedex by number */
	protected String[] entries;

	public int getCapacity() {
		return entries.length;
	}

	public Pokedex setCapacity(int capacity) {
		String[] newArray = new String[capacity];

		for (int i = 0; i < entries.length && i < capacity; i++) {
			newArray[i] = entries[i];
		}

		entries = newArray;
		return this;
	}

	public Pokedex putSeen(int number) {
		if (!"owned".equals(entries[number])) {
			entries[number] = "seen";
		}

		return this;
	}

	public boolean isSeen(int number) {
		return entries[number] != null;
	}

	public Pokedex putOwned(int number) {
		entries[number] = "owned";
		return this;
	}

	public boolean isOwned(int number) {
		return "owned".equals(entries[number]);
	}
}