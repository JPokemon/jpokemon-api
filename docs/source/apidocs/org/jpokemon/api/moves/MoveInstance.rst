MoveInstance
============

.. java:package:: org.jpokemon.api.moves
   :noindex:

.. java:type:: public class MoveInstance

   Defines a move as it is owned and used by a Pokemon.

   :author: Zach Taylor

Fields
------
currentPP
^^^^^^^^^

.. java:field:: protected int currentPP
   :outertype: MoveInstance

   Indicates the current PP of this move

maxPP
^^^^^

.. java:field:: protected int maxPP
   :outertype: MoveInstance

   Indicates the maximum PP of this move

move
^^^^

.. java:field:: protected Move move
   :outertype: MoveInstance

   Indicates the Move that this is an instance of

Constructors
------------
MoveInstance
^^^^^^^^^^^^

.. java:constructor:: public MoveInstance()
   :outertype: MoveInstance

   Provides the default constructor

Methods
-------
getCurrentPP
^^^^^^^^^^^^

.. java:method:: public int getCurrentPP()
   :outertype: MoveInstance

   Gets the current PP of this move instance

getMaxPP
^^^^^^^^

.. java:method:: public int getMaxPP()
   :outertype: MoveInstance

   Gets the max PP of this move instance

getMove
^^^^^^^

.. java:method:: public Move getMove()
   :outertype: MoveInstance

   Gets the move associated with this instance

setCurrentPP
^^^^^^^^^^^^

.. java:method:: public void setCurrentPP(int currentPP)
   :outertype: MoveInstance

   Sets the current PP of this move instance

setMaxPP
^^^^^^^^

.. java:method:: public void setMaxPP(int maxPP)
   :outertype: MoveInstance

   Sets the max PP of this move instance

setMove
^^^^^^^

.. java:method:: public void setMove(Move move)
   :outertype: MoveInstance

   Sets the move associated with this instance

