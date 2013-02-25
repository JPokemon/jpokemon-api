package org.jpokemon.pmapi.item;

/**
 * Defines a class to hold both an item and an amount. Used as the contents of 
 * a player's bag.
 */
public class ItemStack {
	private Item item;
	private int amount;

	/** Gets the {@link Item} in the ItemStack. */
	public Item getItem() {
		return item;
	}

	/** Sets the {@link Item} in the ItemStack. */
	public void setItem(Item item) {
		this.item = item;
	}

	/** Gets the amount of the {@link Item} in the ItemStack. */
	public int getAmount() {
		return amount;
	}

	/** Sets the amount of the {@link Item} in the ItemStack. */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return item.getName() + " x" + amount;
	}
}