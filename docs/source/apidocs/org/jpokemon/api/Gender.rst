.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: java.util Random

Gender
======

.. java:package:: org.jpokemon.api
   :noindex:

.. java:type:: public class Gender

   Defines a gender, as it is assigned to a trainer or Pokémon. Provides some convenient language and random generation functionality as well.

   :author: atheriel@gmail.com

Fields
------
FEMALE
^^^^^^

.. java:field:: public static final Gender FEMALE
   :outertype: Gender

   Indicates the possession of "Female" gender.

GENDERLESS
^^^^^^^^^^

.. java:field:: public static final Gender GENDERLESS
   :outertype: Gender

   Indicates the possession of neither "Male" nor "Female" gender.

MALE
^^^^

.. java:field:: public static final Gender MALE
   :outertype: Gender

   Indicates the possession of "Male" gender.

Methods
-------
getGenderByName
^^^^^^^^^^^^^^^

.. java:method:: public static Gender getGenderByName(String name)
   :outertype: Gender

   Gets the appropriate gender for the given name.

getGenders
^^^^^^^^^^

.. java:method:: public static List<Gender> getGenders()
   :outertype: Gender

   Gets the list of all available genders.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: Gender

   Gets the name of this gender.

getObjectPronoun
^^^^^^^^^^^^^^^^

.. java:method:: public String getObjectPronoun()
   :outertype: Gender

   Gets the object pronoun for this gender.

getPossessiveDeterminer
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPossessiveDeterminer()
   :outertype: Gender

   Gets the possessive determiner pronoun for this gender.

getPossessivePronoun
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPossessivePronoun()
   :outertype: Gender

   Gets the possessive pronoun for this gender.

getRandomBinaryGender
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static Gender getRandomBinaryGender(Random random)
   :outertype: Gender

   Gets a random male or female gender, with an equal chance of each.

   :param ranomd: The random generator to use in the selection.

getReflexivePronoun
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getReflexivePronoun()
   :outertype: Gender

   Gets the reflexive pronoun for this gender.

getSubjectPronoun
^^^^^^^^^^^^^^^^^

.. java:method:: public String getSubjectPronoun()
   :outertype: Gender

   Gets the subject pronoun for this gender.

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Gender

