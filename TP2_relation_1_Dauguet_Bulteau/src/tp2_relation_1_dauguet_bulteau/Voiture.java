/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
public Voiture(String UnModele, String UneMarque, int LaPuissanceCV){
    Modele = UnModele;
    Marque = UneMarque;
    PuissanceCV= LaPuissanceCV;
    Proprietaire= null;
}
public String toString() {
    String chaine;
    chaine = "La voiture à pour modele "+ Modele+ ", pour marque "+ Marque+ " et pour puissance " + PuissanceCV;
    return chaine;
}

    
}
    

