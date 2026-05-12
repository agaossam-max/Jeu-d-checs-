# ♟️ Exercice 5 - Remplacement de isValidMove

Ce projet est un exercice de Programmation Orientée Objet en Java. L'objectif principal est de remplacer la méthode `isValidMove`
 dans la classe `Reine` afin de valider ses déplacements aux échecs. La reine peut se déplacer horizontalement,
 verticalement ou en diagonale sur n'importe quelle distance. Le projet repose sur une hiérarchie de classes où `Reine`, 
`Tour` et `Fou` héritent toutes de la classe de base `Piece`, chacune redéfinissant ses propres règles de mouvement via le polymorphisme.
 La classe `Position` représente une case du plateau avec une ligne et une colonne, 
tandis que la classe `Main` sert de point d'entrée pour tester et afficher si le déplacement d'une reine est valide ou non.
