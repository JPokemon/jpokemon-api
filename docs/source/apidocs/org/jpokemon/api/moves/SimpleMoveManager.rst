.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

SimpleMoveManager
=================

.. java:package:: org.jpokemon.api.moves
   :noindex:

.. java:type:: public class SimpleMoveManager implements MoveManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`MoveManager`\  interface.  Important: this manager loads no moves by default.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public Move getByName(String name)
   :outertype: SimpleMoveManager

getInstance
^^^^^^^^^^^

.. java:method:: public static MoveManager getInstance()
   :outertype: SimpleMoveManager

   Gets the singleton instance of this class

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(Move move)
   :outertype: SimpleMoveManager

registerAbility
^^^^^^^^^^^^^^^

.. java:method:: @Override public void registerAbility(Move move) throws JPokemonError
   :outertype: SimpleMoveManager

