.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api Manager

PokemonType
===========

.. java:package:: org.jpokemon.api.types
   :noindex:

.. java:type:: public class PokemonType

   Defines a Pokémon type (such as Grass or Dark). For convenience, the classic 17 types are instantiated by the \ :java:ref:`ClassicTypes`\  class. If a \ :java:ref:`Manager`\  has been defined, calling \ :java:ref:`setName`\  will automatically register it with the manager under that name.

   :author: Zach Taylor

Fields
------
effectivenessMap
^^^^^^^^^^^^^^^^

.. java:field:: protected Map<String, TypeEffectiveness> effectivenessMap
   :outertype: PokemonType

   Defines a mapping of this type's effectiveness against others.

manager
^^^^^^^

.. java:field:: public static Manager<PokemonType> manager
   :outertype: PokemonType

   Indicates the manager that registers types; must be set before types can be instantiated.

name
^^^^

.. java:field:: protected String name
   :outertype: PokemonType

   Indicates the name of the type.

Constructors
------------
PokemonType
^^^^^^^^^^^

.. java:constructor:: public PokemonType()
   :outertype: PokemonType

   Provides the default constructor.

Methods
-------
getIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List<String> getIneffectiveAgainst()
   :outertype: PokemonType

   Gets the list of types this type is ineffective against by name.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonType

   Gets the name of this type.

getNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List<String> getNotVeryEffectiveAgainst()
   :outertype: PokemonType

   Gets the list of types this type is not very effective against by name.

getSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List<String> getSuperEffectiveAgainst()
   :outertype: PokemonType

   Gets the list of types this type is super-effective against by name.

isIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isIneffectiveAgainst(PokemonType type)
   :outertype: PokemonType

   Checks whether this type is ineffective against a given type.

isIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isIneffectiveAgainst(String typeName)
   :outertype: PokemonType

   Checks whether this type is ineffective against a type of the given name.

isNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isNotVeryEffectiveAgainst(PokemonType type)
   :outertype: PokemonType

   Checks whether this type is not very effective against a given type.

isNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isNotVeryEffectiveAgainst(String typeName)
   :outertype: PokemonType

   Checks whether this type is not very effective against a type of the given name.

isSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isSuperEffectiveAgainst(PokemonType type)
   :outertype: PokemonType

   Checks whether this type is super-effective against a given type.

isSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isSuperEffectiveAgainst(String typeName)
   :outertype: PokemonType

   Checks whether this type is super-effective against a type of the given name.

setIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PokemonType setIneffectiveAgainst(String... ineffectiveAgainst)
   :outertype: PokemonType

   Sets the list of types this type is ineffective against by name.

setName
^^^^^^^

.. java:method:: public PokemonType setName(String name)
   :outertype: PokemonType

   Sets the name of this type, and registers it with the \ :java:ref:`TypeManager`\  if one is defined.

setNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PokemonType setNotVeryEffectiveAgainst(String... notVeryEffectiveAgainst)
   :outertype: PokemonType

   Sets the list of types this type is not very effective against by name.

setSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PokemonType setSuperEffectiveAgainst(String... superEffectiveAgainst)
   :outertype: PokemonType

   Sets the list of types this type is super-effective against by name.

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: PokemonType

