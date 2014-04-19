package org.jpokemon.example.itemattribute;

/**
 * Provides a possible item attribute describing qualities of ball items,
 * including catch rate. This can be extended to include type modifiers, etc.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true when the object in question is the same
 * class as this. This is to prevent an Item from storing multiple
 * BallAttributes.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class BallAttribute {
	/** Indicates the catch rate of this ball */
	protected int catchRate;

	/** Provides the default constructor */
	public BallAttribute() {
	}

	/** Gets the catch rate of this ball */
	public int getCatchRate() {
		return this.catchRate;
	}

	/** Sets the catch rate of this ball */
	public BallAttribute setCatchRate(int catchRate) {
		this.catchRate = catchRate;
		return this;
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return o.getClass().equals(this.getClass());
	}
}
