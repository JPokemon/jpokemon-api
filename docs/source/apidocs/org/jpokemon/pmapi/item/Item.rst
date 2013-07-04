.. java:import:: java.util HashMap

.. java:import:: org.jpokemon.pmapi JPokemonError

Item
====

.. java:package:: org.jpokemon.pmapi.item
   :noindex:

.. java:type:: public class Item

   Defines a basic item. This class provides the most basic attributes that all items in a Pokémon game are likely to share. To create your own items, you have two options: (1) extend this class, or (2) make use of the `attribute` system. See the wiki for details. Note that the `attributes` \ :java:ref:`HashMap`\  will not initialize until an attribute is added. Thus, if a traditional inheritance scheme is preferable for your project, this class can be extended and this functionality ignored without memory inefficiency. The same goes for the management features; if the `manager` field remains `null`, its functionality is ignored, and only a very weak protest is made by the constructor in the form of an unchecked error.

   :author: Atheriel

Fields
------
activeHoldEffect
^^^^^^^^^^^^^^^^

.. java:field:: protected boolean activeHoldEffect
   :outertype: Item

   Indicates whether this item has an active effect when held by a Pokémon. Defaults to `false`.

attributes
^^^^^^^^^^

.. java:field:: protected HashMap<String, ItemAttribute> attributes
   :outertype: Item

   Indicates the non-basic attributes of the item.

consumable
^^^^^^^^^^

.. java:field:: protected boolean consumable
   :outertype: Item

   Indicates whether this item is consumed upon use, including use while holding. Defaults to `false`.

description
^^^^^^^^^^^

.. java:field:: protected String description
   :outertype: Item

   Indicates the description of this item (as it would appear in the bag or a shop).

holdable
^^^^^^^^

.. java:field:: protected boolean holdable
   :outertype: Item

   Indicates whether this item is holdable by a Pokémon. Defaults to `false`.

manager
^^^^^^^

.. java:field:: public static ItemManager manager
   :outertype: Item

   Indicates the manager being used to register items. May be `null`.

name
^^^^

.. java:field:: protected String name
   :outertype: Item

   Indicates the name of the item (as it would appear in the bag or a shop).

passiveHoldEffect
^^^^^^^^^^^^^^^^^

.. java:field:: protected boolean passiveHoldEffect
   :outertype: Item

   Indicates whether this item has a passive effect when held by a Pokémon. Defaults to `false`.

salePrice
^^^^^^^^^

.. java:field:: protected int salePrice
   :outertype: Item

   Indicates the sale price for this item. Defaults to `0`.

sellable
^^^^^^^^

.. java:field:: protected boolean sellable
   :outertype: Item

   Indicates whether this item is sellable to a vendor. Defaults to `false`.

usableDuringBattle
^^^^^^^^^^^^^^^^^^

.. java:field:: protected boolean usableDuringBattle
   :outertype: Item

   Indicates whether this item is during battle. Defaults to `false`.

usableOutsideBattle
^^^^^^^^^^^^^^^^^^^

.. java:field:: protected boolean usableOutsideBattle
   :outertype: Item

   Indicates whether this item is usable outside of battle. Defaults to `false`.

Constructors
------------
Item
^^^^

.. java:constructor:: public Item()
   :outertype: Item

   Provides the default constructor.

Methods
-------
addAttribute
^^^^^^^^^^^^

.. java:method:: public ItemAttribute addAttribute(String name, ItemAttribute attribute)
   :outertype: Item

   Adds an attribute to the item. It must have a distinct name.

getAttribute
^^^^^^^^^^^^

.. java:method:: public ItemAttribute getAttribute(String name)
   :outertype: Item

   Gets the \ :java:ref:`ItemAttribute`\  instance for this item of a given type.

   :param name: The name of attribute requested.
   :return: The item's attribute under this name, or `null` if it does not possess one.

getDescription
^^^^^^^^^^^^^^

.. java:method:: public String getDescription()
   :outertype: Item

   Gets the description of this item.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: Item

   Gets the name of this item.

getSalePrice
^^^^^^^^^^^^

.. java:method:: public int getSalePrice()
   :outertype: Item

   Gets the sale price for this item.

hasActiveHoldEffect
^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasActiveHoldEffect()
   :outertype: Item

   Checks whether this item has an active effect when held by a Pokémon.

hasAttribute
^^^^^^^^^^^^

.. java:method:: public boolean hasAttribute(String name)
   :outertype: Item

   Checks if the item has an attribute of the given name.

hasPassiveHoldEffect
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean hasPassiveHoldEffect()
   :outertype: Item

   Checks whether this item has a passive effect when held by a Pokémon.

isConsumable
^^^^^^^^^^^^

.. java:method:: public boolean isConsumable()
   :outertype: Item

   Checks whether this item is consumed upon use.

isHoldable
^^^^^^^^^^

.. java:method:: public boolean isHoldable()
   :outertype: Item

   Checks whether this item can be held by a Pokémon.

isSellable
^^^^^^^^^^

.. java:method:: public boolean isSellable()
   :outertype: Item

   Checks whether this item is sellable to a vendor.

isUsableDuringBattle
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isUsableDuringBattle()
   :outertype: Item

   Checks whether this item is usable during battle.

isUsableOutsideBattle
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isUsableOutsideBattle()
   :outertype: Item

   Checks whether this item is usable outside of battle.

setActiveHoldEffect
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setActiveHoldEffect(boolean activeHoldEffect)
   :outertype: Item

   Sets whether this item has an active effect when held by a Pokémon.

setConsumable
^^^^^^^^^^^^^

.. java:method:: public void setConsumable(boolean consumable)
   :outertype: Item

   Sets whether this item is consumed upon use.

setDescription
^^^^^^^^^^^^^^

.. java:method:: public void setDescription(String description)
   :outertype: Item

   Sets the description of this item.

setHoldable
^^^^^^^^^^^

.. java:method:: public void setHoldable(boolean holdable)
   :outertype: Item

   Sets whether this item can be held by a Pokémon.

setName
^^^^^^^

.. java:method:: public void setName(String name)
   :outertype: Item

   Sets the name of this item.

setPassiveHoldEffect
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPassiveHoldEffect(boolean passiveHoldEffect)
   :outertype: Item

   Sets whether this item has a passive effect when held by a Pokémon.

setSalePrice
^^^^^^^^^^^^

.. java:method:: public void setSalePrice(int salePrice)
   :outertype: Item

   Sets the sale price for this item.

setSellable
^^^^^^^^^^^

.. java:method:: public void setSellable(boolean sellable)
   :outertype: Item

   Sets whether this item is sellable to a vendor.

setUsableDuringBattle
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setUsableDuringBattle(boolean usableDuringBattle)
   :outertype: Item

   Sets whether this item is usable during battle.

setUsableOutsideBattle
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setUsableOutsideBattle(boolean usableOutsideBattle)
   :outertype: Item

   Sets whether this item is usable outside of battle.

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Item

   Gets a string representation of this item: its name.

