.. java:import:: java.lang.reflect Field

.. java:import:: java.lang.reflect Method

.. java:import:: java.util TreeMap

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

SimpleManager
=============

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleManager<T> implements Manager<T>

   Provides type management and lookup functionality. In order for this class to function, the type ``T`` must have both

   ..

   * a static field ``manager`` of type \ :java:ref:`Manager`\  and
   * a method ``getName()`` that returns a unique string that can identify the object of type ``T``.

   The following classes fulfill these criteria: \ :java:ref:`PokemonAbility`\ , \ :java:ref:`PokemonNature`\ , \ :java:ref:`PokemonSpecies`\ , \ :java:ref:`PokemonType`\ , \ :java:ref:`Move`\ , and \ :java:ref:`Item`\ .

   \ **Usage Example**\

   For example, in conjunction with \ :java:ref:`PokemonType`\ , which fulfills the requirements with its \ :java:ref:`PokemonType.manager`\  field and \ :java:ref:`PokemonType.getName()`\  method, we can instantiate a manager like so:

   .. parsed-literal::

      SimpleManager<PokemonType> typeManager = new SimpleManager<PokemonType>(PokemonType.class);

   To test that this manager is really looking after types, we can try

   .. parsed-literal::

      PokemonType fire = new PokemonType();
      fire.setName("Fire");
      fire.setSuperEffectiveAgainst("Grass", "Bug", "Steel");
      fire.setNotVeryEffectiveAgainst("Fire", "Water", "Rock", "Dragon");

   to set up some of the type's properties. The method \ :java:ref:`PokemonType.setName()`\  does some of the work for us; if ``manager`` is defined, it will call \ :java:ref:`register(fire)`\  automatically. Thus a call to

   .. parsed-literal::

      typeManager.getByName("Fire").isSuperEffectiveAgainst("Grass");

   will at this point return ``true``.

   :codeauthor: atheriel@gmail.com
   :param T: The type to be managed, e.g. \ :java:ref:`PokemonNature`\ .

   .. note::
      This class uses reflection. Pains have been taken to avoid producing errors, but in the case that they appear, they will be silently repressed.

Constructors
------------

.. java:constructor:: public SimpleManager(Class<T> managedClass) throws JPokemonError
   :outertype: SimpleManager

   Constructs a new ``SimpleManager<T>`` for the given type, ``T``. Due to type erasure, the class of the managed type needs to be passed to the manager during construction.

   :param managedClass: The class of the managed type, e.g. ``MyObject.class``.
   :param T: The type to be managed.
   :throws JPokemonError: if there is a conflict over type management. That is, the ``manager`` field of the type is not ``null``.

Methods
-------

.. java:method:: public T getByName(String name)
   :outertype: SimpleManager

   Gets an object of type ``T`` registered by this manager by name.

   :param name: The name of the object requested.
   :return: The object by this name, or ``null`` if it does not exist.

.. java:method:: public boolean isRegistered(T managed)
   :outertype: SimpleManager

   Checks if an object of type ``T`` is registered with the manager.

   :param managed: The object that may be registered.
   :return: ``true`` if the object is known to the manager.

.. java:method:: public boolean isRegistered(String name)
   :outertype: SimpleManager

   Checks if a name is known to the manager.

   :param name: The name that some object may be registered under.
   :return: ``true`` if the name is known to the manager.

.. java:method:: public boolean register(T managed) throws JPokemonError
   :outertype: SimpleManager

   Registers the object of type ``T`` with the manager so it can be looked up by name. There are two conditions under which registration will fail, either:

   ..

   * The name of the object of type ``T`` is ``null`` or
   * The name is already in use by another object known to the manager (i.e. you are trying to register something called "Fire", while another known object is already called "Fire").

   So long as you have bothered to specify unique names, this method should be successful.

   :param managed: The object of type ``T`` to be registered.
   :throws JPokemonError: if there is an error registering the object.
   :return: ``true`` if the object is in fact registered.

