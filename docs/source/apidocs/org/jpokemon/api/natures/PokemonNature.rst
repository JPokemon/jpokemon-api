.. java:import:: org.jpokemon.api Manager

PokemonNature
=============

.. java:package:: org.jpokemon.api.natures
   :noindex:

.. java:type:: public class PokemonNature

   Defines a nature (personality) for a Pokémon. The 25 classic natures are instantiated in the \ :java:ref:`ClassicNatures`\  class.

   To define your own nature, construct instances of this class. If you want to add attributes to the nature, it can also be extended.

   :author: Zach Taylor

Fields
------
manager
^^^^^^^

.. java:field:: public static Manager<PokemonNature> manager
   :outertype: PokemonNature

   Indicates the manager being used to register items. May be ``null``.

name
^^^^

.. java:field:: protected String name
   :outertype: PokemonNature

Constructors
------------
PokemonNature
^^^^^^^^^^^^^

.. java:constructor:: public PokemonNature()
   :outertype: PokemonNature

   Provides the default constructor.

Methods
-------
getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonNature

   Gets the name of this nature.

getStatDecreased
^^^^^^^^^^^^^^^^

.. java:method:: public String getStatDecreased()
   :outertype: PokemonNature

   Gets the stat decreased by this nature.

getStatIncreased
^^^^^^^^^^^^^^^^

.. java:method:: public String getStatIncreased()
   :outertype: PokemonNature

   Gets the stat increased by this nature.

getStatModifier
^^^^^^^^^^^^^^^

.. java:method:: public float getStatModifier(String stat)
   :outertype: PokemonNature

   Gets the stat modifier for a given stat as a float.

getTasteDisliked
^^^^^^^^^^^^^^^^

.. java:method:: public String getTasteDisliked()
   :outertype: PokemonNature

   Gets the disliked taste of this nature.

getTasteFavorite
^^^^^^^^^^^^^^^^

.. java:method:: public String getTasteFavorite()
   :outertype: PokemonNature

   Gets the taste preference of this nature.

setName
^^^^^^^

.. java:method:: public PokemonNature setName(String name)
   :outertype: PokemonNature

   Sets the name of this nature.

setStatDecreased
^^^^^^^^^^^^^^^^

.. java:method:: public PokemonNature setStatDecreased(String stat)
   :outertype: PokemonNature

   Sets the stat decreased by this nature.

setStatIncreased
^^^^^^^^^^^^^^^^

.. java:method:: public PokemonNature setStatIncreased(String stat)
   :outertype: PokemonNature

   Sets the stat increased by this nature.

setTasteDisliked
^^^^^^^^^^^^^^^^

.. java:method:: public PokemonNature setTasteDisliked(String taste)
   :outertype: PokemonNature

   Sets the disliked taste of this nature.

setTasteFavorite
^^^^^^^^^^^^^^^^

.. java:method:: public PokemonNature setTasteFavorite(String taste)
   :outertype: PokemonNature

   Sets the favorite taste of this nature.

