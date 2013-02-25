package org.jpokemon.pmapi.entitysystem;

import java.lang.Comparable;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Defines an entity. Its runtime identity is assigned and stored as the `id`
 * field, while its more permanent (i.e. savable) identity is in its
 * {@link UUID} field.
 *
 * Note: this class implements {@link Comparable} to allow for a natural 
 * ordering by the `id` field. This means that `compareTo()` is *not* 
 * consistent with `equals()`.
 */
public class Entity implements Comparable<Entity> {
	private final AtomicInteger id = new AtomicInteger(-1);
	private UUID uniqueId;
	private HashMap<Class<? extends Component>, Component> components;
	
	/** Indicates the default manager being used to register the entities. */
	public static EntityManager defaultManager = null;

	/** Provides the default constructor; makes sure the entity is registered. */
	public Entity() {
		components = new HashMap<Class<? extends Component>, Component>();
		if (defaultManager == null) {
			throw new EntityException("An entity manager must be defined before entities can be instantiated!");
		}
		defaultManager.registerEntity(this);
	}

	/** Gets the entity's id. */
	public int getId() {
		return id.get();
	}

	/** Sets the entity's id. */
	public void setId(int id) {
		this.id.set(id);
	}

	/** Gets the entity's unique id. */
	public UUID getUniqueId() {
		return uniqueId;
	}

	/** Sets the entity's unique id. */
	public void setUniqueId(UUID uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * Adds a component to this entity (if it does not already possess one).
	 * 
	 * @param  componentClass The component's class (use `MyComponent.class`).
	 * 
	 * @return                A new instance of the component if the entity 
	 *                        does not already have one, and the known instance
	 *                        if it does.
	 */
	public <T extends Component> T add(Class<T> componentClass) {
		synchronized(components) {
			T component = (T) components.get(componentClass);			
			
			// Return the known component if the entity already has one.
			if (component != null) {
				return component;
			}

			// Try to create a new instance of the component
			try {
				component = (T) componentClass.newInstance();
			} catch(Exception e) {
				e.printStackTrace();
			}

			// If the instantiation is successful, add it to the entity.
			if (component != null) {
				component.attach(this);
				components.put(componentClass,component);				
			}

			return component;
		}
	}

	/**
	 * Removes the component from the entity (if it possesses one).
	 * 
	 * @param  componentClass The component's class (use `MyComponent.class`).
	 * 
	 * @return                `true` if the component was removed, and `false`
	 *                        otherwise.
	 */
	public <T extends Component> boolean remove(Class<T> componentClass) {
		// If the class is empty, it clearly cannot be removed.
		if (componentClass == null) {
			return false;
		}
		
		synchronized(components) {
			T component = (T) components.get(componentClass);

			// If the component is not attached to this entity, return false.
			if (component == null) {
				return false;
			}

			components.remove(componentClass);
			return true;
		}
	}

	/**
	 * Gets the instance of the given component for this entity.
	 * 
	 * @param  componentClass The component's class (use `MyComponent.class`).
	 * 
	 * @return                The instance of the component for this entity (if
	 *                        it has one), and `null` otherwise.
	 */
	public <T extends Component> T get(Class<T> componentClass) {
		if (componentClass == null) {
			return null;
		}

		return components.get(componentClass);
	}

	/**
	 * Gets the collection of all component instances attached to this entity.
	 *
	 * @return A {@link Collection} of components.
	 */
	public Collection<Component> getAll() {
		synchronized(components) {
			return components.values();			
		}
	}

	/** Compares this entity to another to establish ordering by their `id` fields. */
	@Override
	public int compareTo(Entity e) {
		int otherId = e.getId();

		// This should never happen.
		if (id == otherId) {
			throw new EntityException("No two entities should ever have the same id!");
		}

		return (id > otherId) ? 1 : -1;
	}
}