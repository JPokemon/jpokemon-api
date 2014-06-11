package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

public class SkillTest extends TestCase {
	@Test
	public void testMove() {
		String moveName = "FooMove";
		Skill skill = new Skill();
		skill.setMove(moveName);
		assertEquals(moveName, skill.getMove());
	}

	@Test
	public void testCurrentPP() {
		int currentPP = 123456;
		Skill skill = new Skill();
		skill.setCurrentPP(currentPP);
		assertEquals(currentPP, skill.getCurrentPP());
	}

	@Test
	public void testMaxPP() {
		int maxPP = 123456;
		Skill skill = new Skill();
		skill.setMaxPP(maxPP);
		assertEquals(maxPP, skill.getMaxPP());
	}
}
