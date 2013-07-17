.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Modifier

.. java:import:: java.util HashMap

ExperienceCurve
===============

.. java:package:: org.jpokemon.api.classic
   :noindex:

.. java:type:: public final class ExperienceCurve

   Defines the available experience curves for a Pokémon. For justification, see the entry in [Bulbapedia][l_1]. This class also contains static methods to retrieve the appropriate curve by name or byte identifier. [l_1]: http://bulbapedia.bulbagarden.net/wiki/Experience#Relation_to_level

   :author: Atheriel

Fields
------
ERRATIC
^^^^^^^

.. java:field:: public static final ExperienceCurve ERRATIC
   :outertype: ExperienceCurve

   Indicates the Pokémon has an `Erratic` experience curve.

FAST
^^^^

.. java:field:: public static final ExperienceCurve FAST
   :outertype: ExperienceCurve

   Indicates the Pokémon has a `Fast` experience curve.

FLUCTUATING
^^^^^^^^^^^

.. java:field:: public static final ExperienceCurve FLUCTUATING
   :outertype: ExperienceCurve

   Indicates the Pokémon has a `Fluctuating` experience curve.

MEDIUM_FAST
^^^^^^^^^^^

.. java:field:: public static final ExperienceCurve MEDIUM_FAST
   :outertype: ExperienceCurve

   Indicates the Pokémon has a `Medium Fast` experience curve.

MEDIUM_SLOW
^^^^^^^^^^^

.. java:field:: public static final ExperienceCurve MEDIUM_SLOW
   :outertype: ExperienceCurve

   Indicates the Pokémon has a `Medium Slow` experience curve.

SLOW
^^^^

.. java:field:: public static final ExperienceCurve SLOW
   :outertype: ExperienceCurve

   Indicates the Pokémon has a `Slow` experience curve.

Methods
-------
getAsByte
^^^^^^^^^

.. java:method:: public byte getAsByte()
   :outertype: ExperienceCurve

   Gets the experience curve as a byte.

getExperienceCurveByByteId
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ExperienceCurve getExperienceCurveByByteId(byte byteId)
   :outertype: ExperienceCurve

   Gets the experience curve with the given byte representation.

getExperienceCurveByName
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ExperienceCurve getExperienceCurveByName(String name)
   :outertype: ExperienceCurve

   Gets the experience curve with the given name.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: ExperienceCurve

   Gets the name of the experience curve.

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: ExperienceCurve

   Returns a String representation of the curve.

   :return: The name of the curve as a String.

