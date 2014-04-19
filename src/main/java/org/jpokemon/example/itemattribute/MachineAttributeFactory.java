package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link MachineAttribute MachineAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MachineAttributeFactory extends ItemAttributeFactory {
	/** Indicates the name of item attributes this factory produces */
	public static final String ITEM_ATTRIBUTE_NAME = "machine";

	/** Provides the default constructor */
	public MachineAttributeFactory() {
	}

	@Override
	public String getName() {
		return ITEM_ATTRIBUTE_NAME;
	}

	@Override
	public Object buildItemAttribute(String options) {
		MachineAttribute machineAttribute = new MachineAttribute();
		machineAttribute.setMoveName(options);
		return machineAttribute;
	}
}
