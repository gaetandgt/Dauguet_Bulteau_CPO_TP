/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_dauguet_bulteau;

import java.util.Scanner;

/**
 *
 * @author bulte
 */
public class SP4_console_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       String joueur1 ; 
       
       

       System.out.println("Veuillez entrer votre nom:") ;
       joueur1 = sc.next() ;
       Joueur J1 = new Joueur(joueur1)  ;

       
       System.out.println(J1);
       
       
       
       Partie unePartie= new Partie(J1);
        
       String code[]= new String [4] ;
       code=unePartie.initialiserPartie();
       unePartie.debuterPartie(code);
    }
    
}
