.. java:import:: org.jpokemon.pmapi JPokemonException

TypeManager
===========

.. java:package:: org.jpokemon.pmapi.type
   :noindex:

.. java:type:: public interface TypeManager

   Provides an interface for keeping track of \ :java:ref:`PokemonTypes`\  in an application. The most basic implementation of this (devoid of types) is the \ :java:ref:`SimpleTypeManager`\  class, and the 17 classic types are implemented in the \ :java:ref:`ClassicTypes`\  class. It is not recommended to use more than one manager for types at a time.

Methods
-------
getTypeByName
^^^^^^^^^^^^^

.. java:method:: public abstract PokemonType getTypeByName(String name)
   :outertype: TypeManager

   Gets a type registered by this manager by name.

   :param name: The name of the type requested.
   :return: The \ :java:ref:`PokemonType`\  for this type.

isRegistered
^^^^^^^^^^^^

.. java:method:: public abstract boolean isRegistered(PokemonType type)
   :outertype: TypeManager

   Checks if a type is registered with the manager.

   :return: `true` if the type is known to the manager.

registerType
^^^^^^^^^^^^

.. java:method:: public abstract boolean registerType(PokemonType type) throws JPokemonException
   :outertype: TypeManager

   Registers a type with the manager so it can be looked up by name.

   :param type: The type to be registered.
   :return: `true` if the type is in fact registered; otherwise `false`.

