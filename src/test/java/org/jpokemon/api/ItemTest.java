package org.jpokemon.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.*;
import org.jpokemon.api.items.attributes.*;
import org.jpokemon.api.managers.SimpleItemAttributeManager;
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
		ItemAttribute.manager = new SimpleItemAttributeManager();
		new PocketAttribute().setPocketName("Berries").setName("BerryPocket");

		Item cheriBerry = new Item().addAttribute("Pocket", "BerryPocket");
		assertTrue("Berry pocket", cheriBerry.hasAttribute("Pocket"));
		assertEquals("Berry pocket", "Berries", ((PocketAttribute) ItemAttribute.manager.getByName(cheriBerry.getAttribute("Pocket"))).getPocketName());
	}
}