/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
import java.util.Random;
import java.util.Scanner;
public class Partie {
    Joueur [] ListeJoueurs= new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu;
    
public Partie(Joueur a, Joueur b){
    ListeJoueurs[0]=a;
    ListeJoueurs[1]=b;
    
}

public void initialiserPartie(){
    Grille grillejeu[][]= new Grille[6][7];
    for(int i=0; i<21; i++){
        Jeton Jeton1=new Jeton("Rouge");
        Jeton Jeton2=new Jeton("Jaune");
         if (ListeJoueurs[0].Couleur=="Rouge"){
             ListeJoueurs[0].ListeJetons[i]=Jeton1;
             ListeJoueurs[1].ListeJetons[i]=Jeton2;
         }
         else{
             ListeJoueurs[1].ListeJetons[i]=Jeton1;
             ListeJoueurs[0].ListeJetons[i]=Jeton2;
         }
    }
}

Scanner sc = new Scanner(System.in) ;
public void debuterPartie(){
    System.out.println("C'est l'heure du duel");
    while(grillejeu.etreGagnantePourJoueur(joueurCourant)!=true){
        String Colonne;
        System.out.println("Entrez la colonne dans laquelle vous désirez jouer, vous mettrez un chiffre");
        Colonne = sc.next() ;
        while (Colonne!="1" & Colonne!="2" & Colonne!="3" & Colonne!="4" & Colonne!="5" & Colonne!="6" & Colonne!="7"){
            System.out.println("erreur, retapez la colonne");
            Colonne = sc.next() ;
        }
        int Col= Integer.parseInt(Colonne);
        
        
        
        
    }
}

public void attribuerCouleursAuxJoueurs(){
    int var;
    Random Aleat = new Random();
    var = Aleat.nextInt(2);
    
    if (var==1){
        ListeJoueurs[0].Couleur="rouge";
        ListeJoueurs[1].Couleur="jaune";
    }
    else{
        ListeJoueurs[1].Couleur="rouge";
        ListeJoueurs[0].Couleur="jaune";
    }
    
}

}
