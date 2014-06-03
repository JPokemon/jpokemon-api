package org.jpokemon.api;

import junit.framework.TestCase;

import org.junit.Test;

public class MoveInstanceTest extends TestCase {

	@Test
	public void testMove() {
		String moveName = "FooMove";
		MoveInstance move = new MoveInstance();
		move.setMove(moveName);
		assertEquals(moveName, move.getMove());
	}

	@Test
	public void testCurrentPP() {
		int currentPP = 123456;
		MoveInstance move = new MoveInstance();
		move.setCurrentPP(currentPP);
		assertEquals(currentPP, move.getCurrentPP());
	}

	@Test
	public void testMaxPP() {
		int maxPP = 123456;
		MoveInstance move = new MoveInstance();
		move.setMaxPP(maxPP);
		assertEquals(maxPP, move.getMaxPP());
	}
}
