Nom du Pattern : Abstract Factory

Intention:
1- Permettre de créer des familles d'obhets liés ou dépendants avec plusieurs fabriques
sans avoir à préciser au moment de leur création la classe concrète à utiliser.
2- Obtenir plusieurs types d'objets retournés par chaque fabrique
(plusieurs méthodes d'instanciation par Factory Method

Probleme :
1- Pouvoir créer dynamiquement des familles d'objets apparentés
(des instances d'une meme classe)
2- Reportez certaines décisions jusqu'à la phase d'execution
(par exemple , le choix d'une classe concrète pour réaliser une interface données)

Solution :
1- Définir des interfaces pour chaque produit de la famille de produits.Toutes les autres variantes
de produits peuvent ensuite se servir de ces interfaces.

2-Définir uneinterface pour la fabrique abstraite contenat une liste de méthodes de création pour
toutes les familles de produits.

3- Définir une classe fabrique pour chaque variante d'une famille de produits,
qui retourne un certain type de produits et qui implémente l'interface fabrique abstraite.

Conséquences:

    Avantage :
        1- Encapsuler la création d'objets
        2- Favoriser la cohérence entre les familles d'objets car il garantit que si
        une famille d'objets est conçue pour fonctionner ensemble,
        l'application utilise les objets d'une famille à la fois
        3- Eviter le couplage étroit entre les produits concrets et le code client.

    Inconvenion :
        1- Changement de la fabrique abstraite et toutes les sous-classes dans
        le cas d'ajout d'une nouvelle famille d'objets
        2- La super-usine de l'abstract Factory (interface ou classe abstraite)
        fixe les familles d'objets qui peuvent etre créers.