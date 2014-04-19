package org.jpokemon.example.itemattribute;

/**
 * Provides a possible item attribute describing qualities of evolution stone
 * items, namely its' type.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true when the object in question is the same
 * class as this. This is to prevent an Item from storing multiple
 * EvolutionStoneAttributes.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class EvolutionStoneAttribute {
	/** Indicates the type that evolves with this evolution stone item */
	protected String type;

	public EvolutionStoneAttribute() {
	}

	public String getType() {
		return type;
	}

	public EvolutionStoneAttribute setType(String type) {
		this.type = type;
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
