# Singleton Pattern : 
## I - Différentes méthodes d'implémenter singleton
A class that is instantiated exactly once.
- 1- Field instance( Instance de champ) : Private constructor + public static final instance field.
```
public class Tom {
    public static final Tom Instance = new Tom();
    private Tom() {}
    public void catchJerry() {...}
    }
}
```
- 2- Static factory : private constructor + private static final instance field.	
	getInstance() is called ‘static factory’ in this case.
```
public class Tom {
    public static final Tom Instance = new Tom();
    private Tom() {}
    public static Tom getInstance() { return Instance; }
    public void catchJerry() {...}
    }
}
```
- 3 - Lazy initialization :  instancier l'objet quand il y a besoin.
```
public class Tom {
  private static final Tom INSTANCE;
  private Tom() {...}
  public static Tom getInstance() {
    if(INSTANCE == null) {
      INSTANCE = new TOM();
    }
    return INSTANCE;
  }
}
```
## II - Problèmes et Améliorations
### Thread safe:
 	Quand il y a race condition, alors ça détruit le singleton。
  Par exemple quand il y a deux thread, alors pendant quand le premier thread est entrain de créer l'instance, la deuxième peut aussi commencer à créer.
  Pour éviter ce problème, on ajoute 'synchronized' après static.

```
public class Tom {
  private static final Tom INSTANCE;
  private Tom() {...}
  public static synchronized Tom getInstance() {
    if(INSTANCE == null) {
      INSTANCE = new TOM();
    }
    return INSTANCE;
  }
}
```
### volatile:
Parceque thread peut être exécuté dans des processus différentes, alors on met volatile pour que thread va lire l'instance depuis la mémoire globale.
```
public class Tom {
  private static volatile final Tom INSTANCE;
  private Tom() {...}
  public static synchronized Tom getInstance() {
    if(INSTANCE == null) {
      synchronized(this);
      if(INSTANCE == null) {
        INSTANCE = new TOM();
      }
    }
    return INSTANCE;
  }
}
```





