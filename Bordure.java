/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package exploration;
/*
Le programme définit une classe appelée "Bordure" qui hérite de la classe "Case". 
Cette classe représente une case de bordure dans un jeu de plateau. 

Le constructeur de la classe prend en entrée un plateau, une ligne et une colonne, et la méthode "toString" 
renvoie une représentation graphique de la case de bordure.

Deux autres méthodes sont définies pour la classe Bordure. 
La méthode "propageP" est appelée lorsqu'une pierre arrive sur la case de bordure et décrémente 
le nombre de pierres du joueur. La méthode "arrive" est appelée lorsqu'un joueur arrive sur 
la case de bordure et affiche un message pour indiquer au joueur de changer de direction.

*/
public class Bordure extends Case{
// Le constructeur de la classe Bordure appelle le constructeur de la classe parent Case.
    public Bordure(Plateau plateau, int lig, int col) {
        super(plateau, lig, col);
    }
    // La méthode toString renvoie la représentation graphique d'une case de bordure.
    public String toString(){
        return "░";
    }
    
    // La méthode propageP est appelée lorsqu'une pierre arrive sur une case de bordure. 
    //Elle décrémente le nombre de pierres du joueur et affiche un message d'erreur.
    @Override
    public void propageP(Joueur j, Direction d) {
        
            j.decNbPierres();
            System.out.println("La pierre a atteint le bord et est donc perdue. ");    }

    // La méthode arrive est appelée lorsqu'un joueur arrive sur une case de bordure. 
    //Elle affiche un message indiquant au joueur de changer de direction.
    @Override
    public void arrive(Joueur j) {
        System.out.println("Il vous faut changer de direction car vous avez atteint la limite.");
    }
    
}
