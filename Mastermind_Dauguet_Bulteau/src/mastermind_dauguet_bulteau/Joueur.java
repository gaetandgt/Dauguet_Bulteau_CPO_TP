/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
public class Joueur {
    String Nom;
    int nbCoupsRestants; 


public Joueur(String unNom){
    unNom=Nom;
}

public boolean JoueUnCoup(){
    //le joueur peu proposer 12 codes et joue donc 48 fois
    if(nbCoupsRestants==0){
        return false;
    }
    else{
        nbCoupsRestants--;
        return true;
    }
}
}