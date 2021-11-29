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
public class Grille { // on crée la classe grille, qui est de la forme de notre grille de puissance 4
    Cellule [][] CellulesJeu= new Cellule[6][7];
    
public Grille (){ // On définit notre grille de puissance 4 d'une taille de 6 lignes et 7 colonnes grâce aux deux boucles for
    for (int i=0;i<6;i++){
        for (int j=0;j<7;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
}

public boolean ajouterJetonDansLaColonne(Jeton unJeton, int Colonne){ // cette méthode place un jeton dans la colonne indiquée, renvoie vrai si l'action s'est bien déroulée ou faux si il y avait déjà un jeton dans cette case
    
    int a=0;
    
    if (CellulesJeu[5][Colonne-1].jetonCourant!=null){
        return false;
    }
    else{
        while (CellulesJeu[a][Colonne-1].jetonCourant!=null){ // si la colonne n'est pas pleine, on teste ligne par ligne en partant du bas pour positionner correctement le jeton dans la colonne
            a++;
        }
        CellulesJeu[a][Colonne-1].jetonCourant=unJeton;
        return true;
    }
    
}
    
public boolean etreRemplie(){ // on teste si la grille est pleine en testant la dernière ligne de jetons
    if (CellulesJeu[5][0].jetonCourant==null && CellulesJeu[5][1].jetonCourant!=null && CellulesJeu[5][2].jetonCourant!=null && CellulesJeu[5][3].jetonCourant!=null && CellulesJeu[5][4].jetonCourant!=null && CellulesJeu[5][5].jetonCourant!=null && CellulesJeu[5][6].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}  

public void viderGrille(){ // on réinitialise chacune des cellules à null pour l'attribut jeton de telle sorte à vider la grille
    for (int i=0; i<6; i++){ // ces deux boucles nous permettent de parcourir toute la grille
        for (int j=0; i<7; j++){
            CellulesJeu[i][j].jetonCourant=null;
        }
    }
}

public void afficherGrilleSurConsole(){ // on affiche la grille avec les d=différents éléments qui peuvent se trouver dans chaque cellule
    System.out.println("affichage grille");
    for (int i=5;i>=0;i--){
        for (int j=0;j<7;j++){
            
            if (celluleOccupee(i,j)==true){
                
                if (lireCouleurDuJeton(i,j)=="Rouge"){ // si la cellule est occupée par un jeton et que la couleur est rouge alors on affiche un rond rouge
                    System.out.print("\033[31m O  ");
                }
                else{ // sinon on affiche un jeton jaune
                    System.out.print("\033[33m O  ");
                }
            }
            else if(CellulesJeu[i][j].presenceTrouNoir()==true){ // on teste ensuite si il y a un trou noir da,s cette cellule, on affiche un rond violet
                System.out.print("\033[35m O  ");
            } 
            else if(CellulesJeu[i][j].presenceDesintegrateur()==true){ // on teste enfin si il y a un désintegrateur, seulement si il n y a pas de trou noir ou de jeton, et on affiche un rond vert.
                System.out.print("\033[32m O  ");
            }
            else{
                System.out.print("\033[37m O  ");
                }
            }   
        System.out.println("");   
    }// si il y a à la fois un trou noir et un désintegrateur sur la meme cellule on affiche seulement le trou noir car celui ci cache le desintegrateur
}


public boolean celluleOccupee(int nb1, int nb2){ // on teste la présence d'un jeton dans une certaine cellule de coordonnées nb1 et nb2
    if (CellulesJeu[nb1][nb2].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}

public String lireCouleurDuJeton(int num1, int num2){ // cette méthode retourne la couleur du jeton présent dans la cellule de coordonnées num1 num2
    
    return CellulesJeu[num1][num2].jetonCourant.Couleur;
}

public boolean etreGagnantePourJoueur(Joueur joueur){ // cette méthode nous permet de vérifier si la grille est gagnante en parcourant celle-ci et en considérant tous les cas ou 4 jetons d'une meme couleur pourraient être alignés
    
    int j;
    int i;
    for(i=0;i<6;i++){
    //for(j=0;j<3;j++){    
        for(j=0;j<4;j++){
        //for(i=0;i<6;i++){
            if (celluleOccupee(i,j)==true && celluleOccupee(i,j+1)==true && celluleOccupee(i,j+2)==true && celluleOccupee(i,j+3)==true){ // on teste sur une colonne
                if (CellulesJeu[i][j].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    for(j=0;j<3;j++){
        
        
        for(i=0;i<7;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i)==true && celluleOccupee(j+2,i)==true && celluleOccupee(j+3,i)==true){ // on teste sur une ligne
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        
        for(i=0;i<4;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i+1)==true && celluleOccupee(j+2,i+2)==true && celluleOccupee(j+3,i+3)==true){ // on teste en diagonale
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i+3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        
        for(i=6;i>3;i--){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i-1)==true && celluleOccupee(j+2,i-2)==true && celluleOccupee(j+3,i-3)==true){ // on teste sur l'autre diagonale
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i-1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i-2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i-3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    return false;
    
}

public void tasserGrille(int numC){ // cette méthode permet de tasser la grille si une cellule ne contient pas de jeton et que celles au dessus en contiennent. Le tassement esyt fait dans tous les cas mais n'a aucune conséquence quand il n'y a plus de jeton
    for(int i=0 ; i<6 ; i++){
        if (celluleOccupee(i ,numC)==false){
           for(int j=i ; j<5 ; j++){
               CellulesJeu[j][numC].jetonCourant=CellulesJeu[j+1][numC].jetonCourant;
           }
           CellulesJeu[5][numC].jetonCourant=null;
        }
    }
}

public boolean colonneRemplie(int col){ // on teste la dernière ligne d'une colonne pour savoir si elle est pleine
    if (CellulesJeu[5][col].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}

public boolean placerDesintegrateur(int lg, int cln){ // cette méthode permet de placer un désintegrateur sur la cellule de coordonnees lg cln si il n'y en a pas déjà un
    if(CellulesJeu[lg][cln].presenceDesintegrateur()==false){
        CellulesJeu[lg][cln].placerDesintegrateur();
        return true;
    }
    else{
        return false;
    }
}

public boolean placerTrouNoir(int lg, int cln){ // cette méthode permet de placer un trou noir sur la cellule de coordonnees lg cln si il n'y en a pas déjà un
    if(CellulesJeu[lg][cln].presenceTrouNoir()==false){
        CellulesJeu[lg][cln].placerTrouNoir();
        return true;
    }
    else{
        return false;
    }
}

public boolean supprimerJeton(int lg, int cln){ // on supprime le jeton présent dans une cellule de coordonnees lg cln, s'il y en a un. L'attribut jetonCourant de celle-ci redevient null
    if(celluleOccupee(lg,cln)==true){
        CellulesJeu[lg][cln].jetonCourant=null;
        return true;
    }
    else{
        return false;
    }
}

public Jeton recupererJeton(int lg, int cln){ // cette méthode nous permet de récupérer un jeton dans la cellule de coordonnées lg cln
     Jeton recupJetonVar = CellulesJeu[lg][cln].recupererJeton();
     CellulesJeu[lg][cln].jetonCourant=null;
     return recupJetonVar;
}

}


