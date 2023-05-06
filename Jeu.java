/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 Ce code définit une classe "Jeu" qui représente le déroulement d'un jeu.
 * Cette classe contient deux attributs: "joueur" et "grille", qui représentent respectivement le 
 * joueur et le plateau du jeu. 
La classe possède également des méthodes permettant d'accéder et de modifier ces attributs. 
* En outre, elle possède des méthodes qui permettent de jouer au jeu: "joue()" permet de jouer une partie, 
* "isFini()" renvoie vrai si le jeu est terminé, c'est-à-dire si le joueur a gagné ou perdu. 
Enfin, le constructeur de la classe prend en paramètre plusieurs arguments qui définissent les caractéristiques du 
* plateau de jeu, le nombre de pierres du joueur et la liste des catégories de cases sur le plateau avec leur 
* pourcentage respectif.
 */
public class Jeu
{

    private Joueur joueur;
    private Plateau grille;
    /**
     *
     * @return
     */
    public Joueur getJoueur()
    {
        return this.joueur;
    }

    /**
     *
     * @param joueur
     */
    public void setJoueur(Joueur joueur)
    {
        this.joueur = joueur;
    }

    

    /**
     *
     * @return
     */
    public Plateau getGrille()
    {
        return grille;
    }

    /**
     *
     * @param grille
     */
    public void setGrille(Plateau grille)
    {
        this.grille = grille;
    }

    /**
     *
     * @return
     */
    public Plateau getPlateau()
    {
        return grille;
    }

    /**
     *
     * @param plateau
     */
    public void setPlateau(Plateau plateau)
    {
        this.grille = plateau;
    }  
    
    /**
     * Restitue vrai si le jeu est terminé, c'est-à-dire si le joueur a gagné ou perdu
     * @return un booléen
     */
    public boolean isFini(){return this.getJoueur().isGagnant()||this.getJoueur().isPerdant();}

    /**
     * À chaque tour, on demande au joueur s'il veut avancer ou lancer une pierre.
     * Cela se termine quand le joueur gagne ou perd
     */
    public void joue()
    {
        /* ajout de code */

        do{
            // Boucle principale de jeu qui continue tant que le joueur n'a pas gagné ou perdu
            this.grille.dessinePlateau(this.joueur);
            // Afficher le plateau avec la position du joueur et le nombre de pierres qu'il possède
           System.out.println("le joueur "+getJoueur().getNom()+" a "+getJoueur().getNbPierres()+" Pierres\n\n");
               // Demander au joueur s'il veut avancer ou lancer une pierre
            char rep= Lire.c("Avancer ou lancer une pierre(A/P) ");
            if(rep=='A'){   
                // Si le joueur veut avancer, le faire avancer dans la direction choisie par le joueur
                getJoueur().avance( Direction.getDirectionJoueur("Choisis une direction"));
            }else if(rep=='P'){
                // Si le joueur veut lancer une pierre, lui demander la direction dans laquelle il veut la lancer, puis la lancer
                getJoueur().lancePierre(Direction.getDirectionJoueur("Choisis une direction"));
            }else 
                System.out.println("veillez saisir  A ou P ");

        }while(!(getJoueur().isGagnant()||getJoueur().isPerdant()));

        // Afficher toutes les cases du plateau
        System.out.println("\nvoici les cases du plateaux\n");
        this.grille.toString(this.joueur);
        System.out.println("\n");

   
    }
    

    
            
    /**
     *
     * @param nbLig
     * @param nbCol
     * @param nbPierres nombre de pierres du joueur en pourcentage du nombre de cases du plateau
     * @param liste liste des catégories de cases - qui inclut le pourcentage voulu de cette catégorie
     */
    public Jeu(int nbLig, int nbCol, int nbPierres,Categorie... liste)
    {
        this.setPlateau(new Plateau(nbCol,nbLig,this,liste));
        Case c=new Depart(this.getPlateau(),1,0);
        this.getPlateau().setCaseDeGrille(1, 0, c);
        this.setJoueur(new Joueur(Lire.S("Nom du joueur? "),this.getPlateau().get(1, 0),nbPierres*nbCol*nbLig/100));
    
    }

}
