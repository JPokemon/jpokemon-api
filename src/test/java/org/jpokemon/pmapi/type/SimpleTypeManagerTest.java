package org.jpokemon.pmapi.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.pmapi.type.ClassicTypes;
import org.jpokemon.pmapi.type.PokemonType;

/**
 * Tests type registration and some classic type properties.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
@RunWith(JUnit4.class)
public class SimpleTypeManagerTest {

	@BeforeClass
	public static void setup() {
		// Instantiate and link all classic types with SimpleTypeManager
		SimpleTypeManager.init();
		ClassicTypes.init();
	}

	/** Tests some properties of classic types. */
	@Test
	public void testClassicTypes() {
		assertTrue("Dark is known.", PokemonType.manager.isRegistered(ClassicTypes.DARK));
		assertTrue("Normal is ineffective against Ghost.", PokemonType.manager.getTypeByName("Normal").isIneffectiveAgainst("Ghost"));
		assertFalse("Normal is not super-effective against Fighting.", PokemonType.manager.getTypeByName("Normal").isSuperEffectiveAgainst("Fighting"));
	}

	/** Creates a new type and tests that it has been registered. */
	@Test
	public void testTypeAddition() {
		PokemonType test = new PokemonType().setName("Test");
		PokemonType.manager.registerType(test);
		assertTrue("Test is now a type.", PokemonType.manager.isRegistered(test));
	}
}