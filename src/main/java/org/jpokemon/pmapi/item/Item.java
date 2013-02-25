package org.jpokemon.pmapi.item;

/**
 * Defines a basic item.
 */
public class Item {
	/** Indicates the name of the item (as it would appear in the bag or a shop). */
	protected String name = "????";

	/** Indicates the description of this item (as it would appear in the bag or a shop). */
	protected String description = "";

	/** Indicates whether this item is sellable to a vendor. */
	protected boolean sellable = false;
	
	/** Indicates the sale price for this item. */
	protected int salePrice = 0;
	
	/** Indicates whether this item is usable in any sense. */
	protected boolean usable = false;

	/** Indicates whether this item is consumed upon use, including use while holding. */
	protected boolean consumable = false;

	/** Indicates whether this item is holdable by a Pokémon. */
	protected boolean holdable = false;

	/** Indicates whether this item has an effect when held by a Pokémon. */
	protected boolean holdEffect = false;

	/** Gets the name of this item. */
	public String getName() {
		return name;
	}

	/** Sets the name of this item. */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the description of this item. */
	public String getDescription() {
		return description;
	}

	/** Sets the description of this item. */
	public void setDescription(String description) {
		this.description = description;
	}

	/** Checks whether this item is sellable to a vendor. */
	public boolean isSellable() {
		return sellable;
	}

	/** Sets whether this item is sellable to a vendor. */
	public void setSellable(boolean sellable) {
		this.sellable = sellable;
	}

	/** Gets the sale price for this item. */
	public int getSalePrice() {
		return salePrice;
	}

	/** Sets the sale price for this item. */
	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	/** Checks whether this item is usable in any sense. */
	public boolean isUsable() {
		return usable;
	}

	/** Sets whether this item is usable in any sense. */
	public void setUsable(boolean usable) {
		this.usable = usable;
	}

	/** Checks whether this item is consumed upon use. */
	public boolean isConsumable() {
		return consumable;
	}

	/** Sets whether this item is consumed upon use. */
	public void setConsumable(boolean consumable) {
		this.consumable = consumable;
	}

	/** Checks whether this item can be held by a Pokémon. */
	public boolean isHoldable() {
		return holdable;
	}

	/** Sets whether this item can be held by a Pokémon. */
	public void setHoldable(boolean holdable) {
		this.holdable = holdable;
	}

	/** Checks whether this item has an effect when held by a Pokémon. */
	public boolean hasHoldEffect() {
		return holdEffect;
	}

	/** Sets whether this item has an effect when held by a Pokémon. */
	public void setHoldEffect(boolean holdEffect) {
		this.holdEffect = holdEffect;
	}
}