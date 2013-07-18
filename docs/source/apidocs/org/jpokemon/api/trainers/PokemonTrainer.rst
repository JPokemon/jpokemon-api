.. java:import:: java.util ArrayList

PokemonTrainer
==============

.. java:package:: org.jpokemon.api.trainers
   :noindex:

.. java:type:: public class PokemonTrainer

   Defines a basic trainer class. Trainers possess a party of Pokemon instances and a list of item names. They may also belong to a class of other trainers.

   :codeauthor: atheriel@gmail.com

   **See also:** :java:ref:`TrainerClass`

Fields
------

.. java:field:: protected String className
   :outertype: PokemonTrainer

   Indicates the name of the trainer's class, or `null` if it has none.

.. java:field:: protected ArrayList<String> items
   :outertype: PokemonTrainer

   Indicates the list of items the trainer has (by name).

.. java:field:: protected String name
   :outertype: PokemonTrainer

   Indicates the name of the trainer.

Methods
-------

.. java:method:: public boolean addItem(String name)
   :outertype: PokemonTrainer

   Adds an item to this trainer by name.

   :return: `true` if the item has been successfully added to the list.

.. java:method:: public String getClassName()
   :outertype: PokemonTrainer

   Gets the name of this trainer's class.

.. java:method:: public String getItems()
   :outertype: PokemonTrainer

   Gets the names of the items this trainer possesses.

.. java:method:: public String getName()
   :outertype: PokemonTrainer

   Gets the name of this trainer.

.. java:method:: public boolean hasClass()
   :outertype: PokemonTrainer

   Checks if this trainer belongs to a trainer class.

.. java:method:: public boolean hasItem(String name)
   :outertype: PokemonTrainer

   Checks if the trainer has an item of this name.

.. java:method:: public boolean removeItem(String name)
   :outertype: PokemonTrainer

   Removes an item from this trainer by name.

   :return: `true` if the item has been successfully removed from the list.

.. java:method:: public void setClassName(String className)
   :outertype: PokemonTrainer

   Sets the name of this trainer's class.

.. java:method:: public void setItems(String... items)
   :outertype: PokemonTrainer

   Sets the items this trainer possesses by name.

.. java:method:: public void setName(String name)
   :outertype: PokemonTrainer

   Sets the name of this trainer.

