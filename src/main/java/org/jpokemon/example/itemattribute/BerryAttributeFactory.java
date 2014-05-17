package org.jpokemon.example.itemattribute;

import java.util.Map;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link BerryAttribute BerryAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class BerryAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public BerryAttributeFactory() {
	}

	@Override
	public Class<BerryAttribute> getItemAttributeClass() {
		return BerryAttribute.class;
	}

	@Override
	public Object buildItemAttribute(String optionString) throws JPokemonException {
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
		} catch (NumberFormatException e) {
			// Too hard to actually tell why this failed
			throw new JPokemonException(e);
		} catch (IndexOutOfBoundsException e) {
			// Too hard to actually tell why this failed
			throw new JPokemonException(e);
		}

		return berryAttribute;
	}

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException {
		if (!(object instanceof BerryAttribute)) {
			throw new JPokemonException("Expected berry item attribute object: " + object);
		}

		BerryAttribute berryAttribute = (BerryAttribute) object;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(berryAttribute.getGrowthTime());
		for (Map.Entry<String, Integer> flavorAssignment : berryAttribute.getFlavors().entrySet()) {
			stringBuilder.append(',');
			stringBuilder.append(flavorAssignment.getKey());
			stringBuilder.append('=');
			stringBuilder.append(flavorAssignment.getValue());
		}

		return stringBuilder.toString();
	}
}
