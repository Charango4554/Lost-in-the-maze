/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploration;

/**
 *
 * @author jo
 */
public class Vide extends Case
{
    private  Joueur j; 
    private boolean devoiler;
    /**
     *
     * @param plateau
     * @param lig
     * @param col
     */
    public Vide(Plateau plateau, int lig, int col)
    {
        super(plateau, lig, col);// Appelle le constructeur de la classe parente pour initialiser la case avec les coordonnées spécifiées
        /* ajout de code éventuel */
        devoiler=false;// Initialise la variable devoiler à false pour indiquer que la case n'est pas encore dévoilée dans le jeu
    }
    /**
     *
     * @param j
     */
    @Override
    public void arrive(Joueur j)
    {        
        /* À son arrivée, le joueur est positionné dans cette case , rien n'est fais pour une pierre*/
        j.setPosition(this);// on fais de la case vide la nouvelle position du joueur 
        this.devoiler=true;
    }

    /**
     *
     * @param j
     * @param d
     */
    @Override
    public void propageJ(Joueur j, Direction d)
    {
        super.propageJ(j, d);
        /* la pierre  ou le joueur est propagée à la case voisine dans la direction d */
    }
      public void propageP(Joueur j, Direction d)
    {
       
        super.propageP  (j, d);              
        /* la pierre  ou le joueur est propagée à la case voisine dans la direction d */
    }
        public String toString(){
        return "--";
    }
              public String toStr(){
        return "-";
    }
       public boolean isDevoiler() {
        return devoiler;
    }
}