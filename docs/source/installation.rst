Installation Instructions
=========================

The library isn't available as a downloadable ``.jar`` file just yet, so you'll have to build it from the source code to use it. Don't worry -- it's pretty straightforward. And I'm assuming that if you want to use a 3rd party Java library, you're probably okay with a little bit of work.

Building from Source
--------------------

First, you need a copy of the source code, which can be obtained by running the following commands in a terminal::

	$ cd /desired/path/to/repository
	$ git clone https://github.com/atheriel/jPokemon.git

The ``git`` command should be available on any modern operating system. If it's not, you can also download a ``.zip`` file from GitHub. Put the ``.zip`` file where you'd like the source code to live, and unzip it.

Once you've finished either of the above, the source code will now be located in a newly-created ``jPokemon`` directory. The library itself has no dependencies, so you can build it however you'd like -- for instance by opening it in the Eclipse or Intellij IDEs. However, it can also be built with `Maven <http://maven.apache.org/>`_, which is what its author uses, and what that ``pom.xml`` file you might have noticed in the source code is for.

Building with Maven
^^^^^^^^^^^^^^^^^^^

Make sure you have Maven 2 or 3 installed on your system. You can check this by running ``mvn --version``. After you have acquired Maven, navigate to the directory you've put the source code into (as above) and enter the following::

	$ cd jPokemon
	$ mvn clean install

The project is now installed on your local maven repository, and the ``.jar`` file can be found in the ``target`` directory. If you use Maven for your own projects, the library can be added as::

	<dependency>		
		<groupId>org.jpokemon</groupId>
		<artifactId>pmapi</artifactId>
		<version>Alpha</version>
	</dependency>

to your ``pom.xml`` file under ``dependencies``.
