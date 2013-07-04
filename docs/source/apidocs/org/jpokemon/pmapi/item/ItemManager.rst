.. java:import:: org.jpokemon.pmapi JPokemonError

ItemManager
===========

.. java:package:: org.jpokemon.pmapi.item
   :noindex:

.. java:type:: public interface ItemManager

   Provides an interface for storing and keeping track of items at runtime. The most basic implementation of this is the \ :java:ref:`SimpleItemManager`\  class.

   :author: Atheriel

Methods
-------
getItemByName
^^^^^^^^^^^^^

.. java:method:: public abstract Item getItemByName(String name)
   :outertype: ItemManager

   Gets an item registered by this manager by name.

   :param name: The name of the item requested.
   :return: The \ :java:ref:`Item`\  instance for this item.

isRegistered
^^^^^^^^^^^^

.. java:method:: public abstract boolean isRegistered(Item item)
   :outertype: ItemManager

   Checks if an item is registered with the manager.

   :return: `true` if the item is known to the manager.

registerItem
^^^^^^^^^^^^

.. java:method:: public abstract boolean registerItem(Item item) throws JPokemonError
   :outertype: ItemManager

   Registers an item with the manager so it can be looked up by name.

   :param item: The item to be registered.
   :return: `true` if the item is in fact registered; otherwise `false`.

