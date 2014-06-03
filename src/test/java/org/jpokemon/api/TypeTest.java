package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Tests type properties and the use of ClassicTypes.
 * 
 * @author atheriel@gmail.com
 * @author zach
 */
public class TypeTest extends TestCase {
	@Test
	public void testName() {
		String typeName = "FooType";
		Type type = new Type();
		type.setName(typeName);
		assertEquals(typeName, type.getName());
	}

	@Test
	public void testEffectiveness() {
		String typeName = "Type1";
		Type type = new Type();
		assertNotNull(type.getSuperEffectiveAgainst());
		assertEquals(0, type.getSuperEffectiveAgainst().size());
		assertNotNull(type.getNotVeryEffectiveAgainst());
		assertEquals(0, type.getNotVeryEffectiveAgainst().size());
		assertNotNull(type.getIneffectiveAgainst());
		assertEquals(0, type.getIneffectiveAgainst().size());

		type.setSuperEffectiveAgainst(typeName);
		assertEquals(1, type.getSuperEffectiveAgainst().size());
		assertEquals(typeName, type.getSuperEffectiveAgainst().get(0));

		type.setIneffectiveAgainst(typeName);
		assertEquals(0, type.getSuperEffectiveAgainst().size());
		assertEquals(1, type.getIneffectiveAgainst().size());
		assertEquals(typeName, type.getIneffectiveAgainst().get(0));

		type.removeEffectiveness(typeName);
		assertEquals(0, type.getIneffectiveAgainst().size());

		type.setNotVeryEffectiveAgainst(null);
		assertNotNull(type.getNotVeryEffectiveAgainst());
	}
}
