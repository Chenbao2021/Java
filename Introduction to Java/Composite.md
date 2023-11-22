## I - Définition
Il compose des objets en des structures arborescences pour représenter des hiérarchies composant/composé.
Il permet aux clients de traiter de la même façon les objets individuels et les combinaisons de ces derniers.

[Plus des détailles]

## II - Questions d'entretien
### 1 - Comment le pattern Composite permet-il de traiter les objets individuels et les composites de manière uniforme ?
Le pattern Composite définit une interface commune pour tous les composants (feuilles et composite), ce qui permet de les traiter de manière uniforme.
Les composites ont une liste d'enfants(qui peuvent être des feuilles ou d'autre composites), tandis que les feuilles ne contiennent pas d'autre objets.

### 2 - Pouvez-vous expliquer le rôle des composants, des feuilles et des composites dans le pattern Composite ?
- Composants : Les interfaces communes pour les feuilles(objets individuels) et les composites(collections d'objets)
- Feuilles: Les objets individuels
- Composites: Des collections d'objets, généralement stockés dans une liste.



[Plus des détailles]: <https://docs.google.com/document/d/1Uhw3gXgJHTNobsOeguOWy_W8cc8d8XUg_AsnxNPSOrA/edit?usp=sharing>
