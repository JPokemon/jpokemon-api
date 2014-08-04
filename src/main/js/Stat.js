function(jPokemon) {
  jPokemon.Stat = function Stat() {
    this.value = null;
    this.ev = null;
    this.iv = null;
  }

  var statics = Stat,
      exports = Stat.prototype;

  exports.getValue = function() {
    return this.value;
  };

  exports.setValue = function(value) {
    this.value = value;
    return this;
  };

  exports.getEv = function() {
    return this.ev;
  };

  exports.setEv = function(ev) {
    this.ev = ev;
    return this;
  };

  exports.getIv = function() {
    return this.iv;
  };

  exports.setIv = function(iv) {
    this.iv = iv;
    return this;
  };
}(window.jPokemon = window.jPokemon || {});
