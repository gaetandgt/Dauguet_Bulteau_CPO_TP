/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console;

/**
 *
 * @author gaeta
 */
public class Master_Grille {
    
    Master_Couleurs couleur;   
    Master_Cellules[][] CellulesJeu=new Master_Cellules[4][12]; // on définit cellulesjeu, le tableau de taille 4x12 cellules
   
    public Master_Grille (){ 
        for (int i=0; i<4; i++){ // on imbrique deux boucles for pour créer le tableau cellulesjeu
            for (int j=0; j<12; j++){
            CellulesJeu[i][j]=new Master_Cellules(); // il est composé de 4 lignes de 12 colonnes
            }
        }
    }
   
    public boolean ajouterJeton(int ligne,int colonne){ //on ajoute un jeton dans la cellule
        return "null".equals(CellulesJeu[ligne][colonne].lireCouleur()) ; // celui ci est vide (sans couleur) mais de type de string
    }
    
    public boolean celluleOccupee(int ligne, int colonne){ // on renvoie un booleen
        return CellulesJeu[ligne][colonne].Couleur!=null; // on prend en entrée les coordonnées de la cellule et on regarde si il y a déjà une couleur ou pas
    }

    public String lireCouleurC(int ligne, int colonne){
    return CellulesJeu[ligne][colonne].lireCouleur(); // on prend en entrée les coordonnées de la cellule et on renvoie la couleur de celle ci
    }
    
    public void afficherGrille(){ // on crée la fonction pour afficher la grille, de type void cette fonction ne renvoie rien
        for(int i=0; i<4; i++){ // on fait une boucle for allant de 0 à 3 pour les 4 lignes
            System.out.print("\n"+(i+1)+ " :"); // on indique le numéro de chaque ligne
            
            for(int j=0; j<12; j++){ // deuxième boucle allant de 0 à 11 pour les 12 colonnes de la grille
                if ("noir".equals(lireCouleurC(i,j))){
                        System.out.print("\033[30m N  "); // on teste sur chaque cellule de la grille si celle ci est définie par une couleur ou si elle est vide
                }
                else if ("rouge".equals(lireCouleurC(i,j))){
                        System.out.print("\033[31m Rg "); // on affiche en conséquent l'initiale ou les 2 premières lettres de la couleur sur la grille. Ces lettres sont affichées de la meme couleur
                }
                else if ("vert".equals(lireCouleurC(i,j))){
                        System.out.print("\033[32m V  "); // la couleur noir avec le numero 30 ne s affiche pas, il n'y a que 8 couleurs utilisables donc 2 cases s'affichent blanches sur ma grille finale
                }
                else if ("jaune".equals(lireCouleurC(i,j))){
                        System.out.print("\033[33m J  "); // on compare les string avec .equals
                }
                else if ("bleu".equals(lireCouleurC(i,j))){
                        System.out.print("\033[34m B  ");
                }
                else if ("violet".equals(lireCouleurC(i,j))){
                        System.out.print("\033[35m Vi ");
                }
                else if ("cyan".equals(lireCouleurC(i,j))){
                        System.out.print("\033[36m Cy ");
                }
                else if ("blanc".equals(lireCouleurC(i,j))){
                        System.out.print("\033[37m Bl ");
                }
                else if ("null".equals(lireCouleurC(i,j))){
                        System.out.print("\033[37m o  ");
                }
            } // la grille est réaffichée après chaque tour de jeu, mise à jour avec les choix du joueur
        }
    }
  
}

