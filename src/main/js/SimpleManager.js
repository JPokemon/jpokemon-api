(function(jPokemon) {
  jPokemon.SimpleManager = function SimpleManager() {
    this.objects = {};
  }

  var statics = jPokemon.SimpleManager,
      exports = jPokemon.SimpleManager.prototype;

  exports.isRegistered = function(name) {
    return this.objects[name] !== undefined;
  };

  exports.register = function(object) {
    var name = object.getName();

    if (name) {
      this.objects[name] = object;
    }
  };

  exports.getAll = function() {
    var keys = Object.keys(this.objects),
        list = [];

    for (var index in keys) {
      list.push(this.objects[keys[index]]);
    }

    return list;
  };

  exports.getByName = function(name) {
    return this.objects[name];
  };

  exports.update = function(object) {
    exports.register(object);
  };

  exports.unregister = function(name) {
    delete this.objects[name];
  };
})(window.jPokemon = window.jPokemon || {});
