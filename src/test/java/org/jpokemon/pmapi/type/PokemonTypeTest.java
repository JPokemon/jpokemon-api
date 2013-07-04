package org.jpokemon.pmapi.type;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests some properties of types.
 *
 * @author Zack Taylor
 * @author atheriel@gmail.com
 *
 * @since 0.1
 */
public class PokemonTypeTest {
	
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
