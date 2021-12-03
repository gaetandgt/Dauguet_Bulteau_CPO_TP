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
    Jeton [][] CellulesJeu= new Jeton[4][12];
    
    
public Grille (){ 
    for (int i=0;i<3;i++){
        for (int j=0;j<11;j++){
            CellulesJeu[i][j]=new Jeton();
        }
    }
}
}

