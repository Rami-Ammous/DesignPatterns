Nom du Pattern : Factory Method

Probleme :
1- problème fondamental de la création d'un objet concret d'une classe :
les appels directs au constructeur de l'objet (NEW) en appelant une méthode fabrique concréte
2- la classe est liée à cet objet créé
3- la modification de l'instanciation indépendamment de la classe est imposiible


Intention :
1- définit une interface pour la création d'un objet,
en laissant à des sous-classes le choix des classes à instancier.
2 - il permet à une classe de déléguer l'instanciation à des sous-classes.

Solution :
1- le Factory Method évite de lier une classe à un objet en définissant d'abord une opération
distincte pour la création de l'objet : La fabrique
2- Factory Method utilise l'héritage et s'appuie sur une classe dérivée ou une sous-classe
pour créer un objet.
3- une fois appelée, elle génere l'objet, au lieu de constructeur de classe.


Usages connus :
- Séparation entre le code du constructeur et le code qui utilise réellement le produit,
ex: ajouter un nouveau produit en redéfinissant le méthode fabrique
-Les toolkits et les frameworks car leurs classes sont souvent dérivées par les applications qui les utilisent
-Création des collections immuables en java. Factory Method est utilisé pour créer List,Set,Map et Map.Entry



Conséquences:
- Avantages :
1- pas besoin d'incorporer des classes spécifiques à l'application.
2- Les instances du patron permettent d'ajouter de nouvelles classes sans que l'application ait à changer
3- Réutiliser des objets au lieu d'en construire de nouveaux (2conomie des ressources)