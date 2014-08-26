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

		assertNotNull(contestCategory.getReactions());
		assertEquals(0, contestCategory.getReactions().size());

		String REACTION_EXCITEMENT = "EXCITEMENT";
		contestCategory.setReaction(categoryName, REACTION_EXCITEMENT);

		assertEquals(1, contestCategory.getReactions().size());
		assertEquals(REACTION_EXCITEMENT, contestCategory.getReaction(categoryName));

		String REACTION_CUSTOM = "The reviews were mixed, and overall unreceptive";
		contestCategory.setReaction(categoryName, REACTION_CUSTOM);

		assertEquals(1, contestCategory.getReactions().size());
		assertEquals(REACTION_CUSTOM, contestCategory.getReaction(categoryName));

		contestCategory.removeReaction(categoryName);
		assertEquals(0, contestCategory.getReactions().size());

		contestCategory.setReactions(null);
		assertNotNull(contestCategory.getReactions());
	}
}
