package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

public class MoveContainerTest extends TestCase {
	@Test
	public void testMove() {
		String moveName = "FooMove";
		MoveContainer move = new MoveContainer();
		move.setMove(moveName);
		assertEquals(moveName, move.getMove());
	}

	@Test
	public void testCurrentPP() {
		int currentPP = 123456;
		MoveContainer move = new MoveContainer();
		move.setCurrentPP(currentPP);
		assertEquals(currentPP, move.getCurrentPP());
	}

	@Test
	public void testMaxPP() {
		int maxPP = 123456;
		MoveContainer move = new MoveContainer();
		move.setMaxPP(maxPP);
		assertEquals(maxPP, move.getMaxPP());
	}
}
