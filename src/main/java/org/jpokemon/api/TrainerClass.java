package org.jpokemon.api;

/**
 * Defines a class of trainers (such as Youngsters or Swimmers).
 * 
 * @author atheriel@gmail.com
 * @author zach
 * 
 * @since 0.1
 */
public class TrainerClass {
	/**
	 * Indicates the manager used to register Pokémon trainer classes. May be
	 * null.
	 */
	public static Manager<TrainerClass> manager;

	/** Indicates the name of the trainer class */
	protected String name;

	/** Indicates the description of the trainer class */
	protected String description;

	/** Gets the name of this trainer class. */
	public String getName() {
		return this.name;
	}

	/** Sets the name of this trainer class. */
	public TrainerClass setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the description of the trainer class */
	public String getDescription() {
		return description;
	}

	/** Sets the description of the trainer class */
	public TrainerClass setDescription(String description) {
		this.description = description;
		return this;
	}
}
