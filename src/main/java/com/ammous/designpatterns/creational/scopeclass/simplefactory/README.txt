Ce patron est généralement utilisé dans tous les logiciels où de nouvelles
classes sont ajoutées régulièrement

ce pattern est plus un idiome de programmation qu'un design pattern
l'idiome propose une solution propre à un language pour des détails d'implémentation.

Avantage : le moyen le plus simple pour gérer la création d'objets en spécifiant l'objet à la créer en passant le type à la fabrique

Inconvenients :
1 - Pour la création d'autres objets il faut modifier la classe Factory
2 - pas de possibilité de créer automatiqument des familles d'objets de des combinaisons
d'objets issues de plusieurs types d'usines
