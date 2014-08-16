(function(jPokemon) {
  jPokemon.Item = function Item() {
    this.name = null;
    this.description = null;
    this.sellable = null;
    this.salePrice = null;
    this.usableOutsideBattle = null;
    this.usableDuringBattle = null;
    this.consumable = null;
    this.holdable = null;
    this.properties = {};
  }

  var statics = jPokemon.Item,
      exports = jPokemon.Item.prototype;

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

  exports.isSellable = function() {
    return this.sellable;
  };

  exports.setSellable = function(sellable) {
    this.sellable = sellable;
    return this;
  };

  exports.getSalePrice = function() {
    return this.salePrice;
  };

  exports.setSalePrice = function(salePrice) {
    this.salePrice = salePrice;
    return this;
  };

  exports.isUsableOutsideBattle = function() {
    return this.usableOutsideBattle;
  };

  exports.setUsableOutsideBattle = function(usableOutsideBattle) {
    this.usableOutsideBattle = usableOutsideBattle;
    return this;
  };

  exports.isUsableDuringBattle = function() {
    return this.usableDuringBattle;
  };

  exports.setUsableDuringBattle = function(usableDuringBattle) {
    this.usableDuringBattle = usableDuringBattle;
    return this;
  };

  exports.isConsumable = function() {
    return this.consumable;
  };

  exports.setConsumable = function(consumable) {
    this.consumable = consumable;
    return this;
  };

  exports.isHoldable = function() {
    return this.holdable;
  };

  exports.setHoldable = function(holdable) {
    this.holdable = holdable;
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
