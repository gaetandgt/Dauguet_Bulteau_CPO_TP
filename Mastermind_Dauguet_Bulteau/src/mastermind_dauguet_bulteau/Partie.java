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
    String [] CodeJoueur = new String [4];
    

    
public void creationCode(){
    int var;
    String boule="rien";
    Random Aleat = new Random();
    //Créer le code aléatoirement
    for (int i=0; i<4; i++){
        var = Aleat.nextInt(8);//tirage aléatoire entre 1 et 8
        if (var==1){
            boule="Argent";
        }
        if (var==2){
            boule="Rouge";
        }
        if (var==3){
            boule="Dore";
        }
        if (var==4){
            boule="Vert";
        }
        if (var==5){
            boule="Blanc";
        }
        if (var==6){
            boule="Bleu";
        }
        if (var==7){
            boule="Jaune";
        }
        if (var==8){
            boule="Violet";
        }
        code[i]= boule;
    }
}
}
