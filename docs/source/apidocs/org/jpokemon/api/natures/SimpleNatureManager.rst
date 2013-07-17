.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

SimpleNatureManager
===================

.. java:package:: org.jpokemon.api.natures
   :noindex:

.. java:type:: public class SimpleNatureManager implements NatureManager

Methods
-------
getNatureByName
^^^^^^^^^^^^^^^

.. java:method:: @Override public PokemonNature getNatureByName(String name)
   :outertype: SimpleNatureManager

init
^^^^

.. java:method:: public static void init()
   :outertype: SimpleNatureManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonNature nature)
   :outertype: SimpleNatureManager

registerNature
^^^^^^^^^^^^^^

.. java:method:: @Override public void registerNature(PokemonNature nature) throws JPokemonError
   :outertype: SimpleNatureManager

