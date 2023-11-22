# Sérialisation
## I - Définition 
La sérialisation est le processus de conversion d'un objet en une séquence d'octets, souvent dans le but de le stocker sur un support de stockage (comme un fichier) ou de le transmettre à travers un réseau. L'objectif principal de la sérialisation est de rendre les objets persistants ou transportables.

## II - Questions d'entretien
### 1- Qu’est ce que la sérialisation en Java et pourquoi est-elle utilisée?
La sérialisation en Java est le processus de conversion d’un objet en un flux d’octets,
Généralement dans le but de sauvegarder l’état de l’objet ou de le transmettre via le réseau.

Elle est utilisée pour stocker des objets de manière persistante et pour transférer des objets entre différentes machines virtuelles Java.

### 2- Comment sérialisez-vous un objet en Java? Expliquez le processus de sérialisation.

Pour sérialiser un objet en Java, la classe de l’objet doit implémenter l’interface ‘Serializable’.
Ensuite, vous pouvez utiliser un “ObjectOutputStream” pour écrire l’objet dans un flux de sortie.

### 3- Qu’est ce que l’interface Serializable et quel est son rôle dans la sérialisation en Java?

L’interface ‘Serializable’ est une interface marquée qui indique que les objets de la classe peuvent être sérialisés.
Son rôle est de fournir une indication au compilateur que la classe peut être convertie en un flux d’octets.

### 4- Quelle est la différence entre la sérialisation et la désérialisation en Java?

La sérialisation est le processus de conversion d’un objet en un flux d’octets, tandis que la désérialisation est le processus inverse, où un flux d’octets est utilisé pour recréer un objet.

### 5- Comment exclure un champ spécifique de la sérialisation d’un objet en Java?

Pour exclure un champ spécifique de la sérialisation, on peut utiliser les mots clés ‘transient’ ou ‘static’. Les champs marqués avec ‘transient’ ne sont pas inclus dans le processus de sérialisation.

```
public class MyClass implements Serializable {
  public transient int data;
}
```

### 6- Pouvez-vous sérialiser des objets qui ne sont pas implémentés avec l’interface serializable? Si oui, comment?
Oui, mais cela provoquerait une exception ‘NotSerializableException’. Pour éviter cela, vous pouvez utiliser une méthode personnalisée en implémentant les méthodes ‘writeObject’ et ‘readObject’.
```
public class MyClass {
  public int data;

  private void writeObject(ObjectOutputStream oos) throws IOException {
    oos.defaultWriteObject();
    // Ecrire ici les champs non sérialisables
  }

  private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException {
    oos.defaultReadObject();
    // Lire ici les champs non sérialisables
  } 
}
```

### 7- Quels sont les avantages et les inconvénients de la sérialisation en Java?
- Facile à mettre en oeuvre
- Prend en charge la persistance d’objets
- Utile pour la communication inter-processus
- Peut entraîner des problèmes de sécurité si les données sérialisées sont partagées.
- Peut être inefficace en termes de performance

### 8- Expliquez la différence entre la sérialisation implicite et explicite en Java.
La sérialisation implicite se produit lorsque la classe implémente “Serializable” et utilise la sérialisation par défaut de Java.
La sérialisation explicite se produit lorsque la classe utilise des méthodes personnalisées(‘writeObject’ et ‘readObject’) pour contrôler le processus de sérialisation.

### 9- Qu’est ce que la serialVersionUID et pourquoi est-il recommandé de l’utilisateur lors de la sérialisation en Java?

La ‘serialVersionUID’ est un identifiant unique associé à chaque classe sérialisable.
Elle est utilisée pour vérifier que le même objet est lu pendant la désérialisation.


