function(jPokemon) {
  jPokemon.Species = function Species() {
    this.name = null;
    this.tag = null;
    this.description = null;
    this.number = null;
    this.types = [];
    this.abilities = [];
    this.hiddenAbility = null;
    this.genderless = null;
    this.maleRatio = null;
    this.catchRate = null;
    this.breedable = null;
    this.eggGroups = [];
    this.eggCyles = null;
    this.height = null;
    this.weight = null;
    this.experienceYield = null;
    this.experienceCurve = null;
    this.effortValues = {};
    this.bodyStyle = null;
    this.color = null;
    this.tameness = null;
    this.baseStats = {};
    this.evolutions = [];
    this.moveLists = {};
    this.eggMoves = [];
    this.machineMoves = [];
    this.tutorMoves = [];
    this.properties = {};
  }

  var statics = Species,
      exports = Species.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.getProperties = function() {
    return this.properties;
  };

  exports.setProperties = function(properties) {
    this.properties = properties;
    return this;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getNumber = function() {
    return this.number;
  };

  exports.getDescription = function() {
    return this.description;
  };

  exports.setDescription = function(description) {
    this.description = description;
    return this;
  };

  exports.getTag = function() {
    return this.tag;
  };

  exports.setTag = function(tag) {
    this.tag = tag;
    return this;
  };

  exports.setNumber = function(number) {
    this.number = number;
    return this;
  };

  exports.getTypes = function() {
    return this.types;
  };

  exports.setTypes = function(types) {
    this.types = types;
    return this;
  };

  exports.getAbilities = function() {
    return this.abilities;
  };

  exports.setAbilities = function(abilities) {
    this.abilities = abilities;
    return this;
  };

  exports.getHiddenAbility = function() {
    return this.hiddenAbility;
  };

  exports.setHiddenAbility = function(hiddenAbility) {
    this.hiddenAbility = hiddenAbility;
    return this;
  };

  exports.isGenderless = function() {
    return this.genderless;
  };

  exports.setGenderless = function(genderless) {
    this.genderless = genderless;
    return this;
  };

  exports.getMaleRatio = function() {
    return this.maleRatio;
  };

  exports.setMaleRatio = function(maleRatio) {
    this.maleRatio = maleRatio;
    return this;
  };

  exports.getCatchRate = function() {
    return this.catchRate;
  };

  exports.setCatchRate = function(catchRate) {
    this.catchRate = catchRate;
    return this;
  };

  exports.isBreedable = function() {
    return this.breedable;
  };

  exports.setBreedable = function(breedable) {
    this.breedable = breedable;
    return this;
  };

  exports.getEggGroups = function() {
    return this.eggGroups;
  };

  exports.setEggGroups = function(eggGroups) {
    this.eggGroups = eggGroups;
    return this;
  };

  exports.getEggCyles = function() {
    return this.eggCyles;
  };

  exports.setEggCyles = function(eggCyles) {
    this.eggCyles = eggCyles;
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

  exports.getExperienceYield = function() {
    return this.experienceYield;
  };

  exports.setExperienceYield = function(experienceYield) {
    this.experienceYield = experienceYield;
    return this;
  };

  exports.getExperienceCurve = function() {
    return this.experienceCurve;
  };

  exports.setExperienceCurve = function(experienceCurve) {
    this.experienceCurve = experienceCurve;
    return this;
  };

  exports.getEffortValues = function() {
    return this.effortValues;
  };

  exports.setEffortValues = function(effortValues) {
    this.effortValues = effortValues;
    return this;
  };

  exports.getBodyStyle = function() {
    return this.bodyStyle;
  };

  exports.setBodyStyle = function(bodyStyle) {
    this.bodyStyle = bodyStyle;
    return this;
  };

  exports.getColor = function() {
    return this.color;
  };

  exports.setColor = function(color) {
    this.color = color;
    return this;
  };

  exports.getTameness = function() {
    return this.tameness;
  };

  exports.setTameness = function(tameness) {
    this.tameness = tameness;
    return this;
  };

  exports.getBaseStats = function() {
    return this.baseStats;
  };

  exports.setBaseStats = function(baseStats) {
    this.baseStats = baseStats;
    return this;
  };

  exports.getEvolutions = function() {
    return this.evolutions;
  };

  exports.setEvolutions = function(evolutions) {
    this.evolutions = evolutions;
    return this;
  };

  exports.setMoveLists = function(moveLists) {
    this.moveLists = moveLists;
    return this;
  };

  exports.getEggMoves = function() {
    return this.eggMoves;
  };

  exports.setEggMoves = function(eggMoves) {
    this.eggMoves = eggMoves;
    return this;
  };

  exports.getMachineMoves = function() {
    return this.machineMoves;
  };

  exports.setMachineMoves = function(machineMoves) {
    this.machineMoves = machineMoves;
    return this;
  };

  exports.getTutorMoves = function() {
    return this.tutorMoves;
  };

  exports.setTutorMoves = function(tutorMoves) {
    this.tutorMoves = tutorMoves;
    return this;
  };
}(window.jPokemon = window.jPokemon || {});
