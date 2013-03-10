package org.jpokemon.pmapi.item;

import java.util.HashMap;

import org.jpokemon.pmapi.JPokemonError;

/**
 * Defines a basic item. This class provides the most basic attributes that all
 * items in a Pokémon game are likely to share. To create your own items, you 
 * have two options: (1) extend this class, or (2) make use of the `attribute` 
 * system. See the wiki for details.
 * 
 * Note that the `attributes` {@link HashMap} will not initialize until an 
 * attribute is added. Thus, if a traditional inheritance scheme is preferable 
 * for your project, this class can be extended and this functionality ignored
 * without memory inefficiency.
 *
 * The same goes for the management features; if the `manager` field remains 
 * `null`, its functionality is ignored, and only a very weak protest is made by
 * the constructor in the form of an unchecked error.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public class Item {
	/** Indicates the manager being used to register items. May be `null`. */
	public static ItemManager manager = null;

	/** Indicates the non-basic attributes of the item. */
	protected HashMap<String, ItemAttribute> attributes;
	
	/** Indicates the name of the item (as it would appear in the bag or a shop). */
	protected String name = "????";

	/** Indicates the description of this item (as it would appear in the bag or a shop). */
	protected String description = "";

	/** Indicates whether this item is sellable to a vendor. Defaults to `false`. */
	protected boolean sellable = false;
	
	/** Indicates the sale price for this item. Defaults to `0`. */
	protected int salePrice = 0;
	
	/** Indicates whether this item is usable outside of battle. Defaults to `false`. */
	protected boolean usableOutsideBattle = false;

	/** Indicates whether this item is during battle. Defaults to `false`. */
	protected boolean usableDuringBattle = false;

	/** Indicates whether this item is consumed upon use, including use while holding. Defaults to `false`. */
	protected boolean consumable = false;

	/** Indicates whether this item is holdable by a Pokémon. Defaults to `false`. */
	protected boolean holdable = false;

	/** Indicates whether this item has a passive effect when held by a Pokémon. Defaults to `false`. */
	protected boolean passiveHoldEffect = false;

	/** Indicates whether this item has an active effect when held by a Pokémon. Defaults to `false`. */
	protected boolean activeHoldEffect = false;

	/**
	 * Provides the default constructor.
	 * 
	 * @throws JPokemonError in protest if a manager has not been defined.
	 */
	public Item() {
		if (manager == null) {
			throw new JPokemonError("An item has been instantiated, but no manager is defined!");
		}
	}

	/** Gets the name of this item. */
	public String getName() {
		return name;
	}

	/** Sets the name of this item. */
	public void setName(String name) {
		this.name = name;
		if (manager != null) {
			manager.registerItem(this);
		}
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

	/** Checks whether this item is usable outside of battle. */
	public boolean isUsableOutsideBattle() {
		return usableOutsideBattle;
	}

	/** Sets whether this item is usable outside of battle. */
	public void setUsableOutsideBattle(boolean usableOutsideBattle) {
		this.usableOutsideBattle = usableOutsideBattle;
	}

	/** Checks whether this item is usable during battle. */
	public boolean isUsableDuringBattle() {
		return usableDuringBattle;
	}

	/** Sets whether this item is usable during battle. */
	public void setUsableDuringBattle(boolean usableDuringBattle) {
		this.usableDuringBattle = usableDuringBattle;
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

	/** Checks whether this item has a passive effect when held by a Pokémon. */
	public boolean hasPassiveHoldEffect() {
		return passiveHoldEffect;
	}

	/** Sets whether this item has a passive effect when held by a Pokémon. */
	public void setPassiveHoldEffect(boolean passiveHoldEffect) {
		this.passiveHoldEffect = passiveHoldEffect;
	}

	/** Checks whether this item has an active effect when held by a Pokémon. */
	public boolean hasActiveHoldEffect() {
		return activeHoldEffect;
	}

	/** Sets whether this item has an active effect when held by a Pokémon. */
	public void setActiveHoldEffect(boolean activeHoldEffect) {
		this.activeHoldEffect = activeHoldEffect;
	}

	/** Checks if the item has an attribute of the given name. */
	public boolean hasAttribute(String name) {
		if (attributes == null) {
			return false;
		}
		return attributes.containsKey(name);
	}

	/** Adds an attribute to the item. It must have a distinct name. */
	public ItemAttribute addAttribute(String name, ItemAttribute attribute) {
		if (attributes == null) {
			attributes = new HashMap<String, ItemAttribute>();
		}
		if (!attributes.containsKey(name)) {
			attributes.put(name, attribute);			
		}
		return attribute;
	}

	/**
	 * Gets the {@link ItemAttribute} instance for this item of a given type.
	 * 
	 * @param  name The name of attribute requested.
	 * 
	 * @return      The item's attribute under this name, or `null` if it does 
	 *              not possess one.
	 */
	public ItemAttribute getAttribute(String name) {
		if (attributes == null) {
			return null;
		}

		if (attributes.containsKey(name)) {
			return attributes.get(name);
		}

		return null;
	}

	/** Gets a string representation of this item: its name. */
	@Override
	public String toString() {
		String value =  "Item: " + name;
		return value;
	}
}