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
    int Colo=12;
    int Ligne;
    
    int i=0;
    int j=0;
    grillejeu.afficherGrilleSurConsole();
    while(grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true && grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true){
        
        
        System.out.println("C'est au tour du joueur "+ joueurCourant.Nom);
        System.out.println("Tapez 1 pour placer un pion, 2 pour placer un Desintegrateurs, 3 pour recuperer un jeton");
        
        int Col=0;
        int test=1;
        while (test!=0){
            test=0;
            try{
                Col=sc.nextInt();
            }
            catch(Exception e){
                test=1;
                System.out.println("erreur");
                sc.reset();
                sc.next();
            }
        }
        if (Col==1){
            System.out.println("Entrez la colone dans laquelle vous allez jouer");
            
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

        if (Col==2){
            System.out.println("Entrez la colonne");
            Colo=sc.nextInt();
            System.out.println("Entrez la ligne");
            Ligne=sc.nextInt();
            
            grillejeu.placerDesintegrateur(Colo, Ligne);
        }
        if (Col==3){
            System.out.println("Entrez la colonne");
            Colo=sc.nextInt();
            System.out.println("Entrez la ligne");
            Ligne=sc.nextInt();
            
            grillejeu.recupererJeton(Colo, Ligne);
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
