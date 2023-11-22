# Threads
## I - Définition
En Java, les threads sont utilisés pour exécuter des tâches en parallèle, permettant à un programme d'accomplir plusieurs tâches simultanément.
Cas d’utilisation:
- Traitement par lot(Batch Processing)
    - Avec thread: Chaque thread peut traiter une partie distincte des données en parallèle. accélérant ainsi le traitement global.
    - Sans thread: Chaque tâche attend la fin de la précédente, ce qui peut prendre du temps.

- Interface utilisateur réactive
    - Avec threads: les threads peuvent être utilisés pour effectuer des opérations intensives sans bloquer l’interface utilisateur, assurer une expérience utilisateur réactive.
    - Sans threads: Les opérations intensives bloqueraient l’interface utilisateur, rendant l’application moins conviviale.
- Calculs intensifs:
    - Avec threads: Chaque thread peut effectuer une partie des calculs
    - Sans threads: Un seul thread effectue tous les calculs séquentiellement.

## II - Questions d'entretien
### 1- Qu’est ce qu’un thread en Java?
Un thread en Java est une unité d’exécution légère qui représente un chemin d’exécution séquentiel au sein d’un programme Java.

Un programme Java peut exécuter plusieurs threads simultanément.

un chemin d’exécution séquentiel : exécution ordonnée et linéaire, chaque instruction est exécutée l’une après l’autre, de manière séquentielle, sans qu’aucune instruction ne soit exécutée simultanément.
=> Dans un chemin d’exécution séquentiel, il n’y a pas parallélisme ni concurrence.

### 2- Quelle est la différence entre un thread et un processus ?

Un processus est un programme en cours d’exécution.
Un thread est un sous-processus léger d’un processus, les threads d’un même processus partagent le même espace mémoire.

Processus s’exécutent dans des espaces mémoire différents
Thread s'exécutant dans un espace mémoire partagé.

Un processus se compose de plusieurs threads.
Un thread est la plus petite partie du processus pouvant s’exécuter simultanément avec d’autres parties du processus.

### 3- Comment créer un thread en Java?

Il existe deux façons principales de créer un thread en Java:
En étendant la classe ‘Thread’ 
En implémentant l’interface ‘Runnable’
Et en passant une instance de cette classe ou interface au constructeur de ‘Thread’

Class MonThread implements Runnable {
  public void run() {
    // Code exécuté dans le thread
  }
}

Thread monThread = new Thread(new MonThread());
monThread.start();

### 4- Quelle est la différence entre ‘extends thread’ et ‘implements Runnable’ pour la création de threads?

En Java, il est généralement préférable d’utiliser l’interface ‘Runnable’ car elle permet une meilleure séparation des responsabilités.

En utilisant ‘implements Runnable’, la classe peut étendre une autre classe si nécessaire.

### 5- Qu’est ce que la synchronisation des threads en Java?

La synchronisation des threads en Java est le mécanisme permettant de contrôler l’accès simultané à des ressources partagées pour éviter les conflits de données et garantir la cohérence des données.

### 6- Expliquez ce qu’est un deadlock(impasse) en programmation multithread en Java.

Un deadlock se produit lorsque deux ou plusieurs threads attendent indéfiniment que l’autre libère une ressource, bloquant ainsi l’exécution du programme.

### 7- Qu’est ce que la méthode ‘join()’ sur un thread en Java?

La méthode ‘join()’ est utilisée pour attendre que le thread sur lequel elle est appelée termine son exécution.

Elle peut être utilisée pour synchroniser l’exécution de plusieurs threads.
```
Thread monThread = new Thread(() => {
  // Code du thread
});

monThread.start();
monThread.join();
```



### 8- Quelle est la différence entre les méthodes ‘wait()’ et ‘sleep()’ en Java?

‘wait()’ : utilisée pour libérer le verrou et suspendre l’exécution d’un thread jusqu’à ce qu’un autre thread appelle la méthode ‘notify()’ ou ‘notifyAll()’ .

‘sleep()’ : Suspend simplement l’exécution du thread pendant une période spécifiée sans libérer le verrou. 

### 9- Qu’est ce que le modèle de programmation asynchrone en Java?

Pour exécuter des opérations de manière non bloquante, permettant ainsi à un thread de continuer son exécution pendant que d’autres opérations sont en attente.

### 10- Comment éviter les conditions de course(race condition) en programmation multithread?

Conditions de course: Lorsque deux ou plusieurs threads accèdent concurremment à des ressources partagées et tentent de les modifier en même temps.

Les résultats de ces opérations dépendent de l’ordonnancement des threads par le système d’exploitation, et ils peuvent conduire à des comportements inattendus ou incorrects.

Et les conditions de course peuvent être évitées en synchronisant l’accès aux ressources partagées à l’aide de mécanismes tels que les blocs synchronisés.

