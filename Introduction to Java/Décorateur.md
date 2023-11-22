# Décorateur pattern

## I - Définition
Le pattern Décorateur attache de manière dynamique des responsabilités supplémentaires à un objet.
Cela est utile pour étendre les fonctionnalités d'un objet sans modifier son code.

C'est plus intéressant que d'utiliser l'héritage.

[Plus des détailles]

## II - Questions d'entretien
#### 1 - Quelle est la différence entre le pattern Décorateur et l'héritage classique en termes d'extension de fonctionnalités ?
Le pattern Décorateur permet d'ajouter des fonctionnalités de manière flexible et dynamique, tandis que l'héritage classique nécessite la création de sous-classes pour chaque combinaison de fonctionnalités. Le Décorateur évite ainsi la prolifération de sous-classes.

#### 2 - Comment gérez-vous l'ordre d'empilement des décorateurs pour appliquer différentes fonctionnalités dans le pattern Décorateur ?
L'ordre d'empilement des décorateurs est importants.
Il détermine l'ordre dans lequel les fonctionnalités sont ajoutées.
Les décorateurs doivent être empilés de manière à ce que le plus externe ajoute la fonctionnalité la plus générale, et le plus interne, la plus spécifique.

#### 3 - Quelle est la relation entre le pattern Décorateur et le principe ouvert/fermé (Open/Closed Principle) ?
Le pattern Décorateur respecte le principe ouvert/fermé en permettant l'extension des fonctionnalités sans modifier le code existant. Vous pouvez ajouter de nouveaux décorateurs sans changer le code du composant de base.

#### 4 - Comment évitez-vous la surcharge de la hiérarchie de classes avec le pattern Décorateur ?
En utilisant une interface commune pour les composants concrets et les décorateurs, la surcharge de la hiérarchie de classes est évitée.

Chaque composant ou décorateur implémente la même interface, permettant une gestion plus flexible.




[Plus des détailles]: <https://docs.google.com/document/d/1e6INW90_deC84bmAlE-lsZhSpfhu9cMl7kYx0KmS7LE/edit?usp=sharing>
