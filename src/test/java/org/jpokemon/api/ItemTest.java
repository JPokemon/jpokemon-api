package org.jpokemon.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.*;
import org.jpokemon.api.items.attributes.*;
import org.jpokemon.api.managers.SimpleItemManager;
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

	/**
	 * Checks if an attribute can be properly added to an item.
	 */
	@Test
	public void testItemAttribute() {
		// Define the Berry Pocket. setName will call register
		new PocketAttribute().setPocketName("berries");

		Item cheriBerry = new Item().addAttribute("pocket", "berries");
		assertTrue("Berry pocket", cheriBerry.hasAttribute("pocket"));
		assertEquals("Berry pocket", "berries", cheriBerry.getAttribute("pocket"));
	}
}