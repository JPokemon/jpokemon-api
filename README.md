# The JPokémon Library

There are many Pokémon fan games. A lot of them are based on RPG Maker, and some are home-rolled. Of those, several are even open-source. Games based on RPG Maker are subject to the authors of that framework, and of course, are limited to the scope of RPG Maker itself. Of the open-source games, few pool their code. This library is an answer to all the disparate fan projects. It aims to provide a capable API for Pokémon games.

This library provides well-documented data structures and utilities for Pokémon games written in Java.  
A javascript version is in development!

## About

The JPokemon API is not a game framework, and you will find no game loops or renderers. There is no runtime. There are no algorithms. Instead, there are several other goals defined.

### Extensibility and Configurability

Extend any class and use it however you wish. Or, instead of extension, use the property system. This library is intended to serve as a base for Pokémon games written in Java. For the sake of configuration, the library requires a very declarative style. 

### Reusability

Provides hooks and headers for common algorithms, such as computation of experience required. Reuse components written by others to get to what matters most - the game experience. In fact, many such implementations of various algorithms and computations are already written in the [jpokemon-lib project](http://github.com/jpokemon/jpokemon-lib).

### Optionality

The API provides as much as possible, in an attempt to facilitate fully-fledged games. Games may choose to use as much of this API as they wish. Where possible, pointers are replaced with strings, to prevent enforcing use of any classes included.

## Working with the JPokémon API

### Contributions and Development

This project uses [HuBoard](http://huboard.com) to manage github issues in a kanban flow. You can check out what's on the horizon in either place. Contributions are very appreciated!

### Building

This project uses [maven](http://maven.apache.org/). Clone (or fork!) this repository, and `mvn install` the API. This will create the following maven coordinates...
```
<groupId>org.jpokemon</groupId>
<artifactId>jpokemon-api</artifactId>
```

## License

The JPokémon Library is available under the [MIT License](http://opensource.org/licenses/MIT), See the `LICENSE.txt` file for details.
