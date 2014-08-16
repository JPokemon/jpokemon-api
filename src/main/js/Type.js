(function(jPokemon) {
  jPokemon.Type = function Type() {
    this.name = null;
    this.effectivenessMap = {};
  }

  var statics = jPokemon.Type,
      exports = jPokemon.Type.prototype;

  statics.manager = null;

  statics.SUPER_EFFECTIVENESS = "SUPER";

  statics.NOT_VERY_EFFECTIVENESS = "NOT_VERY";

  statics.INEFFECTIVE_EFFECTIVENESS = "INEFFECTIVE";

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getEffectiveness = function(type) {
    return this.effectivenessMap[type];
  };

  exports.setEffectiveness = function(type, effectiveness) {
    this.effectivenessMap[type] = effectiveness;
  }

  exports.getEffectivenessMap = function() {
    return this.effectivenessMap;
  };

  exports.setEffectivenessMap = function(effectivenessMap) {
    this.effectivenessMap = effectivenessMap;
    return this;
  };
})(window.jPokemon = window.jPokemon || {});
