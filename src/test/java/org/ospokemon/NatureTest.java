package org.ospokemon;

import junit.framework.TestCase;

import org.junit.Test;
import org.ospokemon.Nature;

public class NatureTest extends TestCase {
	@Test
	public void testName() {
		String natureName = "FooNature";
		Nature nature = new Nature();
		nature.setName(natureName);
		assertEquals(natureName, nature.getName());
	}

	@Test
	public void testStatIncreased() {
		String statIncreased = "FooStat";
		Nature nature = new Nature();
		nature.setStatIncreased(statIncreased);
		assertEquals(statIncreased, nature.getStatIncreased());
	}

	@Test
	public void testStatDecreased() {
		String statDecreased = "BarStat";
		Nature nature = new Nature();
		nature.setStatDecreased(statDecreased);
		assertEquals(statDecreased, nature.getStatDecreased());
	}

	@Test
	public void testFlavorFavorite() {
		String flavorFavorite = "FooFlavor";
		Nature nature = new Nature();
		nature.setFlavorFavorite(flavorFavorite);
		assertEquals(flavorFavorite, nature.getFlavorFavorite());
	}

	@Test
	public void testFlavorDisliked() {
		String flavorDisliked = "BarFlavor";
		Nature nature = new Nature();
		nature.setFlavorDisliked(flavorDisliked);
		assertEquals(flavorDisliked, nature.getFlavorDisliked());
	}
}
