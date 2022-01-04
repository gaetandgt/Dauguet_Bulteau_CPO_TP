/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console;

/**
 *
 * @author gaeta
 */
public class Master_Cellules{ // on va définir tous les éléments de la classe cellules
    
    String JetonCourant;
    Master_Cellules Couleur; // la cellule est définie par sa couleur
    String[] TabCouleurs={"noir","rouge","vert","jaune","bleu","violet","cyan","blanc"};
   
    public Master_Cellules(){ // chaque cellule est vide tant que le joueur ne lui a pas attribué de couleur
        JetonCourant="null";          
    }
   
    public boolean affecterJeton(int var){
        
        if("null".equals(JetonCourant)){ // on vérifie que la cellule ne possède pas de couleur
            JetonCourant=TabCouleurs[var]; // si la condition est vérifié, la couleur correspondant dans le tableau à l'entier pris en entrée est associé à la cellule
            return true; // on retourne donc true car l'opération s'est déroulée
        }
        
        else{
            return false; // dans l'autre cas on retourne faux car l'opération n'a pas pu avoir lieu
        }
    }
    
    public String lireCouleur(){
        return JetonCourant; // on renvoie la couleur associée à la cellule
    }
}
