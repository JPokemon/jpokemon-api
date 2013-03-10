package org.jpokemon.pmapi.item.attribute;

import java.util.HashMap;

import org.jpokemon.pmapi.item.ItemAttribute;
import org.jpokemon.pmapi.util.Taste;

/**
 * Provides a possible attribute describing qualities of berry items, including
 * flavor, size, firmness, smoothness, and index number.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
public class BerryAttribute implements ItemAttribute {
	private final HashMap<Taste, Integer> flavors = new HashMap<Taste, Integer>(6);
	private int index;
	private float size;
	private String firmness;
	private int smoothness;

	/** Provides the default constructor. */
	public BerryAttribute() {
		flavors.put(Taste.BITTER, 0);
		flavors.put(Taste.DRY, 0);
		flavors.put(Taste.SOUR, 0);
		flavors.put(Taste.SPICY, 0);
		flavors.put(Taste.SWEET, 0);
	}

	/** Gets the index of this berry. */
	public int geIndex() {
		return index;
	}

	/** Sets the index of this berry. */
	public BerryAttribute setIndex(int index) {
		this.index = index;
		return this;
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

	/** Gets the firmness of this berry. */
	public String getFirmness() {
	    return this.firmness;
	}

	/** Sets the firmness of this berry. */
	public BerryAttribute setFirmness(String firmness) {
	    this.firmness = firmness;
	    return this;
	}

	/** Gets the amount of bitter flavor for this berry. */
	public int getBitterFlavor() {
		return flavors.get(Taste.BITTER);
	}

	/** Sets the amount of bitter flavor for this berry. */
	public BerryAttribute setBitterFlavor(int flavor) {
		flavors.put(Taste.BITTER, flavor);
		return this;
	}

	/** Gets the amount of dry flavor for this berry. */
	public int getDryFlavor() {
		return flavors.get(Taste.DRY);
	}

	/** Sets the amount of dry flavor for this berry. */
	public BerryAttribute setDryFlavor(int flavor) {
		flavors.put(Taste.DRY, flavor);
		return this;
	}

	/** Gets the amount of sour flavor for this berry. */
	public int getSourFlavor() {
		return flavors.get(Taste.SOUR);
	}

	/** Sets the amount of sour flavor for this berry. */
	public BerryAttribute setSourFlavor(int flavor) {
		flavors.put(Taste.SOUR, flavor);
		return this;
	}

	/** Gets the amount of spicy flavor for this berry. */
	public int getSpicyFlavor() {
		return flavors.get(Taste.SPICY);
	}

	/** Sets the amount of spicy flavor for this berry. */
	public BerryAttribute setSpicyFlavor(int flavor) {
		flavors.put(Taste.SPICY, flavor);
		return this;
	}

	/** Gets the amount of sweet flavor for this berry. */
	public int getSweetFlavor() {
		return flavors.get(Taste.SWEET);
	}

	/** Sets the amount of sweet flavor for this berry. */
	public BerryAttribute setSweetFlavor(int flavor) {
		flavors.put(Taste.SWEET, flavor);
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
}