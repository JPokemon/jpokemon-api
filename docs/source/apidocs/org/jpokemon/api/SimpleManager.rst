.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Method

.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.api JPokemonError

SimpleManager
=============

.. java:package:: org.jpokemon.api
   :noindex:

.. java:type:: public class SimpleManager<T> implements Manager<T>

   Provides object management and lookup functionality. In order for this class to function, the object ``T`` must have both

   ..

   * a static field ``manager`` of type \ :java:ref:`Manager`\  and
   * a method ``getName()`` that returns a unique string that can identify the object.

   For example, in conjunction with \ :java:ref:`PokemonType`\ , which fulfills the requirements with its \ :java:ref:`PokemonType.manager`\  field and \ :java:ref:`PokemonType.getName()`\  method, we can instantiate a manager like so:

   .. parsed-literal::

      SimpleManager typeManager = new SimpleManager(PokemonType.class);

   To test that this manager is really looking after types, we can try

   .. parsed-literal::

      PokemonType fire = new PokemonType();
      fire.setName("Fire");
      fire.setSuperEffectiveAgainst("Grass", "Bug", "Steel")
      fire.setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");

   to set up some of the type's properties. The method \ :java:ref:`PokemonType.setName()`\  does some of the work for us; if ``manager`` is defined, it will call \ :java:ref:`register(fire)`\  automatically. Thus a call to

   .. parsed-literal::

      typeManager.getByName("Fire").isSuperEffectiveAgainst("Grass");

   will at this point return ``true``.

   :author: atheriel@gmail.com

Constructors
------------
SimpleManager
^^^^^^^^^^^^^

.. java:constructor:: public SimpleManager(Class<T> managedClass) throws JPokemonError
   :outertype: SimpleManager

   Due to type erasure, the class of the managed object needs to be passed to the manager during construction. This isn't the only possible solution to this problem, but it is the simplest.

   :param managedClass: The class of the managed object, e.g. ``MyObject.class``.

Methods
-------
getByName
^^^^^^^^^

.. java:method:: public T getByName(String name)
   :outertype: SimpleManager

   Gets an object registered by this manager by name.

   :param name: The name of the object requested.
   :return: The object by this name, or ``null`` if it does not exist.

isRegistered
^^^^^^^^^^^^

.. java:method:: public boolean isRegistered(T managed)
   :outertype: SimpleManager

   Checks if an object is registered with the manager.

   :return: ``true`` if the object is known to the manager.

register
^^^^^^^^

.. java:method:: public boolean register(T managed) throws JPokemonError
   :outertype: SimpleManager

   Registers the object with the manager so it can be looked up by name.

   :param managed: The object to be registered.
   :return: ``true`` if the object is in fact registered.

