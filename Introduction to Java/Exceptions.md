# Exceptions en Java
## I - Définition
Une exception est un événement anormale qui se produit pendant l'exécution d'un prograrmme et qui perturbe le flux normal d'instructions.
Une exception est une instance de la classe 'java.lang.Exception' ou de la classe 'java.lang.Error'.
Ex: division par zéro, l'accès à un tableau avec un index invalide, la tentative d'ouvertuve d'une fichier inexistante.

## II - Questions d'entretien

### 1 - Qu’est-ce qu’une exception en JAVA?
En Java, une exception est un événement anormal qui se produit pendant l’exécution d’un programme et perturbe le flux normal d’instructions.

### 2 - Quelle est la différence entre les exceptions contrôlées (checked exceptions) et les exceptions non contrôlées(unchecked exceptions) ?
Les exceptions contrôlées doivent être gérées explicitement dans le code à l’aide de ‘try-catch’, ou déclarées dans la signature de la méthode avec throws. liée à des conditions qui ne sont pas sous contrôle direct du programmeur, par exemple une tentation de la lecture d'un fichier inexistante

Les exceptions non contrôlées incluent les classes RuntimeException et leurs sous-classes, et ne nécessitent pas de traitement explicite
```
try {
  int result = 10/0;
} catch(ArithmeticException e) {
  System.out.println(“Une division par zéro a été tentée.”);
}
```
### 3 -  Quelle est la différence entre throw et throws en Java?
Throw est utilisé pour déclencher une exception explicite.
Throws est utilisé dans la signature de méthode pour indiquer que la méthode peut lancer certaines exceptions.
```
public class ExempleThrowsFunction {
  public static void main(String[] args) {
    try{
      lireFichier(“Monfichier.txt”);
    } catch (FileNotFoundException e) {
    } catch(IOException e) {
    }
  }

  static void lireFichier(String nomFichier) throws FileNotFoundException, IOException {
    FileReader lecteur = new FileReader(nomFichier);
    //…
    lecteur.close();
  }
}
```
### 4 - Expliquez le bloc ‘finally’ en Java.
Le bloc ‘finally’ est utilisé pour contenir du code qui doit être exécuté, qu’une exception soit levée ou non dans le bloc ‘try’.

Il est souvent utilisé pour la gestion des ressources, garantissant que celles-ci sont libérées même en cas d’exception.

```
FileInputStream fichier = null;

try{
  fichier = new FileInputStream(“monFichier.txt”);
} catch (IOException e) {
  System.out.println(“Une exception d’entrée-sortie s’est produite.”);
} finally {
  if( fichier != null) {
    try {
      fichier.close();
    } catch(IOException e) {
      System.out.println(“Erreur lors de la fermeture du fichier”);
    }
  }
}
```

### 5 - Qu’est ce que la classe ‘Exception’ et comment est-elle utilisée dans la gestion des exceptions en Java?
‘Exception’ est la classe de base pour toutes les exceptions vérifiées.
Elle peut être étendue pour créer des exceptions personnalisées.

Les exceptions personnalisées sont utilisées pour signaler des erreurs spécifiques à l’application.
Exemple:
```
// Définition de votre exception personnalisée
class MonExceptionPersonnalisee extends Exception {
    public MonExceptionPersonnalisee() {
        super("Ceci est une exception personnalisée.");
    }

    public MonExceptionPersonnalisee(String message) {
        super(message);
    }
}
// Utilisation de l'exception personnalisée
public class ExempleExceptionPersonnalisee {
    public static void main(String[] args) {
        try {
            // Lancer votre exception personnalisée
            throw new MonExceptionPersonnalisee("Message d'erreur spécifique");
        } catch (MonExceptionPersonnalisee e) {
            // Capturer et traiter l'exception personnalisée
            System.err.println("Exception capturée : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

### 6 - Quelle est la différence entre ‘catch(Exception e)’ et ‘catch (RuntimeException e)’ dans un bloc ‘catch’ ?
- ‘catch (Exception e)’ capture toutes les exceptions, qu’elles soient contrôlées ou non contrôlées.

- ‘catch (RuntimeException e)’ capture spécifiquement les exceptions de type runtimeException et ses sous-classes.

### 7 - Quand utilisez-vous ‘throws’ dans la signature d’une méthode?
On utilise ‘throws’ dans la signature d’une méthode lorsqu' on veut indiquer que la méthode peut lancer une ou plusieurs exceptions vérifiées, mais on ne veut pas les gérer avec ‘try-catch’.

Il transfére la responsabilité de gérer ces exceptions aux appelants de la méthode , ou à d'autres parties du code qui appellent cette méthode.
```
public class ExempleThrows {
  public static void main(String[] args) {
    try {
      maMethode();
    } catch (Exception e) {
      System.out.println(“Exception capturée : “ + e.getMessage());
    }
  }

  static void maMethode() throws Exception {
    throw new Exception(“Une exception s’est produite dans maMethode.”);
  }
}
```

### 8 - Expliquez la différence entre ‘Error’ et ‘Exception’ en Java.
‘Error’ représente des erreurs graves qui ne devraient normalement pas être gérée ou capturées par l’application(ex: OutOfMemoryError) . 

‘Exception’ sont destinées à être gérées dans le programme, et sont généralement des erreurs moins graves.

### 9 - Qu’est ce que le bloc ‘try-with-ressources’ et comment fonctionne-t-il ?
Le bloc ‘try-with-resource’ est utilisé pour gérer automatiquement la fermeture de ressources tq des fichiers ou des connexion réseau.

Les ressources sont automatiquement fermées à la fin du bloc ‘try’, que des exceptions se produisent ou non .

```
try (FileWriter writer = new FileWriter(“monFichier.txt”)) {
  writer.write(“Contenu à écrire dans le fichier.”);
} catch (IOException e) {
  System.out.println(“Erreur lors de l’écriture dans le fichier”);
}
```

### 10 - Qu’est ce que la propagation d’exception(exception propagation) en Java?
La propagation d’exception se produit lorsque, dans une méthode, une exception n’est pas traitée localement avec ‘try-catch’, elle est propagée à la méthode appelante.

On l’utilise généralement pour signaler une condition d’erreur ou une situation exceptionnelle à un niveau supérieur de la hiérarchie des appels de méthodes, où elle peut être gérée de manière appropriée.

Cela se produit automatiquement sauf si la méthode est déclarée avec ‘throws’ pour certaines exceptions.

Avec throws, on déclare que la méthode peut lancer cette exception.
=> Le compilateur Java obligera le code appelant à gérer cette exception ou à la déclarer à son tour avec throws.

