/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons= new Jeton[21];
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
public Joueur (String unNom){
  Nom=unNom ;
}

public void affecterColeur(String uneCouleur){
    Couleur=uneCouleur;
}
   
public boolean ajouterJeton(Jeton nombre){
    
    
    // Attention a cette histoire de 21 ça devra peut-être être modifier tout- à l'heure
    
    
    if (nombreJetonsRestants!=21){
        ListeJetons[nombreJetonsRestants]=nombre;
        return true;
    }
    else{
        return false;
    }
    
    //voir tp ajouter jeton de la liste
}

public void obtenirDesintegrateur(){
    nombreDesintegrateurs++;
}

public boolean utiliserDesintegrateur(){
    if (nombreDesintegrateurs==0){
        return false;
    }
    else{
        nombreDesintegrateurs--;
        return true;
    }
    
}
}
