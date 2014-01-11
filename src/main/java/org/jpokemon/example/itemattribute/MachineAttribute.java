package org.jpokemon.example.itemattribute;

/**
 * Provides a possible attribute describing qualities of machine items,
 * including move name. TM / HM consumability and naming differences should be
 * implemented as part of the Item class. This is an example attribute for
 * attaching a move name.
 * 
 * <p>
 * 
 * NOTE: {@link #equals} returns true for all instances of MachineAttribute!
 * This is to prevent an Item from storing multiple MachineAttributes. It is
 * strongly advised to overwrite equals in subclasses of MachineAttribute.
 * 
 * @author Zach Taylor
 * 
 * @since 0.1
 */
public class MachineAttribute {
	/** Indicates the move name of this machine */
	protected String moveName;

	/** Provides the default constructor */
	public MachineAttribute() {
	}

	/** Gets the move name of this machine */
	public String getMoveName() {
		return moveName;
	}

	/** Sets the move name of this machine */
	public void setMoveName(String m) {
		moveName = m;
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