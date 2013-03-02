# jPokémon: The Pokémon API

Note that _jPokémon_ is a working title. This API provides well-documented data structures and utilities for Pokémon games written in Java. It is currently hosted on Github, and its [homepage][home_site] can be found there as well.

## About

This API (and in part, library) is a response to all of the disparate fan projects (games, engines, and resources) being written in Java. Very few of these projects pool their code, even if they are open source. My suspicion is that a readily accessible and more importantly *well-documented* API might alleviate some of the really dull data-type writing that everyone has to do, and help games get on their feet faster overall. To this end, this project contains (or will ideally contain)

* Data-types for abstract objects common to most (if not all) Pokémon projects: moves, items, species, natures, and so on.
* Enums and lookup classes for things like types, experience curves, etc.

It may in the future contain

* Managers and factories for these objects.
* Serialization to and from formats such as `.xml`, `.json`, and SQL databases for these objects.

This project is *not* a fully-featured engine or game library. There are no game loops. There are no graphics. In fact, there is no data whatsoever. If you're looking for a `Pikachu.java` file, you have come to the wrong place. If, on the other hand, you do not want to write the few hundred lines of setters and getters you will probably need for your `PokemonSpecies.java` file, this project is for you.

## Building

This project has no dependencies, so you can build it however you'd like. However, it can also be built with [Maven][mvn_link], which is what its author uses.

### Building with Maven

Make sure you have Maven 2 or 3 installed on your system. You can check this by entering `mvn --version` on the command line. After you have acquired Maven, navigate to the directory you wish to place the source code and enter the following on the command line:

	cd /path/to/repo
	git clone https://github.com/atheriel/jPokemon.git
	cd jPokemon
	mvn clean install

The project is now installed on your local maven repository, and the `.jar` file can be found in the `target` directory.

## License

The project is licensed under the [ISC license][isc_link], which is very similar to the Simplified BSD and MIT licenses, but written in a more readable format. It is compatible with both the GPL and proprietary licenses. See the `LICENSE.txt` file for details.

[home_site]: http://atheriel.github.com/jPokemon/
[mvn_link]: http://maven.apache.org/
[isc_link]: http://en.wikipedia.org/wiki/ISC_license