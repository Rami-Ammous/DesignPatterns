Le design pattern Singleton garantit qu'une classe n'a qu'une seule instance
tout en fournissant un point d'accès global à cette instance.

erreur courante :
Lorsqu'une variable est partagée entre plusieurs threads sans synchronisation,
les threads peuvent interférer les uns avec les autres, entraînant des résultats imprévisibles.
Cela se produit parce que les threads peuvent lire ou écrire des valeurs de la variable en même temps

Il y a deux façons de faire :
1 -  Vous synchronisez la méthode.
2 -  Vous synchronisez la variable.

Conclusion : Synchroniser uniquement les variables critiques peut être
plus efficace, En revanche, synchroniser toute la méthode peut être plus
simple mais peut ralentir le programme en rendant les threads attendent
plus souvent pour accéder aux ressources partagées.