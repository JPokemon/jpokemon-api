package org.jpokemon.api;

/**
 * Defines a nature (personality) for a Pokémon. The 25 classic natures are
 * instantiated in the {@link ClassicNatures} class.
 * 
 * <p>
 * To define your own nature, construct instances of this class. If you want to
 * add attributes to the nature, it can of course be extended.
 * <p>
 * 
 * <h2>Usage Example</h2>
 * 
 * <p>
 * One could create a nature in the following way:
 * 
 * <pre>
 * Nature aweseome = new Nature().setName("Awesome");
 * awesome.setStatIncreased("Speed").setStatDecreased("Special Defense");
 * awesome.setTasteFavorite("Sweet").setTasteDisliked("Bitter");
 * </pre>
 * 
 * @author atheriel@gmail.com
 * @author Zach Taylor
 * 
 * @since 0.1
 * 
 * @see ClassicNatures
 * @see SimpleNatureManager
 */
public class Nature {
	/** Indicates the manager being used to register items. May be ``null``. */
	public static Manager<Nature> manager;

	/** Indicates the name of this nature. */
	protected String name;

	/** Indicates the stat increased by this nature. */
	protected String statIncreased;

	/** Indicates the stat decreased by this nature. */
	protected String statDecreased;

	/** Indicates the taste favoured by Pokémon of this nature. */
	protected String tasteFavorite;

	/** Indicates the taste disliked by Pokémon of this nature. */
	protected String tasteDisliked;

	/** Provides the default constructor. */
	public Nature() {
	}

	/** Gets the name of this nature. */
	public String getName() {
		return name;
	}

	/** Sets the name of this nature. */
	public Nature setName(String name) {
		this.name = name;
		return this;
	}

	/** Gets the stat increased by this nature. */
	public String getStatIncreased() {
		return statIncreased;
	}

	/** Sets the stat increased by this nature. */
	public Nature setStatIncreased(String stat) {
		this.statIncreased = stat;
		return this;
	}

	/** Gets the stat decreased by this nature. */
	public String getStatDecreased() {
		return statDecreased;
	}

	/** Sets the stat decreased by this nature. */
	public Nature setStatDecreased(String stat) {
		this.statDecreased = stat;
		return this;
	}

	/** Gets the taste preference of this nature. */
	public String getTasteFavorite() {
		return tasteFavorite;
	}

	/** Sets the favorite taste of this nature. */
	public Nature setTasteFavorite(String taste) {
		this.tasteFavorite = taste;
		return this;
	}

	/** Gets the disliked taste of this nature. */
	public String getTasteDisliked() {
		return tasteDisliked;
	}

	/** Sets the disliked taste of this nature. */
	public Nature setTasteDisliked(String taste) {
		this.tasteDisliked = taste;
		return this;
	}

	/**
	 * Gets the stat modifier for a given stat as a float.
	 * 
	 * @deprecated Use {@link #getStatIncreased} or {@link #getStatDecreased}
	 *             instead.
	 */
	public float getStatModifier(String stat) {
		if (statIncreased.equals(stat)) {
			return 1.1f;
		}
		else if (statDecreased.equals(stat)) {
			return 0.9f;
		}
		return 1.0f;
	}
}
