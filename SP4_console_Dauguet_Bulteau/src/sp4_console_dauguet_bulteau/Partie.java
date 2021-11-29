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
    Joueur [] ListeJoueurs= new Joueur[2];
    int [] tabEntiers = new int[100];
    Joueur joueurCourant;
    Grille grillejeu;
    
public Partie(Joueur a, Joueur b){ // on crée une nouvelle partie avec un joueur a et un joueur b, on attribue un ordre de jeu
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
    joueurCourant=ListeJoueurs[0];
    
}

public void initialiserPartie(){
    grillejeu= new Grille();
    
    int compteur=0; // on place les 5 trous noirs en vérifiant bien de ne pas en placer 2 sur la même case
    while(compteur<5){ // ce while nous permet d'effectuer la boucle tant qu'il n'y a pas 5 trous noirs sur la grille
        Random Aleat=new Random();
        int lg=Aleat.nextInt(6); // on tire au hasard les coordonnees sur lesquelles on va placer le trou noir
        int cln=Aleat.nextInt(7);
        if(grillejeu.CellulesJeu[lg][cln].presenceTrouNoir()==false){ // on fait appel à presenceTrouNoir() pour vérifier la présence ou non de trou noir dans la cellule à laquelle on souhaite en ajouter un
        grillejeu.placerTrouNoir(lg, cln); 
        compteur=compteur+1; // on incremente le compteur lorsqu'un trou noir a bien été placé
        }
    }
    
    int compteur2=0; // on place 2 désintegrateurs sur des cases ou sont deja placés des trous noirs. Les desintegrateurs sont alors cachés derriere les trous noirs
    while(compteur2<2){ // ce while nous permet d'effectuer la boucle tant qu'il n'y a pas 2 desintegrateurs cachés sur la grille
        Random Aleat=new Random();
        int lg=Aleat.nextInt(6);// on tire au hasard les coordonnes sur lesquelles on va placer le desintegrateur
        int cln=Aleat.nextInt(7);
        if(grillejeu.CellulesJeu[lg][cln].presenceDesintegrateur()==false && grillejeu.CellulesJeu[lg][cln].presenceTrouNoir()==true){ // on verifie qu'il n'y ait pas deja de desintegrateur et qu'il y ait bien un trou noit
        grillejeu.placerDesintegrateur(lg, cln); 
        compteur2=compteur2+1; // on incremente le compteur lorsque le desintegrateur caché a bien été placé
        }
    }
    
    int compteur3=0; // on place désormais 3 desintegrateurs sur des cases sans trous noirs.
    while(compteur3<3){ // ce while nous permet d'effectuer la boucle tant qu'il n'y a pas 3 desintegrateurs placés sur des cases libres 
        Random Aleat=new Random();
        int lg=Aleat.nextInt(6); // on tire au hasard les coordonnees sur lesquelles on va placer le desintegrateur
        int cln=Aleat.nextInt(7);
        if(grillejeu.CellulesJeu[lg][cln].presenceDesintegrateur()==false && grillejeu.CellulesJeu[lg][cln].presenceTrouNoir()==false){ // on verifie que la cellule tirée aléatoirement ne contient aucun trou noir ou desintegrateur
        grillejeu.placerDesintegrateur(lg, cln); 
        compteur3=compteur3+1; // on incrémente le compteur lorsque le desintegrateur visible a bien été placé
        }
    }
    
    for(int i=0; i<21; i++){ // on crée les listes de jetons avec les 21 jetons de chaque couleur pour chaque joueur
        Jeton Jeton1=new Jeton("Rouge"); // on définit les nouveaux jetons et leur couleur
        Jeton Jeton2=new Jeton("Jaune");
        
         if (ListeJoueurs[0].Couleur=="Rouge"){ // on teste si le jeton est rouge pour savoir dans quel ordre on les répartit
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

public void debuterPartie(){ // c'est la plus grande partie de notre code, celle qui nous permet de jouer la partie
    System.out.println("C'est l'heure du duel"); // petit message pour commencer la partie
    int Colo=12; // on déclare les variables Colo et Ligne
    int Ligne;
    
    int i=0;
    int j=0;
    grillejeu.afficherGrilleSurConsole();
    while(grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true && grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true){
        
        
        System.out.println("C'est au tour du joueur "+ joueurCourant.Nom); // on affiche une phrase pour indiquer le nom du joueur qui doit jouer
        System.out.println("Tapez 1 pour placer un pion, 2 pour placer un Desintegrateurs, 3 pour recuperer un jeton"); // on affiche les différentes possibilités que peut choisir le joueur pour son tour de jeu 
        
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
        if (Col==2){
            if(joueurCourant.nombreDesintegrateurs>0){
                int verif=0;
                while(verif==0){
                    System.out.println("Entrez la colonne");
                    Colo=sc.nextInt();
                    System.out.println("Entrez la ligne");
                    Ligne=sc.nextInt();
                
                    if(joueurCourant.Couleur!=grillejeu.lireCouleurDuJeton(Ligne-1,Colo-1)){
                        grillejeu.supprimerJeton(Ligne-1, Colo-1);
                        joueurCourant.nombreDesintegrateurs--;
                        grillejeu.tasserGrille(Colo-1);
                        verif=1;
                }
                
            
                    else{
                        System.out.println("Vous ne pouvez pas désintégrer un de vos jetons, veuillez rentrer les coordonnées d'un jeton adverse");
                    }
                }
            }
            else{
                Col=1;
                System.out.println("Vous n'avez pas de désintegrateurs, veuillez placer un jeton");
            }
            
        }
        int verif3=0;
        if (Col==3){
            int verif2=0;
                for (int k=0;k<6;k++){
                    for (int g=0;g<7;g++){
                        if (grillejeu.celluleOccupee(k, g)){
                            if (grillejeu.lireCouleurDuJeton(k, g)==joueurCourant.Couleur){
                                verif3=1;
                            }
                        }
                    }
                }
                if(verif3==1){
                    while(verif2==0){
                        System.out.println("Entrez la colonne");
                        Colo=sc.nextInt();
                        System.out.println("Entrez la ligne");
                        Ligne=sc.nextInt();
                
                    if(joueurCourant.Couleur==grillejeu.lireCouleurDuJeton(Ligne-1,Colo-1)){
                        grillejeu.recupererJeton(Ligne-1, Colo-1);
                        grillejeu.tasserGrille(Colo-1);
                        verif2=1;
                    }
                    else{
                        System.out.println("Veuillez sélectionner un de vos jetons");
                    }
                    }
                }
                else{
                    System.out.println("Vous n'avez pas de jeton positionné sur la grille, veuillez jouer un jeton");
                    Col=1;
                }
            }
        
        
        if (Col==1){
            System.out.println("Entrez la colonne dans laquelle vous allez jouer");
            
            test=1;
            while (test!=0){
                test=0;
                try{
                    Colo=sc.nextInt();
                }
                catch(Exception e){
                    test=1;
                    System.out.println("erreur");
                    sc.reset();
                    sc.next();
                }
            }
            
            while (grillejeu.colonneRemplie(Colo-1)!=false){
            
                test=1;
                System.out.println("la colonne est pleine, choisissez de nouveau");
                while (test!=0){
                    test=0;
                    try{
                        Colo=sc.nextInt();
                    }
                    catch(Exception e){
                        test=1;
                        System.out.println("erreur");
                        sc.reset();
                        sc.next();
                    }
                }

            }
            System.out.println(Colo);

            //if celluleOccupee()

            Jeton Jet;
            if (joueurCourant.Couleur=="Rouge"){
                Jet=joueurCourant.ListeJetons[i];
                i++;
            }
            else{
                Jet=joueurCourant.ListeJetons[j];
                j++;
            }
        
            grillejeu.ajouterJetonDansLaColonne(Jet, Colo);     
        }
        for(int y=0; y<6; y++){
            if (grillejeu.CellulesJeu[y][Colo-1].presenceDesintegrateur() && grillejeu.celluleOccupee(y,Colo-1)){
                grillejeu.CellulesJeu[y][Colo-1].recupererDesintegrateur();
                joueurCourant.nombreDesintegrateurs++;
                System.out.println(ListeJoueurs[0].Nom);
                System.out.println(ListeJoueurs[1].Nom);
                System.out.println(ListeJoueurs[0].nombreDesintegrateurs);
                System.out.println(ListeJoueurs[1].nombreDesintegrateurs);
            }
        }
        for(int x=0; x<6; x++){
            if (grillejeu.CellulesJeu[x][Colo-1].presenceTrouNoir() && grillejeu.celluleOccupee(x,Colo-1)){
                            grillejeu.CellulesJeu[x][Colo-1].activerTrouNoir();
            }
        }
        
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
        
        if (grillejeu.etreRemplie()==true){
            grillejeu.viderGrille();
            grillejeu.afficherGrilleSurConsole();
        }
        
    }
    System.out.println(joueurCourant);
    System.out.println(ListeJoueurs[0]);
    if (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])==true ){
        
        if (joueurCourant!=ListeJoueurs[0]){
            if (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])==true){
                System.out.println("le gagnant est " + ListeJoueurs[1].Nom);
            }
            else{
                System.out.println("le gagnant est " + ListeJoueurs[0].Nom);
            }
        }
        else{
            System.out.println("le gagnant est " + ListeJoueurs[0].Nom);
        }
    }
    else{
        
        if (joueurCourant!=ListeJoueurs[1]){
            if (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])==true){
                System.out.println("le gagnant est " + ListeJoueurs[0].Nom);
            }
            else{
                System.out.println("le gagnant est " + ListeJoueurs[1].Nom);
            }
        }
        else{
            System.out.println("le gagnant est " + ListeJoueurs[1].Nom);
        }
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