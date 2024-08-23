La fabrique permet de créer un objet dont le type dépend du contexte : cet objet fait partie d'un ensemble de sous-classes.
L'objet retourné par la fabrique est donc toujours du type de la classe mère mais grâce au polymorphisme
les traitements exécutés sont ceux de l'instance créée.

Ce motif de conception est utilisé lorsqu'à l'exécution il est nécessaire de déterminer dynamiquement
quel objet d'un ensemble de sous-classes doit être instancié.

Il est utilisable lorsque :

Le client ne peut déterminer le type d'objet à créer qu'à l'exécution
Il y a une volonté de centraliser la création des objets
L'utilisation d'une fabrique permet de rendre l'instanciation d'objets plus flexible que l'utilisation de l'opérateur d'instanciation new.