package org.jpokemon.api;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

public class MoveTest extends TestCase {
	@Test
	public void testName() {
		String moveName = "FooMove";
		Move move = new Move();
		move.setName(moveName);
		assertEquals(moveName, move.getName());
	}

	@Test
	public void testType() {
		String moveType = "FooType";
		Move move = new Move();
		move.setType(moveType);
		assertEquals(moveType, move.getType());
	}

	@Test
	public void testCategory() {
		String moveCategory = "FooCategory";
		Move move = new Move();
		move.setCategory(moveCategory);
		assertEquals(moveCategory, move.getCategory());
	}

	@Test
	public void testDescription() {
		String moveDescription = "Foos teh bars to acheev teh wins";
		Move move = new Move();
		move.setDescription(moveDescription);
		assertEquals(moveDescription, move.getDescription());
	}

	@Test
	public void testPp() {
		int movePP = 123456;
		Move move = new Move();
		move.setPP(movePP);
		assertEquals(movePP, move.getPP());
	}

	@Test
	public void testPower() {
		int movePower = 100;
		Move move = new Move();
		move.setPower(movePower);
		assertEquals(movePower, move.getPower());
	}

	@Test
	public void testAccuracy() {
		double moveAccuracy = 123.456;
		Move move = new Move();
		move.setAccuracy(moveAccuracy);
		assertEquals(moveAccuracy, move.getAccuracy());
	}

	@Test
	public void testTarget() {
		String moveTarget = "self";
		Move move = new Move();
		move.setTarget(moveTarget);
		assertEquals(moveTarget, move.getTarget());
	}

	@Test
	public void testContestCategory() {
		String moveContestCategory = "FooCategory";
		Move move = new Move();
		move.setContestCategory(moveContestCategory);
		assertEquals(moveContestCategory, move.getContestCategory());
	}

	@Test
	public void testAppeal() {
		int moveAppeal = 100;
		Move move = new Move();
		move.setAppeal(moveAppeal);
		assertEquals(moveAppeal, move.getAppeal());
	}

	@Test
	public void testJam() {
		int moveJam = 100;
		Move move = new Move();
		move.setJam(moveJam);
		assertEquals(moveJam, move.getJam());
	}

	@Test
	public void testContestDescription() {
		String moveContestDescription = "FooCategory";
		Move move = new Move();
		move.setContestDescription(moveContestDescription);
		assertEquals(moveContestDescription, move.getContestDescription());
	}

	@Test
	public void testPriority() {
		int movePriority = 7;
		Move move = new Move();
		move.setPriority(movePriority);
		assertEquals(movePriority, move.getPriority());
	}

	@Test
	public void testProperties() {
		String movePropertyKey = "MovePropertyKey";
		Object moveProperty = new ArrayList<Integer>();
		Move move = new Move();
		assertNotNull(move.getProperties());
		assertEquals(0, move.getProperties().size());

		move.setProperty(movePropertyKey, moveProperty);
		assertEquals(1, move.getProperties().size());
		assertEquals(moveProperty, move.getProperty(movePropertyKey));

		move.removeProperty(movePropertyKey);
		assertNotNull(move.getProperties());
		assertEquals(0, move.getProperties().size());

		move.setProperties(null);
		assertNotNull(move.getProperties());
	}
}
