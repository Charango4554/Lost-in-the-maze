package exploration;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author jo
 */
public class Exploration
{

// Définition de la méthode principale "main" en Java, qui est un point d'entrée pour le programme
public static void main(String[] args)
{
    // Déclaration de variables locales
    char rej;
    int nbL, nbCol, ppi = 0, pmi = 0, pob = 0, ppas = 0;

    // Boucle principale qui continue jusqu'à ce que l'utilisateur choisisse de ne pas rejouer
    do {

        // Demande à l'utilisateur d'entrer les pourcentages de chaque catégorie de case
        System.out.println("Veuillez entrer le pourcentage des cases :");

        do {
            ppi = Lire.i("Pierres (entre 3% et 20%) ");
        } while (ppi < 3 || ppi > 20);

        do {
            pmi = Lire.i("Mines (entre 3% et 20%) ");
        } while (pmi < 3 || pmi > 20);

        do {
            ppas = Lire.i("Passages (entre 3% et 20%) ");
        } while (ppas < 3 || ppas > 20);

        do {
            pob = Lire.i("Obstacles (entre 3% et 20%) ");
        } while (pob < 3 || pob > 20);

        // Création d'objets "Categorie" pour chaque type de case, en utilisant les pourcentages entrés par l'utilisateur
        Categorie pierres = new Categorie(ppi, "Pierres"),
                  mines = new Categorie(pmi, "Mine"),
                  transferts = new Categorie(ppas, "Transfert"),
                  obstacles = new Categorie(pob, "Obstacle");

        // Demande à l'utilisateur d'entrer les dimensions du plateau
        System.out.println("Veuillez entrer les dimensions du plateau ");

        // Boucle qui continue à demander le nombre de lignes jusqu'à ce qu'il soit compris entre 4 et 26 inclusivement
        do {
            nbL = Lire.i("Nombre de lignes (entre 4 et 26) ");
        } while (nbL < 4 || nbL > 26);

        // Boucle qui continue à demander le nombre de colonnes jusqu'à ce qu'il soit compris entre 4 et 26 inclusivement
        do {
            nbCol = Lire.i("Nombre de colonnes (entre 4 et 26 )");
        } while (nbCol < 4 || nbCol > 26);

        // Création d'un objet "Jeu" en utilisant les dimensions du plateau et les objets "Categorie" créés précédemment
        Jeu jeu = new Jeu(nbL + 2, nbCol + 2, 4, pierres, mines, transferts, obstacles);

        // Lancement du jeu
        jeu.joue();

        // Demande à l'utilisateur s'il veut rejouer
        do {
            rej = Lire.c("Voulez vous rejouer ?");
       }while(rej!='N'&&rej!='n'&&rej!='O'&&rej!='o');
        // Tant que la réponse est 'O' ou 'o', continue de lancer des parties
    }while(rej=='O'||rej=='o');
      
    }
}
