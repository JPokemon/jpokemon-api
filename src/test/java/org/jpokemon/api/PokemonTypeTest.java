package org.jpokemon.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.api.types.*;
import org.jpokemon.api.classic.ClassicTypes;

/**
 * Tests type properties and the use of ClassicTypes.
 * 
 * @author atheriel@gmail.com
 * @author Zack Taylor
 */
@RunWith(JUnit4.class)
public class PokemonTypeTest {

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

	/** Tests setting type effectiveness (i.e. "Super-effective"). */
	@Test
	public void testEffectivenessCollision() {
		PokemonType t1 = new PokemonType().setName("Type1");
		new PokemonType().setName("Type2");
		
		t1.setSuperEffectiveAgainst("Type2", "OtherType");
		assertTrue("Type effectivity saved", t1.isSuperEffectiveAgainst("Type2"));

		t1.setIneffectiveAgainst("Type2");
		assertTrue("Ineffective overrides Super Effective", !t1.isSuperEffectiveAgainst("Type2"));
		assertTrue("Ineffective overrides Super Effective", t1.isIneffectiveAgainst("Type2"));
	}
}
