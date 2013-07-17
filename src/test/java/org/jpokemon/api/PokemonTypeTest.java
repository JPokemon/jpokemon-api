package org.jpokemon.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.jpokemon.api.manager.ClassicTypes;
import org.jpokemon.api.types.*;

/**
 * Tests type properties and the use of ClassicTypes.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 */
@RunWith(JUnit4.class)
public class PokemonTypeTest {

	@BeforeClass
	public static void setup() {
		// Setup the hard-coded classic types
		// PokemonType.manager may be defined by other tests, so make sure we replace the reference
		PokemonType.manager = null;
		ClassicTypes.init();
	}

	/** Tests some properties of classic types. */
	@Test
	public void testClassicTypes() {
		assertTrue("Dark is known.", PokemonType.manager.isRegistered(ClassicTypes.DARK));
		assertTrue("Normal is ineffective against Ghost.", PokemonType.manager.getByName("Normal").isIneffectiveAgainst("Ghost"));
		assertFalse("Normal is not super-effective against Fighting.", PokemonType.manager.getByName("Normal").isSuperEffectiveAgainst("Fighting"));
	}

	/** Creates a new type and tests that it has been registered. */
	@Test
	public void testTypeAddition() {
		PokemonType test = new PokemonType().setName("Test");

		// Presently, the PokemonType is registered on setName
		// PokemonType.manager.register(test);

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
