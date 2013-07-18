.. java:import:: org.jpokemon.api JPokemonError

NatureManager
=============

.. java:package:: org.jpokemon.api.natures
   :noindex:

.. java:type:: public interface NatureManager

   Provides an interface for keeping track of \ :java:ref:`PokemonNature`\ s in an application. The most basic implementation is the \ :java:ref:`SimpleNatureManager`\  class, and the 25 classic types are implemented in the \ :java:ref:`ClassicNatures`\  class. It is not possible to use more than one manager for natures at a time.

   :author: atheriel@gmail.com

Methods
-------
getNatureByName
^^^^^^^^^^^^^^^

.. java:method:: public abstract PokemonNature getNatureByName(String name)
   :outertype: NatureManager

   Gets a nature registered with this manager by name.

   :param name: The name of the nature requested.
   :return: The \ :java:ref:`PokemonNature`\  for this nature.

isRegistered
^^^^^^^^^^^^

.. java:method:: public abstract boolean isRegistered(PokemonNature nature)
   :outertype: NatureManager

   Checks if a nature is registered with the manager.

   :return: `true` if the nature is known to the manager.

registerNature
^^^^^^^^^^^^^^

.. java:method:: public abstract void registerNature(PokemonNature nature) throws JPokemonError
   :outertype: NatureManager

   Registers a nature with the manager so it can be looked up by name.

   :param nature: The nature to be registered.

