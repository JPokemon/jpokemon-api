(function(jPokemon) {
  jPokemon.PokemonTrainer = function PokemonTrainer() {
    this.name = null;
    this.trainerID = null;
    this.trainerClass = null;
    this.items = {};
    this.pokemon = [];
    this.properties = {};
  }

  var statics = PokemonTrainer,
      exports = PokemonTrainer.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getTrainerID = function() {
    return this.trainerID;
  };

  exports.setTrainerID = function(trainerID) {
    this.trainerID = trainerID;
    return this;
  };

  exports.getTrainerClass = function() {
    return this.trainerClass;
  };

  exports.setTrainerClass = function(trainerClass) {
    this.trainerClass = trainerClass;
    return this;
  };

  exports.getItemQuantity = function(item) {
    return this.items[item];
  };

  exports.setItemQuantity = function(item, quantity) {
    this.items[item] = quantity;
    return this;
  };

  exports.getItems = function() {
    return this.items;
  };

  exports.setItems = function(items) {
    this.items = items;
    return this;
  };

  exports.addPokemon = function(pokemon) {
    this.pokemon.push(pokemon);
  };

  exports.removePokemon = function(pokemon) {
    this.pokemon.remove(pokemon);
  };

  exports.getPokemon = function() {
    return this.pokemon;
  };

  exports.setPokemon = function(pokemon) {
    this.pokemon = pokemon;
    return this;
  };

  exports.getProperty = function(name) {
    return this.properties[name];
  };

  exports.setProperty = function(name, property) {
    if (!property) {
      property = name;
      name = property.getName();
    }

    this.properties[name] = property;
    return this;
  };

  exports.removeProperty = function(name) {
    delete this.properties[name];
    return this;
  };

  exports.getProperties = function() {
    return this.properties;
  };

  exports.setProperties = function(properties) {
    this.properties = properties;
    return this;
  };
})(window.jPokemon = window.jPokemon || {});
