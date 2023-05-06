/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author jo
 */
public class Mine extends Case
{
    private  boolean mineActive; // état de la mine (active ou non)
     private boolean devoiler;// état de la case (dévoilée ou non)

    public Mine(Plateau plateau, int lig, int col)
    {
        super(plateau, lig, col);
        this.mineActive=true;// une mine est active à sa création
        /* ajout de code éventuel */
        devoiler=false; // la case est initialement cachée
    }

    public boolean isMineActive() {
        return mineActive;
    }

    public boolean isDevoiler() {
        return devoiler;
    }

    @Override
    public void arrive(Joueur j)
    {        
       
        /* La mine explose et le joueur perd */
         if(this.mineActive){
             this.mineActive=false; //la mine à explosé
             j.setPerdant(true);// le joueur est perdant
             System.out.println("\nvous avez perdu , une mine a explosé \n");
         }else j.setPosition(this);// si la mine est désactivée, le joueur peut arriver sur la case
         

    }

    @Override
    public void propageP(Joueur j, Direction d)
    {
        if(this.mineActive){ // si mine active 
        this.mineActive=false; // la mine à explosé donc désactivée
            this.devoiler=true;
            System.out.println("une mine à explosé à "+this.getCoord()+" la pierre est perdu");
            j.decNbPierres();// le joueur perd la pierre
        }else 
        { // la mine etait désactivée donc on propage comme une case vide 
             try{super.propageP  (j, d);}catch(Exception e){
            System.out.println("la pierre a  ateint la bordure "+this.getCoord());
        }
        }
      
        /* La mine explose, la case devient visible, et le joueur perd la pierre */
    }
    public void propageJ(Joueur j, Direction d){
        super.propageJ(j, d);// le joueur est propagé sur la case voisine dans la direction d
    }
      public String toString(){
        return "☀☀";// représentation graphique de la case
    }
          public String toStr(){
        return "☀";// représentation graphique de la case cachée
    }
  
}

