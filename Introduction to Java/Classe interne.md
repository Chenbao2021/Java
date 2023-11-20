# Classe interne
## I - Définition
En Java, une classe interne(ou classe imbriquée), est une classe qui est définie à l'intérieur d'une autre classe.
Une classe interne peut accéder aux membres privés de la classe extérieurs.
Il existe plusieurs types de classe interne:
- Les classes internes statiques.  
    -   Pas besoin d'une instance de la classe extérieur pour être instanciée.
    -   Peut accéder uniquement aux membres statiques de la classe extérieur.
- Les classes internes non statiques.
    -   Peut accéder aux membres statiques et non statiques de la classe extérieur.
    -   Il faut d'abord créer une instance de la classe extérieur.
- Les classes locales.
    - Est définie à l'intérieur d'une méthode ou d'un bloc de code. 
    - A accès aux variables locales de la méthode qui l'entoure.
    - Souvent utilisée pour encapsuler du code qui n'a de sens que dans le contexte spécifique ou il est déclaré.


Quand on l'utilise?
- Quand une classe B n'est utilisé que pour une classe A, cela peut garder les codes bien plus propre.
## II - Questions d'entretien
### 1 - Qu'est ce qu'une classe interne en Java et pourquoi pourrait-on en avoir besoin?

Une classe interne est une classe définie à l'intérieur d'une autre classe en Java.
Elle est utilisée pour encapsuler des fonctionnalités liées et peut accéder aux membres privés de la classe extérieure.

### 2 - Quelle est la différence entre une classe interne statique et une classe interne non statique?

- Une classe interne statique ne nécessite pas d'instance de la classe extérieur pour être instanciée.
- Une classe interne non statique le fait, et ont accès aux membres non statique de la classe extérieur.

### 3 - Comment instancier une classe interne dans Java?

Pour instancier une classe interne, on doit d'abord créer une instance de la classe extérieur, puis utiliser cette instance pour créer l'instance de la classe interne.

### 4 - Peut-on déclarer une classe interne comme privé ou protégée?

Oui, une classe interne peut être déclarée privéé, protégée, publique ou par défaut en fonction des besoins.

### 5 - Qu'est-ce qu'une classe anonyme en Java et comment est-elle liée aux classes internes?

Une classe anonyme = une classe interne sans noms.
Elle est souvent utilisé pour implémenter une interface ou une classe abstraite de manière concise.

### 6 - Qu'est-ce qu'une classe locale en Java?

Une classe locale est une classe défini à l'intérieur d'une méthode ou d'un bloc?
Elle a accès aux variables locales de la méthode qui l'entoure.

### 7 - Comment accéder aux membres de la classe extérieur à partir d'une classe interne?

Une classe interne peut utiliser le mor-clé "this" qualifié, par exemple "ClasseExterne.this.membre";
Exemple:
```
public class OuterClass {
    private int outerMember = 10;
    class InnerClass {
        private int innerMember = 20;
        public void accessMembers() {
            System.out.println("Inner member: " + innerMember);
            System.out.println("Outer member: " + OuterClass.this.outerMember);
        }
    }
}
```

### 8 - Peut-on avoir des classes internes statiques dans une interface en Java?

Oui, une interface en Java peut contenir des classes internes statiques(et les méthodes de cette classe interne peuvent être implémenté) .

### 9 - Qu'est-ce que l'instantiation double de classe interne en Java?

L'instantiation double se produit lorsque l'on crée une instance de classe interne sans créer au préalable uns intance de la classe extérieur.

C'est généralement considérée comme une mauvaise pratique en programmation.

### 10 - Pourquoi utiliser des classes internes plutôt que des classes externes dans certaines situations?

Les classes internes offrent une encapsulation plus forte des fonctionnalités liées, permettant un accès plus facile aux membres privés de la classe extérieure.

Elles sont utilisés lorsqu'une classe est spécifiqueemnt liée à une autre et n'a pas de signification ou d'utilisation en dehors de cette relation.

