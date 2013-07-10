package org.jpokemon.pmapi.pokemon;

/**
 * Defines a {@link Pokemon}'s stat instance. A stat instance holds a value, ev
 * points, and iv points.<br />
 * <br />
 * Note that a stat "value" may be defined to mean any necessary-to-record value
 * relative to the Pokemon instance.
 * 
 * @author zach
 * 
 * @since 0.1
 * 
 */
public class Stat {
	/** Indicates the current value */
	private int value;

	/** Indicates the ev value */
	private int ev;

	/** Indicates the iv value */
	private int iv;

	/** Gets the current value */
	public int getValue() {
		return value;
	}

	/** Sets the current value */
	public Stat setValue(int value) {
		this.value = value;
		return this;
	}

	/** Gets the ev value */
	public int getEv() {
		return ev;
	}

	/** Sets the ev value */
	public Stat setEv(int ev) {
		this.ev = ev;
		return this;
	}

	/** Gets the iv value */
	public int getIv() {
		return iv;
	}

	/** Sets the iv value */
	public Stat setIv(int iv) {
		this.iv = iv;
		return this;
	}
}