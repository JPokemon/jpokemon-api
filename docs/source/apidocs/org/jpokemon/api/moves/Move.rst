.. java:import:: org.jpokemon.api.types PokemonType

Move
====

.. java:package:: org.jpokemon.api.moves
   :noindex:

.. java:type:: public class Move

   Defines a move that can be learned and used by a Pokémon. Moves that cause status ailments, affect stats, and so on are termed as having a `secondary effect`.

   :author: atheriel@gmail.com

Fields
------
accuracy
^^^^^^^^

.. java:field:: protected int accuracy
   :outertype: Move

   Indicates the accuracy of this move.

maxPP
^^^^^

.. java:field:: protected int maxPP
   :outertype: Move

   Indicates the maximum PP for this move.

name
^^^^

.. java:field:: protected String name
   :outertype: Move

   Indicates the name of this move.

power
^^^^^

.. java:field:: protected int power
   :outertype: Move

   Indicates the power of this move.

priority
^^^^^^^^

.. java:field:: protected int priority
   :outertype: Move

   Indicates the priority of this move.

secondaryEffect
^^^^^^^^^^^^^^^

.. java:field:: protected boolean secondaryEffect
   :outertype: Move

   Indicates whether this move has a secondary effect.

selfTargeting
^^^^^^^^^^^^^

.. java:field:: protected boolean selfTargeting
   :outertype: Move

   Indicates whether this move targets the user instead of the opponent.

special
^^^^^^^

.. java:field:: protected boolean special
   :outertype: Move

   Indicates whether this move uses `Special` stats.

type
^^^^

.. java:field:: protected PokemonType type
   :outertype: Move

   Indicates the \ :java:ref:`PokemonType`\  of this move.

usableOutsideBattle
^^^^^^^^^^^^^^^^^^^

.. java:field:: protected boolean usableOutsideBattle
   :outertype: Move

   Indicates whether this move is usable outside of battle.

Methods
-------
getAccuracy
^^^^^^^^^^^

.. java:method:: public int getAccuracy()
   :outertype: Move

   Gets the accuracy of this move.

getMaxPP
^^^^^^^^

.. java:method:: public int getMaxPP()
   :outertype: Move

   Gets the maximum PP for this move.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: Move

   Gets the name of this move.

getPower
^^^^^^^^

.. java:method:: public int getPower()
   :outertype: Move

   Gets the power of this move.

getPriority
^^^^^^^^^^^

.. java:method:: public int getPriority()
   :outertype: Move

   Gets the move priority.

getType
^^^^^^^

.. java:method:: public PokemonType getType()
   :outertype: Move

   Gets the \ :java:ref:`PokemonType`\  of this move.

hasAccuracy
^^^^^^^^^^^

.. java:method:: public boolean hasAccuracy()
   :outertype: Move

   Checks whether this move undergoes miss calculation.

hasPower
^^^^^^^^

.. java:method:: public boolean hasPower()
   :outertype: Move

   Checks whether this move undergoes damage calculation.

hasSecondaryEffect
^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasSecondaryEffect()
   :outertype: Move

   Checks whether this move has a secondary effect.

isSelfTargeting
^^^^^^^^^^^^^^^

.. java:method:: public boolean isSelfTargeting()
   :outertype: Move

   Checks whether this move targets the user instead of its opponent.

isSpecial
^^^^^^^^^

.. java:method:: public boolean isSpecial()
   :outertype: Move

   Check if this move uses the `Special` stats.

isUsableOutsideBattle
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isUsableOutsideBattle()
   :outertype: Move

   Checks whether the move can be used outside of battle.

setAccuracy
^^^^^^^^^^^

.. java:method:: public void setAccuracy(int accuracy)
   :outertype: Move

   Sets the accuracy of this move.

setMaxPP
^^^^^^^^

.. java:method:: public void setMaxPP(int maxPP)
   :outertype: Move

   Sets the maximum PP for this move.

setName
^^^^^^^

.. java:method:: public void setName(String name)
   :outertype: Move

   Sets the name of this move.

setPower
^^^^^^^^

.. java:method:: public void setPower(int power)
   :outertype: Move

   Sets the power of this move.

setPriority
^^^^^^^^^^^

.. java:method:: public void setPriority(int priority)
   :outertype: Move

   Sets the move priority.

setSecondaryEffect
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSecondaryEffect(boolean secondaryEffect)
   :outertype: Move

   Sets whether this move should have a secondary effect.

setSelfTargeting
^^^^^^^^^^^^^^^^

.. java:method:: public void setSelfTargeting(boolean selfTargeting)
   :outertype: Move

   Sets whether this move should target the user instead of its opponent.

setSpecial
^^^^^^^^^^

.. java:method:: public void setSpecial(boolean special)
   :outertype: Move

   Sets whether this move should use the `Special` stats.

setType
^^^^^^^

.. java:method:: public void setType(PokemonType type)
   :outertype: Move

   Sets the \ :java:ref:`PokemonType`\  of this move.

setUsableOutsideBattle
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setUsableOutsideBattle(boolean usableOutsideBattle)
   :outertype: Move

   Sets whether the move should be usable outside of battle.

