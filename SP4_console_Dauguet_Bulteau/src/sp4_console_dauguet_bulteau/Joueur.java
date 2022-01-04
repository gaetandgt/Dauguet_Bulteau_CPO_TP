/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Joueur { // on définit la classe joueur et ses différents attributs
    String Nom;
    String Couleur;
    Jeton [] ListeJetons= new Jeton[48];
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    
public Joueur (String unNom){ //on définit le nom du joueur
  Nom=unNom ;
}

public void affecterCouleur(String uneCouleur){
    Couleur=uneCouleur;
}
   
public boolean ajouterJeton(Jeton nombre){ // on ajoute un jeton dans la liste de jetons du joueur
    
    
    if (nombreJetonsRestants!=48){
        ListeJetons[nombreJetonsRestants]=nombre;
        return true;
    }
    else{
        return false;
    }
    
}




}
