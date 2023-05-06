/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;
/*
Ce code définit une classe Java nommée "Depart" qui hérite de la classe "Case". 
Le constructeur de cette classe prend en paramètres un objet "Plateau" et deux entiers représentant la ligne et la 
colonne de la case dans le plateau. La méthode "propageJ" est redéfinie pour spécifier le comportement de cette case 
lorsque le joueur se déplace dessus
*/

public class Depart extends Case{
    // Constructeur de la classe "Depart" qui prend en paramètres un objet "Plateau", 
    // ainsi que deux entiers représentant la ligne et la colonne de la case dans le plateau.
    public Depart(Plateau plateau, int lig, int col) {
        // Appelle le constructeur de la classe parent "Case" avec les mêmes paramètres
            super(plateau, lig, col);

    }

    // Redéfinition de la méthode "propageJ" de la classe parent "Case"
    // Elle prend en paramètres un objet "Joueur" et une "Direction"
    @Override
    public void propageJ(Joueur j, Direction d)
    {
        // Appelle la méthode "propageJ" de la classe parent "Case" avec les mêmes paramètres
        super.propageJ(j, d);
       
    }
    // Redéfinition de la méthode "toString" de la classe parent "Case"
    public String toString(){
        // Retourne une chaîne de caractères représentant le symbole du départ
        return "▶▶";
    }
   
}
