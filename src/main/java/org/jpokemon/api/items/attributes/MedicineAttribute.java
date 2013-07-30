package org.jpokemon.api.items.attributes;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;
import org.jpokemon.api.items.ItemAttribute;

public class MedicineAttribute implements ItemAttribute {
	/** Indicates the stat that this medicine affects */
	private String stat;

	/** Indicates the strength of this medicine */
	private int strength;

	/** Indicates whether this medicine will wear off */
	private boolean permanent;

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
	public void applyAttribute(Item item) {
		if (item.hasProperty("medicine")) {
			throw new JPokemonError("Redefinition of property (medicine) with item : " + item.toString());
		}
		item.setProperty("medicine", stat);

		if (item.hasProperty("medicinestrength")) {
			throw new JPokemonError("Redefinition of property (medicinestrength) with item : " + item.toString());
		}
		item.setProperty("medicinestrength", strength + "");

		if (item.hasProperty("permanent")) {
			throw new JPokemonError("Redefinition of property (permanent) with item : " + item.toString());
		}
		item.setProperty("permanent", permanent + "");
	}

	public static MedicineAttribute getFromItem(Item item) {
		MedicineAttribute ma = new MedicineAttribute();

		if (!item.hasProperty("medicine")) {
			throw new JPokemonError("Missing property (medicine) from item : " + item.toString());
		}
		ma.setStat(item.getProperty("medicine"));

		if (!item.hasProperty("medicinestrength")) {
			throw new JPokemonError("Missing property (medicinestrength) from item : " + item.toString());
		}
		ma.setStrength(Integer.parseInt(item.getProperty("medicine")));

		if (!item.hasProperty("permanent")) {
			throw new JPokemonError("Missing property (permanent) from item : " + item.toString());
		}
		ma.setPermanent(Boolean.parseBoolean(item.getProperty("permanent")));

		return ma;
	}
}