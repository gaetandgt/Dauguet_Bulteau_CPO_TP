/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
//Code identique à la partie console, les informations sont dans l'autre compte rendu
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
    return jetonCourant;
}

public boolean supprimerJeton(){
    if (jetonCourant!=null){
        jetonCourant=null;
        return true;
    }
    else{
        return false;
    }
}

public boolean placerTrouNoir(){
    if (trouNoir==false){
        trouNoir=true;
        return true;
    }
    else{
        return false;
    }
    
}

public boolean placerDesintegrateur(){
    if(desintegrateur==false){
        desintegrateur=true;
        return true;
    }
    else{
        return false;
    }
}

public boolean presenceTrouNoir(){
    if (trouNoir==true){
        return true;
    }
    return false;
}

public boolean presenceDesintegrateurs(){
    if (desintegrateur==true){
        return true;
    }
    else{
        return false;
    }
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
    if(desintegrateur==true){
        desintegrateur=false;
        return true;
    }
    else{
        return false;
    }

    }

public boolean activerTrouNoir(){
    if(trouNoir==true & jetonCourant!=null){
        jetonCourant=null;
        trouNoir=false;
        return true;
    }

    else{
        return false;
    }
}
}


