package org.jpokemon.pmapi.type;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PokemonTypeTest {
	@Test
	public void testEffectivityCollision() {
		PokemonType t1 = new PokemonType().setName("Type1");
		new PokemonType().setName("Type2");

		t1.setSuperEffectiveAgainst("Type2");

		assertTrue("Type effectivity saved", t1.isSuperEffectiveAgainst("Type2"));

		t1.setIneffectiveAgainst("Type2");

		assertTrue("Ineffective overrides Super Effective", !t1.isSuperEffectiveAgainst("Type2"));
		assertTrue("Ineffective overrides Super Effective", t1.isIneffectiveAgainst("Type2"));
	}
}