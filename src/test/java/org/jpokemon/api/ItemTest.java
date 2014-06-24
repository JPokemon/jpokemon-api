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
		String itemPropertyKey = "ItemPropertyKey";
		Object itemProperty = new Observable();
		Item item = new Item();
		assertNotNull(item.getProperties());
		assertEquals(0, item.getProperties().size());

		item.setProperty(itemPropertyKey, itemProperty);
		assertEquals(1, item.getProperties().size());
		assertEquals(itemProperty, item.getProperty(itemPropertyKey));

		item.removeProperty(itemPropertyKey);
		assertNotNull(item.getProperties());
		assertEquals(0, item.getProperties().size());

		item.setProperties(null);
		assertNotNull(item.getProperties());
	}
}