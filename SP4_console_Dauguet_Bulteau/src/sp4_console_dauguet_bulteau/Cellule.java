/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Cellule { // on crée la classe Cellule avec les 3 différents attributs, chaque cellule est définie par la présence ou non d'éléments selon ces attributes
    Jeton jetonCourant;
    

public Cellule(){ // on définit la cellule de base, ne contenant pas de jeton, de trou noir ou de desintegrateur
    jetonCourant=null;
    
}

public boolean affecterJeton(Jeton jeton){ // cette méthode affecte un jeton à une cellule si il n'y a pas déjà un jeton dans celle-ci
    
    if (jetonCourant==null){
        jetonCourant=jeton;
        return true;
    }
    else{
        return false;
    }
}













public String lireCouleurDuJeton(){ // cette méhode retourne null si il n'y a pas de jeton dans la cellule, elle retourne sa couleur sinon
    if (jetonCourant==null){
        return "vide";
    }
    else{
        return jetonCourant.Couleur;
    }
}




}


