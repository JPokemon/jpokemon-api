package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.PocketAttribute;

public class PocketAttributeFactory extends ItemAttributeFactory {
	public PocketAttributeFactory() {
	}

	@Override
	public String getName() {
		return "pocket";
	}

	@Override
	public Object buildItemAttribute(String options) {
		PocketAttribute pocketAttribute = new PocketAttribute();
		pocketAttribute.setPocketName(options);
		return pocketAttribute;
	}
}