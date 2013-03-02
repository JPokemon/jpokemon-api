package org.jpokemon.pmapi.item;

import java.util.Collection;

/**
 * Provides an interface for storing and keeping track of items at runtime. 
 * Although an {@link Item} does not have an inherent `id` value attached to 
 * it, any practical system to keep track of them will index them. For this 
 * reason, the `add()` method of this interface requires an id number.
 *
 * This interface also provides *two* ways to access items, each serving a 
 * different kind of lookup for different applications. There is of course no 
 * obligation to implement this manager in your own project. It is merely an 
 * illustration of what you will probably require.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public interface IndexedItemManager {

	/** Adds an item to this manager under the given index number. */
	public abstract void addItem(Item item, int id);

	/** Retrieves an item by its index number. */
	public abstract Item getItem(int id);

	/** Retrieves an item by name. */
	public abstract Item getItem(String name);

	/** Gets all of the items this manager is aware of. */
	public abstract Collection<Item> getItems();
}