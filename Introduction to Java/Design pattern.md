## I - Les concepts objets de base:

- Classes/objets:	Les classes sont des modèles pour créer des objets qui communiquent entre eux par messages(appels et méthodes).

- Encapsulation:	On cache(private) la structure d’un objet,  et on ne révèle(public) que les fonctions(méthodes) nécessaires.

- Héritage:		Une classe peut hériter des données et des méthodes d’autres classes.

- Polymorphisme(d’héritage):	Une méthode de même signature peut avoir des comportements(instructions) différents selon la classe où elle est définie.



## II - Intérêts des concepts objets de base

- Sécurité : Protéger un objet contre des modifications inappropriées
- Souplesse : Le polymorphisme permet d’utiliser un même code sur des objets de différentes classes.
- Factorisation : L’héritage permet de factoriser des données et instructions
- Réutilisation : Les notions de classe et d’héritage permettent de réutiliser des données et du code dans différents contextes.



## III - Limites des concepts objets de base
Ils ne permettent pas de garantir la conception de programmes:
- Maintenables
- extensibles
- fiables


## IV - Objectifs
Concevoir des logiciels:
- Facilement maintenables
- Facilement extensibles
- Fiables
- Réutilisables


### V - SOLID
- Single responsibility principle: Une classe = une et une seul responsabilité
- Open/Closed principle	: Une classe doit être ouvert à l’extension, mais fermée à la modification.
- Liskov substitution principle	: Une instance de type A doit pouvoir être remplacée par une instance de type B, tq B sous-classe de A, sans que cela ne modifie la cohérence du programme.
- Interface segregation principle	: Préférer plusieurs interfaces spécifiques adaptées au besoin qu’une interface générale.
- Dependency inversion principle	: Il faut dépendre des abstractions, pas des implémentations.( Les modules de haut niveau ne devraient pas dépendre des modules de bas niveau. Les deux devraient dépendre d’abstraction, cela encourage l’utilisation d’interfaces ou de classes abstraites.)



