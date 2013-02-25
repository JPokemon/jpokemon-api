package org.jpokemon.pmapi.factory;

import java.util.concurrent.atomic.AtomicInteger;

import org.jpokemon.pmapi.item.EffectiveItem;

public class HMFactory {
	private static final AtomicInteger nextId = new AtomicInteger(1);

	public static EffectiveItem generateNewHM(String moveName) {
		int id = nextId.getAndIncrement();
		EffectiveItem newHM = new EffectiveItem();
		if (id < 10) {
			newHM.setName("HM0" + id);
		} else {
			newHM.setName("HM" + id);
		}
		newHM.setDescription("Teaches " + moveName + " to a compatible Pokémon.");
		newHM.setHoldable(false);
		newHM.setConsumable(false);
		//newHM.addUseEffect();
	}
}