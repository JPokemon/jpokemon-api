(function(jPokemon) {
  jPokemon.Skill = function Skill() {
    this.move = null;
    this.currentPP = null;
    this.maxPP = null;
  }

  var statics = jPokemon.Skill,
      exports = jPokemon.Skill.prototype;

  exports.getMove = function() {
    return this.move;
  };

  exports.setMove = function(move) {
    this.move = move;
    return this;
  };

  exports.getCurrentPP = function() {
    return this.currentPP;
  };

  exports.setCurrentPP = function(currentPP) {
    this.currentPP = currentPP;
    return this;
  };

  exports.getMaxPP = function() {
    return this.maxPP;
  };

  exports.setMaxPP = function(maxPP) {
    this.maxPP = maxPP;
    return this;
  };
})(window.jPokemon = window.jPokemon || {});
