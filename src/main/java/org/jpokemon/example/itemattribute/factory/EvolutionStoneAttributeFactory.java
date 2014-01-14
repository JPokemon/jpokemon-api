package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.EvolutionStoneAttribute;

public class EvolutionStoneAttributeFactory extends ItemAttributeFactory {
	public EvolutionStoneAttributeFactory() {
	}

	@Override
	public String getName() {
		return "evolutionstone";
	}

	@Override
	public Object buildItemAttribute(String options) {
		EvolutionStoneAttribute evolutionStoneAttribute = new EvolutionStoneAttribute();
		evolutionStoneAttribute.setType(options);
		return evolutionStoneAttribute;
	}
}