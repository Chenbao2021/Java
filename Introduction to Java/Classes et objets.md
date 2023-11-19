# I - Les définitions
## A - Classes
- Une classe est un modèle ou un plan pour créer des objets.
- Elle définit les attributs et les méthodes qui seront présents dans chaque objet créé à partir de cette classe.
- Elle agit commr un modèle pour représenter des entités du monde réel.

## B - Objet
- Un objet est une instance spécifique d'une classe.
- Il représente une entité particulière basée sur le modèle défini par la classe
- Les objets ont des attributs spécifiques et peuvent exécuter des méthodes définies dans leur classe parente.

# II - Questions d'entretien

### 1 - Qu'est ce qu'une classe en Java?

Une classe en Java est un modèle ou un plan pour créer des objets
Elle définit les propriétés et les comportements communs à tous les objets de ce type.

### 2 - Quelle est la différence entre une classe et un objet en Java?

Une classe est un modèle qui définit les propriétées et les comportements, tandis qu'un objet est une instance spécifique de cette classe.

### 3 - Expliquez le concept d'encapsulation en Java.

L'encapsulation est le principe de regrouper les données et les méthodes qui agissent sur les données dans une seule unité.

Exemple : Classe, Blocs, etc.

### 4 - Qu'est ce qu'un constructeur en Java?

Un constructeur est une méthode spéciale dans une classe qui est appelée lorsqu'un objet de cette classe est créé.

### 5 - Quelle est la différence entre un constructeur par défaut et un constructeur paramétreé?

Un constructeur par défaut est fourni par Java s'il n'y a aucun constructeur dans une classe.

Un constructeur paramétré est défini par le programmeur et prend des paramètres pour initialiser les variables d'instances.

### 6 - Qu'est ce que le mot-clé "this" en Java?

"this" référence à l'instance actuelle de la classe.
Il est utilisé pour distinguer les variables d'instance de la classe des variables locales lorsqu'elles ont le même nom.

### 7 - Expliquez le concept d'héritage en Java.

L'héritage est un mécanisme qui permet à une classe d'hériter des propriétés et des comportements d'une autre classe.

### 8 - Qu'est ce que la surcharge de méthode en Java?

La surcharge de méthodes permet à une classe d'avoir plusieurs méthodes du même nom, mais avec une liste différente de types de paramètres.

### 9 - Quelle est la différence entre l'héritage et l'interface en Java?

'extends' : L'héritage permet à une classe d'hériter des propriétés et des comortements d'une autre classe.

'implements' :  l'interface permet à une classe de définir un contrat(ensemble de méthodes) que d'autre classes doivent implémenter.

### 10 - Qu'est ce que la méthode equals() et comment doit-elle être implémentée?

La méthode equals() est utilisée pour comparer deux objets pour l'égalité.
Elle doit être correctement définie dans la classe pour comparer le contenu des objets plutôt que leur référence mémoire.
```
public class Personne {
    String nom;
    int age;
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() !== obj.getClass()) return false;
        Personne personne = (Personne) obj;
        return this.age == personne.age && nom.equals(personne.nom)
    }
}
```
