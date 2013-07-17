.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api.evolutions PokemonEvolution

.. java:import:: org.jpokemon.api.types PokemonType

.. java:import:: org.jpokemon.api.classic ExperienceCurve

PokemonSpecies
==============

.. java:package:: org.jpokemon.api.species
   :noindex:

.. java:type:: public class PokemonSpecies

   Defines a Pokemon species. Note that this refers to an object like `Bublasaur` and not the tag `Seed Pokemon`.

   :author: atheriel@gmail.com

Fields
------
baseStats
^^^^^^^^^

.. java:field:: protected Map<String, Integer> baseStats
   :outertype: PokemonSpecies

   Indicates the base stats (hp, atk, def, satk, sdef, spd, exp) for this species.

breedable
^^^^^^^^^

.. java:field:: protected boolean breedable
   :outertype: PokemonSpecies

   Indicates whether this species is breedable in any way.

catchRate
^^^^^^^^^

.. java:field:: protected int catchRate
   :outertype: PokemonSpecies

   Indicates the difficulty in catching this species.

colour
^^^^^^

.. java:field:: protected String colour
   :outertype: PokemonSpecies

   Indicates the colour of the species (as it appears in a Pokédex entry).

dexEntry
^^^^^^^^

.. java:field:: protected String dexEntry
   :outertype: PokemonSpecies

   Indicates the description of the species (as it appears in a Pokédex entry).

dreamAbility
^^^^^^^^^^^^

.. java:field:: protected String dreamAbility
   :outertype: PokemonSpecies

   Indicates the dream world Ability of this species (If none, is set to primary ability)

effortValues
^^^^^^^^^^^^

.. java:field:: protected Map<String, Integer> effortValues
   :outertype: PokemonSpecies

   Indicates the EVs gained (hp, atk, def, satk, sdef, spd) from defeating this species.

eggGroup
^^^^^^^^

.. java:field:: protected int eggGroup
   :outertype: PokemonSpecies

   Indicates the first egg group of this species.

eggMoveList
^^^^^^^^^^^

.. java:field:: protected String eggMoveList
   :outertype: PokemonSpecies

   Indicates the egg moves for this species.

evolutions
^^^^^^^^^^

.. java:field:: protected ArrayList<PokemonEvolution> evolutions
   :outertype: PokemonSpecies

   Indicates the evolutions for this species (if it has any).

expCurve
^^^^^^^^

.. java:field:: protected ExperienceCurve expCurve
   :outertype: PokemonSpecies

   Indicates this species' experience gain behaviour.

genderless
^^^^^^^^^^

.. java:field:: protected boolean genderless
   :outertype: PokemonSpecies

   Indicates whether this species is genderless.

genus
^^^^^

.. java:field:: protected String genus
   :outertype: PokemonSpecies

   Indicates the Genus (the "species" in the classic games) of this species.

height
^^^^^^

.. java:field:: protected float height
   :outertype: PokemonSpecies

   Indicates the average height of the species (as it appears in a Pokédex entry).

machineMoveList
^^^^^^^^^^^^^^^

.. java:field:: protected String machineMoveList
   :outertype: PokemonSpecies

   Indicates the moves that can be learned from machines by this species.

moveList
^^^^^^^^

.. java:field:: protected HashMap<Integer, String> moveList
   :outertype: PokemonSpecies

   Indicates the moves learned at a given level by this species.

name
^^^^

.. java:field:: protected String name
   :outertype: PokemonSpecies

   Indicates the name of this species.

percentMale
^^^^^^^^^^^

.. java:field:: protected float percentMale
   :outertype: PokemonSpecies

   Indicates what percentage of this species are male.

pokedexNo
^^^^^^^^^

.. java:field:: protected int pokedexNo
   :outertype: PokemonSpecies

   Indicates this species' number in the National Pokédex.

primaryAbility
^^^^^^^^^^^^^^

.. java:field:: protected String primaryAbility
   :outertype: PokemonSpecies

   Indicates the primary Ability of this species.

primaryType
^^^^^^^^^^^

.. java:field:: protected PokemonType primaryType
   :outertype: PokemonSpecies

   Indicates the primary type of this species.

regionalNo
^^^^^^^^^^

.. java:field:: protected int regionalNo
   :outertype: PokemonSpecies

   Indicates this species' number in the Regional Pokédex

