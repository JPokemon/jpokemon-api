package org.jpokemon.example.itemattribute;

/**
 * Provides a possible attribute describing the pocket an item belongs to. The
 * names of the pockets each have their own static field, which can of course be
 * modified.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of PocketAttribute! This
 * is to prevent an Item from storing multiple PocketAttributes. It is strongly
 * advised to overwrite equals in subclasses of PocketAttribute.
 * 
 * @author atheriel@gmail.com
 * 
 * @since 0.1
 */
public class PocketAttribute {
	private String pocketName;

	/** Provides the default constructor. */
	public PocketAttribute() {
	}

	/** Gets the name of the pocket this item belongs to. */
	public String getPocketName() {
		return pocketName;
	}

	/** Sets the name of the pocket this item belongs to. */
	public PocketAttribute setPocketName(String pocketName) {
		this.pocketName = pocketName;
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