/*
 * Visit http://bulbapedia.bulbagarden.net/wiki/Ability
 * Apply id 'select_me' to "List of Abilities" table
 * Execute script
 */

var table = document.getElementById('select_me');
var rows = table.getElementsByTagName('tr');

var printStuff = function(name, description) {
  var line = 'public static final Ability ';
  line += name.toUpperCase().replace(' ', '_');
  line += ' = new Ability().setName("';
  line += name;
  line += '").setDescription("';
  line += description
  line += '");'

  console.log(line);
}

for (var i=1; i<rows.length; i++) {
  var row = rows[i];
  var abilityName = row.getElementsByTagName('td')[1].children[0].innerText;
  var abilityDescription = row.getElementsByTagName('td')[2].innerText;

  printStuff(abilityName, abilityDescription);
}