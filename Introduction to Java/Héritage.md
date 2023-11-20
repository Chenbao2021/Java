# I- Qu'est ce que l'héritage en Java?
L'héritage en Java est un concept de la programmation orientée objet.

Il consiste à une classe d'hériter des propriétés et des comportements d'une autre classe.

La sous-classe peut utiliser, étendre ou modifier les membres(attributs et méthodes) de la superclasse.

L'héritage favorise la réutilisation du code, la hiérarchie et la structuration du programme, 
# II- Questions d'entretien sur les mot-clés.
### 1 - Qu'est ce que l'héritage en Java?

L'héritage est un mécanisme permettant à une classe d'heriter des attributs et des méthodes d'une autre classe.

### 2 - Quelle est la différence entre une classe abstraite et une interface en Java?

- Classe abstraite peut avoir des méthodes abstraites et non abstraites
- Interface ne peut contenir que des méthodes abstraites

### 3 - Expliquez le concept de surcharge de méthode en Java.

La surcharge de méthode en Java se produit lorsqu'une classe a plusieurs méthodes avec le même nom mais des signatures différentes(nombre ou type de paramètres différents).

### 4 - Qu’est-ce que le polymorphisme en Java?

Le polymorphisme en Java permet à un objet d'adopter plusieurs formes.

Cela peut se produire par le biais du polymorphisme de sous-type ou du polymorphisme paramétrique.

- Polymorphisme de sous-type 
    - Si B hérite A, alors un objet de B peut être utilisé partout où un objet A est attendu.
    - Si B hérite A, alors B peut être référencé par une reference de A.(Ajouter de nouvelles classes sans changer le code existant)

### 5 - Qu’est-ce que le mot-clé ‘super’ en Java?
Le mot-clé "super" est utilisé pour accéder aux membres de la classe parente dans une classe fille.

### 6 - Comment empêcher l’héritage d’une classe en Java?

En déclarant une classe comme "final", on peut l'interdire la dérivé des sous-classes.

### 7 - Qu’est ce que la classe ‘Object’ en Java et quelle est sa relation avec l’héritage?

La classe 'Object' est la classe racine de toutes les classes en Java.
Elle fournit des méthodes tq: 'equals()', 'hashCode()', 'toString()'.

### 8 - Qu’est ce que l’héritage multiple et pourquoi Java ne le supporte-t-il pas pour les classes?

Lorsqu'une classe hérite de plusieurs classes parentes.

Pour éviter le problème du diamant et maintenir la simplicité et la clarté du langage.

On peut utiliser l'interface à la place, car une classe peut implémenter plusieurs interfaces.

### 9 - Comment utiliser l’héritage dans la conception de logiciels(software design) ?

L'héritage est utilisé pour créer des hiérarchies de classes, partager et réutiliser du code, et établir des relations de type "est-un".

### 10 - 'public','protected', 'privated' lors d'une héritage.

- Private : Uniquement accessible à l'intérieur de la classe qui les a définis.
- Public: Depuis n'importe où
- Protected: Accessible dans la classe de base et ses classes dérivées. Souvent utilisé pour permettre l'accès aux classes dérivées tout en limitant l'accès aux autres classes exernes.
    - Dans le contexte d'héritage, 'super' n'est pas nécessaire pour accéder aux membres 'protected' de la classe de base . 
```
public class Superclass {
    protected int protectedMember;

    public Superclass(int value) {
        this.protectedMember = value;
    }
}

public class Subclass extends Superclass {
    public Subclass(int value) {
        super(value);  // Appel du constructeur de la classe de base

        // Accès direct au membre protégé sans utiliser "super"
        int valueFromSuperclass = protectedMember;
        System.out.println("Value from superclass: " + valueFromSuperclass);
    }
}

```
