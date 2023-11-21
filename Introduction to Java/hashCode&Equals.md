# HashCode et Equals en Java
## I - Definition
'hashCode' et 'equals' font partie du contrat du système de gestion des collections, en particulièr lors de l'utilisation de classes comme clés dans les structures de données basées sur le hachage, telles que les 'HashMap' et 'HashSet'.
Si equals() retourne vrai, alors les codes de hachage doivent également être égaux.

## II - Questions d'entretien
### 1 - Quel est le rôle de la méthode ‘hashCode()’ dans Java?
hashCode(): Renvoie un code de hachage numérique pour un objet, utilisé par certaines collections Java pour optimiser la recherche d’objets.

### 2 - Pourquoi est-il important que si deux objets sont égaux, alors leurs codes de hachage (‘hashCode()’) doivent également être égaux?
C’est une exigence pour garantir la cohérence entre “equals()’ et ‘hashCode()’.
Nécessaire pour le bon fonctionnement des collections basées sur le hachage tq les HashMap.

### 3 - Quelles sont les règles que vous devez suivre lors de l’implémentation de la méthode ‘equals()’ en Java?
Les règles incluent la réflexivité, la symétrie, la transitivité et la consistance.
- Réflexivité	: x.equals(x) == true
- Symétrie	: x.equals(y) == true => y.equals(x) == true
- Transitivité	: x == y && x == z => y == z
- consistance	: Toujours le même résultat pour un couple donné.

### 4 - Pourquoi est-il recommandé de redéfinir la méthode ‘hashCode()’ lorsque vous redéfinissez ‘equals()’ ?
C’est nécessaire pour maintenir la cohérence avec les collections basées sur le hachage, assurant que deux objets égaux ont le même code de hachage.

### 5 - Quels sont les risques si vous ne respectez pas la règle “si equals() retourne true, alors hashCode() doit renvoyer le même résultat” ?
Les collections basées sur le hachage ne fonctionnent pas correctement, entraînant des comportements inattendus lors de l’utilisation de ces objets dans des structures de données tq des HashMap.

### 6 - Quelle est la différence entre ‘==’ et ‘equals()’ en Java?
- ‘==’ compare les références d’objets.
- ‘Equals()’ compare le contenu des objets, et on peut personnalisér la méthode équals() avec "Override".

### 7 - Pouvez-vous utiliser un champ mutable comme clé dans une HashMap? Pourquoi et pourquoi pas ?
Il est généralement déconseillé d’utiliser un champ mutable comme clé, car si la clé change après l’ajout dans la HashMap,  le code de hachage peut être altéré, entraînant des erreurs de recherche.

### 8 - Comment pouvez-vous assurer l’immuabilité d’une classe lorsque vous l’utilisez comme clé dans une HashMap?
La classe doit être déclarée comme immuable, et tous les champs utilisés pour “equals” et “hashCode()” doivent également être immuables.

### 9 - Quelle est la relation entre ‘hashCode()’ et les performances des collections basées sur le hachage?
Une bonne répartition des codes de hachage peut améliorer les performances des opérations de recherche dans les collections basées sur le hachage.

### 10 - Quelle est la signification du terme “collision” dans le contexte des codes de hachage? Comment les collections basées sur le hachage les gèrent-elles?
Collision: Lorsque deux objets différents ont le même code de hachage.
On peut utiliser la liste des chaînes pour résoudre ce problème. (On crée une liste chaînée à l’emplacement si un objet existe déjà).


