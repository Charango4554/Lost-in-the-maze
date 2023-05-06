/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author jo
 */
public class Passage extends Case
{
     public Case destination;// la case de destination du passage
     private boolean devoiler;// indique si la case est dévoilée ou non
     /**
      * Définit la case de destination du passage.
      *
      * @param c la case de destination
      */
     public void setDestination(Case c){
         destination=c;
     }
     /**
      * Retourne la case de destination du passage.
      *
      * @return la case de destination
      */
     public Case getDestination(){
         return this.destination;
     }
    /* Le passage renvoie à une autre case du plateau*/
    public Passage(Plateau plateau, int lig, int col)
    {
        super(plateau, lig, col);
        /* ajout de code éventuel
         * il faut définir une case de destination aléatoire
         */
        this.destination=null;
        devoiler=false;
        
    }

    @Override
    public void arrive(Joueur j)
    {        
         System.out.println(destination);
        /* Réexpédition du joueur à la case de destination quand il arrive */
        this.devoiler=true;
        destination.arrive(j);//le joueur atteri dans destination 
       
    }

    @Override
    public void propageP(Joueur j, Direction d)
    {
        
        this.destination.propageP(j, d);
        /* la pierre continue son chemin à la case de destination */
    }
      public String toString(){
        return "↻↻";
    }
       public boolean isDevoiler() {
        return devoiler;
    }
}
