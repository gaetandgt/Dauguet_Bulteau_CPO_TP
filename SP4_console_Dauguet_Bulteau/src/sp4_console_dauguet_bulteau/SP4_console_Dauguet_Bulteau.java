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
       String joueur2 ;

       System.out.println("Veuillez entrer le nom du premier joueur:") ;
       joueur1 = sc.next() ;
       Joueur J1 = new Joueur(joueur1)  ;

       System.out.println("Veuillez entrer le nom du deuxième joueur:") ;
       joueur2 = sc.next() ;
       Joueur J2 = new Joueur(joueur2)  ;
        
    
        Partie unePartie= new Partie(J1,J2);
        unePartie.attribuerCouleursAuxJoueurs();
        unePartie.initialiserPartie();
        unePartie.debuterPartie();
    }
    
}
