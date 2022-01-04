/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console;

/**
 *
 * @author gaeta
 */
public class Master_Couleurs{ //on définit la classe couleurs
    
    String[] TabCouleurs; //le tableau des couleurs disponibles dans le jeu
    String Couleur; //l'attribut couleur qui va définir chaque cellule
    
   
    public Master_Couleurs(int var){ //prend un entier en entrée
        
        this.TabCouleurs = new String[]{"noir", "rouge", "vert", "jaune", "bleu", "violet", "cyan", "blanc"}; //on entre dans le tableau les 8 couleurs qui seront disponibles dans le jeu
        Couleur=TabCouleurs[var] ; //le string couleur va être défini en fonction de l'entier var, qui correspond à la couleur à cette place dans le tableau
    }
    public int CouleurVersChiffre(String entrée){//on prend le nom de la couleur en entrée
        
        int val=0;
        
        for (int i=0; i<8; i++){ //on fait une boucle allant de 0 à 7 pour parcourir notre tableau de couleurs
            if (TabCouleurs[i].equals(entrée)){ //on teste pour chaque case pour trouver à laquelle la couleur en entrée correspond
                val=i;             // on attribue la position de cette couleur à val
            } 
        }
        
        return val; // on retourne la variable val
    }
}
