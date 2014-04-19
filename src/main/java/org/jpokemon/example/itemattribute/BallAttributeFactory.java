package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link BallAttribute BallAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class BallAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "ball";

	/** Provides the default constructor */
	public BallAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
	}

	@Override
	public Object buildItemAttribute(String options) {
		BallAttribute ballAttribute = new BallAttribute();

		try {
			int catchRate = Integer.parseInt(options);
			ballAttribute.setCatchRate(catchRate);
		} catch (NumberFormatException e) { // TODO - log
		}

		return ballAttribute;
	}
}
