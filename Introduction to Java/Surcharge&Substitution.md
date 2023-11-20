# Surcharge et Substitution

## I - Définitions
### _Surcharge_ (Overloading)
La surcharge se produit lorsque deux ou plusieurs méthodes dans la même classe ont le même nom mais des listes de paramètres différentes.

La surcharge permet d'avoir plusieurs méthodes avec le même nom mais une signature différente.

### _Substitution_(Overriding)
La substitution se produit lorsque dans une classe dérivée(sous-classe), une méthode a la même signature qu'une méthode dans la classe de base(superclasse). (_Ceci n'inclut pas les méthodes statiques, qui n'appartient pas directement à aux instances de la classe_)

## II - Questions d'entretien

### 1 - Qu'est ce que la surcharge de méthode en Java?
La surcharge de méthode en Java se produit lorsqu'une classe a plusieurs méthodes avec le même nom mais des signatures différentes.

### 2 - Qu'est ce qu'il ne peut pas être utilisé comme critère de surcharge de méthode en Java?
Le type de retour seul ne peut pas être utilisé comme critère de surcharge de méthode en Java.

### 3 - Quelle est la différence entre la surcharge et la substitution en Java?
- Surcharge: Lorsqu'il y a plusieurs méthodes ont le même nom
- Substitution: Lorsqu'il y a une méthode dans la classe dérivée a le même nom que la classe de base.

### 4 - Comment marquer une méthode pour la substitution en Java?

On utilise l'annotation '@Override' pour marquer une méthode comme étant destinée à la substitution.

### 5 - Est ce que la substitution de méthode peut se produire entre des classes non liées par l'héritage?
Non, substitution de méthode ne peut se produire que dans une hiérarchie de classes, où une classe hérite d'une autre.

### 6 - Peut-on utiliser des méthodes statiques dans la surcharge ou la substitution de méthodes?
Non, les méthodes statiques ne sont pas liées à une instance particulière de la classe.
donc il n'est pas hérité par la classe dérivée, donc il n'y a pas de la substitution possible.
Mais on peut avoir deux méthodes avec le même nom qui constitue une surcharge des méthodes.

### 7 - Comment JVM choisit-elle quelle méthode appelée lors du surcharge?
La JVM choisit quelle méthode appeler en fonction du nombre et des types des paramètres de l'appel de la méthode.

