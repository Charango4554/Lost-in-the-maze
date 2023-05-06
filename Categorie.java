/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploration;

/**
 *
 * @author jo
 */
public class Categorie
{
    /*
    La classe a une méthode pour récupérer le pourcentage de cases de cette catégorie dans le plateau, 
    ainsi qu'une méthode pour récupérer le nom de la catégorie. La classe a également une méthode pour 
    créer une nouvelle case du type de la catégorie actuelle à une position donnée dans le plateau. 
    La méthode utilise un switch statement pour déterminer le type de case à créer en fonction du nom de la catégorie.
    */
    private int pourcentage;

    /**
     * Restitue le pourcentage de cases de cette catégorie dans le plateau
     * @return
     */
    public int getPourcentage()
    {
        return this.pourcentage;
    }

    private void setPourcentage(int pourcentage)
    {
        this.pourcentage = pourcentage;
    }

    private String nom;

    /**
     * Restitue le nom de la catégorie qui renvoie au nom de la classe
     * @return Une chaîne de caractères
     */
    public String getNom()
    {
        return this.nom;
    }
    private void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     *
     * @param pourcentage
     * @param categorie
     */
    public Categorie(int pourcentage, String categorie)
    {
        this.setPourcentage(pourcentage);
        this.setNom(categorie);
    }

    /**
     * Restitue une case correspondant à la catégorie courante
     * @param p Le plateau auquel appartiendra la case créée
     * @param lig La ligne de la case créée
     * @param col La colonne de la case créée
     * @return Une nouvelle case du type de la catégorie
     */
    public Case getCase(Plateau p,int lig,int col)
    {
        switch(this.getNom())
        {
            case "Obstacle":return new Obstacle(p,lig,col);
            case "Mine":return new Mine(p,lig,col);
            case "Transfert":return new Passage(p,lig,col);
            case "Simple":return new Vide(p,lig,col);
            case "Pierres":return new Pierres(p,lig,col);
        }
        System.out.println("Échec pour la catégorie "+this);
        return null;
    }
}
