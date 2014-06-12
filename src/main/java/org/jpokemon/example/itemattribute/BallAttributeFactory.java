package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link BallAttribute BallAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class BallAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public BallAttributeFactory() {
	}

	@Override
	public Class<BallAttribute> getItemAttributeClass() {
		return BallAttribute.class;
	}

	@Override
	public Object buildItemAttribute(String options) throws JPokemonException {
		BallAttribute ballAttribute = new BallAttribute();

		try {
			int catchRate = Integer.parseInt(options);
			ballAttribute.setCatchRate(catchRate);
		} catch (NumberFormatException e) {
			throw new JPokemonException("Expected catch rate integer score: " + options);
		}

		return ballAttribute;
	}

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException {
		if (!(object instanceof BallAttribute)) {
			throw new JPokemonException("Expected ball item attribute object: " + object);
		}

		BallAttribute ballAttribute = (BallAttribute) object;
		return Integer.toString(ballAttribute.getCatchRate());
	}
}
