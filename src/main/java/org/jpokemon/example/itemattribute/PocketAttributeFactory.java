package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

public class PocketAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "pocket";

	/** Provides the default constructor */
	public PocketAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
	}

	@Override
	public Object buildItemAttribute(String options) {
		PocketAttribute pocketAttribute = new PocketAttribute();
		pocketAttribute.setPocketName(options);
		return pocketAttribute;
	}
}
