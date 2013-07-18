MoveInstance
============

.. java:package:: org.jpokemon.api.moves
   :noindex:

.. java:type:: public class MoveInstance

   Defines a move as it is owned and used by a Pokemon.

   :codeauthor: Zach Taylor

Fields
------

.. java:field:: protected int currentPP
   :outertype: MoveInstance

   Indicates the current PP of this move

.. java:field:: protected int maxPP
   :outertype: MoveInstance

   Indicates the maximum PP of this move

.. java:field:: protected Move move
   :outertype: MoveInstance

   Indicates the Move that this is an instance of

Constructors
------------

.. java:constructor:: public MoveInstance()
   :outertype: MoveInstance

   Provides the default constructor

Methods
-------

.. java:method:: public int getCurrentPP()
   :outertype: MoveInstance

   Gets the current PP of this move instance

.. java:method:: public int getMaxPP()
   :outertype: MoveInstance

   Gets the max PP of this move instance

.. java:method:: public Move getMove()
   :outertype: MoveInstance

   Gets the move associated with this instance

.. java:method:: public void setCurrentPP(int currentPP)
   :outertype: MoveInstance

   Sets the current PP of this move instance

.. java:method:: public void setMaxPP(int maxPP)
   :outertype: MoveInstance

   Sets the max PP of this move instance

.. java:method:: public void setMove(Move move)
   :outertype: MoveInstance

   Sets the move associated with this instance

