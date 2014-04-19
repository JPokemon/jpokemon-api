package org.jpokemon.example.itemattribute;

/**
 * Provides a possible item attribute describing qualities of medicine items,
 * including stat affected, medicine strength, and permanence.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true when the object in question is the same
 * class as this. This is to prevent an Item from storing multiple
 * MedicineAttributes.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MedicineAttribute {
	/** Indicates the stat that this medicine affects */
	protected String stat;

	/** Indicates the strength of this medicine */
	protected int strength;

	/** Indicates whether this medicine will wear off */
	protected boolean permanent;

	/** Provides the default constructor */
	public MedicineAttribute() {
	}

	/** Gets the stat that this medicine affects */
	public String getStat() {
		return stat;
	}

	/** Sets the stat that this medicine affects */
	public void setStat(String stat) {
		this.stat = stat;
	}

	/** Gets the strength of this medicine */
	public int getStrength() {
		return strength;
	}

	/** Sets the strength of this medicine */
	public MedicineAttribute setStrength(int strength) {
		this.strength = strength;
		return this;
	}

	/** Gets whether this medicine will wear off */
	public boolean isPermanent() {
		return permanent;
	}

	/** Sets whether this medicine will wear off */
	public MedicineAttribute setPermanent(boolean permanent) {
		this.permanent = permanent;
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