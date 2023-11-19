# I- Qu'est ce que le mot-clé en Java?
En java, les mot-clés sont des termes réservés qui ont des significations spéciales dans le langage.

# II- Questions d'entretien sur les mot-clés.
### 1 - Quel est le rôle du mot-clé "final" en Java?

Le mot-clé 'final' est utilisé pour indiquer que quelque chose ne peut pas être modifié.
- Rend une variable constante
- Rend une méthode non modifiable dans les sous-classes
- Rend une classe non extensibles

### 2 - Quelle est la différence entre 'static' et 'final pour les variables en java?

 - 'static' : Partagée par toutes les instances de la classe.
 - 'final' : Ne peut pas être modifiée parès son utilisation

Tips: Une variable static ne peut pas être déclaré comme privé,car il n'appartient pas à une classe.

### 3 - Comment utilisez-vous le mot-clé "this" en Java?

Le mot-clé 'this' est utilisé pour faire référence à l'instance actuelle de la classe.
Souvent utilisé pour éviter les ambiguïté entre les variables d'instance et les variables locales, lorsque celles-ci ont le même nom.

### 4 - Qu'est ce que le mot-clé 'static' signifie pour une méthode en Java?

Une méthode est déclarée avec le mot-clé "static" appartient à la classe plutôt qu'à une instance particulière.
* Elle peut être appelée sans créer d'instance de la classe.
* Elle ne peut qu'accéder aux variables statics de la classe.

### 5 - Expliquez le rôle du mot-clé "synchronized" en Java.

Le mot-clé 'synchronized' est utilisé pour gérer la concurrence dans les threads.
Il garantit qu'un seul thread à la fois peut accéder à une section de code ou à une méthode synchronisée.
* Méthode synchronisé:
    ```
    class Compteur {
        private int valeur = 0;
        public synchronized void incrementer() {
            valeur ++;
        }
    }
    ```
* Blocs synchronisé:
    ```
    Class ListePartagee {
        private List<String> elements = new ArrayList<>();
        public void ajouter(String element) {
            synchronized(this) {
                    element.add(element);
            }
        }
    }
    ```

### 6 - Quelle est la signification du mot-clé "super" en Java?

Le mot-clé "super" est utilisé pour accéder aux membres de la classe parente.
Souvent utilisé pour appeler le constructeur de la classe parente dans le constructeur de la classe enfant.

### 7 - A quoi sert le mot-clé 'abstract en Java?

Utilisé pour déclarer une classe abstraite ou une méthode abstraite.
- Classe: Ne peut pas être instanciée.
- Méthode: Pas d'implémentation dans la classe où elle est déclarée

### 8 - Quel est le rôle du mot-clé 'interface' en Java?

Pour déclarer une interface.
Une interface est une collection de méthodes abstraites.
Une interface pour une classe est comme un contrat, la classe qui implémente l'interface doit réaliser les méthodes abstraites de l'interface.

### 9 - Comment fonctionne le mot-clé 'volatile' en Java?

Utilisé pour indiquer au compilateur et au runtime que la valeur d'une variable peut être modifiée par plusieurs threads.
Il garantit la visibilité des changements de la variable entre les threads,  c'est à dire que chaque fois qu'un thread accède à cette valeur, il peut voir la valeur la plus récente.

### 10 - Quelle est la signiciation du mot-clé "try","catch" et "finally"?

- Try : Encadre un code qui peut générer des exceptions
- Catch : Gérer les exceptions
- Finally : Exécute à la fin de try ou catch.

### 11 - Quelle est la différence entre une variable statique et une variable d'instance en Java?

Une variable statique est partagée par toutes les instances de la classe.
Une variable d'instance appartient à chaque instance de la classe.

### 12 - Peut-on accéder à une variable non statique depuis une méthode statique en Java?

Non, une méthode statique ne peut pas accéder directement aux variables d'instances.
Elle peut seulement accéder à des variables statiques.

### 13 - Qu'est ce qu'une méthode statique en Java, et comment est-elle différente d'une méthode d'instance?

Une méthode statique est une méthode liée à la classe plutôt qu'à une instance particulière.
Une méthode d'instance est associée à une instance spécifique de la classe et ne peut être appelée que sur cette instance.

### 14 - Dans quel contexte utiliser le mot-clé 'final' pour une méthode en Java?

Interdiction de la redéfinition de la méthode dans des sous-classes.
Cela peut assurer l'immutabilité du comportement de la méthode dans les sous-classes.
    
### 15 - Comment déclarer une constante en Java en utilisant le mot-clé "final"?

static final int MA_CONSTANTE = 42;

### 16 - Peut-on modifier la valeur d'une variable 'final' après sont initialisation enJava?

Non

### 17 - Peut on déclarer une classe "static"?

On ne peut pas déclarer une classe static.

### 18 - Peut on déclarer une classe "final" ?

Oui, ce qui signifie qu'elle ne peut pas être étendue(sous-classée).

### 19 - Comment le mot-clé "static est-il utilisé dans le contexte des blocs d'initialisation en Java?

En Java, les blocs d'initialisation statique sont des portions de code qui sont exécutées lors du chargement de la classe.
Il existe 2 blocs d'initialisation statiques:
- Bloc d'initialisation statique de classe.
    
    ```
        public class ExempleBlocInitialisation {
            static int variableStatique;
            static {
                variableStatique = 10;
            }
        }
    ```
    
- Bloc d'initialisation statique d'instance.
    ```
    public class ExempleBlocInitialisationInstance {
        int variableDInstance;
        {
            variableDInstance = 10;
        }
    }
    ```
