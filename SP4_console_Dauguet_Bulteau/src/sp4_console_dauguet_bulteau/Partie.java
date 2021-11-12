/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Partie {
    Joueur [] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu;
    
public Partie(Joueur a, Joueur b){
    if (joueurCourant==a){
        joueurCourant=b;
    }
    else{
        joueurCourant=a;
    }
}

public void initialiserPartie(){
    
}

public void debuterPartie(){
    
}

public void attribuerCouleursAuxJoueurs(){
    
}

}
