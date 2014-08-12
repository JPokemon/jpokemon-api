(function(jPokemon) {
  jPokemon.ContestCategory = function ContestCategory() {
    this.name = null;
    this.flavor = null;
    this.color = null;
    this.stat = null;
    this.reactions = {};
  }

  var statics = ContestCategory,
      exports = ContestCategory.prototype;

  statics.manager = null;

  statics.EXCITEMENT_REACTION = "EXCITEMENT";

  statics.INDIFFERENCE_REACTION = "INDIFFERENCE";

  statics.DISCONTENT_REACTION = "DISCONTENT";

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getColor = function() {
    return this.color;
  };

  exports.setColor = function(color) {
    this.color = color;
    return this;
  };

  exports.getStat = function() {
    return this.stat;
  };

  exports.getFlavor = function() {
    return this.flavor;
  };

  exports.setFlavor = function(flavor) {
    this.flavor = flavor;
    return this;
  };

  exports.setStat = function(stat) {
    this.stat = stat;
    return this;
  };

  exports.getReaction = function(contestCategory) {
    return this.reactions[contestCategory];
  };

  exports.setReaction = function(contestCategory, reaction) {
    this.reactions[contestCategory] = reaction;
    return this;
  };

  exports.removeReaction = function(contestCategory) {
    delete this.reactions[contestCategory];
    return this;
  };

  exports.getReactions = function() {
    return this.reactions;
  };

  exports.setReactions = function(reactions) {
    this.reactions = reactions;
    return this;
  };
})(window.jPokemon = window.jPokemon || {});
