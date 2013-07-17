.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.abilities PokemonAbility

SimpleAbilityManager
====================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleAbilityManager implements Manager<PokemonAbility>

   Defines a "simplest-possible" implementation of the \ :java:ref:`AbilityManager`\  interface.  Important: this manager loads no types by default.

Constructors
------------
SimpleAbilityManager
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleAbilityManager()
   :outertype: SimpleAbilityManager

   Provides a private constructor.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public PokemonAbility getByName(String name)
   :outertype: SimpleAbilityManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(PokemonAbility ability)
   :outertype: SimpleAbilityManager

register
^^^^^^^^

.. java:method:: @Override public boolean register(PokemonAbility ability) throws JPokemonError
   :outertype: SimpleAbilityManager

