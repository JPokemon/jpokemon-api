package org.jpokemon.pmapi.entitysystem;

import java.util.Collection;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Defines a basic implementation of the {@link EntityManager} interface.
 *
 * This class *should* be thread-safe.
 */
public class SimpleEntityManager implements EntityManager, Runnable {
	private final static AtomicInteger nextId = new AtomicInteger(1);
	private final TreeMap<Integer, Entity> entities = new TreeMap<Integer, Entity>();

	/**
	 * Provides the default constructor. Also sets itself as `defaultManager` 
	 * in the {@link Entity} class.
	 */
	public SimpleEntityManager() {
		if (Entity.defaultManager == null) {
			Entity.defaultManager = this;
		}
	}

	@Override
	public void registerEntity(Entity entity) {
		int currentId = entity.getId();
		
		if (currentId == -1) {
			currentId = nextId.getAndIncrement();
			entity.setId(currentId);
		}

		// Assign a UUID (if the entity does not already have one).
		if (entity.getUniqueId() == null) {
			entity.setUniqueId(UUID.randomUUID());
		}

		synchronized(entities) {
			entities.put(currentId, entities);
		}
	}
	
	@Override
	public Entity getEntity(int id) {
		synchronized(entities) {
			return entities.get(id);
		}
	}

	@Override
	public void killEntity(Entity entity) {
		synchronized(entities) {
			if (!entities.containsValue(entity)) {
				return;
			}
			entities.remove(entity.getId());
		}
	}

	/** Gets all of the entities in this manager. */
	public Collection<Entity> getAll() {
		return entities.values();
	}
}