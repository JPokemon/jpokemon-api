(function(jPokemon) {
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

  exports.setDescription = function(description) {
    this.description = description;
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
