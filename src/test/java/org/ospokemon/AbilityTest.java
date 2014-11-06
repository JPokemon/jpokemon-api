package org.ospokemon;

import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Test;
import org.ospokemon.Ability;

public class AbilityTest extends TestCase {
	@Test
	public void testName() {
		String abilityName = "FooAbility";
		Ability ability = new Ability();
		ability.setName(abilityName);
		assertEquals(abilityName, ability.getName());
	}

	@Test
	public void testDescription() {
		String abilityDescription = "Foos all teh bars";
		Ability ability = new Ability();
		ability.setDescription(abilityDescription);
		assertEquals(abilityDescription, ability.getDescription());
	}

	@Test
	public void testEffects() {
		String abilityPropertyKey = "AbilityPropertyKey";
		Object abilityProperty = new HashMap<String, String>();
		Ability ability = new Ability();
		assertNotNull(ability.getProperties());
		assertEquals(0, ability.getProperties().size());

		ability.setProperty(abilityPropertyKey, abilityProperty);
		assertEquals(1, ability.getProperties().size());
		assertEquals(abilityProperty, ability.getProperty(abilityPropertyKey));

		ability.removeProperty(abilityPropertyKey);
		assertNotNull(ability.getProperties());
		assertEquals(0, ability.getProperties().size());

		ability.setProperties(null);
		assertNotNull(ability.getProperties());
	}
}
