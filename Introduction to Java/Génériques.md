# Générique
## I - Définition
Les génériques en Java permettant de créer des classes, interfaces et méthodes qui peuvent travailler avec différents
types de données tout en offrant une sécurité de type au moment de la compilation.

## II - Questions d'entretien
### 1 - Qu’est ce que le générique en Java et quel est son objectif principal ?
Les génériques en Java permettent de créer des classes,
interfaces et méthodes qui peuvent travailler avec différents types de données tout en offrant une sécurité de type.

### 2 - Comment déclarez-vous une classe générique en Java?
```
public class Boite<T> {
  private T contenu;
  public void mettre(T objet) {
    this.contenu = objet;
  }

  public T obtenir() {
    return contenu;
  }
}
```

### 3 - Quelle est la différence entre un type sauvage(‘raw type’) et un type générique?
Un type sauvage utilise des génériques sans spécifier le type, ce qui peut causer des avertissements de compilation.
```
List<?> listSauvage = new ArrayList<>();
```
Signifie que la liste peut contenir des éléments de n’importe quel type, mais le type exact n’est pas spécifié.
Mais avec les types sauvages, on perd une partie de l’information de type spécifique que les génériques sont censés fournir, car les types sont inconnus.

### 4 - Expliquez le concept de “type bounds” dans le contexte des génériques.
Les “types bounds” spécifient les limites des types pouvant être utilisés avec des génériques, exemple avec une borne supérieur:
```
public class Boire<T extends Fruit> {
}
```

### 5 - Qu’est-ce qu’une méthode générique et comment déclarez-vous une telle méthode?
Une méthode générique permet de travailler avec différents types.

Exemple de méthode génériques:
```
public <T> T fusionner(T a, T b) {
  // Logique de fusion  
  return resultat;
}
```

### 6 - Comment utilisez-vous des génériques pour créer une collection en Java?
Exemple de création d’une liste générique:
```
List<String> listeChaines = new ArrayList<>();
```

### 7 - Qu'est ce que l'invariance, la covariance et la contravariance dans le contexte des génériques?
- Invariance: Aucune sous-typage n’est autorisé
- Covariance: Permet le sous-typage, exemple: ‘List<? extends Fruit>’
- Contravariance: permet le surtypage; ‘List<? super Fruit>’

Invariant:
En Java, par défaut, les types génériques sont invariants,c'est à dire:
Si classeA est une sous-classe de ClasseB,  cela ne signifie pas que 'List<ClasseA>' est une sous-liste de 'List<ClassB>', on ne peut pas affecteur une 'List<ClasseA>' à une variable de type ClasseB, même si ClasseA est une sous-classe de 'ClasseB'.

Covariance:
```
static void afficherFruits(List<? extends Fruit> listeDeFruits) {
        for (Fruit fruit : listeDeFruits) {
            System.out.println(fruit);
        }
}

 public static void main(String[] args) {
        // Création d'une liste de pommes
        List<Pomme> listeDePommes = new ArrayList<>();
        listeDePommes.add(new Pomme());
        listeDePommes.add(new Pomme());

        // Afficher les pommes (et la covariance permet également de passer une liste de sous-types)
        afficherFruits(listeDePommes);

        // Création d'une liste d'oranges
        List<Orange> listeDOranges = new ArrayList<>();
        listeDOranges.add(new Orange());
        listeDOranges.add(new Orange());

        // Afficher les oranges (et la covariance permet également de passer une liste de sous-types)
        afficherFruits(listeDOranges);
}
```

Permet à un type générique de varier dans la même direction que son type de base.
Si 'ClasseA' est une sous-classe de 'ClasseB', alors 'List<ClasseA>' est considérée comme une sous-liste de 'List<? extends ClasseB>'. Cela permet d'assigner une 'List<ClasseA>' à une variable de type 'List<? extends ClasseB>'.

Contravariance:
```
Consumer<? super Integer> consommateur = new ArrayList<Number>()::add;
```
La contravariance permet à un type générique de varier dans la direction opposée à son type de base.
N'est pas aussi ourant que Contravariance.

### 8 - Comment utilisez-vous le mot-clé ‘wildcard’(‘?’) avec les génériques?
Le wildcard est utilisé pour représenter un type inconnue:
```
public void imprimerListe(List<?> liste) {
  // Logique d’impression
}
```

### 9 -  Qu’est ce que l’erasure des types et comment cela affecte-t-il les génériques en Java?
Erasure des types est le processus par lequel les informations sur les types génériques sont supprimées à la compilation.

Cela peut entraîner des avertissements et des limitations.

### 10 - Comment les génériques contribuent-ils à la sécurité et à la clarté du code en Java?
- Détectant les erreurs de type à la compilation.
- la clarté du code en permettant une spécification précise des types utilisés dans les classes/interfaces/méthodes.

