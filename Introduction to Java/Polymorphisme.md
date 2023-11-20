# Polymorphisme
## I - Definition
Le polymorphisme en Java permet à un objet d'être traité comme une instance de sa classe de base,
ce qui permet de traiter différentes classs de manière uniforme.

Il existe deux types de polymorphismes:
- Le polymorphisme de sous-typage (ou polymorphisme d'inclusion)
- Le polymorphisme de surcharge (ou polymorphisme d'interface)

 _En effet, le concept de surcharge qu'on a vu dans le précédant cours est le polymorphisme de  surcharge, et le concept de substitution qu'on a vu précédant est le polymorphisme de substitution._

### -> Polymorphisme de sous-typage:
Se produit lorsque des objets d'une classe dérivée peuvent être traités comme des objets de la classe de base.
Cela se fait via des références de la classe de base.

#### Conditions: Nécessite l'utilisation de l'héritage et l'override de méthode ans la classe dérivées pour que le polymorphisme fonctionne correctement.

### -> Polymorphisme de Surcharge:
Se produit lorsque plusieurs méthodes portent le même nom dans une classe ou une interface, mais avec des listes de paramètres différentes.

#### Conditions: Il nécessite que plusieurs méthodes portent le même nom mais aient des listes de paramètres différentes.


## II - Questions d'entretien

### 1 - Qu'est ce que le polymorphisme en Java?
Le polymorphisme en Java permet à un objet d'être traité comme une instance de sa classe de base, ce qui permet de traiter différentes classes de manière uniforme.

### 2 - Quelles sont les deux formes de polymorphisme en Java?
- Polymorphisme de compilation : Utilise les informations du "Type" pour résoudre le liaison(Le cas de surcharge des méthodes).
- Polymorphisme d'exécution: Utilise l'objet pour résoudre le liasion(Substitution des méthodes).

### 3 - Qu'est ce que le polymorphisme de compilation(ou statique).
Le polymorphisme de compilation fait référence à la résolution des méthodes et des liens lors de la compilation plutôt qu'à l'exécution. C.A.D le compilateur détermine quelle méthode sera appelée en fonction du type déclaré de l'objet, plutôt que du type réel de l'objet lors de l'exécution.

Par exemple pour le code ci-dessous:

    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        void makeSound() {
            System.out.println("Dog barks");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Animal myDog = new Dog(); 
            myDog.makeSound(); // "Dog barks"
        }
    }

Si on supprime la méthode makeSound() de la classe Animal, une erreur de compilation se produit, car le polymorphisme de compilation remarque qu'il n'y a pas de méthode "makeSound()" dans la classe Animal. C'est pourquoi le terme "compilation" est utilisé.

En revanche, si on supprime la méthode makeSound et qu'il n'y a pas d'erreurs au moment de la compilation, lors de l'exécution, une erreur est affichée, car la méthode "makeSound" n'est pas présente dans la classe Dog.

### 4 - Qu'est ce que le polymorphisme d'exécution(ou dynamique)
Le polymorphisme dynamique se produit lorsque le type réel d'un objet est déterminé à l'exécution et que les méthodes approprié sont appelées en fonction de ce type.

La décision sur laquelle la méthode doit être appelée est prise au moment de l'exécution.

Le type réel de l'objet est déterminé à l'exécution.

Exemple: La substitution de méthode est un exemple de polymorphisme d'exécution.

### 5 - Comment le polymorsphisme est-il réalisé en Java?
En utilisant le mécanisme d'héritage et en définissant des méthodes dans une classe de base que les sous-classes peuvent surcharger.

### 6 - Qu'est ce que la liaison tardive(late binding) en Java?
C'est un autre terme pour le polymorphisme d'exécution, où le type réel d'un objet est déterminé à l'exécution.

### 7 - Expliquez le concept de surcharge de méthode en relation avec le polymorphisme.
La surcharge de méthode permet à une classe d'avoir plusieurs méthodes du même nom mais avec des paramètres différents, ce qui est une forme de polymorphisme de compilation.

### 8 - Quelle est la différence entre surcharge de méthode et substitution de méthode?

- Surcharge de méthode: Concerne la déclaration de plusieurs méthodes avec le même nom dans une classe
- Substitution : Se produit lorsque les sous-classes fournissent une implémentation spécifique d'une méthode déjà définie dans la classe de base.

### 9 - Pouvez-vous donnez un exemple concret de polymorphisme en Java avec des interfaces?

```
interface Forme {
  void dessiner();
}

class Cercle implements Forme {
  public void dessiner() {
    System.out.println(“Dessiner un cercle”);
  }
}

class Carre implements Forme {
  public void dessiner() {
    System.out.println(“Dessiner un carré”);
  }
}

Forme forme = new Cercle();
forme.dessiner();
```

### 10 - Comment utilisez-vous le polymorphisme pour créer une méthode générique en Java?

En utilisant des classes ou des interfaces génériques, où les types spécifiques sont déterminés lors de l'utilisation de la classe ou de l'interface.

