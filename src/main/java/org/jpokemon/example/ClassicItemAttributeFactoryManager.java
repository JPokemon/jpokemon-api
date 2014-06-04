package org.jpokemon.example;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;
import org.jpokemon.example.itemattribute.BallAttribute;
import org.jpokemon.example.itemattribute.BallAttributeFactory;
import org.jpokemon.example.itemattribute.BerryAttribute;
import org.jpokemon.example.itemattribute.BerryAttributeFactory;
import org.jpokemon.example.itemattribute.EvolutionStoneAttribute;
import org.jpokemon.example.itemattribute.EvolutionStoneAttributeFactory;
import org.jpokemon.example.itemattribute.MachineAttribute;
import org.jpokemon.example.itemattribute.MachineAttributeFactory;
import org.jpokemon.example.itemattribute.MedicineAttribute;
import org.jpokemon.example.itemattribute.MedicineAttributeFactory;
import org.jpokemon.example.itemattribute.PocketAttribute;
import org.jpokemon.example.itemattribute.PocketAttributeFactory;

/**
 * Provides an example implementation of the
 * {@link ItemAttributeFactory#manager}, using several classic item attributes.
 * 
 * @see BallAttributeFactory
 * @see BerryAttributeFactory
 * @see EvolutionStoneAttributeFactory
 * @see MachineAttributeFactory
 * @see MedicineAttributeFactory
 * @see PocketAttributeFactory
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class ClassicItemAttributeFactoryManager implements Manager<ItemAttributeFactory> {
	protected Map<String, ItemAttributeFactory> itemAttributeFactories = new HashMap<String, ItemAttributeFactory>();

	/** Indicates the name of the ball attribute factory */
	public static final String BALL_ATTRIBUTE_FACTORY = BallAttribute.class.getName();

	/** Indicates the name of the berry attribute factory */
	public static final String BERRY_ATTRIBUTE_FACTORY = BerryAttribute.class.getName();

	/** Indicates the name of the evolution stone attribute factory */
	public static final String EVOLUTION_STONE_ATTRIBUTE_FACTORY = EvolutionStoneAttribute.class.getName();

	/** Indicates the name of the machine attribute factory */
	public static final String MACHINE_ATTRIBUTE_FACTORY = MachineAttribute.class.getName();

	/** Indicates the name of the medicine attribute factory */
	public static final String MEDICINE_ATTRIBUTE_FACTORY = MedicineAttribute.class.getName();

	/** Indicates the name of the pocket attribute factory */
	public static final String POCKET_ATTRIBUTE_FACTORY = PocketAttribute.class.getName();

	public ClassicItemAttributeFactoryManager() {
		register(new BallAttributeFactory());
		register(new BerryAttributeFactory());
		register(new EvolutionStoneAttributeFactory());
		register(new MachineAttributeFactory());
		register(new MedicineAttributeFactory());
		register(new PocketAttributeFactory());
	}

	@Override
	public boolean isRegistered(String itemAttributeFactoryName) {
		return itemAttributeFactories.containsKey(itemAttributeFactoryName);
	}

	@Override
	public void register(ItemAttributeFactory itemAttributeFactory) throws JPokemonException {
		if (itemAttributeFactory == null) {
			throw new JPokemonException("Cannot register null item attribute factory");
		}
		if (itemAttributeFactory.getItemAttributeClass() == null) {
			throw new JPokemonException("Cannot register item attribute factory without item attribute class: "
					+ itemAttributeFactory);
		}
		if (itemAttributeFactories.containsKey(itemAttributeFactory.getItemAttributeClass().getName())) {
			throw new JPokemonException("An item attribute factory with the same name is already registered: "
					+ itemAttributeFactory);
		}

		itemAttributeFactories.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public ItemAttributeFactory getByName(String name) {
		return itemAttributeFactories.get(name);
	}

	@Override
	public void update(ItemAttributeFactory itemAttributeFactory) throws JPokemonException {
		if (itemAttributeFactory == null) {
			throw new JPokemonException("Cannot register null item attribute factory");
		}
		if (itemAttributeFactory.getItemAttributeClass() == null) {
			throw new JPokemonException("Cannot register item attribute factory without item attribute class: "
					+ itemAttributeFactory);
		}
		if (!itemAttributeFactories.containsKey(itemAttributeFactory.getItemAttributeClass().getName())) {
			throw new JPokemonException("An item attribute factory with the same name is not registered: "
					+ itemAttributeFactory);
		}

		itemAttributeFactories.put(itemAttributeFactory.getItemAttributeClass().getName(), itemAttributeFactory);
	}

	@Override
	public void unregister(String itemAttributeClass) throws JPokemonException {
		if (itemAttributeClass == null) {
			throw new JPokemonException("Cannot unregister item attribute factory without item attribute class");
		}
		if (!itemAttributeFactories.containsKey(itemAttributeClass)) {
			throw new JPokemonException("There is no item attribute factory with item attribute class: " + itemAttributeClass);
		}

		itemAttributeFactories.remove(itemAttributeClass);
	}

	/**
	 * Initializes a new ClassicItemAttributeFactoryManager as the
	 * {@link ItemAttributeFactory#manager}
	 * 
	 * @throws JPokemonException If the ItemAttributeFactory.manager is already
	 *           defined
	 */
	public static void init() throws JPokemonException {
		if (ItemAttributeFactory.manager != null) {
			throw new JPokemonException("ItemAttributeFactory.manager is already defined");
		}

		ItemAttributeFactory.manager = new ClassicItemAttributeFactoryManager();
	}
}
