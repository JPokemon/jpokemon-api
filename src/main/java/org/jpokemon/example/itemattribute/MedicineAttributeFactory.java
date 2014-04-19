package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link MedicineAttribute MedicineAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MedicineAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "medicine";

	/** Provides the default constructor */
	public MedicineAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
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
		} catch (NumberFormatException e) { // TODO - log
		} catch (IndexOutOfBoundsException e) { // TODO - log
		}

		return medicineAttribute;
	}
}
