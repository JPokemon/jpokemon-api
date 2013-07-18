.. java:import:: java.util HashMap

.. java:import:: org.jpokemon.api Manager

Item
====

.. java:package:: org.jpokemon.api.items
   :noindex:

.. java:type:: public class Item

   Defines a basic item. This class provides the most basic attributes that all items in a Pokémon game are likely to share. To create your own items, you have two options: (1) extend this class, or (2) make use of the ``attribute`` system. See the wiki for details.

   Note that the ``attributes`` \ :java:ref:`HashMap`\  will not initialize until an attribute is added. Thus, if a traditional inheritance scheme is preferable for your project, this class can be extended and this functionality ignored without memory inefficiency.

   The same goes for the management features; if the ``manager`` field remains ``null``, its functionality is ignored, and only a very weak protest is made by the constructor in the form of an unchecked error.

   :codeauthor: atheriel@gmail.com

Fields
------

.. java:field:: protected boolean activeHoldEffect
   :outertype: Item

   Indicates whether this item has an active effect when held by a Pokémon. Defaults to `false`.

.. java:field:: protected HashMap<String, ItemAttribute> attributes
   :outertype: Item

   Indicates the non-basic attributes of the item.

.. java:field:: protected boolean consumable
   :outertype: Item

   Indicates whether this item is consumed upon use, including use while holding. Defaults to `false`.

.. java:field:: protected String description
   :outertype: Item

   Indicates the description of this item (as it would appear in the bag or a shop).

.. java:field:: protected boolean holdable
   :outertype: Item

   Indicates whether this item is holdable by a Pokémon. Defaults to `false`.

.. java:field:: public static Manager<Item> manager
   :outertype: Item

   Indicates the manager being used to register items. May be ``null``.

.. java:field:: protected String name
   :outertype: Item

   Indicates the name of the item (as it would appear in the bag or a shop).

.. java:field:: protected boolean passiveHoldEffect
   :outertype: Item

   Indicates whether this item has a passive effect when held by a Pokémon. Defaults to `false`.

.. java:field:: protected int salePrice
   :outertype: Item

   Indicates the sale price for this item. Defaults to `0`.

.. java:field:: protected boolean sellable
   :outertype: Item

   Indicates whether this item is sellable to a vendor. Defaults to `false`.

.. java:field:: protected boolean usableDuringBattle
   :outertype: Item

   Indicates whether this item is during battle. Defaults to `false`.

.. java:field:: protected boolean usableOutsideBattle
   :outertype: Item

   Indicates whether this item is usable outside of battle. Defaults to `false`.

Constructors
------------

.. java:constructor:: public Item()
   :outertype: Item

   Provides the default constructor.

Methods
-------

.. java:method:: public Item addAttribute(String name, ItemAttribute attribute)
   :outertype: Item

   Adds an attribute to the item. It must have a distinct name.

.. java:method:: public ItemAttribute getAttribute(String name)
   :outertype: Item

   Gets the \ :java:ref:`ItemAttribute`\  instance for this item of a given type.

   :param name: The name of attribute requested.
   :return: The item's attribute under this name, or `null` if it does not possess one.

.. java:method:: public String getDescription()
   :outertype: Item

   Gets the description of this item.

.. java:method:: public String getName()
   :outertype: Item

   Gets the name of this item.

.. java:method:: public int getSalePrice()
   :outertype: Item

   Gets the sale price for this item.

.. java:method:: public boolean hasActiveHoldEffect()
   :outertype: Item

   Checks whether this item has an active effect when held by a Pokémon.

.. java:method:: public boolean hasAttribute(String name)
   :outertype: Item

   Checks if the item has an attribute of the given name.

.. java:method:: public boolean hasPassiveHoldEffect()
   :outertype: Item

   Checks whether this item has a passive effect when held by a Pokémon.

.. java:method:: public boolean isConsumable()
   :outertype: Item

   Checks whether this item is consumed upon use.

.. java:method:: public boolean isHoldable()
   :outertype: Item

   Checks whether this item can be held by a Pokémon.

.. java:method:: public boolean isSellable()
   :outertype: Item

   Checks whether this item is sellable to a vendor.

.. java:method:: public boolean isUsableDuringBattle()
   :outertype: Item

   Checks whether this item is usable during battle.

.. java:method:: public boolean isUsableOutsideBattle()
   :outertype: Item

   Checks whether this item is usable outside of battle.

.. java:method:: public Item setActiveHoldEffect(boolean activeHoldEffect)
   :outertype: Item

   Sets whether this item has an active effect when held by a Pokémon.

.. java:method:: public Item setConsumable(boolean consumable)
   :outertype: Item

   Sets whether this item is consumed upon use.

.. java:method:: public Item setDescription(String description)
   :outertype: Item

   Sets the description of this item.

.. java:method:: public Item setHoldable(boolean holdable)
   :outertype: Item

   Sets whether this item can be held by a Pokémon.

.. java:method:: public Item setName(String name)
   :outertype: Item

   Sets the name of this item.

.. java:method:: public Item setPassiveHoldEffect(boolean passiveHoldEffect)
   :outertype: Item

   Sets whether this item has a passive effect when held by a Pokémon.

.. java:method:: public Item setSalePrice(int salePrice)
   :outertype: Item

   Sets the sale price for this item.

.. java:method:: public Item setSellable(boolean sellable)
   :outertype: Item

   Sets whether this item is sellable to a vendor.

.. java:method:: public Item setUsableDuringBattle(boolean usableDuringBattle)
   :outertype: Item

   Sets whether this item is usable during battle.

.. java:method:: public Item setUsableOutsideBattle(boolean usableOutsideBattle)
   :outertype: Item

   Sets whether this item is usable outside of battle.

.. java:method:: @Override public String toString()
   :outertype: Item

   Gets a string representation of this item: its name.

