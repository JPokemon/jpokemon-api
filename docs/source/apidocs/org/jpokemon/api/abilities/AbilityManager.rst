.. java:import:: org.jpokemon.api JPokemonError

AbilityManager
==============

.. java:package:: org.jpokemon.api.abilities
   :noindex:

.. java:type:: public interface AbilityManager

   Provides an interface for keeping track of \ :java:ref:`PokemonAbility`\ s. The most basic implementation of this is the \ :java:ref:`SimpleAbilityManager`\  class.

   :author: Zach Taylor

Methods
-------
getByName
^^^^^^^^^

.. java:method:: public PokemonAbility getByName(String name)
   :outertype: AbilityManager

   Gets an ability registered with this manager by name.

   :param name: The name of the ability requested.
   :return: The \ :java:ref:`PokemonAbility`\  for this type.

isRegistered
^^^^^^^^^^^^

.. java:method:: public boolean isRegistered(PokemonAbility ability)
   :outertype: AbilityManager

   Checks if an ability is registered with this manager.

   :return: `true` if the ability is known to the manager.

registerAbility
^^^^^^^^^^^^^^^

.. java:method:: public void registerAbility(PokemonAbility ability) throws JPokemonError
   :outertype: AbilityManager

   Registers an ability with this manager so it can be looked up by name.

   :param ability: The ability to be registered.

