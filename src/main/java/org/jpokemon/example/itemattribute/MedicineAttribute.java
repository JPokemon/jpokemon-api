package org.jpokemon.example.itemattribute;

/**
 * Provides a possible attribute describing qualities of medicine items,
 * including stat affected, medicine strength, and permanence.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of MedicineAttribute!
 * This is to prevent an Item from storing multiple MedicineAttributes. It is
 * strongly advised to overwrite equals in subclasses of MedicineAttributes.
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

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
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