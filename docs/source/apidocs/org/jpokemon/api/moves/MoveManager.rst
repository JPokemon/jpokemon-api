.. java:import:: org.jpokemon.api JPokemonError

MoveManager
===========

.. java:package:: org.jpokemon.api.moves
   :noindex:

.. java:type:: public interface MoveManager

   Provides an interface for keeping track of \ :java:ref:`Move`\ s in an application. The most basic implementation is the \ :java:ref:`SimpleMoveManager`\  class. Classic moves are not defined because their implementation is outside the scope of this library.

   :author: Zach Taylor

Methods
-------
getByName
^^^^^^^^^

.. java:method:: public Move getByName(String name)
   :outertype: MoveManager

   Gets a move registered with this manager by name.

   :param name: The name of the ability requested.
   :return: The \ :java:ref:`Move`\  for this type.

isRegistered
^^^^^^^^^^^^

.. java:method:: public boolean isRegistered(Move move)
   :outertype: MoveManager

   Checks if a move is registered with the manager.

   :return: `true` if the move is known to the manager.

registerAbility
^^^^^^^^^^^^^^^

.. java:method:: public void registerAbility(Move move) throws JPokemonError
   :outertype: MoveManager

   Registers a move with the manager so it can be looked up by name.

   :param move: The Move to be registered.

