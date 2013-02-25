package org.jpokemon.pmapi.entitysystem;

/**
 * Provides an interface for management of entities.
 */
public interface EntityManager {

	/**
	 * Registers an entity with the manager and assigns it an id.
	 * 
	 * @param  entity The {@link Entity} to register.
	 */
	public abstract void registerEntity(Entity entity);
	
	/**
	 * Gets the entity instance with the given id.
	 * 
	 * @param  id The id of the entity.
	 * 
	 * @return    An {@link Entity} instance if one exists, and `null` if not.
	 */
	public abstract Entity getEntity(int id);

	/**
	 * Permanently removes the instance of the entity.
	 * 
	 * @param  entity The entity to dispose of.
	 */
	public abstract void killEntity(Entity entity);
}