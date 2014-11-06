package org.ospokemon;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.ospokemon.Evolution;
import org.ospokemon.Species;

public class SpeciesTest extends TestCase {
	@Test
	public void testName() {
		String speciesName = "FooSpecies";
		Species species = new Species();
		species.setName(speciesName);
		assertEquals(speciesName, species.getName());
	}

	@Test
	public void testTag() {
		String speciesTag = "The Foo Pokemon";
		Species species = new Species();
		species.setTag(speciesTag);
		assertEquals(speciesTag, species.getTag());
	}

	@Test
	public void testDescription() {
		String speciesDescription = "Long description about the species";
		Species species = new Species();
		species.setDescription(speciesDescription);
		assertEquals(speciesDescription, species.getDescription());
	}

	@Test
	public void testNumber() {
		int speciesNumber = 123;
		Species species = new Species();
		species.setNumber(speciesNumber);
		assertEquals(speciesNumber, species.getNumber());
	}

	@Test
	public void testType() {
		String type1 = "FooType";
		String type2 = "BarType";
		Species species = new Species();
		assertNotNull(species.getTypes());
		assertEquals(0, species.getTypes().size());

		species.addType(type1);
		assertEquals(1, species.getTypes().size());
		assertEquals(type1, species.getTypes().get(0));

		species.addType(type2);
		assertEquals(2, species.getTypes().size());
		assertEquals(type1, species.getTypes().get(0));
		assertEquals(type2, species.getTypes().get(1));

		species.removeType(type1);
		assertEquals(1, species.getTypes().size());
		assertEquals(type2, species.getTypes().get(0));

		species.setTypes(null);
		assertNotNull(species.getTypes());
		assertEquals(0, species.getTypes().size());
	}

	@Test
	public void testAbility() {
		String ability1 = "FooAbility";
		String ability2 = "BarAbility";
		Species species = new Species();
		assertNotNull(species.getAbilities());
		assertEquals(0, species.getAbilities().size());

		species.addAbility(ability1);
		assertEquals(1, species.getAbilities().size());
		assertEquals(ability1, species.getAbilities().get(0));

		species.addAbility(ability2);
		assertEquals(2, species.getAbilities().size());
		assertEquals(ability1, species.getAbilities().get(0));
		assertEquals(ability2, species.getAbilities().get(1));

		species.removeAbility(ability1);
		assertEquals(1, species.getAbilities().size());
		assertEquals(ability2, species.getAbilities().get(0));

		species.setAbilities(null);
		assertNotNull(species.getAbilities());
		assertEquals(0, species.getAbilities().size());
	}

	@Test
	public void testHiddenAbility() {
		String speciesHiddenAbility = "FooAbility";
		Species species = new Species();
		species.setHiddenAbility(speciesHiddenAbility);
		assertEquals(speciesHiddenAbility, species.getHiddenAbility());
	}

	@Test
	public void testGenderless() {
		Species species = new Species();
		assertEquals(false, species.isGenderless());

		species.setGenderless(true);
		assertEquals(true, species.isGenderless());
	}

	@Test
	public void testMaleRatio() {
		double speciesMaleRatio = 0.123456;
		Species species = new Species();
		species.setMaleRatio(speciesMaleRatio);
		assertEquals(speciesMaleRatio, species.getMaleRatio());
	}

	@Test
	public void testCatchRate() {
		int speciesCatchRate = 789;
		Species species = new Species();
		species.setCatchRate(speciesCatchRate);
		assertEquals(speciesCatchRate, species.getCatchRate());
	}

	@Test
	public void testBreedable() {
		Species species = new Species();
		assertEquals(false, species.isBreedable());

		species.setBreedable(true);
		assertEquals(true, species.isBreedable());
	}

	@Test
	public void testEggGroup() {
		String eggGroup1 = "FooGroup";
		String eggGroup2 = "BarGroup";
		Species species = new Species();
		assertNotNull(species.getEggGroups());
		assertEquals(0, species.getEggGroups().size());

		species.addEggGroup(eggGroup1);
		assertEquals(1, species.getEggGroups().size());
		assertEquals(eggGroup1, species.getEggGroups().get(0));

		species.addEggGroup(eggGroup2);
		assertEquals(2, species.getEggGroups().size());
		assertEquals(eggGroup1, species.getEggGroups().get(0));
		assertEquals(eggGroup2, species.getEggGroups().get(1));

		species.removeEggGroup(eggGroup1);
		assertEquals(1, species.getEggGroups().size());
		assertEquals(eggGroup2, species.getEggGroups().get(0));

		species.setEggGroups(null);
		assertNotNull(species.getEggGroups());
		assertEquals(0, species.getEggGroups().size());
	}

