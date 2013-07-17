.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.natures PokemonNature

SimpleNatureManager
===================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleNatureManager implements Manager<PokemonNature>

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public PokemonNature getByName(String name)
   :outertype: SimpleNatureManager

init
^^^^

.. java:method:: public static void init()
   :outertype: SimpleNatureManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonNature nature)
   :outertype: SimpleNatureManager

register
^^^^^^^^

.. java:method:: @Override public boolean register(PokemonNature nature) throws JPokemonError
   :outertype: SimpleNatureManager

