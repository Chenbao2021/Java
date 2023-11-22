# Lambda expressions
## I - Définition
En Java, une lambda expression est une manière concise et expressive de représenter une instance d'une interface fonctionnelle(Une interface avec une seule méthode abstraite).
Elle permet de déclarer des fonctions anonymes de manière plus concise que les méthode straditionnelles.

Exemple:
```
// Interface fonctionnelle avec une seule méthode abstraite
interface Calcul {
    int operation(int a, int b);
}
public class ExempleLambda {
    public static void main(String[] args) {
        // Utilisation d'une lambda expression pour définir une fonction d'addition
        Calcul addition = (a, b) -> a + b;

        // Utilisation de la fonction définie par la lambda expression
        System.out.println(addition.operation(5, 3)); // Affiche 8
    }
}
```

## II - Questions d'entretien
### 1- Qu’est ce qu’une expression lambda en Java et quel est son objectif principal?
	Une expression lambda est une fonction anonyme qui permet de traiter les fonctions comme des objets.
	Simplifier le code en permettant une implémentation plus concise des interfaces fonctionnelles.

### 2- Quelle est la différence entre une interface fonctionnelle et une interface normale dans le contexte des expressions lambda?

- Une interface fonctionnelle: Une interface qui contient une seule méthode abstraite.
Les expressions lambda sont souvent utilisées pour implémenter de tels interfaces de manière concise.

- Les interfaces normales peuvent avoir plusieurs méthodes abstraites et ne peuvent pas être utilisées directement avec des expressions lambdas.

## 3- Comment déclarez-vous une expression lambda en Java? Donnez un exemple simple.
	Une expression lambda a la syntaxe ‘(paramètres) -> expression’.
```
Runnnable runnable = new Runnable() {
  @override
  public void run() {
    System.out.println(“Hello world”);
  }
}

Runnable lambdaRunnable = () -> System.out.println(“Hello World!”);
```

### 4- Qu’est ce que l’interface fonctionnelle prédéfinie en Java, et donnez un exemple d’utilisation d’une telle interface avec une expression lambda


### 5- Expliquez la notion de portée(scope) des variables dans une expression lambda



### 6- Quand utilisez-vous une expression lambda plutôt qu’une classe anonyme pour implémenter une interface fonctionnelle?

Les expressions lambda sont plus concises que les classes anonymes, donc elles sont préférées pour des interfaces fonctionnelles simples. Les classes anonymes sont toujours nécessaires lorsqu’on a besoin de plusieurs méthodes ou d’une référence à ‘this’.

### 7- Pouvez-vous utiliser une expression lambda sans avoir une interface fonctionnelle?

Non, une expression lambda doit toujours être utilisée avec une interface fonctionnelle.
Cependant, Java propose des interfaces fonctionnelles pré-définies dans Java.util.function’
qui peuvent être utilisées dans divers contextes.

### 8- Quelle est la différence entre les expressions lambda et les méthodes de référence en Java?Donnez des exemples.

Les méthodes de référence offrent un moyen plus concis d’écrire des expressions lambda en utilisant des références de méthode existantes.

```
// Expression Lambda
List<String> names = Arrays.asList(“Alice”, “Bob”, “Charlie”)
names.forEach(s -> System.out.println(s));

// Méthode de référence
name.forEach(System.out:: println);
```

### 9- Comment gérer les exceptions à l’intérieur d’une expression lambda?

On peut utiliser un bloc try-catch à l’intérieur de l’expression lambda.
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.forEach(num -> {
  try {
    System.out.println(10 / num);
  } catch (ArithmeticException e) {
    System.err.println(“Division par zéro”);
  }
});
```



10- Expliquez le concept de capture de variable effectivement finale dans les expressions lambda.

Les expressions lambda capturent les variables locales, si la variable n’est pas effectivement finale et que sa valeur est modifiée après la capture par l’expression lambda, cela pourrait entraîner des comportements imprévisibles, car l’expression lambda utilise la valeur au moment de la capture.
