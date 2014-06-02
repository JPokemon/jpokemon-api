package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Defines a basic item. This class provides the most basic attributes that all
 * items in a Pokémon game are likely to share. To create your own items, you
 * have two options: (1) extend this class, or (2) make use of the ``attribute``
 * system. See the wiki for details.
 * 
 * <p>
 * 
 * Note that the attributes {@link ArrayList} will not initialize until an
 * attribute is added. Thus, if a traditional inheritance scheme is preferable
 * for your project, this functionality can be ignored without memory
 * inefficiency.
 * 
 * <p>
 * 
 * The same goes for the management features; if the ``manager`` field remains
 * ``null``, its functionality is ignored.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Item {
	/** Indicates the manager used to register items. May be null. */
	public static Manager<Item> manager;

	/** Indicates the name of the item */
	protected String name;

	/** Indicates the description of this item */
	protected String description;

	/** Indicates whether this item is sellable to a vendor */
	protected boolean sellable;

	/** Indicates the sale price for this item */
	protected int salePrice;

	/** Indicates whether this item is usable outside of battle */
	protected boolean usableOutsideBattle;

	/** Indicates whether this item is during battle */
	protected boolean usableDuringBattle;

	/** Indicates whether this item is consumed on use */
	protected boolean consumable;

	/** Indicates whether this item is holdable by a Pokémon */
	protected boolean holdable;

	/** Indicates attributes of the item */
	protected List<Object> attributes;

	/** Provides the default constructor */
	public Item() {
	}

	/** Gets the name of this item */
	public String getName() {
		return name;
	}

	/** Sets the name of this item */
	public Item setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of this item */
	public String getDescription() {
		return description;
	}

	/** Sets the description of this item */
	public Item setDescription(String description) {
		this.description = description;
		return this;
	}

	/** Checks whether this item is sellable to a vendor */
	public boolean isSellable() {
		return sellable;
	}

	/** Sets whether this item is sellable to a vendor */
	public Item setSellable(boolean sellable) {
		this.sellable = sellable;
		return this;
	}

	/** Gets the sale price for this item */
	public int getSalePrice() {
		return salePrice;
	}

	/** Sets the sale price for this item */
	public Item setSalePrice(int salePrice) {
		this.salePrice = salePrice;
		return this;
	}

	/** Checks whether this item is usable outside of battle */
	public boolean isUsableOutsideBattle() {
		return usableOutsideBattle;
	}

	/** Sets whether this item is usable outside of battle */
	public Item setUsableOutsideBattle(boolean usableOutsideBattle) {
		this.usableOutsideBattle = usableOutsideBattle;
		return this;
	}

	/** Checks whether this item is usable during battle */
	public boolean isUsableDuringBattle() {
		return usableDuringBattle;
	}

	/** Sets whether this item is usable during battle */
	public Item setUsableDuringBattle(boolean usableDuringBattle) {
		this.usableDuringBattle = usableDuringBattle;
		return this;
	}

	/** Checks whether this item is consumed upon use */
	public boolean isConsumable() {
		return consumable;
	}

	/** Sets whether this item is consumed upon use */
	public Item setConsumable(boolean consumable) {
		this.consumable = consumable;
		return this;
	}

	/** Checks whether this item can be held by a Pokémon */
	public boolean isHoldable() {
		return holdable;
	}

	/** Sets whether this item can be held by a Pokémon */
	public Item setHoldable(boolean holdable) {
		this.holdable = holdable;
		return this;
	}

	/** Adds an attribute to this item */
	public Item addAttribute(Object attribute) {
		if (this.attributes == null) {
			this.attributes = new ArrayList<Object>();
		}

		this.attributes.add(attribute);
		return this;
	}

	public Item removeAttribute(Object attribute) {
		if (this.attributes != null) {
			this.attributes.remove(attribute);
		}

		return this;
	}

	/** Gets all attributes of this item */
	public List<Object> getAttributes() {
		if (attributes == null) {
			return new ArrayList<Object>();
		}

		return attributes;
	}

	/** Sets all attributes of this item */
	public Item setAttributes(List<Object> attributes) {
		this.attributes = attributes;
		return this;
	}
}
