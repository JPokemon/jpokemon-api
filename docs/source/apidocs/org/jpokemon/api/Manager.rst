Manager
=======

.. java:package:: org.jpokemon.api
   :noindex:

.. java:type:: public interface Manager<T>

   Provides an interface for object management and lookup functionality. A generic implementation is provided by the \ :java:ref:`SimpleManager`\  class that works across all classes in the library.

   For implementations specific to each class, see:

   :codeauthor: atheriel@gmail.com

   **See also:** :java:ref:`SimpleAbilityManager`

Methods
-------

.. java:method:: public T getByName(String name)
   :outertype: Manager

   Gets an object registered by this manager by name.

   :param name: The name of the object requested.
   :return: The object by this name, or ``null`` if it does not exist.

.. java:method:: public boolean isRegistered(T managed)
   :outertype: Manager

   Checks if an object is registered with the manager.

   :return: ``true`` if the object is known to the manager.

.. java:method:: public boolean register(T managed) throws JPokemonError
   :outertype: Manager

   Registers the object with the manager so it can be looked up by name.

   :param managed: The object to be registered.
   :throws JPokemonError: if there is an error registering the object.
   :return: ``true`` if the object is in fact registered.

