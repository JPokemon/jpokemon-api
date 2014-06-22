package org.jpokemon.api;

/**
 * Defines an algorithm for producing {@link Requirement}s. Provides a
 * {@link Manager} reference for construction libraries to target. It is
 * recommended for library code, and therefore, library consumers. A simple
 * project may choose to completely ignore this class.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public abstract class RequirementFactory {
	/** Indicates the manager used to register RequirementFactories. May be null. */
	public static Manager<RequirementFactory> manager;

	/** Gets the class of requirement that this factory produces */
	public abstract Class<? extends Requirement> getRequirementClass();

	/** Builds a requirement, given the options provided */
	public abstract Requirement buildRequirement(String options) throws JPokemonException;

	/** Serializes a requirement to a string for registration */
	public abstract String serializeRequirement(Requirement requirement) throws JPokemonException;
}
