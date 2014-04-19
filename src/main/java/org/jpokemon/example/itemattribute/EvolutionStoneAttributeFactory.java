package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link EvolutionStoneAttribute EvolutionStoneAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class EvolutionStoneAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "evolutionstone";

	/** Provides the default constructor */
	public EvolutionStoneAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
	}

	@Override
	public Object buildItemAttribute(String options) {
		EvolutionStoneAttribute evolutionStoneAttribute = new EvolutionStoneAttribute();
		evolutionStoneAttribute.setType(options);
		return evolutionStoneAttribute;
	}
}
