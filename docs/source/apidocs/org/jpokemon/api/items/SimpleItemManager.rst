.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.api JPokemonError

SimpleItemManager
=================

.. java:package:: org.jpokemon.api.items
   :noindex:

.. java:type:: public class SimpleItemManager implements ItemManager

   Defines a "simplest-possible" implementation of the \ :java:ref:`ItemManager`\  interface.

   :author: atheriel@gmail.com

Methods
-------
getInstance
^^^^^^^^^^^

.. java:method:: public static ItemManager getInstance()
   :outertype: SimpleItemManager

   Gets the singleton instance of this class.

getItemByName
^^^^^^^^^^^^^

.. java:method:: @Override public Item getItemByName(String name)
   :outertype: SimpleItemManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(Item item)
   :outertype: SimpleItemManager

registerItem
^^^^^^^^^^^^

.. java:method:: @Override public boolean registerItem(Item item) throws JPokemonError
   :outertype: SimpleItemManager

