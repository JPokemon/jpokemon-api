package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.BerryAttribute;

public class BerryAttributeFactory extends ItemAttributeFactory {
	public BerryAttributeFactory() {
	}

	@Override
	public String getName() {
		return "berry";
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
		}
		catch (NumberFormatException e) { // TODO - log
		}
		catch (IndexOutOfBoundsException e) { // TODO - log
		}

		return berryAttribute;
	}
}