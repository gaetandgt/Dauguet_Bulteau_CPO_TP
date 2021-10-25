/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    

public Personne(String unNom, String unprenom){
    nom = unNom;
    prenom= unprenom;
    liste_voitures = new Voiture [3] ;
    nbVoitures = 0;
}
public String toString() {
    String chaine1;
    chaine1 = "Son nom est "+ nom + " et son prénom est "+ prenom;
    return chaine1;
}

public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.Proprietaire!=null){
        return false;
    }
    if (nbVoitures==3){
        return false;
    }
    liste_voitures[nbVoitures]= voiture_a_ajouter;
    nbVoitures=nbVoitures+1;
    voiture_a_ajouter.Proprietaire = this ; 
    return true;
}
}
