package org.jpokemon.example.itemattribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a possible attribute describing qualities of berry items, including
 * growth rate and flavors.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of BerryAttribute! This
 * is to prevent an Item from storing multiple BerryAttributes. It is strongly
 * advised to overwrite equals in subclasses of BerryAttribute.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class BerryAttribute {
	/** Indicates the time it takes to grow this berry */
	protected String growthTime;

	/** Indicates the flavors of this berry */
	protected Map<String, Integer> flavors;

	/** Provides the default constructor. */
	public BerryAttribute() {
	}

	/** Gets the amount of time this berry requires to grow */
	public String getGrowthTime() {
		return growthTime;
	}

	/** Sets the amount of time this berry requires to grow */
	public void setGrowthTime(String growthTime) {
		this.growthTime = growthTime;
	}

	/** Gets the amount of flavor for the given flavor. */
	public int getFlavor(String flavor) {
		if (flavors == null || !flavors.containsKey(flavor)) {
			return -1;
		}

		return flavors.get(flavor);
	}

	/** Sets the amount of bitter flavor for this berry. */
	public BerryAttribute setFlavor(String flavor, int strength) {
		if (flavors == null) {
			flavors = new HashMap<String, Integer>();
		}
		flavors.put(flavor, strength);
		return this;
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return o.getClass().equals(this.getClass());
	}
}