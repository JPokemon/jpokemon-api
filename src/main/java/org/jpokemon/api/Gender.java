package org.jpokemon.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Defines a gender, as it is assigned to a trainer or Pokémon. Provides some
 * convenient language and random generation functionality as well.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 * 
 * @note This classes's language features are very specific to English.
 * @deprecated Being deprecated pre-0.1 doesn't look good... I'm talking to you,
 *             Gender.class!
 */
public class Gender {

	/** Indicates the possession of "Male" gender. */
	public static final Gender MALE = new Gender("Male", "He", "Him", "His", "His", "Himself");

	/** Indicates the possession of "Female" gender. */
	public static final Gender FEMALE = new Gender("Female", "She", "Her", "Her", "Hers", "Herself");

	/** Indicates the possession of neither "Male" nor "Female" gender. */
	public static final Gender GENDERLESS = new Gender("Genderless", "It", "It", "Its", "Its", "Itself");

	private static final List<Gender> genderList = new ArrayList<Gender>(3);

	private final String name;
	private final String subjectPronoun;
	private final String objectPronoun;
	private final String possessiveDeterminer;
	private final String possessivePronoun;
	private final String reflexivePronoun;

	private Gender(String name, String subjectPronoun, String objectPronoun, String possessiveDeterminer,
			String possessivePronoun, String reflexivePronoun) {
		this.name = name;
		this.subjectPronoun = subjectPronoun;
		this.objectPronoun = objectPronoun;
		this.possessiveDeterminer = possessiveDeterminer;
		this.possessivePronoun = possessivePronoun;
		this.reflexivePronoun = reflexivePronoun;
		genderList.add(this);
	}

	/** Gets the name of this gender. */
	public String getName() {
		return name;
	}

	/** Gets the subject pronoun for this gender. */
	public String getSubjectPronoun() {
		return subjectPronoun;
	}

	/** Gets the object pronoun for this gender. */
	public String getObjectPronoun() {
		return objectPronoun;
	}

	/** Gets the possessive determiner pronoun for this gender. */
	public String getPossessiveDeterminer() {
		return possessiveDeterminer;
	}

	/**
	 * Gets the possessive pronoun for this gender.
	 * 
	 * @note Due to English weirdness, this gives odd results with GENDERLESS.
	 */
	public String getPossessivePronoun() {
		return possessivePronoun;
	}

	/** Gets the reflexive pronoun for this gender. */
	public String getReflexivePronoun() {
		return reflexivePronoun;
	}

	/** Gets the appropriate gender for the given name. */
	public static Gender getGenderByName(String name) {
		if (name.equals(MALE.getName())) {
			return MALE;
		}
		else if (name.equals(FEMALE.getName())) {
			return FEMALE;
		}
		else if (name.equals(GENDERLESS.getName())) {
			return GENDERLESS;
		}
		return null;
	}

	/**
	 * Gets a random male or female gender, with an equal chance of each.
	 * 
	 * @param ranomd The random generator to use in the selection.
	 */
	public static Gender getRandomBinaryGender(Random random) {
		return genderList.get(random.nextInt(2));
	}

	/** Gets the list of all available genders. */
	public static List<Gender> getGenders() {
		return genderList;
	}

	@Override
	public String toString() {
		return name;
	}
}
