package org.jpokemon.api.items.attributes;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;
import org.jpokemon.api.items.ItemAttribute;

/**
 * Provides a possible attribute describing the pocket an item belongs to. The
 * names of the pockets each have their own static field, which can of course be
 * modified.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public class PocketAttribute implements ItemAttribute {
	private String pocketName;

	/** Provides the default constructor. */
	public PocketAttribute() {
	}

	/** Gets the name of the pocket this item belongs to. */
	public String getPocketName() {
		return pocketName;
	}

	/** Sets the name of the pocket this item belongs to. */
	public PocketAttribute setPocketName(String pocketName) {
		this.pocketName = pocketName;
		return this;
	}

	@Override
	public void applyAttribute(Item item) {
		if (item.hasProperty("pocket")) {
			throw new JPokemonError("Redefinition of property (pocket) with item : " + item.toString());
		}
		item.setProperty("pocket", pocketName);
	}

	/**
	 * Reads all necessary attributes from the specified Item to get an
	 * ItemAttribute instance
	 * 
	 * @param item Item to read attributes from
	 * @return A BerryAttribute built from attributes of the Item
	 */
	public static PocketAttribute getFromItem(Item item) {
		PocketAttribute pa = new PocketAttribute();

		if (!item.hasProperty("pocket")) {
			throw new JPokemonError("Missing property (pocket) from item : " + item.toString());
		}
		pa.setPocketName(item.getProperty("pocket"));

		return pa;
	}
}