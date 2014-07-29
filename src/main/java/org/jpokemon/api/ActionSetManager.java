package org.jpokemon.api;

import java.util.List;

/**
 * Defines a custom extension of the {@link Manager} interface, as is applicable
 * for {@link ActionSet}s. This special interface may be required by some
 * libraries due to the complicated nature of binding action sets to overworld
 * entities.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public interface ActionSetManager {
	/**
	 * Registers an ActionSet with the manager so it can be looked up later
	 * 
	 * @param actionSet The ActionSet to be registered
	 * @throws JPokemonException If there is an error registering the ActionSet
	 */
	public void register(ActionSet actionSet) throws JPokemonException;

	/**
	 * Gets all ActionSets from this manager for an overworld entity
	 * 
	 * @param name The name of the overworld entity
	 * @return All ActionSets mapped to the entity
	 * @throws JPokemonException If there is an error retrieving ActionSets
	 */
	public List<ActionSet> getAll(String name) throws JPokemonException;

	/**
	 * Gets all ActionSets from this manager for an overworld entity under the
	 * specific context
	 * 
	 * @param name The name of the overworld entity
	 * @param context The context the ActionSet is available with
	 * @return All ActionSets mapped to the entity under the given context
	 * @throws JPokemonException If there is an error retrieving ActionSets
	 */
	public List<ActionSet> getAll(String name, String context) throws JPokemonException;

	/**
	 * Re-registers an ActionSet with the manager, overriding any conflicts with
	 * the already registered version
	 * 
	 * @param actionSet The ActionSet to update
	 * @throws JPokemonException If there is an error registering the ActionSet
	 */
	public void update(ActionSet actionSet) throws JPokemonException;

	/**
	 * Removes a ActionSet from the registry
	 * 
	 * @param actionSet The ActionSet to remove
	 * @throws JPokemonException If there is an error removing the ActionSet
	 */
	public void unregister(ActionSet actionSet) throws JPokemonException;
}
