package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.MedicineAttribute;

public class MedicineAttributeFactory extends ItemAttributeFactory {
	public MedicineAttributeFactory() {
	}

	@Override
	public String getName() {
		return "medicine";
	}

	@Override
	public Object buildItemAttribute(String optionString) {
		MedicineAttribute medicineAttribute = new MedicineAttribute();

		try {
			String[] options = optionString.split(",");

			String stat = options[0];
			medicineAttribute.setStat(stat);

			int strength = Integer.parseInt(options[1]);
			medicineAttribute.setStrength(strength);

			boolean permanent = Boolean.parseBoolean(options[2]);
			medicineAttribute.setPermanent(permanent);
		}
		catch (NumberFormatException e) { // TODO - log
		}
		catch (IndexOutOfBoundsException e) { // TODO - log
		}

		return medicineAttribute;
	}
}