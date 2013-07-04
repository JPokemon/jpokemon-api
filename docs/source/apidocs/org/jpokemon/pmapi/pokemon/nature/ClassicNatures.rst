.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Modifier

.. java:import:: java.util ArrayList

.. java:import:: java.util Random

.. java:import:: org.jpokemon.pmapi.util Stat

.. java:import:: org.jpokemon.pmapi.util Taste

ClassicNatures
==============

.. java:package:: org.jpokemon.pmapi.pokemon.nature
   :noindex:

.. java:type:: public final class ClassicNatures

   Defines the 25 classic natures (personalities) that a Pokémon may possess. Note that this class is final. If you want to add or remove natures, it cannot be extended; you must write your own lookup class.

   :author: Atheriel

Fields
------
ADAMANT
^^^^^^^

.. java:field:: public static final PokemonNature ADAMANT
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Serious`.

BASHFUL
^^^^^^^

.. java:field:: public static final PokemonNature BASHFUL
   :outertype: ClassicNatures

   Provides the neutral nature `Bashful`.

BOLD
^^^^

.. java:field:: public static final PokemonNature BOLD
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Bold`.

BRAVE
^^^^^

.. java:field:: public static final PokemonNature BRAVE
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Brave`.

CALM
^^^^

.. java:field:: public static final PokemonNature CALM
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Calm`.

CAREFUL
^^^^^^^

.. java:field:: public static final PokemonNature CAREFUL
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Careful`.

DOCILE
^^^^^^

.. java:field:: public static final PokemonNature DOCILE
   :outertype: ClassicNatures

   Provides the neutral nature `Docile`.

GENTLE
^^^^^^

.. java:field:: public static final PokemonNature GENTLE
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Gentle`.

HARDY
^^^^^

.. java:field:: public static final PokemonNature HARDY
   :outertype: ClassicNatures

   Provides the neutral nature `Hardy`.

HASTY
^^^^^

.. java:field:: public static final PokemonNature HASTY
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Hasty`.

IMPISH
^^^^^^

.. java:field:: public static final PokemonNature IMPISH
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Impish`.

JOLLY
^^^^^

.. java:field:: public static final PokemonNature JOLLY
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Jolly`.

LAX
^^^

.. java:field:: public static final PokemonNature LAX
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Lax`.

LONELY
^^^^^^

.. java:field:: public static final PokemonNature LONELY
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Loneley`.

MILD
^^^^

.. java:field:: public static final PokemonNature MILD
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Mild`.

MODEST
^^^^^^

.. java:field:: public static final PokemonNature MODEST
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Modest`.

NAIVE
^^^^^

.. java:field:: public static final PokemonNature NAIVE
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Naive`.

NAUGHTY
^^^^^^^

.. java:field:: public static final PokemonNature NAUGHTY
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Naughty`.

QUIET
^^^^^

.. java:field:: public static final PokemonNature QUIET
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Quiet`.

QUIRKY
^^^^^^

.. java:field:: public static final PokemonNature QUIRKY
   :outertype: ClassicNatures

   Provides the neutral nature `Quirky`.

RASH
^^^^

.. java:field:: public static final PokemonNature RASH
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Rash`.

RELAXED
^^^^^^^

.. java:field:: public static final PokemonNature RELAXED
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Relaxed`.

SASSY
^^^^^

.. java:field:: public static final PokemonNature SASSY
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Sassy`.

SERIOUS
^^^^^^^

.. java:field:: public static final PokemonNature SERIOUS
   :outertype: ClassicNatures

   Provides the neutral nature `Serious`.

TIMID
^^^^^

.. java:field:: public static final PokemonNature TIMID
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Timid`.

Methods
-------
getRandomNature
^^^^^^^^^^^^^^^

.. java:method:: public static PokemonNature getRandomNature(Random random)
   :outertype: ClassicNatures

   Helper method to get a random nature, with a uniform probability distribution.

   :param random: The \ :java:ref:`Random`\  object to select the nature with.

