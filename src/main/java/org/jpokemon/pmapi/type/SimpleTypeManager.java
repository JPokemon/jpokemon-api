package org.jpokemon.pmapi.type;

import java.util.TreeMap;

import org.jpokemon.pmapi.JPokemonError;

/**
 * Defines a "simplest-possible" implementation of the {@link TypeManager} 
 * interface. Important: this manager loads no types by default! For that, see 
 * the {@link ClassicTypes} class.
 */
public class SimpleTypeManager implements TypeManager {
	private final TreeMap<String, PokemonType> typeList = new TreeMap<String, PokemonType>();

	/**
	 * Provides the default constructor.
	 * 
	 * @throws JPokemonError if there is a conflict with another 
	 *         			     {@link TypeManager} in registering types.
	 */
	public SimpleTypeManager() throws JPokemonError {
		if (PokemonType.manager != null) {
			throw new JPokemonError("Type registration conflict: another type manager has already been defined!");
		}
		PokemonType.manager = this;
	}

	/**
	 * Registers an additional type so it can be looked up by name. Called 
	 * automatically for all named {@link PokemonType} instances, so it should 
	 * not usually be called directly.
	 * 
	 * @param  type The type to be registered.
	 *
	 * @return  `true` if the type is in fact registered; otherwise `false`.
	 *
	 * @throws JPokemonError if a type has already taken the name being used by 
	 *         				 the given type, or if the type is already known 
	 *         				 (perhaps by some other name).
	 */
	@Override
	public boolean registerType(PokemonType type) throws JPokemonError {
		if (typeList.containsKey(type.getName())) {
			throw new JPokemonError("A type with the name " + type.getName() + " has already been registered!");
		}
		if (typeList.containsValue(type)) {
			throw new JPokemonError("This type is already registered!");
		}
		typeList.put(type.getName(), type);
		return true;
	}

	/**
	 * Checks if a type has been registered.
	 *
	 * @return `true` if the type is known.
	 */
	@Override
	public boolean isRegistered(PokemonType type) {
		return typeList.containsValue(type);
	}

	/**
	 * Gets a known type by name, including those additional ones.
	 * 
	 * @param  name The name of the type requested.
	 * 
	 * @return      The {@link PokemonType} for this type.
	 */
	public PokemonType getTypeByName(String name) {
		if (!typeList.containsKey(name)) {
			return null;
		}
		return typeList.get(name);
	}

	public String[] getTypeList() {
		return (String[]) typeList.keySet().toArray();
	}
}