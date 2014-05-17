package org.jpokemon.example.itemattribute;

import org.jpokemon.api.ItemAttributeFactory;
import org.jpokemon.api.JPokemonException;

/**
 * Provides an implementation of {@link ItemAttributeFactory} which can build
 * {@link MachineAttribute MachineAttributes}.
 * 
 * @author zach
 * 
 * @since 0.1
 */
public class MachineAttributeFactory extends ItemAttributeFactory {
	/** Provides the default constructor */
	public MachineAttributeFactory() {
	}

	@Override
	public Class<MachineAttribute> getItemAttributeClass() {
		return MachineAttribute.class;
	}

	@Override
	public Object buildItemAttribute(String options) {
		MachineAttribute machineAttribute = new MachineAttribute();
		machineAttribute.setMoveName(options);
		return machineAttribute;
	}

	@Override
	public String serializeItemAttribute(Object object) throws JPokemonException {
		if (!(object instanceof MachineAttribute)) {
			throw new JPokemonException("Expected machine item attribute object: " + object);
		}

		MachineAttribute machineAttribute = (MachineAttribute) object;
		return machineAttribute.getMoveName();
	}
}
