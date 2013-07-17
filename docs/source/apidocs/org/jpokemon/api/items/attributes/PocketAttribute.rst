.. java:import:: org.jpokemon.api.items ItemAttribute

PocketAttribute
===============

.. java:package:: org.jpokemon.api.items.attributes
   :noindex:

.. java:type:: public class PocketAttribute implements ItemAttribute

   Provides a possible attribute describing the pocket an item belongs to. The names of the pockets each have their own static field, which can of course be modified.

   :author: atheriel@gmail.com

Fields
------
BALLS
^^^^^

.. java:field:: public static String BALLS
   :outertype: PocketAttribute

   Indicates the name of the balls pocket.

BATTLE
^^^^^^

.. java:field:: public static String BATTLE
   :outertype: PocketAttribute

   Indicates the name of the battle items pocket.

BERRIES
^^^^^^^

.. java:field:: public static String BERRIES
   :outertype: PocketAttribute

   Indicates the name of the berries pocket.

DEFAULT
^^^^^^^

.. java:field:: public static String DEFAULT
   :outertype: PocketAttribute

   Indicates the name of the default pocket.

KEY
^^^

.. java:field:: public static String KEY
   :outertype: PocketAttribute

   Indicates the name of the key items pocket.

MACHINES
^^^^^^^^

.. java:field:: public static String MACHINES
   :outertype: PocketAttribute

   Indicates the name of the tm & hm pocket.

MAIL
^^^^

.. java:field:: public static String MAIL
   :outertype: PocketAttribute

   Indicates the name of the mail pocket.

MEDICINE
^^^^^^^^

.. java:field:: public static String MEDICINE
   :outertype: PocketAttribute

   Indicates the name of the medicine pocket.

Constructors
------------
PocketAttribute
^^^^^^^^^^^^^^^

.. java:constructor:: public PocketAttribute()
   :outertype: PocketAttribute

   Provides the default constructor.

PocketAttribute
^^^^^^^^^^^^^^^

.. java:constructor:: public PocketAttribute(String pocketName)
   :outertype: PocketAttribute

   Constructs a new attribute with the given pocket name.

Methods
-------
getPocketName
^^^^^^^^^^^^^

.. java:method:: public String getPocketName()
   :outertype: PocketAttribute

   Gets the name of the pocket this item belongs to.

setPocketName
^^^^^^^^^^^^^

.. java:method:: public PocketAttribute setPocketName(String pocketName)
   :outertype: PocketAttribute

   Sets the name of the pocket this item belongs to.

