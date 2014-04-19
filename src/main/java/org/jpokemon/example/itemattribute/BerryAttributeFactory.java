package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link BerryAttribute BerryAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class BerryAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "berry";

	/** Provides the default constructor */
	public BerryAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
	}

	@Override
	public Object buildItemAttribute(String optionString) {
		BerryAttribute berryAttribute = new BerryAttribute();

		try {
			String[] options = optionString.split(",");
			int growthTime = Integer.parseInt(options[0]);
			berryAttribute.setGrowthTime(growthTime + "");

			for (int i = 1; i < options.length; i++) {
				String[] flavorAssignment = options[i].split("=");
				String flavor = flavorAssignment[0];
				int strength = Integer.parseInt(flavorAssignment[1]);
				berryAttribute.setFlavor(flavor, strength);
			}
		} catch (NumberFormatException e) { // TODO - log
		} catch (IndexOutOfBoundsException e) { // TODO - log
		}

		return berryAttribute;
	}
}
