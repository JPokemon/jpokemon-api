package org.jpokemon.pmapi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.jpokemon.pmapi.pokemon.PokemonSpecies;

/**
 * Tests some species properties.
 *
 * @author atheriel@gmail.com
 *
 * @since 0.1
 */
@RunWith(JUnit4.class)
public class PokemonTest {

	/** Tests registration and retrieval of base stats. */
	@Test
	public void testBaseStats() {
		PokemonSpecies species = new PokemonSpecies();
		species.setBaseStat("Attack", 47);
		assertTrue("Attack base stat is 47.", species.getBaseStat("Attack") == 47);
	}
}
