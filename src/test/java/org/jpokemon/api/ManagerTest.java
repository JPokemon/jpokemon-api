package org.jpokemon.api;

import static org.junit.Assert.assertTrue;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.manager.Manager;
import org.jpokemon.api.manager.SimpleManager;
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
	static Manager<Type> manager;
	static Type type;

	@BeforeClass
	public static void setup() {
		type = new Type();

		// Other tests define PokemonType.manager, so SimpleManager instantiation has problems...
		Type.manager = null;
		manager = new SimpleManager<Type>(Type.class);

		type.setName("TestType"); // automatically registers it?
	}

	/**
	 * Verifies that only a single manager can be defined for a managed class.
	 */
	@Test(expected = JPokemonError.class)
	public void testEnforcedSingleManagement() {
		SimpleManager<Type> manager2 = new SimpleManager<Type>(Type.class);
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
		Type type2 = new Type();
		type2.setName("TestType"); // automatically registers it
	}

	/**
	 * Checks that only objects with names can be registered.
	 */
	@Test(expected = JPokemonError.class)
	public void testNameRequirement() {
		Type type2 = new Type();
		manager.register(type2);
	}
}
