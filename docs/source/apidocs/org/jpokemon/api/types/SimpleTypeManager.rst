.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

SimpleTypeManager
=================

.. java:package:: org.jpokemon.api.types
   :noindex:

.. java:type:: public class SimpleTypeManager implements TypeManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`TypeManager`\  interface. Important: this manager loads no types by default! For that, see the \ :java:ref:`ClassicTypes`\  class.

Methods
-------
getTypeByName
^^^^^^^^^^^^^

.. java:method:: @Override public PokemonType getTypeByName(String name)
   :outertype: SimpleTypeManager

init
^^^^

.. java:method:: public static void init()
   :outertype: SimpleTypeManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonType type)
   :outertype: SimpleTypeManager

registerType
^^^^^^^^^^^^

.. java:method:: @Override public boolean registerType(PokemonType type) throws JPokemonError
   :outertype: SimpleTypeManager

