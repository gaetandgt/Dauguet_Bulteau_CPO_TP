/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;

public Cellule(){
    jetonCourant=null;
    trouNoir=false;
    desintegrateur=false;
}

public boolean affecterJeton(Jeton jeton){
    
    if (jetonCourant==null){
        jetonCourant=jeton;
        return true;
    }
    else{
        return false;
    }
}

public Jeton recupererJeton(){
    
}

public boolean supprimerJeton(){
    jetonCourant=null;
}

public boolean placerTrouNoir(){
    
}

public boolean placerDesintegrateur(){
    
}

public boolean presenceTrouNoir(){
    
}

public boolean presenceDesintegrateurs(){
    
}

public String lireCouleurDuJeton(){
    if (jetonCourant==null){
        return "vide";
    }
    else{
        return jetonCourant.Couleur;
    }
}

public boolean recupererDesintegrateur(){
    
}

public boolean activerTrouNoir(){
    
}

}

