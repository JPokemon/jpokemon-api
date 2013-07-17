.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.items Item

SimpleItemManager
=================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleItemManager implements Manager<Item>

   Defines a "simplest-possible" implementation of the \ :java:ref:`ItemManager`\  interface.

   :author: atheriel@gmail.com

Methods
-------
getByName
^^^^^^^^^

.. java:method:: @Override public Item getByName(String name)
   :outertype: SimpleItemManager

isRegistered
^^^^^^^^^^^^

.. java:method:: @Override public boolean isRegistered(Item item)
   :outertype: SimpleItemManager

register
^^^^^^^^

.. java:method:: @Override public boolean register(Item item) throws JPokemonError
   :outertype: SimpleItemManager

