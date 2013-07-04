.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Modifier

.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.pmapi JPokemonException

ClassicTypes
============

.. java:package:: org.jpokemon.pmapi.type
   :noindex:

.. java:type:: public class ClassicTypes extends SimpleTypeManager

   Defines the list of the 17 classic Pokémon types. This class functions very much like an enum, providing constants that can be referenced by Moves and Species, and also provides the functionality of a \ :java:ref:`TypeManager`\  If you wish to add a new type, simply instantiate one and give it a name. To modify a type, you can modify the static field of this class that refers to it, or retrieve the instance by name with `getType`. Both are equivalent.

   :author: Atheriel

Fields
------
BUG
^^^

.. java:field:: public static PokemonType BUG
   :outertype: ClassicTypes

   Provides the classic type `BUG`.

DARK
^^^^

.. java:field:: public static PokemonType DARK
   :outertype: ClassicTypes

   Provides the classic type `DARK`.

DRAGON
^^^^^^

.. java:field:: public static PokemonType DRAGON
   :outertype: ClassicTypes

   Provides the classic type `DRAGON`.

ELECTRIC
^^^^^^^^

.. java:field:: public static PokemonType ELECTRIC
   :outertype: ClassicTypes

   Provides the classic type `ELECTRIC`.

FIGHTING
^^^^^^^^

.. java:field:: public static PokemonType FIGHTING
   :outertype: ClassicTypes

   Provides the classic type `FIGHTING`.

FIRE
^^^^

.. java:field:: public static PokemonType FIRE
   :outertype: ClassicTypes

   Provides the classic type `FIRE`.

FLYING
^^^^^^

.. java:field:: public static PokemonType FLYING
   :outertype: ClassicTypes

   Provides the classic type `FLYING`.

GHOST
^^^^^

.. java:field:: public static PokemonType GHOST
   :outertype: ClassicTypes

   Provides the classic type `GHOST`.

GRASS
^^^^^

.. java:field:: public static PokemonType GRASS
   :outertype: ClassicTypes

   Provides the classic type `GRASS`.

GROUND
^^^^^^

.. java:field:: public static PokemonType GROUND
   :outertype: ClassicTypes

   Provides the classic type `GROUND`.

ICE
^^^

.. java:field:: public static PokemonType ICE
   :outertype: ClassicTypes

   Provides the classic type `ICE`.

NORMAL
^^^^^^

.. java:field:: public static PokemonType NORMAL
   :outertype: ClassicTypes

   Provides the classic type `NORMAL`.

POISON
^^^^^^

.. java:field:: public static PokemonType POISON
   :outertype: ClassicTypes

   Provides the classic type `POISON`.

PSYCHIC
^^^^^^^

.. java:field:: public static PokemonType PSYCHIC
   :outertype: ClassicTypes

   Provides the classic type `PSYCHIC`.

ROCK
^^^^

.. java:field:: public static PokemonType ROCK
   :outertype: ClassicTypes

   Provides the classic type `ROCK`.

STEEL
^^^^^

.. java:field:: public static PokemonType STEEL
   :outertype: ClassicTypes

   Provides the classic type `STEEL`.

TYPELESS
^^^^^^^^

.. java:field:: public static PokemonType TYPELESS
   :outertype: ClassicTypes

   Provides the classic type `????`.

WATER
^^^^^

.. java:field:: public static PokemonType WATER
   :outertype: ClassicTypes

   Provides the classic type `WATER`.

Methods
-------
getType
^^^^^^^

.. java:method:: public static PokemonType getType(String name)
   :outertype: ClassicTypes

   Gets a known type by name, including additional ones.

   :param name: The name of the type requested.
   :return: The \ :java:ref:`PokemonType`\  for this type.

init
^^^^

.. java:method:: public static void init()
   :outertype: ClassicTypes

   Initializes the classic types. This method can be called if you do not want to rely on this singleton class being initialized by the first call to one of its fields or methods.

isKnown
^^^^^^^

.. java:method:: public static boolean isKnown(PokemonType type)
   :outertype: ClassicTypes

   Checks if a type is as known by ClassicTypes.

   :return: `true` if the type is known.

isKnown
^^^^^^^

.. java:method:: public static boolean isKnown(String typeName)
   :outertype: ClassicTypes

   Checks if a type is as known by ClassicTypes.

   :return: `true` if the type is known.

