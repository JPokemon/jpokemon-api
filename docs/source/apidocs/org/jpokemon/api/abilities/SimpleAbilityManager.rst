.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

SimpleAbilityManager
====================

.. java:package:: org.jpokemon.api.abilities
   :noindex:

.. java:type:: public class SimpleAbilityManager implements AbilityManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`AbilityManager`\  interface.  Important: this manager loads no types by default.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public PokemonAbility getByName(String name)
   :outertype: SimpleAbilityManager

getInstance
^^^^^^^^^^^

.. java:method:: public static AbilityManager getInstance()
   :outertype: SimpleAbilityManager

   Gets the singleton instance of this class

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonAbility ability)
   :outertype: SimpleAbilityManager

registerAbility
^^^^^^^^^^^^^^^

.. java:method:: @Override public void registerAbility(PokemonAbility ability) throws JPokemonError
   :outertype: SimpleAbilityManager

