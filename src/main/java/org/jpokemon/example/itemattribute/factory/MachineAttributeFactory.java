package org.jpokemon.example.itemattribute.factory;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.example.itemattribute.MachineAttribute;

public class MachineAttributeFactory extends ItemAttributeFactory {
	public MachineAttributeFactory() {
	}

	@Override
	public String getName() {
		return "machine";
	}

	@Override
	public Object buildItemAttribute(String options) {
		MachineAttribute machineAttribute = new MachineAttribute();
		machineAttribute.setMoveName(options);
		return machineAttribute;
	}
}