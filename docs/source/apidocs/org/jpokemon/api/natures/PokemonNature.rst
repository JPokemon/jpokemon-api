.. java:import:: org.jpokemon.api Manager

PokemonNature
=============

.. java:package:: org.jpokemon.api.natures
   :noindex:

.. java:type:: public class PokemonNature

   Defines a nature (personality) for a Pokémon. The 25 classic natures are instantiated in the \ :java:ref:`ClassicNatures`\  class.

   To define your own nature, construct instances of this class. If you want to add attributes to the nature, it can of course be extended.

   \ **Usage Example**\

   One could create a nature in the following way:

   .. parsed-literal::

      PokemonNature aweseome = new PokemonNature().setName("Awesome");
      awesome.setStatIncreased("Speed").setStatDecreased("Special Defense");
      awesome.setTasteFavorite("Sweet").setTasteDisliked("Bitter");

   :codeauthor: Zach Taylor

   **See also:** :java:ref:`ClassicNatures`, :java:ref:`SimpleNatureManager`

Fields
------

.. java:field:: protected String decreasedStat
   :outertype: PokemonNature

   Indicates the stat decreased by this nature.

.. java:field:: protected String dislikedTaste
   :outertype: PokemonNature

   Indicates the taste disliked by Pokémon of this nature.

.. java:field:: protected String favoriteTaste
   :outertype: PokemonNature

   Indicates the taste favoured by Pokémon of this nature.

.. java:field:: protected String increasedStat
   :outertype: PokemonNature

   Indicates the stat increased by this nature.

.. java:field:: public static Manager<PokemonNature> manager
   :outertype: PokemonNature

   Indicates the manager being used to register items. May be ``null``.

.. java:field:: protected String name
   :outertype: PokemonNature

   Indicates the name of this nature.

Constructors
------------

.. java:constructor:: public PokemonNature()
   :outertype: PokemonNature

   Provides the default constructor.

Methods
-------

.. java:method:: public String getName()
   :outertype: PokemonNature

   Gets the name of this nature.

.. java:method:: public String getStatDecreased()
   :outertype: PokemonNature

   Gets the stat decreased by this nature.

.. java:method:: public String getStatIncreased()
   :outertype: PokemonNature

   Gets the stat increased by this nature.

.. java:method:: public float getStatModifier(String stat)
   :outertype: PokemonNature

   Gets the stat modifier for a given stat as a float.

.. java:method:: public String getTasteDisliked()
   :outertype: PokemonNature

   Gets the disliked taste of this nature.

.. java:method:: public String getTasteFavorite()
   :outertype: PokemonNature

   Gets the taste preference of this nature.

.. java:method:: public PokemonNature setName(String name)
   :outertype: PokemonNature

   Sets the name of this nature.

.. java:method:: public PokemonNature setStatDecreased(String stat)
   :outertype: PokemonNature

   Sets the stat decreased by this nature.

.. java:method:: public PokemonNature setStatIncreased(String stat)
   :outertype: PokemonNature

   Sets the stat increased by this nature.

.. java:method:: public PokemonNature setTasteDisliked(String taste)
   :outertype: PokemonNature

   Sets the disliked taste of this nature.

.. java:method:: public PokemonNature setTasteFavorite(String taste)
   :outertype: PokemonNature

   Sets the favorite taste of this nature.

