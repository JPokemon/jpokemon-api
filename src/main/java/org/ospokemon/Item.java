package org.ospokemon;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides an API for items, and properties that all items are likely to share
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class Item {
	/** Indicates the manager used to register items. May be null. */
	public static Manager<Item> manager;

	/** Indicates the unique id of this item */
	protected String id;

	/** Indicates the name of this item */
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

	/** Indicates the properties of this item */
	protected Map<String, Object> properties;

	/** Gets the unique id of this item */
	public String getId() {
		return id;
	}

	/** Sets the unique id of this item */
	public Item setId(String id) {
		this.id = id;
		return this;
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

	/** Gets a property of this item using class name as the key */
	@SuppressWarnings("unchecked")
	public <T> T getProperty(Class<T> clazz) {
		return (T) getProperty(clazz.getName());
	}

	/** Gets a property of this item by name */
	public Object getProperty(String name) {
		if (properties == null) {
			return null;
		}

		return properties.get(name);
	}

	/** Adds a property to this item using the class name as the key */
	public Item addProperty(Object object) {
		return setProperty(object.getClass().getName(), object);
	}

	/** Sets a property of this item */
	public Item setProperty(String name, Object property) {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		properties.put(name, property);
		return this;
	}

	/** Removes a property from this item by name */
	public Item removeProperty(String name) {
		if (properties != null) {
			properties.remove(name);
		}

		return this;
	}

	/** Gets all properties of this item */
	public Map<String, Object> getProperties() {
		if (properties == null) {
			properties = new HashMap<String, Object>();
		}

		return properties;
	}

	/** Sets all properties of this item */
	public Item setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}
}
