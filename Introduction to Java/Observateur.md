# Observateur
## I - Définition

 Lien pour les cours:  https://docs.google.com/document/d/1qSaPjavBbZ-kixZb-frWRgXZiR6pXerkfuMFMoC1Scw/edit?usp=sharing

## II - Questions d'entretien

### 1 - Qu'est ce que le design pattern Observateur et quel problème cherche-t-il à résoudre?
Le pattern Observateur est un modèle de conception comportemental qui définit une dépendance entre objets de manière à ce que lorsque l'état d'un objet change, tous ses dépendants soient notifiés et mis à jour automatiquement.
Il résout le problème de la communication efficace entre objets sans les coupler de manière rigide.

### 2 - Quelles sont les principales classes/interfaces impliquées dans le pattern Observer et quel est leur rôle ?
- Observable(sujet observé): Maintient une liste d'observateur et notifie ces observateurs en cas de changement.

- Observer(observateur): Implémenté avec une méthode de mise à jour.

### 3 - Comment garantissez-vous le couplage lâche entre les sujets (sujets observés) et les observateurs dans le pattern Observer ?
En utilisant des interfaces, le couplage est réduit. Les sujets observés ne connaissent que l'interface Observer, et les observateurs ne connaissent que l'interface Observable. 
Cela permet de changer ou d'ajouter des observateurs sans modifier le code du sujet observé.

### 4 - Expliquez comment le pattern Observer est utilisé dans le modèle de conception MVC (Modèle-Vue-Contrôleur).
Le modèle(Model) agit comme le sujet observé, tandis que la Vue agit comme l'observateur.
Lorsque le modèle change, la vue est notifiée et mise à jour en conséquence, assurant une séparation efficace de préoccupations.

### 5 - Quels sont les avantages et les inconvénients du pattern Observer, et dans quels cas serait-il approprié de l'utiliser ?
- Les avantages:
    - Le couplage lâche
    - La facilité d'extension
    - La séparation des responsabilités
- Les inconvénients:
    - Mises à jour coûteuses
    - Complexité potentielle
  
