/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Jeton { // on définit la classe jeton et son seul attribut qui est sa couleur 
    String Couleur;
    public Jeton(String unecouleur){
        Couleur=unecouleur;
    }
    public String lireCouleur(){
        return(Couleur);
    }
    
}
