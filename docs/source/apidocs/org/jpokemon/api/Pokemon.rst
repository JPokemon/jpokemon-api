.. java:import:: java.util ArrayList

.. java:import:: java.util Collections

.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api.species PokemonSpecies

.. java:import:: org.jpokemon.api.moves MoveInstance

Pokemon
=======

.. java:package:: org.jpokemon.api
   :noindex:

.. java:type:: public class Pokemon

   Defines a particular instance of a Pokémon. STUBBED.

   :codeauthor: Zach Taylor

Fields
------

.. java:field:: protected List<MoveInstance> moves
   :outertype: Pokemon

   Indicates the moves of this Pokémon

.. java:field:: protected String name
   :outertype: Pokemon

   Indicates the name of this Pokémon.

.. java:field:: protected PokemonSpecies species
   :outertype: Pokemon

   Indicates the species of this Pokémon.

.. java:field:: protected Map<String, Stat> stats
   :outertype: Pokemon

   Indicates the stats of this Pokémon

Constructors
------------

.. java:constructor:: public Pokemon()
   :outertype: Pokemon

   Provides the default constructor.

Methods
-------

.. java:method:: public Pokemon addMove(MoveInstance move)
   :outertype: Pokemon

   Adds a move to this Pokémon's move set

.. java:method:: public Pokemon addStat(String name, Stat stat)
   :outertype: Pokemon

   Adds a Stat to this Pokémon with the specified name

.. java:method:: public MoveInstance getMove(int index)
   :outertype: Pokemon

   Gets the move with the specified index in this Pokémon's move set

.. java:method:: public List<MoveInstance> getMoves()
   :outertype: Pokemon

   Gets the moves associated with this Pokemon as a list

.. java:method:: public String getName()
   :outertype: Pokemon

   Gets the name of this Pokémon.

.. java:method:: public Stat getStat(String name)
   :outertype: Pokemon

   Gets a Stat from this Pokémon using the specified name

.. java:method:: public List<Stat> getStats()
   :outertype: Pokemon

   Gets the stats associated with this Pokémon as a list

.. java:method:: public MoveInstance removeMove(int index)
   :outertype: Pokemon

   Removes a move from this Pokémon's move set at the specified index

.. java:method:: public Pokemon removeMove(MoveInstance move)
   :outertype: Pokemon

   Removes the specified MoveInstance from this Pokémon's move set

.. java:method:: public Stat removeStat(String name)
   :outertype: Pokemon

   Removes a Stat with the specified name from this Pokémon.

.. java:method:: public Pokemon setName(String name)
   :outertype: Pokemon

   Sets the name of this Pokémon.

