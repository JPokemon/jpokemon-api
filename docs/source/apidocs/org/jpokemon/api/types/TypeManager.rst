.. java:import:: org.jpokemon.api JPokemonError

TypeManager
===========

.. java:package:: org.jpokemon.api.types
   :noindex:

.. java:type:: public interface TypeManager

   Provides an interface for keeping track of \ :java:ref:`PokemonTypes`\ . The most basic implementation of this is the \ :java:ref:`SimpleTypeManager`\  class. For convenience, the 17 classic types are implemented in the \ :java:ref:`ClassicTypes`\  class, which functions very much like an enum. To avoid a variety of issues, it is not possible to use more than one manager for types at a time.

   :author: atheriel@gmail.com

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

.. java:method:: public abstract boolean registerType(PokemonType type) throws JPokemonError
   :outertype: TypeManager

   Registers a type with the manager so it can be looked up by name.

   :param type: The type to be registered.
   :return: `true` if the type is successfully registered; otherwise `false`.