	@Test
	public void testEggCycles() {
		int speciesEggCyles = 456;
		Species species = new Species();
		species.setEggCyles(speciesEggCyles);
		assertEquals(speciesEggCyles, species.getEggCyles());
	}

	@Test
	public void testHeight() {
		double speciesHeight = 123.456;
		Species species = new Species();
		species.setHeight(speciesHeight);
		assertEquals(speciesHeight, species.getHeight());
	}

	@Test
	public void testWeight() {
		double speciesWeight = 456.123;
		Species species = new Species();
		species.setWeight(speciesWeight);
		assertEquals(speciesWeight, species.getWeight());
	}

	@Test
	public void testExperienceYield() {
		int speciesExperienceYield = 300;
		Species species = new Species();
		species.setExperienceYield(speciesExperienceYield);
		assertEquals(speciesExperienceYield, species.getExperienceYield());
	}

	@Test
	public void testExperienceCurve() {
		String speciesExperienceCurve = "FooCurve";
		Species species = new Species();
		species.setExperienceCurve(speciesExperienceCurve);
		assertEquals(speciesExperienceCurve, species.getExperienceCurve());
	}

	@Test
	public void testEffortValue() {
		String stat = "FooStat";
		int val1 = 123;
		int val2 = 234;
		Species species = new Species();
		assertNotNull(species.getEffortValues());
		assertEquals(0, species.getEffortValues().size());

		species.setEffortValue(stat, val1);
		assertEquals(1, species.getEffortValues().size());
		assertEquals(val1, species.getEffortValue(stat));

		species.setEffortValue(stat, val2);
		assertEquals(1, species.getEffortValues().size());
		assertEquals(val2, species.getEffortValue(stat));

		species.removeEffortValue(stat);
		assertNotNull(species.getEffortValues());
		assertEquals(0, species.getEffortValues().size());

		species.setEffortValues(null);
		assertNotNull(species.getEffortValues());
		assertEquals(0, species.getEffortValues().size());
	}

	@Test
	public void testBodyStyle() {
		String speciesBodyStyle = "FooBodyStyle";
		Species species = new Species();
		species.setBodyStyle(speciesBodyStyle);
		assertEquals(speciesBodyStyle, species.getBodyStyle());
	}

	@Test
	public void testColor() {
		String speciesColor = "Black";
		Species species = new Species();
		species.setColor(speciesColor);
		assertEquals(speciesColor, species.getColor());
	}

	@Test
	public void testTameness() {
		int speciesTameness = 600;
		Species species = new Species();
		species.setTameness(speciesTameness);
		assertEquals(speciesTameness, species.getTameness());
	}

	@Test
	public void testBaseStat() {
		String stat = "FooStat";
		int val1 = 123;
		int val2 = 234;
		Species species = new Species();
		assertNotNull(species.getBaseStats());
		assertEquals(0, species.getBaseStats().size());

		species.setBaseStat(stat, val1);
		assertEquals(1, species.getBaseStats().size());
		assertEquals(val1, species.getBaseStat(stat));

		species.setBaseStat(stat, val2);
		assertEquals(1, species.getBaseStats().size());
		assertEquals(val2, species.getBaseStat(stat));

		species.removeBaseStat(stat);
		assertNotNull(species.getBaseStats());
		assertEquals(0, species.getBaseStats().size());

		species.removeBaseStat(null);
		assertNotNull(species.getBaseStats());
		assertEquals(0, species.getBaseStats().size());
	}

	@Test
	public void testEvolution() {
		Evolution evolution1 = new Evolution() {
			@Override
			public String getSpecies() {
				return "FooSpecies";
			}
		};
		Evolution evolution2 = new Evolution() {
			@Override
			public String getSpecies() {
				return "BarSpecies";
			}
		};
		Species species = new Species();
		assertNotNull(species.getEvolutions());
		assertEquals(0, species.getEvolutions().size());

		species.addEvolution(evolution1);
		assertEquals(1, species.getEvolutions().size());
		assertEquals(evolution1, species.getEvolutions().get(0));

		species.addEvolution(evolution2);
		assertEquals(2, species.getEvolutions().size());
		assertEquals(evolution1, species.getEvolutions().get(0));
		assertEquals(evolution2, species.getEvolutions().get(1));

		species.removeEvolution(evolution1);
		assertEquals(1, species.getEvolutions().size());
		assertEquals(evolution2, species.getEvolutions().get(0));

		species.setEvolutions(null);
		assertNotNull(species.getEvolutions());
		assertEquals(0, species.getEvolutions().size());
	}

