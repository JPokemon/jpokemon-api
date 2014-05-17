package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link MedicineAttribute MedicineAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MedicineAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public MedicineAttributeFactory() {
	}

	@Override
	public Class<MedicineAttribute> getItemAttributeClass() {
		return MedicineAttribute.class;
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

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException {
		if (!(object instanceof MedicineAttribute)) {
			throw new JPokemonException("Expected medicine item attribute object: " + object);
		}

		MedicineAttribute medicineAttribute = (MedicineAttribute) object;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(medicineAttribute.getStat());
		stringBuilder.append(',');
		stringBuilder.append(medicineAttribute.getStrength());
		stringBuilder.append(',');
		stringBuilder.append(medicineAttribute.isPermanent());

		return stringBuilder.toString();
	}
}
