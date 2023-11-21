
# La Collection (List, Map, Set)

## I - Définition
En Java, 'List', 'Map' et 'Set' sont des interfaces du framework de collections, situé dans le package 'java.util'.
Elles fournissent différentes structures de données pour le stockage, la manipulation et la récupération d'éléments.
- List: Collections ordonnées avec des duplicatas.
- Map: Associations clé-valeur.
- Set: Ensembles sans duplicatas.

## II - Questions d'entretien
### 1 - Quelle est la principale différence entre une ArrayList et une LinkedList en Java?
- ArrayList utilise un tableau pour stocker les éléments. Il est plus rapide pour l’accès aléatoire
- LinkedList utilise une liste chaînée. Il est plus efficace pour les opérations d’insertion et de suppression en milieu de liste.

### 2 - Comment ajoutez-vous un élément à la fin d’une liste en Java?
Pour ajouter un élément à la fin d’une liste, on utilise : “.add()”
### 3 - Quand choisiriez-vous d’utiliser une ArrayList plutôt qu’une LinkedList, et vice versa?
- Lorsque l’accès aux éléments est fréquent		:‘ArrayList’
- Lorsque l’insertion et suppression sont fréquent	:’LinkedList’

### 4 - Qu’est-ce qu’un HashSet en Java et comment garantit-il l’unicité des éléments?
HashSet utilise une table de hachage pour garantir l’unicité des éléments.
Il utilise la méthode ‘hashCode()’ pour déterminer l'emplacement sur la table.

### 5 - Pouvez-vous expliquer la différence entre HashSet et TreeSet en termes de tri des éléments?
- HashSet ne garantit pas l’ordre des éléments
- TreeSet maintient les éléments dans l’ordre.

HashSet utilise une table de hachage pour srocker les éléménts, les éléments sont stocké aléatoirement.
TreeSet utilise une structure de données de type arbre(Les éléments sont toujorus triée).

### 6 - Comment vérifiez-vous si un élément particulier existe dans un HashSet?
On peut utiliser ‘contains()’ pour vérifier si un élément existe.


### 7 - Expliquez la différence entre HashMap et TreeMap.
HashMap ne garantit pas d’ordre
TreeMap trie les clés dans un ordre naturel ou spécifié par un comparateur


### 8 - Comment ajoutez-vous une paire clé-valeur à une carte(MAP) en Java?
On peut utiliser la méthode ‘.put(clé, valeur)’


### 9 - Quelle est la différence entre les méthodes ‘get()’ et ‘containsKey()’ dans une Map?
‘get()’ renvoie la valeur associée à la clé
‘containsKey() indique si la clé existe.
