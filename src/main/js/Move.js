(function(jPokemon) {
  jPokemon.Move = function Move() {
    this.name = null;
    this.type = null;
    this.description = null;
    this.category = null;
    this.PP = null;
    this.power = null;
    this.accuracy = null;
    this.target = null;
    this.contestCategory = null;
    this.appeal = null;
    this.jam = null;
    this.contestDescription = null;
    this.priority = null;
    this.properties = {};
  }

  var statics = Move,
      exports = Move.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getType = function() {
    return this.type;
  };

  exports.setType = function(type) {
    this.type = type;
    return this;
  };

  exports.getDescription = function() {
    return this.description;
  };

  exports.setDescription = function(description) {
    this.description = description;
    return this;
  };

  exports.getPriority = function() {
    return this.priority;
  };
  
  exports.setPriority = function(priority) {
    this.priority = priority;
    return this;
  };

  exports.getCategory = function() {
    return this.category;
  };

  exports.setCategory = function(category) {
    this.category = category;
    return this;
  };

  exports.getPP = function() {
    return this.PP;
  };

  exports.setPP = function(PP) {
    this.PP = PP;
    return this;
  };

  exports.getPower = function() {
    return this.power;
  };

  exports.setPower = function(power) {
    this.power = power;
    return this;
  };

  exports.getAccuracy = function() {
    return this.accuracy;
  };

  exports.setAccuracy = function(accuracy) {
    this.accuracy = accuracy;
    return this;
  };

  exports.getTarget = function() {
    return this.target;
  };

  exports.setTarget = function(target) {
    this.target = target;
    return this;
  };

  exports.getContestCategory = function() {
    return this.contestCategory;
  };

  exports.setContestCategory = function(contestCategory) {
    this.contestCategory = contestCategory;
    return this;
  };

  exports.getAppeal = function() {
    return this.appeal;
  };

  exports.setAppeal = function(appeal) {
    this.appeal = appeal;
    return this;
  };

  exports.getJam = function() {
    return this.jam;
  };

  exports.setJam = function(jam) {
    this.jam = jam;
    return this;
  };

  exports.getContestDescription = function() {
    return this.contestDescription;
  };

  exports.setContestDescription = function(contestDescription) {
    this.contestDescription = contestDescription;
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
