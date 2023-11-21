# ArrayList et LinkedList
## I - Definition
ArrayList et LinkedList sont deux implémentations de l'interface 'List' dans Java.
- ArrayList : Utilise tableau dynamique pour stocker les éléments.Lorsque la taille de la liste dépasse la capacité du tableau, un nouveau tableau plus grand est crée, et les éléments sont copiés dans le nouveau tableau.
- LinkedList : Elle utilise une liste doublement chaînée pour stocker les éléments. Chaque élément dans la liste a une référence vers l'élément précédent et l'élément suivant.

## II - Questions d'entretien
### 1 - Quelle est la différence fondamentale entre ArrayList et LinkedList en Java?
ArrayList est basée sur un tableau dynamique,
LinkedList est basée sur une liste doublement chaînée.
### 2 - Comment ajouter un élément à la fin d’une ArrayList en Java?
Utilisez la méthode ‘add()’ pour ajouter un élément à la fin de l’ArrayList.
```
ArrayList<String> arr = new ArrayList();
arr.add(“Premier”);
```
### 3 - Comment ajouter un élément à la fin d’une LinkedList en Java?
De même, utiliser la méthod “add”
### 4 - Quand choisiriez-vous d’utiliser une ArrayList plutôt qu’une LinkedList, et vice-versa ?
- ArrayList : Lorsqu’on a besoin d’un accès rapide par index.
- LinkedList: Lorsqu’on effectue fréquemment des opérations d’insertion ou de suppression.

### 5 - Comment supprimer un élément à une position spécifique dans une ArrayList?
On utilise la méthode “.remove(index)”.

### 6 - Comment supprimer un élément à une position spécifique dans une liste LinkedList?
même méthode

### 7 - Comment parcourir tous les éléments d’une ArrayList en utilisant une boucle for ?
Utiliser une boucle for pour itérer sur les éléments de l’ArrayList.
```
ArrayList<String> arrayList = new ArrayList<>();
for(int i = 0; i < arrayList.size(); i++) {
  System.out.println(arrayList.get(i))
}
```
### 8 - Comment parcourir tous les éléments d’une LinkedList en utilisant une boucle for ?
On peut parcourir avec un itérateur(Iterator):
```
  for (Iterator<String> it = maListe.iterator(); it.hasNext();) {
            String element = it.next();
            System.out.println(element);
        }
```
ou avec une boucle for:
```
for (String element : maListe) {
    System.out.println(element);
}
```
### 9 -  Quelle est la complexité temporelle de l’opération de récupération d’un élément par index dans une ArrayList et une LinkedList?

Dans ArrayList: O(1), car il suffit de pointer à la position indiquée selon l’index.
Dans LinkedList: O(n) , car il faut parcourir la liste.

### 10 - Comment convertir une ArrayList en tableau(Array) en Java?
Utiliser la méthode “toArray()” pour convertir une ArrayList en tableau.
```
ArrayList<String> arr = new ArrayList<>();
arr.add(“Premier”);
arr.add(“Second”);
// “new String[0]” utilisé comme modèle pour indiquer le type de tableau.  
String[] tableau = arr.toArray(new String[0])

```
