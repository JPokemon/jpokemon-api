package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

public class PokedexTest extends TestCase {
	@Test
	public void testSeen() {
		String pokemon1 = "FooPokemon";
		Pokedex pokedex = new Pokedex();
		assertNotNull(pokedex.getSeen());
		assertFalse(pokedex.isSeen(pokemon1));

		pokedex.setSeen(pokemon1);
		assertTrue(pokedex.isSeen(pokemon1));
		assertEquals(1, pokedex.getSeen().size());
		assertEquals(pokemon1, pokedex.getSeen().get(0));

		pokedex.removeStatus(pokemon1);
		assertFalse(pokedex.isSeen(pokemon1));
	}

	@Test
	public void testOwned() {
		String pokemon1 = "FooPokemon";
		Pokedex pokedex = new Pokedex();
		assertNotNull(pokedex.getOwned());
		assertFalse(pokedex.isOwned(pokemon1));

		pokedex.setOwned(pokemon1);
		assertTrue(pokedex.isOwned(pokemon1));
		assertEquals(1, pokedex.getOwned().size());
		assertEquals(pokemon1, pokedex.getOwned().get(0));

		pokedex.removeStatus(pokemon1);
		assertFalse(pokedex.isOwned(pokemon1));
	}

	@Test
	public void testSeenOwnedCollision() {
		String pokemon1 = "FooPokemon";
		Pokedex pokedex = new Pokedex();
		assertNotNull(pokedex.getSeen());
		assertNotNull(pokedex.getOwned());
		assertFalse(pokedex.isSeen(pokemon1));
		assertFalse(pokedex.isOwned(pokemon1));

		pokedex.setSeen(pokemon1);
		assertTrue(pokedex.isSeen(pokemon1));
		assertFalse(pokedex.isOwned(pokemon1));

		pokedex.setOwned(pokemon1);
		assertFalse(pokedex.isSeen(pokemon1));
		assertTrue(pokedex.isOwned(pokemon1));
	}
}
