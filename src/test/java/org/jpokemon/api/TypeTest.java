package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

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

		assertNotNull(type.getEffectiveness());
		assertEquals(0, type.getEffectiveness().size());

		String EFFECTIVENESS_SUPER_STRING = "super";
		type.setEffectiveness(typeName, EFFECTIVENESS_SUPER_STRING);

		assertEquals(1, type.getEffectiveness().size());
		assertEquals(EFFECTIVENESS_SUPER_STRING, type.getEffectiveness(typeName));

		String EFFECTIVENESS_CUSTOM_STRING = "mega-extreme";
		type.setEffectiveness(typeName, EFFECTIVENESS_CUSTOM_STRING);

		assertEquals(1, type.getEffectiveness().size());
		assertEquals(EFFECTIVENESS_CUSTOM_STRING, type.getEffectiveness(typeName));

		type.removeEffectiveness(typeName);
		assertEquals(0, type.getEffectiveness().size());

		type.setEffectiveness(null);
		assertNotNull(type.getEffectiveness());
	}
}
