package org.jpokemon.pmapi.trainer;

import java.util.ArrayList;

/**
 * Defines a basic trainer class. Trainers possess a party of Pokemon 
 * instances and a list of item names. They may also belong to a class of other
 * trainers.
 *
 * @author Atheriel
 *
 * @since Alpha
 *
 * @see TrainerClass
 */
public class PokemonTrainer {
	/** Indicates the name of the trainer. */
	protected String name;

	/** Indicates the name of the trainer's class, or `null` if it has none. */
	protected String className = null;
	
	/** Indicates the list of items the trainer has (by name). */
	protected ArrayList<String> items;
	
	/** Indicates the trainer's party Pokémon. */
	//protected ArrayList<Pokemon> party;

	/** Gets the name of this trainer. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this trainer. */
	public void setName(String name) {
		this.name = name;
	}

	/** Checks if this trainer belongs to a trainer class. */
	public boolean hasClass() {
		return (className != null);
	}

	/** Gets the name of this trainer's class. */
	public String getClassName() {
		return this.className;
	}

	/** Sets the name of this trainer's class. */
	public void setClassName(String className) {
		this.className = className;
	}

	/** Gets the names of the items this trainer possesses. */
	public String[] getItems() {
		return (String[]) this.items.toArray();
	}

	/** Sets the items this trainer possesses by name. */
	public void setItems(String... items) {
		if (items != null) {
			this.items = new ArrayList<String>();
			for (String i : items) {
				this.items.add(i);
			}
		}
	}

	/**
	 * Adds an item to this trainer by name.
	 * 
	 * @return      `true` if the item has been successfully added to the list.
	 */
	public boolean addItem(String name) {
		if (this.items == null) {
			this.items = new ArrayList<String>();
		}
		return this.items.add(name);
	}

	/**
	 * Removes an item from this trainer by name.
	 * 
	 * @return      `true` if the item has been successfully removed from the 
	 *               list.
	 */
	public boolean removeItem(String name) {
		if (!this.items.contains(name)) {
			return false;
		}
		return this.items.remove(name);
	}

	/** Checks if the trainer has an item of this name. */
	public boolean hasItem(String name) {
		if (this.items.contains(name)) {
			return true;
		}
		return false;
	}
}