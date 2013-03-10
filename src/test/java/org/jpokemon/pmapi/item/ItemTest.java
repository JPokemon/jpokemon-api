package org.jpokemon.pmapi.item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.pmapi.item.Item;
import org.jpokemon.pmapi.item.attribute.*;

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
	 * Checks if an attribute can be properly added to an item.
	 */
	@Test
	public void testItemAttribute() {
		Item cheriBerry = new Item();
		PocketAttribute pocket = (PocketAttribute) cheriBerry.addAttribute("Pocket", new PocketAttribute());
		pocket.setPocketName(PocketAttribute.BERRIES);
		assertTrue("Berry pocket", cheriBerry.hasAttribute("Pocket"));
		assertEquals("Berry pocket", "Berries", ((PocketAttribute) cheriBerry.getAttribute("Pocket")).getPocketName());
	}
}