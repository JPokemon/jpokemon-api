package org.jpokemon.api.items.attributes;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.items.ItemAttribute;

/**
 * Provides a possible attribute describing qualities of berry items, including
 * flavor, size, firmness, smoothness, and index number.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class BerryAttribute extends ItemAttribute {
	/** Indicates the size of this berry */
	private float size;

	/** Indicates the smoothness of this berry */
	private int smoothness;

	/** Indicates the firmness of this berry */
	private String firmness;

	/** Indicates the flavors of this berry */
	private Map<String, Integer> flavors = new HashMap<String, Integer>(6);

	/** Provides the default constructor. */
	public BerryAttribute() {
	}

	/** Gets the size of this berry. */
	public float getSize() {
		return size;
	}

	/** Sets the size of this berry. */
	public BerryAttribute setSize(float size) {
		this.size = size;
		return this;
	}

	/** Gets the smoothness of this berry. */
	public int getSmoothness() {
		return smoothness;
	}

	/** Sets the smoothness of this berry. */
	public void setSmoothness(int smoothness) {
		this.smoothness = smoothness;
	}

	/** Gets the firmness of this berry. */
	public String getFirmness() {
		return this.firmness;
	}

	/** Sets the firmness of this berry. */
	public BerryAttribute setFirmness(String firmness) {
		this.firmness = firmness;
		return this;
	}

	/** Gets the amount of flavor for the given taste. */
	public int getFlavor(String taste) {
		return flavors.get(taste);
	}

	/** Sets the amount of bitter flavor for this berry. */
	public BerryAttribute setFlavor(String taste, int flavor) {
		flavors.put(taste, flavor);
		return this;
	}
}