	@Test
	public void testMove() {
		String move1 = "FooMove";
		String move2 = "BarMove";
		int level1 = 123;
		Species species = new Species();
		assertNotNull(species.getMoveLists());
		assertEquals(0, species.getMoveLists().size());
		assertNotNull(species.getMoveList(level1));
		assertEquals(1, species.getMoveLists().size());

		species.addMove(level1, move1);
		assertEquals(1, species.getMoveLists().size());
		assertEquals(1, species.getMoveList(level1).size());
		assertEquals(move1, species.getMoveList(level1).get(0));

		species.addMove(level1, move2);
		assertEquals(1, species.getMoveLists().size());
		assertEquals(2, species.getMoveList(level1).size());
		assertEquals(move1, species.getMoveList(level1).get(0));
		assertEquals(move2, species.getMoveList(level1).get(1));

		species.removeMove(level1, move1);
		assertEquals(1, species.getMoveLists().size());
		assertEquals(move2, species.getMoveList(level1).get(0));

		List<String> moveList1 = new ArrayList<String>();
		moveList1.add(move1);
		species.setMoveList(level1, moveList1);
		assertEquals(moveList1, species.getMoveList(level1));

		species.setMoveList(level1, null);
		assertEquals(0, species.getMoveLists().size());

		species.setMoveList(level1, moveList1);
		assertEquals(1, species.getMoveList(level1).size());
		species.removeMoveList(level1);
		assertEquals(0, species.getMoveLists().size());

		species.setMoveLists(null);
		assertNotNull(species.getMoveLists());
		assertEquals(0, species.getMoveLists().size());
	}

	@Test
	public void testEggMove() {
		String eggMove1 = "FooMove";
		String eggMove2 = "BarMove";
		Species species = new Species();
		assertNotNull(species.getEggMoves());
		assertEquals(0, species.getEggMoves().size());

		species.addEggMove(eggMove1);
		assertEquals(1, species.getEggMoves().size());
		assertEquals(eggMove1, species.getEggMoves().get(0));

		species.addEggMove(eggMove2);
		assertEquals(2, species.getEggMoves().size());
		assertEquals(eggMove1, species.getEggMoves().get(0));
		assertEquals(eggMove2, species.getEggMoves().get(1));

		species.removeEggMove(eggMove1);
		assertEquals(1, species.getEggMoves().size());
		assertEquals(eggMove2, species.getEggMoves().get(0));

		species.setEggMoves(null);
		assertNotNull(species.getEggMoves());
		assertEquals(0, species.getEggMoves().size());
	}

	@Test
	public void testMachineMove() {
		String machineMove1 = "FooMove";
		String machineMove2 = "BarMove";
		Species species = new Species();
		assertNotNull(species.getMachineMoves());
		assertEquals(0, species.getMachineMoves().size());

		species.addMachineMove(machineMove1);
		assertEquals(1, species.getMachineMoves().size());
		assertEquals(machineMove1, species.getMachineMoves().get(0));

		species.addMachineMove(machineMove2);
		assertEquals(2, species.getMachineMoves().size());
		assertEquals(machineMove1, species.getMachineMoves().get(0));
		assertEquals(machineMove2, species.getMachineMoves().get(1));

		species.removeMachineMove(machineMove1);
		assertEquals(1, species.getMachineMoves().size());
		assertEquals(machineMove2, species.getMachineMoves().get(0));

		species.setMachineMoves(null);
		assertNotNull(species.getMachineMoves());
		assertEquals(0, species.getMachineMoves().size());
	}

	@Test
	public void testTutorMove() {
		String machineMove1 = "FooMove";
		String machineMove2 = "BarMove";
		Species species = new Species();
		assertNotNull(species.getTutorMoves());
		assertEquals(0, species.getTutorMoves().size());

		species.addTutorMove(machineMove1);
		assertEquals(1, species.getTutorMoves().size());
		assertEquals(machineMove1, species.getTutorMoves().get(0));

		species.addTutorMove(machineMove2);
		assertEquals(2, species.getTutorMoves().size());
		assertEquals(machineMove1, species.getTutorMoves().get(0));
		assertEquals(machineMove2, species.getTutorMoves().get(1));

		species.removeTutorMove(machineMove1);
		assertEquals(1, species.getTutorMoves().size());
		assertEquals(machineMove2, species.getTutorMoves().get(0));

		species.setTutorMoves(null);
		assertNotNull(species.getTutorMoves());
		assertEquals(0, species.getTutorMoves().size());
	}
}
