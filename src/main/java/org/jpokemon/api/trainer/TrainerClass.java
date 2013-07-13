package org.jpokemon.api.trainer;

/**
 * Defines a class of trainers (such as Youngsters or Swimmers).
 *
 * @author atheriel@gmail.com
 *
 * @since  0.1
 */
public class TrainerClass {
	/** Indicates the name of the trainer class. */
	protected String name = "";
	
	/** Indicates the base payout of the trainer class. */
	protected int basePayout = 30;

	/** Indicates whether trainers of this class can be male. */
	protected boolean potentiallyMale = true;

	/** Indicates whether trainers of this class can be female. */
	protected boolean potentiallyFemale = true;

	/** Gets the name of this trainer class. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this trainer class. */
	public void setName(String name) {
		this.name = name;
	}

	/** Gets the base payout for this trainer class. */
	public int getBasePayout() {
		return this.basePayout;
	}

	/** Sets the base payout for this trainer class. */
	public void setBasePayout(int basePayout) {
		this.basePayout = basePayout;
	}

	/** Checks whether members of this trainer class can be male. */
	public boolean isPotentiallyMale() {
		return this.potentiallyMale;
	}

	/** Sets whether members of this trainer class can be male. */
	public void setPotentiallyMale(boolean potentiallyMale) {
		this.potentiallyMale = potentiallyMale;
	}

	/** Checks whether members of this trainer class can be female. */
	public boolean isPotentiallyFemale() {
		return this.potentiallyFemale;
	}

	/** Sets whether members of this trainer class can be female. */
	public void setPotentiallyFemale(boolean potentiallyFemale) {
		this.potentiallyFemale = potentiallyFemale;
	}
}
