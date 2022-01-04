/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;
public class Partie { // on définit la classe partie et ses différents attributs
    
    int [] tabEntiers = new int[100];
    Joueur joueurCourant;
    Grille grillejeu;
    Joueur [] ListeJoueurs = new Joueur[1];
    
public Partie(Joueur a){ // on crée une nouvelle partie avec un joueur a et un joueur b, on attribue un ordre de jeu
    
    joueurCourant=a;
    
}

public String[] initialiserPartie(){
    grillejeu= new Grille();
    int var;
    String code[]= new String [4] ;
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
    
    System.out.println(code);
    return (code);
    
}

Scanner sc = new Scanner(System.in) ;

public void debuterPartie(String code[]){ // c'est la plus grande partie de notre code, celle qui nous permet de jouer la partie
    System.out.println("C'est l'heure du duel"); // petit message pour commencer la partie
    int K=1;
    String Texte="";
    int i=0;
    int j=0;
    grillejeu.afficherGrilleSurConsole();
    String[] Code=new String [4];
    Code[0]="rien";
    Code[1]="rien";
    Code[2]="rien";
    Code[3]="rien";
    int [] Commun=new int [2];
    
    Commun=grillejeu.etreGagnantePourJoueur(code, Code);
    while(Commun[1]!=4) {
        
        
        
        System.out.println("Tapez Bleu, Vert, Jaune, Rouge, Dore, Blanc, Argent ou Violet"); // on affiche les différentes possibilités que peut choisir le joueur pour son tour de jeu 
        String Jeu;
        int a=0;
         System.out.println(code);
        while ( a<4){
            Jeu=sc.next();
            Code[a]=Jeu;
            
            grillejeu.afficherGrilleSurConsole(); 
            a++;
        }
        int [] Pareil=new int [2];
        Pareil=grillejeu.etreGagnantePourJoueur(code, Code);
        if (Pareil[1]==4){
            System.out.println("Vous avez gagné");
        }
        else{
            
            Texte=(Texte  +  "Test N " +K+  ";"+ Commun[0]+" en commun"+ ";"+ Commun[1]+" bien placé\n");
            System.out.println(Texte);
            K++;
        }
    }
}
}

    
        
        /*
        int Col=0; // on pose le choix du joueur à 0 avant qu'il n'ait choisi
        int test=1;
        while (test!=0){ // tant que le joueur n'a pas rentré une donnée compatible on indique une erreur
            test=0;
            try{
                Col=sc.nextInt();
            }
            catch(Exception e){ // on vérifie que le joueur entre bien une donnée compatible avec ce qu'il doit rentrer pour pouvoir jouer
                test=1;
                System.out.println("erreur");
                sc.reset();
                sc.next();
            }
        }
        */
       


