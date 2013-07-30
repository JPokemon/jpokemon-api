package org.jpokemon.api.items.attributes;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.items.Item;
import org.jpokemon.api.items.ItemAttribute;

public class EvolutionStoneAttribute implements ItemAttribute {
	private String type;

	public EvolutionStoneAttribute() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void applyAttribute(Item item) {
		if (item.hasProperty("evolutionstone")) {
			throw new JPokemonError("Redefinition of property (evolutionstone) with item : " + item.toString());
		}
		item.setProperty("evolutionstone", type);
	}

	public static EvolutionStoneAttribute getFromItem(Item item) {
		EvolutionStoneAttribute esa = new EvolutionStoneAttribute();

		if (!item.hasProperty("evolutionstone")) {
			throw new JPokemonError("Missing property (evolutionstone) from item : " + item.toString());
		}
		esa.setType(item.getProperty("evolutionstone"));

		return esa;
	}
}