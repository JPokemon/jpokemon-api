function(jPokemon) {
  jPokemon.Nature = function Nature() {
    this.name = null;
    this.statIncreased = null;
    this.statDecreased = null;
    this.flavorFavorite = null;
    this.flavorDisliked = null;
  }

  var statics = Nature,
      exports = Nature.prototype;

  statics.manager = null;

  exports.getName = function() {
    return this.name;
  };

  exports.setName = function(name) {
    this.name = name;
    return this;
  };

  exports.getStatIncreased = function() {
    return this.statIncreased;
  };

  exports.setStatIncreased = function(statIncreased) {
    this.statIncreased = statIncreased;
    return this;
  };

  exports.getStatDecreased = function() {
    return this.statDecreased;
  };

  exports.setStatDecreased = function(statDecreased) {
    this.statDecreased = statDecreased;
    return this;
  };

  exports.getFlavorFavorite = function() {
    return this.flavorFavorite;
  };

  exports.setFlavorFavorite = function(flavorFavorite) {
    this.flavorFavorite = flavorFavorite;
    return this;
  };

  exports.setFlavorDisliked = function(flavorDisliked) {
    this.flavorDisliked = flavorDisliked;
    return this;
  };
}(window.jPokemon = window.jPokemon || {});
