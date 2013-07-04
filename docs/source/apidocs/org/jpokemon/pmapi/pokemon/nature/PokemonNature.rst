.. java:import:: org.jpokemon.pmapi.util Stat

.. java:import:: org.jpokemon.pmapi.util Taste

PokemonNature
=============

.. java:package:: org.jpokemon.pmapi.pokemon.nature
   :noindex:

.. java:type:: public class PokemonNature

   Defines a nature (personality) for a Pokémon. The 25 classic natures are instantiated in the \ :java:ref:`ClassicNatures`\  class. To define your own nature, construct an instance of this class. If you want to add attributes to the nature, it can also be extended.

   :author: Atheriel

Fields
------
increased
^^^^^^^^^

.. java:field:: protected final Stat increased
   :outertype: PokemonNature

name
^^^^

.. java:field:: protected final String name
   :outertype: PokemonNature

preference
^^^^^^^^^^

.. java:field:: protected final Taste preference
   :outertype: PokemonNature

Constructors
------------
PokemonNature
^^^^^^^^^^^^^

.. java:constructor:: public PokemonNature(String name, Stat increased, Stat decreased, Taste preference)
   :outertype: PokemonNature

Methods
-------
getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonNature

   Gets the name of this nature.

getStatDecreased
^^^^^^^^^^^^^^^^

.. java:method:: public Stat getStatDecreased()
   :outertype: PokemonNature

   Gets the stat decreased by this nature.

getStatIncreased
^^^^^^^^^^^^^^^^

.. java:method:: public Stat getStatIncreased()
   :outertype: PokemonNature

   Gets the stat increased by this nature.

getStatModifier
^^^^^^^^^^^^^^^

.. java:method:: public float getStatModifier(Stat stat)
   :outertype: PokemonNature

   Gets the stat modifier for a given stat.

getTastePreference
^^^^^^^^^^^^^^^^^^

.. java:method:: public Taste getTastePreference()
   :outertype: PokemonNature

   Gets the taste preference of this nature.

