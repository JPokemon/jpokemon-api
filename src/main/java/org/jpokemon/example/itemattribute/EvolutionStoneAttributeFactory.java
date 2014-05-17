package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link EvolutionStoneAttribute EvolutionStoneAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class EvolutionStoneAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public EvolutionStoneAttributeFactory() {
	}

	@Override
	public Class<EvolutionStoneAttribute> getItemAttributeClass() {
		return EvolutionStoneAttribute.class;
	}

	@Override
	public Object buildItemAttribute(String options) {
		EvolutionStoneAttribute evolutionStoneAttribute = new EvolutionStoneAttribute();
		evolutionStoneAttribute.setType(options);
		return evolutionStoneAttribute;
	}

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException  {
		if (!(object instanceof EvolutionStoneAttribute)) {
			throw new JPokemonException("Expected evolution stone item attribute object: " + object);
		}

		EvolutionStoneAttribute evolutionStoneAttribute = (EvolutionStoneAttribute) object;
		return evolutionStoneAttribute.getType();
	}
}
