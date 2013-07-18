package org.jpokemon.api;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.jpokemon.api.classic.ClassicTypes;
import org.jpokemon.api.managers.SimpleTypeManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests type properties and the use of ClassicTypes.
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 */
@RunWith(JUnit4.class)
public class PokemonTypeTest {

	/** Tests some properties of classic types. */
	@Test
	public void testClassicTypes() {
		Type.manager = new SimpleTypeManager();

		assertTrue("Dark is known.", Type.manager.isRegistered(ClassicTypes.DARK));
		assertTrue("Normal is ineffective against Ghost.", Type.manager.getByName("Normal").isIneffectiveAgainst("Ghost"));
		assertFalse("Normal is not super-effective against Fighting.", Type.manager.getByName("Normal").isSuperEffectiveAgainst("Fighting"));
	}

	/** Creates a new type and tests that it has been registered. */
	@Test
	public void testTypeAddition() {
		Manager<Type> manager = new SimpleTypeManager();
		Type test = new Type().setName("Test");
		manager.register(test);

		assertTrue("Test is now a type.", manager.isRegistered(test));
	}

	/** Tests setting type effectiveness (i.e. "Super-effective"). */
	@Test
	public void testEffectivenessCollision() {
		Manager<Type> manager = new SimpleTypeManager();
		Type t1 = new Type().setName("Type1");
		Type t2 = new Type().setName("Type2");
		manager.register(t1);
		manager.register(t2);

		t1.setSuperEffectiveAgainst("Type2", "OtherType");
		assertTrue("Type effectivity saved", t1.isSuperEffectiveAgainst("Type2"));

		t1.setIneffectiveAgainst("Type2");
		assertTrue("Ineffective overrides Super Effective", !t1.isSuperEffectiveAgainst("Type2"));
		assertTrue("Ineffective overrides Super Effective", t1.isIneffectiveAgainst("Type2"));
	}
}
