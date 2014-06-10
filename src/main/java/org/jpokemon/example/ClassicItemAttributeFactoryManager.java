package org.jpokemon.example;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;
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
public class ClassicItemAttributeFactoryManager extends SimpleItemAttributeFactoryManager {
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
