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
        if (Col==2){ // Le joueur a rentré 2, il souhaite jouer un désintegrateur
            if(joueurCourant.nombreDesintegrateurs>0){ // on vérifie qu'il possède bien un désintegrateur
                int verif=0;
                while(verif==0){ // on effectue cette boucle tant que l'utilisateur n'a pas désigné les coordonnées d'un jeton adverse
                    System.out.println("Entrez la colonne");
                    Colo=sc.nextInt();// on récupère le numéro de la colonne que le joueur a donné
                    System.out.println("Entrez la ligne");
                    Ligne=sc.nextInt(); // on récupère le numéro de la ligne que le joueur a donné
                
                    if(joueurCourant.Couleur!=grillejeu.lireCouleurDuJeton(Ligne-1,Colo-1)){ // on vérifie que les coordonnées correspondent bien à un jeton adverse
                        grillejeu.supprimerJeton(Ligne-1, Colo-1); // si la condition est vérifiée, on supprime le jeton adverse
                        joueurCourant.nombreDesintegrateurs--; // on décrémente donc le nombre de désintegrateurs du joueur
                        grillejeu.tasserGrille(Colo-1); // On tasse ensuite la grille de la colone ou le desintegrateur a été joué
                        verif=1;// on modifie notre variable de vérification pour sortir du tant que
                }
                
            
                    else{ // si le joueur a sélectionné un de ses jetons, on lui demande à nouveau de rentrer les coordonnées d'un jeton à désintegrer
                        System.out.println("Vous ne pouvez pas désintégrer un de vos jetons, veuillez rentrer les coordonnées d'un jeton adverse");
                    }
                }
            }
            else{
                Col=1; // si le joueur ne possède pas de désintegrateur, on lui demande de jouer un jeton à la place
                System.out.println("Vous n'avez pas de désintegrateurs, veuillez placer un jeton");
            }
            
        }
        int verif3=0;
        if (Col==3){ // le joueur a choisi de récupérer un jeton
            int verif2=0;
                for (int k=0;k<6;k++){ // on parcourt toute la grille pour vérifier que le joueur possède bien au moins un jeton sur la grille
                    for (int g=0;g<7;g++){
                        if (grillejeu.celluleOccupee(k, g)){ // si on tomber sur une cellule occupée, on vérifie la couleur du jeton à l'intérieur
                            if (grillejeu.lireCouleurDuJeton(k, g)==joueurCourant.Couleur){
                                verif3=1; 
                            }
                        }
                    }
                }
                if(verif3==1){ // si un jeton est bien présent on valide le test et on demande au joueur de donner les coordonnées du jeton qu'il souhaite récupérer
                    while(verif2==0){ // tant que le joueur ne rentre pas les coordonnées d'un de ses jetons on effectue la boucle
                        System.out.println("Entrez la colonne");
                        Colo=sc.nextInt();
                        System.out.println("Entrez la ligne");
                        Ligne=sc.nextInt();
                
                    if(joueurCourant.Couleur==grillejeu.lireCouleurDuJeton(Ligne-1,Colo-1)){ // on vérifie que les coordonnées entrées correspondent à un jeton de la bonne couleur
                        grillejeu.recupererJeton(Ligne-1, Colo-1); // on récupère le jeton
                        grillejeu.tasserGrille(Colo-1); // on tasse la colonne où le jeton a été récupéré
                        verif2=1; // on valide la vérification pour sortir de la boucle tant que
                    }
                    else{
                        System.out.println("Veuillez sélectionner un de vos jetons"); // si les coordonnées ne sont pas valides on demande au joueur de recommencer
                    }
                    }
                }
                else{
                    System.out.println("Vous n'avez pas de jeton positionné sur la grille, veuillez jouer un jeton"); // si le test concernant la possession d'au moins 1 jeton sur la grille est négatif, on demande au joueur de jouer un jeton
                    Col=1; // on passe donc sur Col=1 soit la boucle pour jouer un jeton
                }
            }
        
        
        if (Col==1){ // le joueur a choisi de jouer un jeton
            System.out.println("Entrez la colonne dans laquelle vous allez jouer"); // on demande la colonne dans laquelle le joueur souhaite jouer son jeton
            
            test=1;
            while (test!=0){ // cette boucle vérifie que le joueur rentre bien une donnée valable pour le numéro de colonne qu'il doit choisir
                test=0;
                try{
                    Colo=sc.nextInt();
                }
                catch(Exception e){
                    test=1; // tant qu'il y a une erreur, test=1 et la boucle se répète
                    System.out.println("erreur");
                    sc.reset();
                    sc.next();
                }
            }
            
            while (grillejeu.colonneRemplie(Colo-1)!=false){ // on vérifie que la colonne oul le joueur a choisi de jouer n'est pas pleine
            
                test=1;
                System.out.println("la colonne est pleine, choisissez de nouveau"); // à chaque fois que le joueur choisit une colonne pleine, on lui demande de jouer autre part
                while (test!=0){ // on vérifie à nouveau, à chaque fois que le joueur entre une nouvelle donnée, qu'elle concorde avec le type de données qu'il doit rentrer
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
                i++; // on incrémente le nombre de jetons rouges qui ont été utilisés
            }
            else{
                Jet=joueurCourant.ListeJetons[j];
                j++; // on incrémente le nombre de jetons jaunes qui ont été utilisés
            }
        
            grillejeu.ajouterJetonDansLaColonne(Jet, Colo);     
        }
        for(int y=0; y<6; y++){ // on va parcourir toute la grille pour savoir si un jeton n'est pas positionné sur un désintégrateut et que, par conséquent, il le récupère
            if (grillejeu.CellulesJeu[y][Colo-1].presenceDesintegrateur() && grillejeu.celluleOccupee(y,Colo-1)){ // on teste sur chaque cellule si il y a un jeton ET un désintegrateur présents
                grillejeu.CellulesJeu[y][Colo-1].recupererDesintegrateur(); // si c'est le cas, le joueur récupère le désintégrateur (celui-ci disparaît donc de la grille)
                joueurCourant.nombreDesintegrateurs++; // on incrémente le nombre de désintégrateurs du joueur qui l'a récupéré
                System.out.println(ListeJoueurs[0].Nom+ListeJoueurs[0].nombreDesintegrateurs); //on affiche le nombre de désintégrateurs de chaque joueur pour qu'ils sachent toujours combien ils en ont
                System.out.println(ListeJoueurs[1].Nom+ListeJoueurs[1].nombreDesintegrateurs); //c'est utile par exemple dans le cas où le joueur a joué sur un trou noir et ne sait donc pas qu'il a récupéré un désintégrateur
            }
        }
        for(int x=0; x<6; x++){ // on va parcourir toute la grille pour savoir si un jeton n'a pas été placé sur un trou noir
            if (grillejeu.CellulesJeu[x][Colo-1].presenceTrouNoir() && grillejeu.celluleOccupee(x,Colo-1)){ // on teste chaque cellule pour savoir si il y a un trou noir ET un jeton présent
                            grillejeu.CellulesJeu[x][Colo-1].activerTrouNoir(); // si c'est le cas on active le trou noir, qui disparaît et emmène le jeton avec lui
            }
        }
        
        grillejeu.afficherGrilleSurConsole(); // on affiche finalement la nouvelle grille telle qu'elle est après le tour de jeu et tous les changements
        
        if (ListeJoueurs[0]==joueurCourant){ // on switch du joueur 0 au joueur 1 si le joueur 0 jouait
            joueurCourant=ListeJoueurs[1];
        }
        else{ // on switch du joueur 1 au joueur 0 si le joueur 1 jouait
            joueurCourant=ListeJoueurs[0];
        }
        
        if (grillejeu.etreRemplie()==true){
            grillejeu.viderGrille();
            grillejeu.afficherGrilleSurConsole();
        }
        
    }
    System.out.println(joueurCourant); 
    System.out.println(ListeJoueurs[0]);
    if (grillejeu.etreGagnantePourJoueur(ListeJoueurs[0])==true ){ // on teste la grille pour savoir si elle est gagnante pour le joueur 0
        
        if (joueurCourant!=ListeJoueurs[0]){ // on teste le joueur courant pour déterminer si le joueur courant est le joueur 0 ou 1
            if (grillejeu.etreGagnantePourJoueur(ListeJoueurs[1])==true){ // on explore les différentes combinaisons de grilles gagnantes et de joueurs courant pour déterminer le vainqueur, par exemple en cas d égalité
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
        
        if (joueurCourant!=ListeJoueurs[1]){ // on explore les autres combinaisons de vainqueur quand le joueur courant est le joueur 0
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
// au final, si l'on a une égalité, c'est à dire que la grille soit gagnante pour les 2 joueurs à la fois, c'est le joueur dont ce nétait pas le tour de jouer qui est gagnant.
// si un seul joueur a une grille gagnante, alors il est déclaré vainqueur
public void attribuerCouleursAuxJoueurs(){ // cette méthode permet d'attribuer les couleurs aux joueurs de façon aléatoire
    int var;
    Random Aleat = new Random();
    var = Aleat.nextInt(2); // on définit var égal à 1 ou 2 aléatoirement
    
    if (var==1){
        ListeJoueurs[0].Couleur="Rouge"; // dans le premier cas, le joueur 0 est rouge et le joueur 1 est jaune
        ListeJoueurs[1].Couleur="Jaune";
    }
    else{
        ListeJoueurs[1].Couleur="Rouge"; // dans le deuxième cas, le joueur 1 est rouge et le joueur 0 est jaune
        ListeJoueurs[0].Couleur="Jaune";
    }
    }
}