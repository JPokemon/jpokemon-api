package org.jpokemon.api.items.attributes;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;
import org.jpokemon.api.items.ItemAttribute;

/**
 * Provides a possible attribute describing qualities of machine items,
 * including move name. TM / HM consumability and naming differences should be
 * implemented as part of the Item class.
 * 
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class MachineAttribute implements ItemAttribute {

	/** Indicates the move name of this machine */
	private String moveName;

	/** Provides the default constructor */
	public MachineAttribute() {
	}

	/** Gets the move name of this machine */
	public String getMoveName() {
		return moveName;
	}

	/** Sets the move name of this machine */
	public void setMoveName(String m) {
		moveName = m;
	}

	@Override
	public void applyAttribute(Item item) {
		if (item.hasAttribute("movename")) {
			throw new JPokemonError("Redefinition of property (movename) with item : " + item.toString());
		}
		item.addAttribute("movename", moveName);
	}

	/**
	 * Reads all necessary attributes from the specified Item to get an
	 * ItemAttribute instance
	 * 
	 * @param item Item to read attributes from
	 * @return A BerryAttribute built from attributes of the Item
	 */
	public static MachineAttribute getFromItem(Item item) {
		MachineAttribute ma = new MachineAttribute();

		if (!item.hasAttribute("movename")) {
			throw new JPokemonError("Missing property (movename) from item : " + item.toString());
		}
		ma.setMoveName(item.getAttribute("movename"));

		return ma;
	}
}