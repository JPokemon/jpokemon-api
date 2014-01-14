package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.BallAttribute;

public class BallAttributeFactory extends ItemAttributeFactory {
	public BallAttributeFactory() {
	}

	@Override
	public String getName() {
		return "ball";
	}

	@Override
	public Object buildItemAttribute(String options) {
		BallAttribute ballAttribute = new BallAttribute();

		try {
			int catchRate = Integer.parseInt(options);
			ballAttribute.setCatchRate(catchRate);
		}
		catch (NumberFormatException e) { // TODO - log
		}

		return ballAttribute;
	}
}