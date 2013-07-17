Manager
=======

.. java:package:: org.jpokemon.api
   :noindex:

.. java:type:: public interface Manager<T>

Methods
-------
getByName
^^^^^^^^^

.. java:method:: public T getByName(String name)
   :outertype: Manager

   Gets an item registered by this manager by name.

   :param name: The name of the item requested.
   :return: The \ :java:ref:`Item`\  instance for this item.

isRegistered
^^^^^^^^^^^^

.. java:method:: public boolean isRegistered(T managed)
   :outertype: Manager

   Checks if an item is registered with the manager.

   :return: `true` if the item is known to the manager.

register
^^^^^^^^

.. java:method:: public boolean register(T managed) throws JPokemonError
   :outertype: Manager

   Registers the object with the manager so it can be looked up by name.

   :param managed: The object to be registered.
   :return: `true` if the object is in fact registered; otherwise `false`.

