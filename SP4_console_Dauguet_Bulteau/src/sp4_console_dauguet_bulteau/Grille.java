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
public class Grille {
    Cellule [][] CellulesJeu= new Cellule[6][7];
    
public Grille (){
    for (int i=0;i<6;i++){
        for (int j=0;j<7;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
}

public boolean ajouterJetonDansLaColonne(Jeton unJeton, int Colonne){
    
    int a=0;
    
    if (CellulesJeu[5][Colonne-1].jetonCourant!=null){
        return false;
    }
    else{
        while (CellulesJeu[a][Colonne-1].jetonCourant!=null){
            a++;
        }
        CellulesJeu[a][Colonne-1].jetonCourant=unJeton;
        return true;
    }
    
}
    
public boolean etreRemplie(){
    if (CellulesJeu[5][0].jetonCourant==null && CellulesJeu[5][1].jetonCourant!=null && CellulesJeu[5][2].jetonCourant!=null && CellulesJeu[5][3].jetonCourant!=null && CellulesJeu[5][4].jetonCourant!=null && CellulesJeu[5][5].jetonCourant!=null && CellulesJeu[5][6].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}  

public void viderGrille(){
    for (int i=0; i<6; i++){
        for (int j=0; i<7; j++){
            CellulesJeu[i][j].jetonCourant=null;
        }
    }
}

public void afficherGrilleSurConsole(){
    System.out.println("affichage grille");
    for (int i=5;i>=0;i--){
        for (int j=0;j<7;j++){
            
            if (celluleOccupee(i,j)==true){
                
                if (lireCouleurDuJeton(i,j)=="Rouge"){
                    System.out.print("\033[31m O  ");
                }
                else{
                    System.out.print("\033[33m O  ");
                }
            }
            else if(CellulesJeu[i][j].presenceTrouNoir()==true){
                System.out.print("\033[35m O  ");
            } 
            else if(CellulesJeu[i][j].presenceDesintegrateur()==true){
                System.out.print("\033[32m O  ");
            }
            else{
                System.out.print("\033[37m O  ");
                }
            }   
        System.out.println("");   
    }
}


public boolean celluleOccupee(int nb1, int nb2){
    if (CellulesJeu[nb1][nb2].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}

public String lireCouleurDuJeton(int num1, int num2){
    
    return CellulesJeu[num1][num2].jetonCourant.Couleur;// modification des -1 a revoir
}

public boolean etreGagnantePourJoueur(Joueur joueur){
    
    int j;
    int i;
    for(i=0;i<6;i++){
    //for(j=0;j<3;j++){    
        for(j=0;j<4;j++){
        //for(i=0;i<6;i++){
            if (celluleOccupee(i,j)==true && celluleOccupee(i,j+1)==true && celluleOccupee(i,j+2)==true && celluleOccupee(i,j+3)==true){
                if (CellulesJeu[i][j].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[i][j+3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    for(j=0;j<3;j++){
        
        
        for(i=0;i<7;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i)==true && celluleOccupee(j+2,i)==true && celluleOccupee(j+3,i)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        
        for(i=0;i<4;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i+1)==true && celluleOccupee(j+2,i+2)==true && celluleOccupee(j+3,i+3)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i+3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        
        for(i=6;i>3;i--){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i-1)==true && celluleOccupee(j+2,i-2)==true && celluleOccupee(j+3,i-3)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i-1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i-2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i-3].jetonCourant.Couleur==joueur.Couleur){
                    return true;
                }
            }
        }
    }
    
    return false;
    
}

public void tasserGrille(int numC){
    for(int i=0 ; i<6 ; i++){
        if (celluleOccupee(i ,numC)==false){
           for(int j=i ; j<5 ; j++){
               CellulesJeu[j][numC].jetonCourant=CellulesJeu[j+1][numC].jetonCourant;
           }
           CellulesJeu[5][numC].jetonCourant=null;
        }
    }
}

public boolean colonneRemplie(int col){
    if (CellulesJeu[5][col].jetonCourant!=null){
        return true;
    }
    else{
        return false;
    }
}

public boolean placerDesintegrateur(int lg, int cln){
    if(CellulesJeu[lg][cln].presenceDesintegrateur()==false){
        CellulesJeu[lg][cln].placerDesintegrateur();
        return true;
    }
    else{
        return false;
    }
}

public boolean placerTrouNoir(int lg, int cln){
    if(CellulesJeu[lg][cln].presenceTrouNoir()==false){
        CellulesJeu[lg][cln].placerTrouNoir();
        return true;
    }
    else{
        return false;
    }
}

public boolean supprimerJeton(int lg, int cln){
    if(celluleOccupee(lg,cln)==true){
        CellulesJeu[lg][cln].jetonCourant=null;
        return true;
    }
    else{
        return false;
    }
}

public Jeton recupererJeton(int lg, int cln){
     CellulesJeu[lg][cln].jetonCourant=null;
     return CellulesJeu[lg][cln].recupererJeton();
}

}


