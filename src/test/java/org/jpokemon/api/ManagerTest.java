package org.jpokemon.api;

import static org.junit.Assert.assertTrue;

import org.jpokemon.api.exceptions.JPokemonError;
import org.jpokemon.api.managers.SimpleManager;
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
		type = new Type().setName("TestType");

		// Other tests define PokemonType.manager, so SimpleManager instantiation has problems...
		Type.manager = null;
		manager = new SimpleManager<Type>(Type.class);

		manager.register(type);
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
	 * Checks that only objects with names can be registered.
	 */
	@Test(expected = JPokemonError.class)
	public void testNameRequirement() {
		Type type2 = new Type();
		manager.register(type2);
	}
}
