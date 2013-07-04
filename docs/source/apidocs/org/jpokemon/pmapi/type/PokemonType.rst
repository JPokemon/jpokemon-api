.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: org.jpokemon.pmapi JPokemonException

PokemonType
===========

.. java:package:: org.jpokemon.pmapi.type
   :noindex:

.. java:type:: public class PokemonType

   Defines a Pokémon type (such as Grass or Dark). For convenience, the classic 17 types are instantiated by the \ :java:ref:`ClassicTypes`\  class. Note that this class will try to register itself with the manager as soon as `setName` is called, so that it will have a name to register under.

   :author: Atheriel

Fields
------
ineffectiveAgainst
^^^^^^^^^^^^^^^^^^

.. java:field:: protected List<String> ineffectiveAgainst
   :outertype: PokemonType

   Indicates the names of types this type is ineffective against (does not affect).

manager
^^^^^^^

.. java:field:: public static TypeManager manager
   :outertype: PokemonType

   Indicates the manager that registers types; must be set before types can be instantiated.

name
^^^^

.. java:field:: protected String name
   :outertype: PokemonType

   Indicates the name of the type.

notVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: protected List<String> notVeryEffectiveAgainst
   :outertype: PokemonType

   Indicates the names of types this type is not very effective against.

superEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^

.. java:field:: protected List<String> superEffectiveAgainst
   :outertype: PokemonType

   Indicates the names of types this type is super-effective against.

Constructors
------------
PokemonType
^^^^^^^^^^^

.. java:constructor:: public PokemonType() throws JPokemonException
   :outertype: PokemonType

   Provides the default constructor.

Methods
-------
getIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getIneffectiveAgainst()
   :outertype: PokemonType

   Gets the list of types this type is ineffective against by name.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonType

   Gets the name of this type.

getNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getNotVeryEffectiveAgainst()
   :outertype: PokemonType

   Gets the list of types this type is not very effective against by name.

getSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getSuperEffectiveAgainst()
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

.. java:method:: public PokemonType setName(String name) throws JPokemonException
   :outertype: PokemonType

   Sets the name of this type, and also registers it with the manager.

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

