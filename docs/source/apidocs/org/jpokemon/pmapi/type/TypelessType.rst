.. java:import:: org.jpokemon.pmapi JPokemonException

TypelessType
============

.. java:package:: org.jpokemon.pmapi.type
   :noindex:

.. java:type:: public class TypelessType extends PokemonType

   Defines a "typeless" Pokémon type (the `????` type). This class will return `false` for all checks against it, and is by default named "????".

Constructors
------------
TypelessType
^^^^^^^^^^^^

.. java:constructor:: public TypelessType() throws JPokemonException
   :outertype: TypelessType

   Provides the default constructor.

Methods
-------
isIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isIneffectiveAgainst(PokemonType type)
   :outertype: TypelessType

   Checks if this type is ineffective against the given type.

   :return: `false`

isIneffectiveAgainst
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isIneffectiveAgainst(String typeName)
   :outertype: TypelessType

   Checks if this type is ineffective against the type of a given name.

   :return: `false`

isNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isNotVeryEffectiveAgainst(PokemonType type)
   :outertype: TypelessType

   Checks if this type is not very effective against the given type.

   :return: `false`

isNotVeryEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isNotVeryEffectiveAgainst(String typeName)
   :outertype: TypelessType

   Checks if this type is not very effective against the type of the given name.

   :return: `false`

isSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isSuperEffectiveAgainst(PokemonType type)
   :outertype: TypelessType

   Checks if this type is super-effective against the given type.

   :return: `false`

isSuperEffectiveAgainst
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public boolean isSuperEffectiveAgainst(String typeName)
   :outertype: TypelessType

   Checks if this type is super-effective against the type of a given name.

   :return: `false`

