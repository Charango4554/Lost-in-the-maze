/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;
/*
Sert de modèle pour représenter les différentes cases d'un plateau de jeu. 
La classe "Case" contient des méthodes pour obtenir et définir la position d'une case sur le plateau,pour obtenir 
le plateau sur lequel se trouve la case, pour déterminer si la case doit être révélée ou non, 
pour obtenir un caractère représentant la ligne et la colonne de la case, pour propager 
la présence d'un joueur ou d'un mur dans une certaine direction
*/
public abstract class Case
{
         
    private static char getNumChar(int num){return (char)('A'+num);}
    
    private Plateau plateau;
    private int lig;
    private int col;
    
    // Constructeur pour créer une nouvelle instance de la case
    public Case(Plateau plateau, int lig, int col)
    {
        this.setPlateau(plateau);
        this.setLig(lig);
        this.setCol(col);
    }
    
    // Méthode pour obtenir le plateau sur lequel se trouve la case
    public Plateau getPlateau()
    {
        return this.plateau;
    }

    // Méthode privée pour définir le plateau sur lequel se trouve la case
    private void setPlateau(Plateau plateau)
    {
        this.plateau = plateau;
    }

    // Méthode pour obtenir la ligne de la case
    public String toStr(){
        return "";
    }

    public void setDestination(Case c){
        
    }
    
    // Méthode pour obtenir la ligne de la case
    public int getLig()
    {
        return this.lig;
    }
    // Méthode privée pour définir la ligne de la case
     private void setLig(int lig)
    {
        this.lig = lig;
    }
     // Méthode pour déterminer si la case doit être révélée ou non
    public boolean isDevoiler(){
        return true;
    }
        
    // Méthode pour obtenir la colonne de la case
    public int getCol()
    {
        return this.col;
    }
    
    // Méthode privée pour définir la colonne de la case
    private void setCol(int col)
    {
        this.col = col;
    }
    
    // Méthode pour obtenir un caractère représentant la ligne de la case
    public char getLigchar(){
        return Case.getNumChar(this.getLig());
    }   
    
    // Méthode pour obtenir un caractère représentant la colonne de la case
    public char getColchar(){
        return Case.getNumChar(this.getCol());
    }



    // Méthode appelée lorsqu'un joueur arrive sur la case
    public void arrive(Joueur j)
    {
        //Ne fait rien
    }

    // Méthode pour propager la présence d'un joueur dans une certaine direction
    public void propageJ(Joueur j,Direction d) 
    {
        // Appelle la méthode "arrive" de la case suivante dans la direction spécifiée
        this.getSuivante(d).arrive(j);

    } 
    
    // Méthode pour propager un mur dans une certaine direction
     public void propageP(Joueur j,Direction d) // pour propager le joueur dans la direction d
    {
         // Appelle la méthode "propageP" de la case suivante dans la direction spécifiée
        this.getSuivante(d).propageP(j,d);
    } 
    

    public String getCoord(){
        //renvoie la coordonnée de la case sous forme de chaîne de caractères
        return "("+this.getLigchar()+","+this.getColchar()+")";
    }
    

    public Case getSuivante(Direction d) 
    { 
        //pour chaque direction donnée par la méthode getSymbole de l'objet Direction,
        //on définit la case suivante correspondante dans le tableau plateau
        Case c=null;
            switch(d.getSymbole()){ 
            
            case '↖': c= plateau.get(lig-1, col-1) ;break;
            case '↑': c= plateau.get(lig-1, col) ;break;
            case '↗': c= plateau.get(lig-1, col+1) ; break;
            case '←': c= plateau.get(lig, col-1) ;break;
            case '→': c= plateau.get(lig, col+1) ;break;
            case '↙': c= plateau.get(lig+1, col-1) ;break;
            case '↓': c= plateau.get(lig+1, col) ;break;
            case '↘': c= plateau.get(lig+1, col+1) ;
        }
     //case suivante
      return c; 
      
    }


    
}
