package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

public class ContestCategoryTest extends TestCase {
	@Test
	public void testName() {
		String contestCategoryName = "FooCategory";
		ContestCategory contestCategory = new ContestCategory();
		contestCategory.setName(contestCategoryName);
		assertEquals(contestCategoryName, contestCategory.getName());
	}

	@Test
	public void testFlavor() {
		String flavorName = "FooFlavor";
		ContestCategory contestCategory = new ContestCategory();
		contestCategory.setFlavor(flavorName);
		assertEquals(flavorName, contestCategory.getFlavor());
	}

	@Test
	public void testColor() {
		String colorName = "FooColor";
		ContestCategory contestCategory = new ContestCategory();
		contestCategory.setColor(colorName);
		assertEquals(colorName, contestCategory.getColor());
	}

	@Test
	public void testStat() {
		String statName = "FooStat";
		ContestCategory contestCategory = new ContestCategory();
		contestCategory.setStat(statName);
		assertEquals(statName, contestCategory.getStat());
	}

	@Test
	public void testReactions() {
		String categoryName = "FooCategory";
		ContestCategory contestCategory = new ContestCategory();
		assertFalse(contestCategory.isExcitementReaction(categoryName));
		assertFalse(contestCategory.isIndifferenceReaction(categoryName));
		assertFalse(contestCategory.isDiscontentReaction(categoryName));

		assertNotNull(contestCategory.getExcitementReaction());
		assertNotNull(contestCategory.getIndifferenceReactions());
		assertNotNull(contestCategory.getDiscontentReaction());

		contestCategory.setExcitementReaction(categoryName);
		assertTrue(contestCategory.isExcitementReaction(categoryName));
		assertEquals(1, contestCategory.getExcitementReaction().size());

		contestCategory.setIndifferenceReaction(categoryName);
		assertTrue(contestCategory.isIndifferenceReaction(categoryName));
		assertFalse(contestCategory.isExcitementReaction(categoryName));
		assertEquals(1, contestCategory.getIndifferenceReactions().size());
		assertEquals(0, contestCategory.getExcitementReaction().size());

		contestCategory.removeReaction(categoryName);
		assertEquals(0, contestCategory.getIndifferenceReactions().size());
	}
}
