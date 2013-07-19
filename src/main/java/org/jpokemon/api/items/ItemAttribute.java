package org.jpokemon.api.items;

import org.jpokemon.api.Manager;

/**
 * Provides an interface for `attributes` that can be added to items. At this
 * time, attributes have no common features, so in theory anything at all could
 * implement this.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public abstract class ItemAttribute {
	public static Manager<ItemAttribute> manager;

	/** Indicates the name of this attribute */
	protected String name;

	/** Provides the default constructor. */
	public ItemAttribute() {
	}

	/** Gets the name of this attribute. */
	public String getName() {
		return name;
	}

	/** Sets the name of this attribute. */
	public ItemAttribute setName(String name) {
		this.name = name;
		return this;
	}
}
