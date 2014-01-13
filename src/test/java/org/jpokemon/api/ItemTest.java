package org.jpokemon.api;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.example.SimpleItemManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests the features of items.
 * 
 * @author atheriel@gmail.com
 */
@RunWith(JUnit4.class)
public class ItemTest {

	/**
	 * Checks that managed items must indeed have a unique name.
	 */
	@Test(expected = JPokemonError.class)
	public void testEnforcedItemUniqueness() {
		Manager<Item> manager = new SimpleItemManager();
		manager.register(new Item().setName("Test Item"));
		manager.register(new Item().setName("Test Item"));
	}
}