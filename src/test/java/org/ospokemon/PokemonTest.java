package org.ospokemon;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.ospokemon.Species;

/**
 * Tests some species properties.
 *
 * @author atheriel@gmail.com
 */
@RunWith(JUnit4.class)
public class PokemonTest {

	/** Tests registration and retrieval of base stats. */
	@Test
	public void testBaseStats() {
		Species species = new Species();
		species.setBaseStat("Attack", 47);
		assertTrue("Attack base stat is 47.", species.getBaseStat("Attack") == 47);
	}
}
