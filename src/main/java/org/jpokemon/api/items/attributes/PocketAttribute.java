package org.jpokemon.api.items.attributes;

import org.jpokemon.api.items.ItemAttribute;

/**
 * Provides a possible attribute describing the pocket an item belongs to. The 
 * names of the pockets each have their own static field, which can of course 
 * be modified.
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class PocketAttribute implements ItemAttribute {
	/** Indicates the name of the default pocket. */
	public static String DEFAULT = "Items";

	/** Indicates the name of the balls pocket. */
	public static String BALLS = "Poké Balls";

	/** Indicates the name of the battle items pocket. */
	public static String BATTLE = "Battle Items";

	/** Indicates the name of the berries pocket. */
	public static String BERRIES = "Berries";

	/** Indicates the name of the key items pocket. */
	public static String KEY = "Key Items";

	/** Indicates the name of the tm & hm pocket. */
	public static String MACHINES = "TMs and HMs";

	/** Indicates the name of the mail pocket. */
	public static String MAIL = "Mail";

	/** Indicates the name of the medicine pocket. */
	public static String MEDICINE = "Medicine";

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
