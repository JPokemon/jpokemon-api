.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.jpokemon.api JPokemonError

.. java:import:: org.jpokemon.api Manager

.. java:import:: org.jpokemon.api.natures PokemonNature

SimpleNatureManager
===================

.. java:package:: org.jpokemon.api.managers
   :noindex:

.. java:type:: public class SimpleNatureManager implements Manager<PokemonNature>

   Provides a basic implementation of the \ :java:ref:`Manager`\  interface for use with \ :java:ref:`PokemonNature`\ s. For a more generic version, see the \ :java:ref:`SimpleManager`\  class.

   :codeauthor: atheriel@gmail.com

Constructors
------------

.. java:constructor:: public SimpleNatureManager() throws JPokemonError
   :outertype: SimpleNatureManager

   Provides the default constructor.

   :throws JPokemonError: if there is a conflict over management. That is, \ :java:ref:`PokemonNature.manager`\  is not ``null``.

Methods
-------

.. java:method:: @Override public PokemonNature getByName(String name)
   :outertype: SimpleNatureManager

.. java:method:: @Override public boolean isRegistered(PokemonNature nature)
   :outertype: SimpleNatureManager

.. java:method:: @Override public boolean register(PokemonNature nature) throws JPokemonError
   :outertype: SimpleNatureManager

