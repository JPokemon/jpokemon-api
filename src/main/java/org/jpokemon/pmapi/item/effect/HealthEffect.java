package org.jpokemon.pmapi.item.effect;

import org.jpokemon.pmapi.item.UseEffect;

/**
 * Defines an effect that will change a Pokémon's health when the item is used.
 */
public class HealthEffect extends UseEffect {
	private boolean fullRestore = false;
	private int healAmount;

	/** Provides the default constructor. */
	public HealthEffect() {
		super();
	}

	/** Gets the amount of health the effect will grant (can be negative). */
	public int getHealAmount() {
		return this.healAmount;
	}

	/** Sets the amount of health the effect will grant (can be negative). */
	public void setHealAmount(int healAmount) {
		this.healAmount = healAmount;
	}


}