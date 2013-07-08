package org.jpokemon.pmapi.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jpokemon.pmapi.JPokemonError;
import org.jpokemon.pmapi.item.attribute.PocketAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests the features of items.
 * 
 * @author Atheriel
 * 
 * @since Alpha
 */
@RunWith(JUnit4.class)
public class ItemTest {

	/**
	 * Checks that managed items must indeed have a unique name.
	 */
	@Test(expected = JPokemonError.class)
	public void testEnforcedItemUniqueness() {
		ItemManager manager = SimpleItemManager.getInstance();
		manager.registerItem(new Item().setName("Test Item"));
		manager.registerItem(new Item().setName("Test Item"));
	}

	/**
	 * Checks if an attribute can be properly added to an item.
	 */
	@Test
	public void testItemAttribute() {
		PocketAttribute pocket = new PocketAttribute().setPocketName(PocketAttribute.BERRIES);
		Item cheriBerry = new Item().addAttribute("Pocket", pocket);
		assertTrue("Berry pocket", cheriBerry.hasAttribute("Pocket"));
		assertEquals("Berry pocket", "Berries", ((PocketAttribute) cheriBerry.getAttribute("Pocket")).getPocketName());
	}
}