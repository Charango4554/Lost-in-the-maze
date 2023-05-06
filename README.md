# Lost-in-the-maze
This is a university board game project in which the player must reach the exit square by avoiding obstacles and mines.
The Lire.Java class was created by the professors of my university (http://jl.baril.u-bourgogne.fr/instajava.pdf)


1-First, the program must initialize the parameters of the game, such as the initial stone credit, the dimensions of the board and the percentages of squares in each category.


2-The program then fills the board by randomly choosing the location of the different squares according to the defined percentages. 3-The passage type squares are also linked to their respective destinations.


4-The player starts the game in the initial position, which is defined by the program.


5-At each turn, the program asks the player where he wants to move. If the move is valid, the player is moved to the new square.


6-


If the square contains a mine, the player loses and the game is over.


If the square contains an obstacle, the player cannot enter it and loses a stone.


If the square contains stones, the player retrieves them and adds them to his stone credit.


If the square is a passage, the player is teleported to the corresponding destination square.


If the square is empty, the player can continue his movement without any problem.


7-If the player has any stones left, he can choose to throw one in a direction to get information about the neighboring squares.The result will depend on which square the stone hits, as explained in the general description.


If the player reaches the finish square, he wins the game.


If the player has no more stones and cannot advance any further, the game is over.


8-The program displays the result of the game, i.e. whether the player has won or lost and the final score in stones.


9-The player can choose to start the game again with the same settings or change some settings for a new game.

--------------------------------------
Il s'agit d'un projet universitaire de jeu de société dans lequel le joueur doit atteindre la case de sortie en évitant les obstacles et les mines.
La classe Lire.Java a été crée par les professeur de mon université (http://jl.baril.u-bourgogne.fr/instajava.pdf)


1-Tout d'abord, le programme doit initialiser les paramètres du jeu, tels que le crédit initial en pierres, les dimensions du plateau et les pourcentages de cases de chaque catégorie.


2-Ensuite, le programme remplit le plateau en choisissant aléatoirement l'emplacement des différentes cases en fonction des pourcentages définis. 3-Les cases de type passage sont également reliées à leur destination respective.


4-Le joueur commence le jeu en position initiale, qui est définie par le programme.


5-À chaque tour, le programme demande au joueur où il souhaite se déplacer. Si le mouvement est valide, le joueur est déplacé sur la nouvelle case.


6-
Si la case contient une mine, le joueur perd et la partie est terminée.


Si la case contient un obstacle, le joueur ne peut pas y entrer et perd une pierre.


Si la case contient des pierres, le joueur les récupère et les ajoute à son crédit en pierres.


Si la case est un passage, le joueur est téléporté à la case de destination correspondante.


Si la case est vide, le joueur peut continuer son mouvement sans problème.


7-

Si le joueur a encore des pierres, il peut choisir d'en lancer une dans une direction pour obtenir des informations sur les cases voisines. Le résultat dépendra de la case touchée par la pierre, comme expliqué dans la description générale.


Si le joueur atteint la case d'arrivée, il gagne la partie.


Si le joueur n'a plus de pierres et ne peut plus avancer, la partie est terminée.


8-Le programme affiche le résultat de la partie, c'est-à-dire si le joueur a gagné ou perdu et son score final en pierres.


9-Le joueur peut choisir de recommencer le jeu avec les mêmes paramètres ou de changer certains paramètres pour une nouvelle partie.
