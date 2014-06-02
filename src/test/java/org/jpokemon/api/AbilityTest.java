package org.jpokemon.api;

import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Test;

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
		Object abilityEffect = new HashMap<String, String>();
		Ability ability = new Ability();
		assertNotNull(ability.getEffects());
		assertEquals(0, ability.getEffects().size());

		ability.addEffect(abilityEffect);
		assertEquals(1, ability.getEffects().size());
		assertEquals(abilityEffect, ability.getEffects().get(0));

		ability.removeEffect(abilityEffect);
		assertNotNull(ability.getEffects());
		assertEquals(0, ability.getEffects().size());
	}
}
