package org.jpokemon.example.itemattribute;

/**
 * Provides a possible attribute describing qualities of evolution stone items,
 * namely its' type.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of
 * EvolutionStoneAttribute! This is to prevent an Item from storing multiple
 * EvolutionStoneAttributes. It is strongly advised to overwrite equals in
 * subclasses of EvolutionStoneAttribute.
 * 
 * @author Zach Taylor
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

	public void setType(String type) {
		this.type = type;
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