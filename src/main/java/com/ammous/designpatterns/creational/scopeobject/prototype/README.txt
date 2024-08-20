Le design pattern Prototype consiste à créer de nouveaux objets en copiant un prototype existant.
Cela permet de cloner des objets tout en évitant les coûts associés à l'instanciation de nouveaux objets via un constructeur.

les etapes :
 1- public class Nom_Class implements  Cloneable{

 2- redefinir la méthode clone de l'interface  Cloneable:
 @Override
     public Nom_Class clone() throws CloneNotSupportedException {
         return (Nom_Class) super.clone();
} // Changer `protected` par `public` pour accéder à la méthode en dehors de la classe.


NB: La classe Customer doit implémenter l'interface Cloneable et redéfinir la méthode clone(), sinon,
si on clone l'instance account1, customer1 ne sera pas cloné,
ce qui signifie qu'il pointera simplement vers l'instance customer1 existante pui sil faut modifier la methode clone() de la classe BankAccount

"Les classes enveloppeur (ou wrappers) en Java sont clonées par défaut."

Cependant, il est important de noter que même si les classes enveloppeur en Java peuvent être clonées, elles sont immuables,
c'est-à-dire que leur état ne peut pas être modifié après leur création. En pratique,
cela signifie que lorsque vous clonez un objet enveloppeur, vous obtenez une nouvelle référence pointant vers le même objet,
puisque l'objet lui-même ne peut pas changer.