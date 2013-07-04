.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.pmapi JPokemonException

SimpleTypeManager
=================

.. java:package:: org.jpokemon.pmapi.type
   :noindex:

.. java:type:: public class SimpleTypeManager implements TypeManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`TypeManager`\  interface. Important: this manager loads no types by default! For that, see the \ :java:ref:`ClassicTypes`\  class.

Constructors
------------
SimpleTypeManager
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleTypeManager() throws JPokemonException
   :outertype: SimpleTypeManager

   Provides the default constructor.

Methods
-------
getTypeByName
^^^^^^^^^^^^^

.. java:method:: public PokemonType getTypeByName(String name)
   :outertype: SimpleTypeManager

   Gets a known type by name, including those additional ones.

   :param name: The name of the type requested.
   :return: The \ :java:ref:`PokemonType`\  for this type.

getTypeList
^^^^^^^^^^^

.. java:method:: public String getTypeList()
   :outertype: SimpleTypeManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonType type)
   :outertype: SimpleTypeManager

   Checks if a type has been registered.

   :return: `true` if the type is known.

registerType
^^^^^^^^^^^^

.. java:method:: @Override public boolean registerType(PokemonType type) throws JPokemonException
   :outertype: SimpleTypeManager

   Registers an additional type so it can be looked up by name. Called automatically for all named \ :java:ref:`PokemonType`\  instances, so it should not usually be called directly.

   :param type: The type to be registered.
   :return: `true` if the type is in fact registered; otherwise `false`.

