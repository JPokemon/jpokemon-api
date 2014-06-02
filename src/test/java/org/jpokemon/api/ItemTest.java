package org.jpokemon.api;

import java.util.Observable;

import junit.framework.TestCase;

import org.junit.Test;

public class ItemTest extends TestCase {
	@Test
	public void testName() {
		String itemName = "FooItem";
		Item item = new Item();
		item.setName(itemName);
		assertEquals(itemName, item.getName());
	}

	@Test
	public void testDescription() {
		String itemDescription = "Foos teh bars";
		Item item = new Item();
		item.setDescription(itemDescription);
		assertEquals(itemDescription, item.getDescription());
	}

	@Test
	public void testSellable() {
		Item item = new Item();
		assertFalse(item.isSellable());
		item.setSellable(true);
		assertTrue(item.isSellable());
	}

	@Test
	public void testSalePrice() {
		int itemPrice = 123456;
		Item item = new Item();
		item.setSalePrice(itemPrice);
		assertEquals(itemPrice, item.getSalePrice());
	}

	@Test
	public void testUsableOutsideBattle() {
		Item item = new Item();
		assertFalse(item.isUsableOutsideBattle());
		item.setUsableOutsideBattle(true);
		assertTrue(item.isUsableOutsideBattle());
	}

	@Test
	public void testUsableDuringBattle() {
		Item item = new Item();
		assertFalse(item.isUsableDuringBattle());
		item.setUsableDuringBattle(true);
		assertTrue(item.isUsableDuringBattle());
	}

	@Test
	public void testConsumable() {
		Item item = new Item();
		assertFalse(item.isConsumable());
		item.setConsumable(true);
		assertTrue(item.isConsumable());
	}

	@Test
	public void testHoldable() {
		Item item = new Item();
		assertFalse(item.isHoldable());
		item.setHoldable(true);
		assertTrue(item.isHoldable());
	}

	@Test
	public void testAttributes() {
		Object itemAttribute = new Observable();
		Item item = new Item();
		assertNotNull(item.getAttributes());
		assertEquals(0, item.getAttributes().size());

		item.addAttribute(itemAttribute);
		assertEquals(1, item.getAttributes().size());
		assertEquals(itemAttribute, item.getAttributes().get(0));

		item.removeAttribute(itemAttribute);
		assertNotNull(item.getAttributes());
		assertEquals(0, item.getAttributes().size());

		item.setAttributes(null);
		assertNotNull(item.getAttributes());
	}
}