secondEggGroup
^^^^^^^^^^^^^^

.. java:field:: protected int secondEggGroup
   :outertype: PokemonSpecies

   Indicates the second egg group of this species (if it has one).

secondaryAbility
^^^^^^^^^^^^^^^^

.. java:field:: protected String secondaryAbility
   :outertype: PokemonSpecies

   Indicates the secondary Ability of this species (if it has one).

secondaryType
^^^^^^^^^^^^^

.. java:field:: protected PokemonType secondaryType
   :outertype: PokemonSpecies

   Indicates the secondary type of this species (if it has one).

steps
^^^^^

.. java:field:: protected int steps
   :outertype: PokemonSpecies

   Indicates the number of steps required to hatch an egg of this species.

tameness
^^^^^^^^

.. java:field:: protected int tameness
   :outertype: PokemonSpecies

   Indicates the basic level of happiness of this species.

weight
^^^^^^

.. java:field:: protected float weight
   :outertype: PokemonSpecies

   Indicates the average weight of the species (as it appears in a Pokédex entry).

Constructors
------------
PokemonSpecies
^^^^^^^^^^^^^^

.. java:constructor:: public PokemonSpecies()
   :outertype: PokemonSpecies

   Provides the default constructor.

Methods
-------
getBaseStat
^^^^^^^^^^^

.. java:method:: public int getBaseStat(String name)
   :outertype: PokemonSpecies

   Gets a base stat with the given name for this species. Note that an invalid key will retrieve a value of 0.

   :param name: The name of the base stat, e.g. "Attack".
   :return: The integer value of the base stat, e.g. 47.

getBaseStats
^^^^^^^^^^^^

.. java:method:: public Map<String, Integer> getBaseStats()
   :outertype: PokemonSpecies

   Gets the base stats for this species as a map of name keys to integer values.

getCatchRate
^^^^^^^^^^^^

.. java:method:: public int getCatchRate()
   :outertype: PokemonSpecies

   Gets the catch rate for this species.

getColour
^^^^^^^^^

.. java:method:: public String getColour()
   :outertype: PokemonSpecies

   Gets this species' colour classification.

getDreamAbility
^^^^^^^^^^^^^^^

.. java:method:: public String getDreamAbility()
   :outertype: PokemonSpecies

   Gets this species' dreamworld (hidden) ability.

getEffortValue
^^^^^^^^^^^^^^

.. java:method:: public int getEffortValue(String name)
   :outertype: PokemonSpecies

   Gets the effort value with a given name awarded for defeating this species. Note that an invalid key will retrieve a value of 0.

   :param name: The name of the effort value, typicaly a base stat.
   :return: The integer value of the EV, e.g. 3.

getEffortValues
^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Integer> getEffortValues()
   :outertype: PokemonSpecies

   Gets the effort values awarded for defeating this species as a map of name keys to integer values.

getEggGroup
^^^^^^^^^^^

.. java:method:: public int getEggGroup()
   :outertype: PokemonSpecies

   Gets the egg group for this species.

getEggMoves
^^^^^^^^^^^

.. java:method:: public String getEggMoves()
   :outertype: PokemonSpecies

   Gets the list of moves that can be learned by breeding.

getExperienceCurveType
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public ExperienceCurve getExperienceCurveType()
   :outertype: PokemonSpecies

   Gets the type of experience curve for this species.

getGenus
^^^^^^^^

.. java:method:: public String getGenus()
   :outertype: PokemonSpecies

   Gets the genus of this species.

getHeight
^^^^^^^^^

.. java:method:: public float getHeight()
   :outertype: PokemonSpecies

   Gets this species' average height.

getMachineMoves
^^^^^^^^^^^^^^^

.. java:method:: public String getMachineMoves()
   :outertype: PokemonSpecies

   Gets the list of moves that can be learned by TMs and HMs.

getMaleRatio
^^^^^^^^^^^^

.. java:method:: public float getMaleRatio()
   :outertype: PokemonSpecies

   Gets the proportion of this species that are male.

getMoveList
^^^^^^^^^^^

.. java:method:: public HashMap<Integer, String> getMoveList()
   :outertype: PokemonSpecies

   Sets the move list learned by levelling up.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonSpecies

   Gets the name of this species.

getPokedexEntry
^^^^^^^^^^^^^^^

.. java:method:: public String getPokedexEntry()
   :outertype: PokemonSpecies

   Gets the Pokédex entry for this species.

