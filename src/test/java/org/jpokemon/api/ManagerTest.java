package org.jpokemon.api;

import static org.junit.Assert.assertTrue;

import org.jpokemon.api.types.PokemonType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests the management of classes. This test uses the PokemonType class as an
 * example of a managed class.
 * 
 * @author atheriel@gmail.com
 */
@RunWith(JUnit4.class)
public class ManagerTest {
	static Manager<PokemonType> manager;
	static PokemonType type;

	@BeforeClass
	public static void setup() {
		type = new PokemonType();

		// Other tests define PokemonType.manager, so SimpleManager instantiation has problems...
		PokemonType.manager = null;
		manager = new SimpleManager<PokemonType>(PokemonType.class);

		type.setName("TestType"); // automatically registers it?
	}

	/**
	 * Verifies that only a single manager can be defined for a managed class.
	 */
	@Test(expected = JPokemonError.class)
	public void testEnforcedSingleManagement() {
		SimpleManager<PokemonType> manager2 = new SimpleManager<PokemonType>(PokemonType.class);
	}

	/**
	 * Checks if an object can be properly registered.
	 */
	@Test
	public void testManagement() {
		assertTrue(manager.isRegistered(type));
		assertTrue(manager.getByName("TestType") == type);
	}

	/**
	 * Checks that only one object may be registered under a given name.
	 */
	@Test(expected = JPokemonError.class)
	public void testManagementConflicts() {
		PokemonType type2 = new PokemonType();
		type2.setName("TestType"); // automatically registers it
	}

	/**
	 * Checks that only objects with names can be registered.
	 */
	@Test(expected = JPokemonError.class)
	public void testNameRequirement() {
		PokemonType type2 = new PokemonType();
		manager.register(type2);
	}
}
