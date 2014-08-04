function(jPokemon) {
  jPokemon.Pokemon = function Pokemon() {
    this.name = null;
    this.species = null;
    this.gender = null;
    this.originalTrainerID = null;
    this.originalTrainerName = null;
    this.level = null;
    this.experience = null;
    this.friendship = null;
    this.ability = null;
    this.height = null;
    this.weight = null;
    this.shiny = null;
    this.heldItem = null;
    this.statusConditions = [];
    this.skills = [];
    this.stats = {};
    this.markings = [];
    this.ribbons = [];
    this.properties = {};
  }

  var statics = Pokemon,
      exports = Pokemon.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getHeight = function() {
    return this.height;
  };

  exports.setHeight = function(height) {
    this.height = height;
    return this;
  };

  exports.getWeight = function() {
    return this.weight;
  };

  exports.setWeight = function(weight) {
    this.weight = weight;
    return this;
  };

  exports.getSpecies = function() {
    return this.species;
  };

  exports.setSpecies = function(species) {
    this.species = species;
    return this;
  };

  exports.getGender = function() {
    return this.gender;
  };

  exports.setGender = function(gender) {
    this.gender = gender;
    return this;
  };

  exports.getOriginalTrainerID = function() {
    return this.originalTrainerID;
  };

  exports.setOriginalTrainerID = function(originalTrainerID) {
    this.originalTrainerID = originalTrainerID;
    return this;
  };

  exports.getOriginalTrainerName = function() {
    return this.originalTrainerName;
  };

  exports.setOriginalTrainerName = function(originalTrainerName) {
    this.originalTrainerName = originalTrainerName;
    return this;
  };

  exports.getLevel = function() {
    return this.level;
  };

  exports.setLevel = function(level) {
    this.level = level;
    return this;
  };

  exports.getExperience = function() {
    return this.experience;
  };

  exports.setExperience = function(experience) {
    this.experience = experience;
    return this;
  };

  exports.getFriendship = function() {
    return this.friendship;
  };

  exports.setFriendship = function(friendship) {
    this.friendship = friendship;
    return this;
  };

  exports.getAbility = function() {
    return this.ability;
  };

  exports.setAbility = function(ability) {
    this.ability = ability;
    return this;
  };

  exports.isShiny = function() {
    return this.shiny;
  };

  exports.setShiny = function(shiny) {
    this.shiny = shiny;
    return this;
  };

  exports.getHeldItem = function() {
    return this.heldItem;
  };

  exports.setHeldItem = function(heldItem) {
    this.heldItem = heldItem;
    return this;
  };

  exports.addStatusCondition = function(statusCondition) {
    this.statusConditions.push(statusCondition);
    return this;
  };

  exports.removeStatusCondition = function(statusCondition) {
    this.statusConditions.remove(statusCondition);
    return this;
  };

  exports.getStatusConditions = function() {
    return this.statusConditions;
  };

  exports.setStatusConditions = function(statusConditions) {
    this.statusConditions = statusConditions;
    return this;
  };

  exports.addSkill = function(skill) {
    this.skills.push(skill);
  };

  exports.removeSkill = function(skill) {
    this.skills.remove(skill);
  };

  exports.getSkills = function() {
    return this.skills;
  };

  exports.setSkills = function(skills) {
    this.skills = skills;
    return this;
  };

  exports.getStat = function(name) {
    return this.stats[name];
  };

  exports.setStat = function(name, property) {
    this.stats[name] = property;
    return this;
  };

  exports.removeStat = function(name) {
    delete this.stats[name];
    return this;
  };

  exports.getStats = function() {
    return this.stats;
  };

  exports.setStats = function(stats) {
    this.stats = stats;
    return this;
  };

  exports.addMarking = function(marking) {
    this.markings.push(marking);
    return this;
  };

  exports.removeMarking = function(marking) {
    this.markings.remove(marking);
    return this;
  };

  exports.getMarkings = function() {
    return this.markings;
  };

  exports.setMarkings = function(markings) {
    this.markings = markings;
    return this;
  };

  exports.addRibbon = function(ribbon) {
    this.ribbons.push(ribbon);
    return this;
  };

  exports.removeRibbon = function(ribbon) {
    this.ribbons.remove(ribbon);
    return this;
  };

  exports.getRibbons = function() {
    return this.ribbons;
  };

  exports.setRibbons = function(ribbons) {
    this.ribbons = ribbons;
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
}(window.jPokemon = window.jPokemon || {});