getPokedexNumber
^^^^^^^^^^^^^^^^

.. java:method:: public int getPokedexNumber()
   :outertype: PokemonSpecies

   Get the Pokédex number for this species.

getPrimaryAbility
^^^^^^^^^^^^^^^^^

.. java:method:: public String getPrimaryAbility()
   :outertype: PokemonSpecies

   Gets the primary ability of this species.

getPrimaryType
^^^^^^^^^^^^^^

.. java:method:: public PokemonType getPrimaryType()
   :outertype: PokemonSpecies

   Gets the primary type for this species.

getRegionalPokedexNumber
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int getRegionalPokedexNumber()
   :outertype: PokemonSpecies

   Get the Regional Pokédex number for this species.

getSecondEggGroup
^^^^^^^^^^^^^^^^^

.. java:method:: public int getSecondEggGroup()
   :outertype: PokemonSpecies

   Gets the second egg group for this species (if it has one).

getSecondaryAbility
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getSecondaryAbility()
   :outertype: PokemonSpecies

   Gets this species' secondary ability.

getSecondaryType
^^^^^^^^^^^^^^^^

.. java:method:: public PokemonType getSecondaryType()
   :outertype: PokemonSpecies

   Gets the secondary type for this species (assuming it has one).

getSteps
^^^^^^^^

.. java:method:: public int getSteps()
   :outertype: PokemonSpecies

   Get the number of steps required to hatch an egg for this species.

getTameness
^^^^^^^^^^^

.. java:method:: public int getTameness()
   :outertype: PokemonSpecies

   Gets the base level of happiness for this species.

getWeight
^^^^^^^^^

.. java:method:: public float getWeight()
   :outertype: PokemonSpecies

   Gets this species' average weight.

hasDreamAbility
^^^^^^^^^^^^^^^

.. java:method:: public boolean hasDreamAbility()
   :outertype: PokemonSpecies

   Checks if this species has a dreamworld (hidden) ability.

hasEvolution
^^^^^^^^^^^^

.. java:method:: public boolean hasEvolution()
   :outertype: PokemonSpecies

   Checks whether this species evolves into another at some point.

hasSecondEggGroup
^^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasSecondEggGroup()
   :outertype: PokemonSpecies

   Checks if this species has a second egg group

hasSecondaryAbility
^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasSecondaryAbility()
   :outertype: PokemonSpecies

   Checks if this species has a secondary ability.

hasSecondaryType
^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasSecondaryType()
   :outertype: PokemonSpecies

   Checks whether this species has a secondary type.

isBreedable
^^^^^^^^^^^

.. java:method:: public boolean isBreedable()
   :outertype: PokemonSpecies

   Checks whether this species can be bred at all.

isGenderless
^^^^^^^^^^^^

.. java:method:: public boolean isGenderless()
   :outertype: PokemonSpecies

   Checks whether this species is genderless.

setBaseStat
^^^^^^^^^^^

.. java:method:: public void setBaseStat(String name, int value)
   :outertype: PokemonSpecies

   Sets a base stat with the given name for this species. Instantiates the base stat map if necessary.

   :param name: The name of the base stat, e.g. "Attack".
   :param value: The integer value of the base stat, e.g. 47.

setBaseStats
^^^^^^^^^^^^

.. java:method:: public void setBaseStats(Map<String, Integer> baseStats)
   :outertype: PokemonSpecies

   Sets the base stats for this species.

   :param baseStats: A map of name keys to integer values.

setBreedable
^^^^^^^^^^^^

.. java:method:: public void setBreedable(boolean breedable)
   :outertype: PokemonSpecies

   Sets whether this species can be bred at all.

setCatchRate
^^^^^^^^^^^^

.. java:method:: public void setCatchRate(int catchRate)
   :outertype: PokemonSpecies

   Sets the catch rate for this species.

setColour
^^^^^^^^^

.. java:method:: public void setColour(String colour)
   :outertype: PokemonSpecies

   Sets this species' colour classification.

setDreamAbility
^^^^^^^^^^^^^^^

.. java:method:: public void setDreamAbility(String ability)
   :outertype: PokemonSpecies

   Sets this species' dreamworld (hidden) ability.

setEffortValue
^^^^^^^^^^^^^^

