package org.jpokemon.pmapi.entitysystem;

/**
 * Defines a component for an entity.
 */
public abstract class Component {
	private Entity owner;

	public void attachTo(Entity owner) {
		this.owner = owner;
	}

	public Entity getOwner() {
		return owner;
	}
}