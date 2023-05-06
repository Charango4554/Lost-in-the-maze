/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exploration;

/**
 *
 * @author jo
 */
public class Obstacle extends Case
{
     private boolean devoiler;// indique si la case est dévoilée ou pas
     private int resistance ;// représente la résistance de l'obstacle
    public Obstacle(Plateau plateau, int lig, int col)
    {
        super(plateau,lig,col);
        /* ajout de code éventuel */
        devoiler=false;// par défaut la case n'est pas dévoilée
        
    }

    @Override
    public void arrive(Joueur j)
    {        
        /* Le joueur ne peut pas arriver dans cette case */
        if(this.getResistance()>0){
        System.out.println("vous ne pouvez pas arriver dans cette case veillez changé de direction ou la bombarder de pierre; elle a une resitance de"+this.getResistance());
        this.devoiler=true;// la case est dévoilée
        }else{// s'il n'y a pas de résistance, le joueur arrive dans la case
            j.setPosition(this);
        }
            
    }

    @Override
    public void propageP(Joueur j, Direction d)
    {
        if(this.getResistance()>0){// s'il y a de la résistance, la pierre la rencontre
            this.setResistance(this.getResistance()-1);// la résistance diminue
            j.decNbPierres();// le nombre de pierres du joueur diminue
            System.out.println("Pierre arrêté par un obstacle ; Elle est perdue , la resistance de l'obstacle vaut maintenant"+this.getResistance());
          }else{ // s'il n'y a pas de resistance la pierre continue son chemin dans la meme direction 
            super.propageP(j, d); 
        }
        
        /* La pierre lancée est perdue */
    }

        @Override
    public void propageJ(Joueur j, Direction d)
    {
        super.propageJ(j, d);
        /*  le joueur est propagée à la case voisine dans la direction d */
    }
    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
    
      public String toString(){
        return "♣♣";// représentation textuelle de l'obstacle lors de l'affichage
    }
         public String toStr(){
        return "♣";// représentation textuelle de l'obstacle lors de l'affichage simplifié
    }
          public boolean isDevoiler() {
        return devoiler;
    }
    
}

