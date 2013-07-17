.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.moves Move

SimpleMoveManager
=================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleMoveManager implements Manager<Move>

   Defines a "simplest-possible" implementation of the \ :java:ref:`MoveManager`\  interface.  Important: this manager loads no moves by default.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public Move getByName(String name)
   :outertype: SimpleMoveManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(Move move)
   :outertype: SimpleMoveManager

register
^^^^^^^^

.. java:method:: @Override public boolean register(Move move) throws JPokemonError
   :outertype: SimpleMoveManager

