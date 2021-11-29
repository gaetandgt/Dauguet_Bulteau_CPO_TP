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
    boolean trouNoir;
    boolean desintegrateur;

public Cellule(){ // on définit la cellule de base, ne contenant pas de jeton, de trou noir ou de desintegrateur
    jetonCourant=null;
    trouNoir=false;
    desintegrateur=false;
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

public Jeton recupererJeton(){ // cette méthode retourne les informations de jetonCourant quand on veut récupérer un jeton
    return jetonCourant;
}

public boolean supprimerJeton(){ // cette méthode supprime le jeton, la présence d'un jeton dans la cellule devient null
    if (jetonCourant!=null){
        jetonCourant=null;
        return true;
    }
    else{
        return false;
    }
}

public boolean placerTrouNoir(){ // cette méthode place un trou noir dans une certaine cellule si elle n'en contenait pas déjà un
    if (trouNoir==false){
        trouNoir=true;
        return true;
    }
    else{
        return false;
    }
    
}

public boolean placerDesintegrateur(){ // cette méthode place un désintegrateur dans une certaine cellule si elle n'en contenait pas déjà un
    if(desintegrateur==false){
        desintegrateur=true;
        return true;
    }
    else{
        return false;
    }
}

public boolean presenceTrouNoir(){ // cette méthode fait un test pour savoir si il y a un trou noir présent sur cette cellule, le booléen est vrai ou faux selon la réponse
    if (trouNoir==true){
        return true;
    }
    return false;
}

public boolean presenceDesintegrateur(){ // cette méthode fait un test pour savoir si il y a un désintegrateur présent sur cette cellule, le booléen est vrai ou faux selon la réponse
    if (desintegrateur==true){
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

public boolean recupererDesintegrateur(){ // cette méthode permet passer le booléen désintegrateur de vrai à faux si la cellule contenait un désintegrateur dans le cas ou on souhaite le recupere, elle renvoie faux sinon
    if(desintegrateur==true){
        desintegrateur=false;
        return true;
    }
    else{
        return false;
    }

    }

public boolean activerTrouNoir(){ // cette méthode permet d'activer le trou noir c'est à a dire d'absorber le jeton (jetonCourant devient null) et de faire dispraraitre le trou noir en même temps si l'action a bien eu lieu
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


