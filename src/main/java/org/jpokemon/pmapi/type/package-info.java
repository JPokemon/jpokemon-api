/**
 * Provides classes that define the `types` available for Pokémon moves and 
 * species.
 *
 * Types that this API understands must extend the abstract {@link PokemonType} 
 * class. Most of the time, adding a type is as simple as calling the 
 * constructor and adding a name.
 * 
 * {@link ClassicTypes} provides a lookup for the 17 classic types and an empty
 * type, with some additional functionality. Even if you plan on writing your 
 * own types, this class should be sufficient.
 */
package org.jpokemon.api.type;