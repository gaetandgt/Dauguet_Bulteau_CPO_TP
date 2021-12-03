/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
import java.util.Random;
public class Partie {
    Grille grillejeu;
    String [] code = new String [4];
    public void initialiserPartie(){
        
    }

    
public void creationCode(){
    int var;
    Random Aleat = new Random();
    for (int i=0; i<4; i++){
        var = Aleat.nextInt(8)-1;
        
        code[i]=
    }
}
}
