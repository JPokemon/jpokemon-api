.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Modifier

.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: java.util Random

.. java:import:: org.jpokemon.api.natures PokemonNature

ClassicNatures
==============

.. java:package:: org.jpokemon.api.classic
   :noindex:

.. java:type:: public final class ClassicNatures

   Defines the 25 classic natures (personalities) that a Pokémon may possess. Note that this class is final. If you want to add or remove natures, it cannot be extended; you must write your own lookup class.

   :codeauthor: Zach Taylor

Fields
------

.. java:field:: public static final PokemonNature ADAMANT
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Serious`.

.. java:field:: public static final PokemonNature BASHFUL
   :outertype: ClassicNatures

   Provides the neutral nature `Bashful`.

.. java:field:: public static final PokemonNature BOLD
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Bold`.

.. java:field:: public static final PokemonNature BRAVE
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Brave`.

.. java:field:: public static final PokemonNature CALM
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Calm`.

.. java:field:: public static final PokemonNature CAREFUL
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Careful`.

.. java:field:: public static final PokemonNature DOCILE
   :outertype: ClassicNatures

   Provides the neutral nature `Docile`.

.. java:field:: public static final PokemonNature GENTLE
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Gentle`.

.. java:field:: public static final PokemonNature HARDY
   :outertype: ClassicNatures

   Provides the neutral nature `Hardy`.

.. java:field:: public static final PokemonNature HASTY
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Hasty`.

.. java:field:: public static final PokemonNature IMPISH
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Impish`.

.. java:field:: public static final PokemonNature JOLLY
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Jolly`.

.. java:field:: public static final PokemonNature LAX
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Lax`.

.. java:field:: public static final PokemonNature LONELY
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Loneley`.

.. java:field:: public static final PokemonNature MILD
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Mild`.

.. java:field:: public static final PokemonNature MODEST
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Modest`.

.. java:field:: public static final PokemonNature NAIVE
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Naive`.

.. java:field:: public static final PokemonNature NAUGHTY
   :outertype: ClassicNatures

   Provides the spice-loving, attack increasing nature `Naughty`.

.. java:field:: public static final PokemonNature QUIET
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Quiet`.

.. java:field:: public static final PokemonNature QUIRKY
   :outertype: ClassicNatures

   Provides the neutral nature `Quirky`.

.. java:field:: public static final PokemonNature RASH
   :outertype: ClassicNatures

   Provides the dry-loving, attack increasing nature `Rash`.

.. java:field:: public static final PokemonNature RELAXED
   :outertype: ClassicNatures

   Provides the sour-loving, defense increasing nature `Relaxed`.

.. java:field:: public static final PokemonNature SASSY
   :outertype: ClassicNatures

   Provides the bitter-loving, defense increasing nature `Sassy`.

.. java:field:: public static final PokemonNature SERIOUS
   :outertype: ClassicNatures

   Provides the neutral nature `Serious`.

.. java:field:: public static final PokemonNature TIMID
   :outertype: ClassicNatures

   Provides the sweet-loving, speed increasing nature `Timid`.

Methods
-------

.. java:method:: public static PokemonNature getRandomNature(Random random)
   :outertype: ClassicNatures

   Helper method to get a random nature, with a uniform probability distribution.

   :param random: The \ :java:ref:`Random`\  object to select the nature with.

.. java:method:: public static void init()
   :outertype: ClassicNatures

   Initializes the classic natures, and registers them with the \ :java:ref:`PokemonNature.manager`\

