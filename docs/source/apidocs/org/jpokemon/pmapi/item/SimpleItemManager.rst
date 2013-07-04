.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.pmapi JPokemonError

.. java:import:: org.jpokemon.pmapi JPokemonException

SimpleItemManager
=================

.. java:package:: org.jpokemon.pmapi.item
   :noindex:

.. java:type:: public class SimpleItemManager implements ItemManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`ItemManager`\  interface.

   :author: Atheriel

Constructors
------------
SimpleItemManager
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleItemManager() throws JPokemonException
   :outertype: SimpleItemManager

   Provides the default constructor.

Methods
-------
getItemByName
^^^^^^^^^^^^^

.. java:method:: public Item getItemByName(String name)
   :outertype: SimpleItemManager

   Gets an item registered by this manager by name.

   :param name: The name of the item requested.
   :return: The \ :java:ref:`Item`\  instance for this item.

isRegistered
^^^^^^^^^^^^

.. java:method:: public boolean isRegistered(Item item)
   :outertype: SimpleItemManager

   Checks if an item is registered with the manager.

   :return: `true` if the item is known to the manager.

registerItem
^^^^^^^^^^^^

.. java:method:: public boolean registerItem(Item item) throws JPokemonError
   :outertype: SimpleItemManager

   Registers an item with the manager so it can be looked up by name. Called automatically for all named \ :java:ref:`Item`\  instances, so it should not usually be called directly.

   :param item: The item to be registered.
   :return: `true` if the item is in fact registered; otherwise `false`.

