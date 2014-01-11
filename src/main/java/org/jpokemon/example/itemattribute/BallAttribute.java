package org.jpokemon.example.itemattribute;

/**
 * Provides a possible attribute describing qualities of ball items, including
 * catch rate. This can be extended to include type modifiers, etc.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of BallAttribute! This
 * is to prevent an Item from storing multiple BallAttributes. It is strongly
 * advised to overwrite equals in subclasses of BallAttribute.
 * 
 * @author Zach Taylor
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
		return catchRate;
	}

	/** Sets the catch rate of this ball */
	public void setCatchRate(int cr) {
		catchRate = cr;
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