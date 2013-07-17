.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Modifier

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api.types PokemonType

.. java:import:: org.jpokemon.api.types TypelessType

ClassicTypes
============

.. java:package:: org.jpokemon.api.classic
   :noindex:

.. java:type:: public class ClassicTypes

   Defines the list of the 17 classic Pokémon types. This class functions very much like an enum, providing constants that can be referenced by Moves and Species, and also provides the functionality of a \ :java:ref:`TypeManager`\ . If you wish to add a new type, simply instantiate one and give it a name. To modify a type, you can modify the static field of this class that refers to it, or retrieve the instance by name with `getType`. Both are equivalent.

   :author: Zach Taylor

Fields
------
BUG
^^^

.. java:field:: public static final PokemonType BUG
   :outertype: ClassicTypes

   Provides the classic type `BUG`.

DARK
^^^^

.. java:field:: public static final PokemonType DARK
   :outertype: ClassicTypes

   Provides the classic type `DARK`.

DRAGON
^^^^^^

.. java:field:: public static final PokemonType DRAGON
   :outertype: ClassicTypes

   Provides the classic type `DRAGON`.

ELECTRIC
^^^^^^^^

.. java:field:: public static final PokemonType ELECTRIC
   :outertype: ClassicTypes

   Provides the classic type `ELECTRIC`.

FIGHTING
^^^^^^^^

.. java:field:: public static final PokemonType FIGHTING
   :outertype: ClassicTypes

   Provides the classic type `FIGHTING`.

FIRE
^^^^

.. java:field:: public static final PokemonType FIRE
   :outertype: ClassicTypes

   Provides the classic type `FIRE`.

FLYING
^^^^^^

.. java:field:: public static final PokemonType FLYING
   :outertype: ClassicTypes

   Provides the classic type `FLYING`.

GHOST
^^^^^

.. java:field:: public static final PokemonType GHOST
   :outertype: ClassicTypes

   Provides the classic type `GHOST`.

GRASS
^^^^^

.. java:field:: public static final PokemonType GRASS
   :outertype: ClassicTypes

   Provides the classic type `GRASS`.

GROUND
^^^^^^

.. java:field:: public static final PokemonType GROUND
   :outertype: ClassicTypes

   Provides the classic type `GROUND`.

ICE
^^^

.. java:field:: public static final PokemonType ICE
   :outertype: ClassicTypes

   Provides the classic type `ICE`.

NORMAL
^^^^^^

.. java:field:: public static final PokemonType NORMAL
   :outertype: ClassicTypes

   Provides the classic type `NORMAL`.

POISON
^^^^^^

.. java:field:: public static final PokemonType POISON
   :outertype: ClassicTypes

   Provides the classic type `POISON`.

PSYCHIC
^^^^^^^

.. java:field:: public static final PokemonType PSYCHIC
   :outertype: ClassicTypes

   Provides the classic type `PSYCHIC`.

ROCK
^^^^

.. java:field:: public static final PokemonType ROCK
   :outertype: ClassicTypes

   Provides the classic type `ROCK`.

STEEL
^^^^^

.. java:field:: public static final PokemonType STEEL
   :outertype: ClassicTypes

   Provides the classic type `STEEL`.

TYPELESS
^^^^^^^^

.. java:field:: public static final PokemonType TYPELESS
   :outertype: ClassicTypes

   Provides the classic type `????`.

WATER
^^^^^

.. java:field:: public static final PokemonType WATER
   :outertype: ClassicTypes

   Provides the classic type `WATER`.

Methods
-------
init
^^^^

.. java:method:: public static void init()
   :outertype: ClassicTypes

   Initializes the classic types, and registers them with the \ :java:ref:`PokemonType.manager`\

