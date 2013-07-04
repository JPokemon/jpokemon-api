/*
 * Visit http://bulbapedia.bulbagarden.net/wiki/Nature
 * Apply id 'select_me' to "List of Natures" table
 * Execute script
 */

var table = document.getElementById('select_me');
var rows = table.getElementsByTagName('tr');

var printStuff = function(natureName, statInc, statDec, tasteFav, tasteDis) {
  var line = 'public static final PokemonNature ';
  line += natureName.toUpperCase();
  line += ' = new PokemonNature()\n.setName("';
  line += natureName;
  line += '")\n.setStatIncreased(Stat.';
  line += statInc.toUpperCase();
  line += ')\n.setStatDecreased(Stat.';
  line += statDec.toUpperCase();
  line += ')\n.setTasteFavorite(Taste.';
  line += tasteFav.toUpperCase();
  line += ')\n.setTasteDisliked(Taste.';
  line += tasteDis.toUpperCase();
  line += ');'

  console.log(line);
}

for (var i=1; i<rows.length; i++) {
  var row = rows[i];
  var natureName = row.getElementsByTagName('th')[0].innerText;
  var statIncreased = row.getElementsByTagName('td')[1].innerText;
  var statDecreased = row.getElementsByTagName('td')[2].innerText;
  var tasteFavorite = row.getElementsByTagName('td')[3].innerText;
  var tasteDisliked = row.getElementsByTagName('td')[4].innerText;

  if (statIncreased === 'Sp. Attack') {
    statIncreased = 'SPECIAL_ATTACK';
  }
  if (statIncreased === 'Sp. Defense') {
    statIncreased = 'SPECIAL_DEFENSE';
  }
  if (statDecreased === 'Sp. Attack') {
    statDecreased = 'SPECIAL_ATTACK';
  }
  if (statDecreased === 'Sp. Defense') {
    statDecreased = 'SPECIAL_DEFENSE';
  }

  printStuff(natureName, statIncreased, statDecreased, tasteFavorite, tasteDisliked);
}