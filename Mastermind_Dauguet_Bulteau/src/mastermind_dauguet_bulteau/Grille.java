/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
public class Grille {
    Cellule [][] CellulesJeu= new Cellule[4][12];
    
    
public Grille (){ 
    for (int i=0;i<4;i++){
        for (int j=0;j<12;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
}

public String lireCouleurDuJeton(int ligne, int colonne){
    return CellulesJeu[ligne][colonne].lireCouleur();
}

public boolean celluleOccupee(int ligne, int colonne){
    if (CellulesJeu[ligne][colonne].Couleur!=null){
        return true;
    }
    else{
        return false;
    }
}

public boolean supprimerCouleur(int ligne, int colonne){ 
    if(celluleOccupee(ligne,colonne)==true){
        CellulesJeu[ligne][colonne].Couleur=null;
        return true;
    }
    else{
        return false;
    }
}


}