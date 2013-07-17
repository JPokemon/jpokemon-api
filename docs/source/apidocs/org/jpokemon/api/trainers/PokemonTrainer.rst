.. java:import:: java.util ArrayList

PokemonTrainer
==============

.. java:package:: org.jpokemon.api.trainers
   :noindex:

.. java:type:: public class PokemonTrainer

   Defines a basic trainer class. Trainers possess a party of Pokemon instances and a list of item names. They may also belong to a class of other trainers.

   :author: atheriel@gmail.com

Fields
------
className
^^^^^^^^^

.. java:field:: protected String className
   :outertype: PokemonTrainer

   Indicates the name of the trainer's class, or `null` if it has none.

items
^^^^^

.. java:field:: protected ArrayList<String> items
   :outertype: PokemonTrainer

   Indicates the list of items the trainer has (by name).

name
^^^^

.. java:field:: protected String name
   :outertype: PokemonTrainer

   Indicates the name of the trainer.

Methods
-------
addItem
^^^^^^^

.. java:method:: public boolean addItem(String name)
   :outertype: PokemonTrainer

   Adds an item to this trainer by name.

   :return: `true` if the item has been successfully added to the list.

getClassName
^^^^^^^^^^^^

.. java:method:: public String getClassName()
   :outertype: PokemonTrainer

   Gets the name of this trainer's class.

getItems
^^^^^^^^

.. java:method:: public String getItems()
   :outertype: PokemonTrainer

   Gets the names of the items this trainer possesses.

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: PokemonTrainer

   Gets the name of this trainer.

hasClass
^^^^^^^^

.. java:method:: public boolean hasClass()
   :outertype: PokemonTrainer

   Checks if this trainer belongs to a trainer class.

hasItem
^^^^^^^

.. java:method:: public boolean hasItem(String name)
   :outertype: PokemonTrainer

   Checks if the trainer has an item of this name.

removeItem
^^^^^^^^^^

.. java:method:: public boolean removeItem(String name)
   :outertype: PokemonTrainer

   Removes an item from this trainer by name.

   :return: `true` if the item has been successfully removed from the list.

setClassName
^^^^^^^^^^^^

.. java:method:: public void setClassName(String className)
   :outertype: PokemonTrainer

   Sets the name of this trainer's class.

setItems
^^^^^^^^

.. java:method:: public void setItems(String... items)
   :outertype: PokemonTrainer

   Sets the items this trainer possesses by name.

setName
^^^^^^^

.. java:method:: public void setName(String name)
   :outertype: PokemonTrainer

   Sets the name of this trainer.

