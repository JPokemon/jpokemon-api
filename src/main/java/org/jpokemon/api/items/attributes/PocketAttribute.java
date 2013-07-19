package org.jpokemon.api.items.attributes;

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
public class PocketAttribute extends ItemAttribute {
	private String pocketName;

	/** Provides the default constructor. */
	public PocketAttribute() {
	}

	/** Constructs a new attribute with the given pocket name. */
	public PocketAttribute(String pocketName) {
		this.pocketName = pocketName;
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
}