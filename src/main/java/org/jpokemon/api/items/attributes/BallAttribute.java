package org.jpokemon.api.items.attributes;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;
import org.jpokemon.api.items.ItemAttribute;

/**
 * Provides a possible attribute describing qualities of ball items, including
 * catch rate. This can be extended to include type modifiers, etc.
 * 
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class BallAttribute implements ItemAttribute {

	/** Indicates the catch rate of this ball */
	private int catchRate;

	/** Provides the default constructor */
	public BallAttribute() {
	}

	/** Gets the catch rate of this ball */
	public int getCatchRate() {
		return catchRate;
	}

	/** Sets the catch rate of this ball */
	public void setCatchRate(int cr) {
		catchRate = cr;
	}

	@Override
	public void applyAttribute(Item item) {
		if (item.hasAttribute("catchrate")) {
			throw new JPokemonError("Redefinition of property (catchrate) with item : " + item.toString());
		}
		item.addAttribute("catchrate", catchRate + "");
	}

	/**
	 * Reads all necessary attributes from the specified Item to get an
	 * ItemAttribute instance
	 * 
	 * @param item Item to read attributes from
	 * @return A BerryAttribute built from attributes of the Item
	 */
	public static BallAttribute getFromItem(Item item) {
		BallAttribute ba = new BallAttribute();

		if (!item.hasAttribute("catchrate")) {
			throw new JPokemonError("Missing property (catchrate) from item : " + item.toString());
		}
		ba.setCatchRate(Integer.parseInt(item.getAttribute("catchrate")));

		return ba;
	}
}