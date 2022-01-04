/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_console;


import java.util.Random; // imports necessaires à l'utilisation de génération aléatoire et de recuperation de saisie utilisateur
import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class Master_Partie{ // on va définir la classe partie
    
    Master_Couleurs couleurM=new Master_Couleurs(0);
    String[] combinaison=new String [4];
    Scanner sc=new Scanner(System.in);
    Master_Grille grille;

   
    public void initialiserPartie(){ // on crée la fonction initialiser partie
       
        grille=new Master_Grille(); // on crée une nouvelle grille de type master_grille, comme définie dans la classe grille
        Random rdc=new Random();
        
        for (int i=0 ;i<4 ;i++){ // for allant de 0 à 3
            
            int NBcol;
            NBcol=rdc.nextInt(7); // l 'entier prend une valeur aléatoire entre 0 et 7
            combinaison[i]=couleurM.TabCouleurs[NBcol]; // la combinaison secrète est faite en tirant aléatoirement une couleur 4 fois 
            //System.out.println(couleurM.TabCouleurs[NBcol]);
        }
      

    }
    public void debuterPartie(){ // on crée la fct débuter partie
        String[] couleurJoueur=new String[4];
        for (int i=0; i<12 ; i++){ // on  va faire cette boucle 12 fois pour les 12 coups du joueur
            
            int bonneCoul=0; // on initialise à 0 le compteur comptant les bonnes couleurs mais mal placées
            int bienPlace=0; // on initialise à 0 le compteur comptant les bonnes couleurs bien placées
            
            String couleur1; // On crée 4 string qui prendront ensuite les couleurs qu' a choisies le joueur
            String couleur2;
            String couleur3;
            String couleur4;
            
            System.out.println("Les couleurs disponibles sont : noir, rouge, vert, jaune, bleu, violet, cyan et blanc "); // on indique au joueur les couleurs disponibles
            //System.out.println();
            System.out.println("Ecrivez la premiere couleur"); // on demande au joueur d 'ecrire la premiere couleur
            couleur1=sc.next(); // on recupere la saisie utilisateur
            while (!"noir".equals(couleur1) && !"rouge".equals(couleur1) && !"vert".equals(couleur1) && !"jaune".equals(couleur1) && !"bleu".equals(couleur1) && !"violet".equals(couleur1) && !"cyan".equals(couleur1) && !"blanc".equals(couleur1)){
                couleur1=sc.next(); // on verifie qu'il ait bien entré seulement une couleur disponible et l'ait écrit de la bonne manière.
            } // on a la boucle while pour revérifier tant que la saisie n'est pas correcte
            couleurJoueur[0]=couleur1; // on attribue enfin la couleur du joueur à couleur1
            
            System.out.println("Ecrivez la seconde couleur");
            couleur2=sc.next();
            while (!"noir".equals(couleur2) && !"rouge".equals(couleur2) && !"vert".equals(couleur2) && !"jaune".equals(couleur2) && !"bleu".equals(couleur2) && !"violet".equals(couleur2) && !"cyan".equals(couleur2) && !"blanc".equals(couleur2)){
                couleur2=sc.next();
            }
            couleurJoueur[1]=couleur2; // même procédé pour la deuxième couleur
            
            System.out.println("Ecrivez la troisieme couleur");
            couleur3=sc.next();
            while (!"noir".equals(couleur3) && !"rouge".equals(couleur3) && !"vert".equals(couleur3) && !"jaune".equals(couleur3) && !"bleu".equals(couleur3) && !"violet".equals(couleur3) && !"cyan".equals(couleur3) && !"blanc".equals(couleur3)){
                couleur3=sc.next();
            }

            couleurJoueur[2]=couleur3; // même procédé pour la troisième couleur
            
            System.out.println("Ecrivez la quatrieme couleur");
            couleur4=sc.next();
            while (!"noir".equals(couleur4) && !"rouge".equals(couleur4) && !"vert".equals(couleur4) && !"jaune".equals(couleur4) && !"bleu".equals(couleur4) && !"violet".equals(couleur4) && !"cyan".equals(couleur4) && !"blanc".equals(couleur4)){
                couleur4=sc.next();
            }
            couleurJoueur[3]=couleur4; // même procédé pour la quatrième couleur
           
           
            int couleurDonnée=0;

            for (int compteur=0; compteur<4; compteur++){ // on va attribuer les couleurs à chacune des cellules de la colonne
                
                couleurDonnée=couleurM.CouleurVersChiffre(couleurJoueur[compteur]); // couleurDonnée prend la valeur de la couleur choisie dans le tableau des couleurs

                if (grille.ajouterJeton(compteur, i)==true){ // on vérifie aux coordonnées compteur, i que la case est bien disponible
                    grille.CellulesJeu[compteur][i].JetonCourant=couleurM.TabCouleurs[couleurDonnée]; // on ajoute enfin la couleur dans la grille
                   
                }
            }
            grille.afficherGrille(); // on affiche la grille actualisée
           
            for (int j=0; j<4; j++){ // on va tester chaque cellule pour savoir si elle correspond ou pas à la combinaison secrète
                
                if (grille.CellulesJeu[j][i].JetonCourant.equals(combinaison[j])){ // si la couleur est identique, aux mêmes positions dans la grille et dans la combinaison secrète
                            bienPlace=bienPlace+1; // la variable bienPlace prend alors +1
                }
                
                else{
                    for (int k=0; k<4; k++){ // sinon on test les autres cellules de la combinaison pour savoir si il n'y a pas de couleurs identiques mais pas à la même position
                        if (grille.CellulesJeu[j][i].JetonCourant.equals(combinaison[k])){
                            bonneCoul=bonneCoul+1; // si c'est le cas on augmente le compteur bonneCoul
                            break;
                        }    
                    }
                }
            }
            
            
            
            if (bienPlace==4){ // si 4 couleurs sont bien placées alors la partie est gagnée
                System.out.println("\n"+"Vous avez trouvé la combinaison, bravo"); // on l'annonce à l'utilisateur
                break;
            }
            
            System.out.println("\n"+bonneCoul + " bonne couleur, mal placé"); // on indique à la fin de chaque tour les variables bonneCoul et bienPlace au joueur
            System.out.println(bienPlace + " bien placé");

        }
    }
}
