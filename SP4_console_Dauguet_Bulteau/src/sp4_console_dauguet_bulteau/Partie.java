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
    int [] tabEntiers = new int[100];
    Joueur joueurCourant;
    Grille grillejeu;
    
public Partie(Joueur a, Joueur b){
    Random sort = new Random();
    int Joue;
    Joue = sort.nextInt(2);
    if (Joue==1){
        ListeJoueurs[0]=a;
        ListeJoueurs[1]=b;
    }
    else{
        ListeJoueurs[0]=b;
        ListeJoueurs[1]=a;
    }
    joueurCourant=a;
    
}

public void initialiserPartie(){
    grillejeu= new Grille();
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
    
    
    int i=0;
    int j=0;
    grillejeu.afficherGrilleSurConsole();
    while(grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true && grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true){
        
        String Colonne;
        System.out.println("C'est au tour du joueur "+ joueurCourant.Nom);
        System.out.println("Entrez la colonne dans laquelle vous désirez jouer, vous mettrez un chiffre");
        Colonne = sc.next() ;
        
        
        System.out.println(Colonne);
        //while (Colonne!="1" && Colonne!="2" && Colonne!="3" && Colonne!="4" && Colonne!="5" && Colonne!="6" && Colonne!="7"){
        //    System.out.println("erreur, retapez la colonne");
        //    Colonne = sc.next() ;
        //}
        int Col= Integer.parseInt(Colonne);
        
        System.out.println(Col);
        Jeton Jet;
        if (joueurCourant.Couleur=="Rouge"){
            Jet=joueurCourant.ListeJetons[i];
            i++;
        }
        else{
            Jet=joueurCourant.ListeJetons[j];
            j++;
        }
        System.out.println("test1");
        grillejeu.ajouterJetonDansLaColonne(Jet, Col);
        grillejeu.afficherGrilleSurConsole();
        //if (grillejeu.etreGagnantePourJoueur(joueurCourant)==true){
        //    break;
        //}
        if (ListeJoueurs[0]==joueurCourant){
            joueurCourant=ListeJoueurs[1];
        }
        else{
            joueurCourant=ListeJoueurs[0];
        }
        
        System.out.println("bj");
    }
}

public void attribuerCouleursAuxJoueurs(){
    int var;
    Random Aleat = new Random();
    var = Aleat.nextInt(2);
    
    if (var==1){
        ListeJoueurs[0].Couleur="Rouge";
        ListeJoueurs[1].Couleur="Jaune";
    }
    else{
        ListeJoueurs[1].Couleur="Rouge";
        ListeJoueurs[0].Couleur="Jaune";
    }
    
}

}
