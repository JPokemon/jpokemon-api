package org.jpokemon.example.itemattribute;

import java.util.HashMap;
import java.util.Map;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;
import org.jpokemon.api.Manager;

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
	public static final String BALL_ATTRIBUTE_FACTORY = BallAttributeFactory.ITEM_ATTRIBUTE_NAME;

	/** Indicates the name of the berry attribute factory */
	public static final String BERRY_ATTRIBUTE_FACTORY = BerryAttributeFactory.ITEM_ATTRIBUTE_NAME;

	/** Indicates the name of the evolution stone attribute factory */
	public static final String EVOLUTION_STONE_ATTRIBUTE_FACTORY = EvolutionStoneAttributeFactory.ITEM_ATTRIBUTE_NAME;

	/** Indicates the name of the machine attribute factory */
	public static final String MACHINE_ATTRIBUTE_FACTORY = MachineAttributeFactory.ITEM_ATTRIBUTE_NAME;

	/** Indicates the name of the medicine attribute factory */
	public static final String MEDICINE_ATTRIBUTE_FACTORY = MedicineAttributeFactory.ITEM_ATTRIBUTE_NAME;

	/** Indicates the name of the pocket attribute factory */
	public static final String POCKET_ATTRIBUTE_FACTORY = PocketAttributeFactory.ITEM_ATTRIBUTE_NAME;

	public ClassicItemAttributeFactoryManager() {
		register(new BallAttributeFactory());
		register(new BerryAttributeFactory());
		register(new EvolutionStoneAttributeFactory());
		register(new MachineAttributeFactory());
		register(new MedicineAttributeFactory());
		register(new PocketAttributeFactory());
	}

	@Override
	public void register(ItemAttributeFactory itemAttributeFactory) throws JPokemonException {
		if (itemAttributeFactory == null) {
			throw new JPokemonException("Cannot register null item attribute factory");
		}
		else if (itemAttributeFactory.getName() == null) {
			throw new JPokemonException("Cannot register item attribute factory without a name: " + itemAttributeFactory);
		}
		else if (itemAttributeFactories.containsKey(itemAttributeFactory.getName())
				&& !itemAttributeFactory.equals(itemAttributeFactories.get(itemAttributeFactory.getName()))) {
			throw new JPokemonException("An item attribute factory with the same name is already registered: "
					+ itemAttributeFactory);
		}

		itemAttributeFactories.put(itemAttributeFactory.getName(), itemAttributeFactory);
	}

	@Override
	public boolean isRegistered(String itemAttributeFactoryName) {
		if (itemAttributeFactoryName == null) {
			return false;
		}

		return getByName(itemAttributeFactoryName) != null;
	}

	@Override
	public ItemAttributeFactory getByName(String name) {
		return itemAttributeFactories.get(name);
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
