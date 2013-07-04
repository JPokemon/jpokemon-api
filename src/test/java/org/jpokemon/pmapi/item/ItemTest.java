package org.jpokemon.pmapi.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.pmapi.item.*;
import org.jpokemon.pmapi.item.attribute.*;
import org.jpokemon.pmapi.JPokemonError;

/**
 * Tests the features of items.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
@RunWith(JUnit4.class)
public class ItemTest {

	/**
	 * Checks that only one ItemManager can be registered at a time.
	 */
	@Test(expected=JPokemonError.class)
	public void testItemManager() {
		SimpleItemManager manager = new SimpleItemManager();
		SimpleItemManager manager2 = new SimpleItemManager();
	}

	/**
	 * Checks that managed items must indeed have a unique name.
	 */
	@Test(expected=JPokemonError.class)
	public void testEnforcedItemUniqueness() {
		SimpleItemManager manager = new SimpleItemManager();
		Item a = new Item();
		a.setName("Test Item");
		Item b = new Item();
		b.setName("Test Item");
	}

	/**
	 * Checks if an attribute can be properly added to an item.
	 */
	public void testItemAttribute() {
		Item cheriBerry = new Item();
		PocketAttribute pocket = (PocketAttribute) cheriBerry.addAttribute("Pocket", new PocketAttribute());
		pocket.setPocketName(PocketAttribute.BERRIES);
		assertTrue("Berry pocket", cheriBerry.hasAttribute("Pocket"));
		assertEquals("Berry pocket", "Berries", ((PocketAttribute) cheriBerry.getAttribute("Pocket")).getPocketName());
	}
}