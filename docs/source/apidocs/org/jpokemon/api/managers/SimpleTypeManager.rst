.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.types PokemonType

SimpleTypeManager
=================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleTypeManager implements Manager<PokemonType>

   Defines a "simplest-possible" implementation of the \ :java:ref:`TypeManager`\  interface. Important: this manager loads no types by default! For that, see the \ :java:ref:`ClassicTypes`\  class.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public PokemonType getByName(String name)
   :outertype: SimpleTypeManager

init
^^^^

.. java:method:: public static void init()
   :outertype: SimpleTypeManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonType type)
   :outertype: SimpleTypeManager

register
^^^^^^^^

.. java:method:: @Override public boolean register(PokemonType type) throws JPokemonError
   :outertype: SimpleTypeManager

