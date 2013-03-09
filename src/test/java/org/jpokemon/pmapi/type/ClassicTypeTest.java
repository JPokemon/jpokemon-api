package org.jpokemon.pmapi.type;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.pmapi.JPokemonException;
import org.jpokemon.pmapi.type.ClassicTypes;
import org.jpokemon.pmapi.type.PokemonType;

/**
 * Tests type registration and some classic type properties.
 *
 * @author Atheriel
 *
 * @since  Alpha
 */
@RunWith(JUnit4.class)
public class ClassicTypeTest {

	@BeforeClass
	public static void setup() {
		ClassicTypes.init();
	}

	/**
	 * Tests some properties of classic types.
	 */
	@Test
	public void testClassicTypes() {
		assertTrue("Dark is known.", ClassicTypes.isKnown("Dark"));
		assertTrue("Normal is ineffective against Ghost.", ClassicTypes.getType("Normal").isIneffectiveAgainst("Ghost"));
		assertFalse("Normal is not super-effective against Fighting.", ClassicTypes.getType("Normal").isSuperEffectiveAgainst("Fighting"));
	}

	/**
	 * Creates a new type and tests that it has been registered.
	 */
	@Test
	public void testTypeAddition() {
		try {
			PokemonType test = new PokemonType();
			test.setName("Test");			
		} catch(JPokemonException e) {}
		assertTrue("Test is now a type.", ClassicTypes.isKnown("Test"));
	}
}