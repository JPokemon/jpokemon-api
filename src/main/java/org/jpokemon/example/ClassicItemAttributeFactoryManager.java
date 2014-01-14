package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.Manager;
import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.example.itemattribute.factory.BallAttributeFactory;
import org.jpokemon.example.itemattribute.factory.BerryAttributeFactory;
import org.jpokemon.example.itemattribute.factory.EvolutionStoneAttributeFactory;
import org.jpokemon.example.itemattribute.factory.MachineAttributeFactory;
import org.jpokemon.example.itemattribute.factory.MedicineAttributeFactory;
import org.jpokemon.example.itemattribute.factory.PocketAttributeFactory;

public class ClassicItemAttributeFactoryManager implements Manager<ItemAttributeFactory> {
	protected Map<String, ItemAttributeFactory> itemAttributeFactories = new HashMap<String, ItemAttributeFactory>();

	public ClassicItemAttributeFactoryManager() {
		register(new BallAttributeFactory());
		register(new BerryAttributeFactory());
		register(new EvolutionStoneAttributeFactory());
		register(new MachineAttributeFactory());
		register(new MedicineAttributeFactory());
		register(new PocketAttributeFactory());
	}

	@Override
	public boolean register(ItemAttributeFactory itemAttributeFactory) throws JPokemonError {
		if (isRegistered(itemAttributeFactory)) {
			throw new JPokemonError("Item Attribute Factory already registered: " + itemAttributeFactory.toString());
		}

		itemAttributeFactories.put(itemAttributeFactory.getName(), itemAttributeFactory);
		return true;
	}

	@Override
	public boolean isRegistered(ItemAttributeFactory itemAttributeFactory) {
		if (itemAttributeFactory == null) {
			return false;
		}

		return getByName(itemAttributeFactory.getName()) != null;
	}

	@Override
	public ItemAttributeFactory getByName(String name) {
		return itemAttributeFactories.get(name);
	}
}