.. java:method:: public void setEffortValue(String name, int value)
   :outertype: PokemonSpecies

   Sets the effort value with a given name awarded for defeating this species. Instantiates the effort value map if necessary.

   :param name: The name of the effort value, typicaly a base stat.
   :param value: The integer value of the EV, e.g. 3.

setEffortValues
^^^^^^^^^^^^^^^

.. java:method:: public void setEffortValues(Map<String, Integer> effortValues)
   :outertype: PokemonSpecies

   Sets the effort values awarded for defeating this species.

   :param effortValues: A map of name keys to integer values.

setEggGroup
^^^^^^^^^^^

.. java:method:: public void setEggGroup(int eggGroup)
   :outertype: PokemonSpecies

   Sets the egg group for this species.

setEggMoves
^^^^^^^^^^^

.. java:method:: public void setEggMoves(String eggMoveList)
   :outertype: PokemonSpecies

   Sets the list of moves that can be learned by breeding.

setExperienceCurve
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setExperienceCurve(ExperienceCurve expCurve)
   :outertype: PokemonSpecies

   Sets the type of experience curve for this species.

setGenderless
^^^^^^^^^^^^^

.. java:method:: public void setGenderless(boolean genderless)
   :outertype: PokemonSpecies

   Sets whether this species should be genderless.

setGenus
^^^^^^^^

.. java:method:: public void setGenus(String genus)
   :outertype: PokemonSpecies

   Sets the genus of this species.

setHeight
^^^^^^^^^

.. java:method:: public void setHeight(float height)
   :outertype: PokemonSpecies

   Sets this species' average height.

setMachineMoves
^^^^^^^^^^^^^^^

.. java:method:: public void setMachineMoves(String machineMoveList)
   :outertype: PokemonSpecies

   Sets the list of moves that can be learned by TMs and HMs.

setMaleRatio
^^^^^^^^^^^^

.. java:method:: public void setMaleRatio(float percentMale)
   :outertype: PokemonSpecies

   Sets the proportion of this species that should be male.

setMoveList
^^^^^^^^^^^

.. java:method:: public void setMoveList(HashMap<Integer, String> moveList)
   :outertype: PokemonSpecies

   Sets the move list learned by levelling up.

setName
^^^^^^^

.. java:method:: public void setName(String name)
   :outertype: PokemonSpecies

   Sets the name of this species.

setPokedexEntry
^^^^^^^^^^^^^^^

.. java:method:: public void setPokedexEntry(String dexEntry)
   :outertype: PokemonSpecies

   Sets the Pokédex entry for this species.

setPokedexNumber
^^^^^^^^^^^^^^^^

.. java:method:: public void setPokedexNumber(int dexNo)
   :outertype: PokemonSpecies

   Set the Pokédex number for this species.

setPrimaryAbility
^^^^^^^^^^^^^^^^^

.. java:method:: public void setPrimaryAbility(String ability)
   :outertype: PokemonSpecies

   Sets the primary ability of this species.

setPrimaryType
^^^^^^^^^^^^^^

.. java:method:: public void setPrimaryType(PokemonType type)
   :outertype: PokemonSpecies

   Sets the primary type for this species.

setRegionalPokedexNumber
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setRegionalPokedexNumber(int dexNo)
   :outertype: PokemonSpecies

   Set the Regional Pokédex number for this species.

setSecondEggGroup
^^^^^^^^^^^^^^^^^

.. java:method:: public void setSecondEggGroup(int secondEggGroup)
   :outertype: PokemonSpecies

   Sets the second egg group for this species.

setSecondaryAbility
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSecondaryAbility(String ability)
   :outertype: PokemonSpecies

   Sets this species' secondary ability.

setSecondaryType
^^^^^^^^^^^^^^^^

.. java:method:: public void setSecondaryType(PokemonType type)
   :outertype: PokemonSpecies

   Sets the secondary type for this species.

setSteps
^^^^^^^^

.. java:method:: public void setSteps(int steps)
   :outertype: PokemonSpecies

   Sets the number of steps required to hatch an egg for this species.

setTameness
^^^^^^^^^^^

.. java:method:: public void setTameness(int tameness)
   :outertype: PokemonSpecies

   Sets the base level of happiness for this species.

setWeight
^^^^^^^^^

.. java:method:: public void setWeight(float weight)
   :outertype: PokemonSpecies

   Sets this species' average weight.

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: PokemonSpecies

