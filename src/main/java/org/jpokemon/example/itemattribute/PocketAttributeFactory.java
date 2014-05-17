package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

public class PocketAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public PocketAttributeFactory() {
	}

	@Override
	public Class<PocketAttribute> getItemAttributeClass() {
		return PocketAttribute.class;
	}

	@Override
	public Object buildItemAttribute(String options) {
		PocketAttribute pocketAttribute = new PocketAttribute();
		pocketAttribute.setPocketName(options);
		return pocketAttribute;
	}

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException {
		if (!(object instanceof PocketAttribute)) {
			throw new JPokemonException("Expected pocket item attribute object: " + object);
		}

		PocketAttribute pocketAttribute = (PocketAttribute) object;
		return pocketAttribute.getPocketName();
	}
}
