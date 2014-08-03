function(jPokemon) {
  jPokemon.Ability = function Ability() {
    this.name = null;
    this.description = null;
    this.properties = {};
  }

  var statics = Ability,
      exports = Ability.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getDescription = function() {
    return this.description;
  };

  exports.getProperty = function(name) {
    return this.properties[name];
  };

  exports.setProperty = function(name, property) {
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
    this.properities = properities;
    return this;
  };
}(window.jPokemon = window.jPokemon || {});
