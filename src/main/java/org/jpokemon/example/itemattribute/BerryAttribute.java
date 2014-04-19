package org.jpokemon.example.itemattribute;

import java.util.HashMap;
import java.util.Map;

/**
 * Provides a possible item attribute describing qualities of berry items,
 * including growth rate and flavors.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true when the object in question is the same
 * class as this. This is to prevent an Item from storing multiple
 * BerryAttributes.
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class BerryAttribute {
	/** Indicates the time it takes to grow this berry */
	protected String growthTime;

	/** Indicates the flavors of this berry */
	protected Map<String, Integer> flavors;

	/** Provides the default constructor */
	public BerryAttribute() {
	}

	/** Gets the amount of time this berry requires to grow */
	public String getGrowthTime() {
		return growthTime;
	}

	/** Sets the amount of time this berry requires to grow */
	public BerryAttribute setGrowthTime(String growthTime) {
		this.growthTime = growthTime;
		return this;
	}

	/** Gets the amount of flavor for the given flavor. */
	public int getFlavor(String flavor) {
		if (flavors == null || !flavors.containsKey(flavor)) {
			return -1;
		}

		return flavors.get(flavor);
	}

	/** Sets the amount of bitter flavor for this berry */
	public BerryAttribute setFlavor(String flavor, int strength) {
		if (flavors == null) {
			flavors = new HashMap<String, Integer>();
		}
		flavors.put(flavor, strength);
		return this;
	}

	/** Gets all flavor strengths for this berry */
	public Map<String, Integer> getFlavors() {
		return flavors;
	}

	/** Sets all flavor strengths for this berry */
	public BerryAttribute setFlavors(Map<String, Integer> flavors) {
		this.flavors = flavors;
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
