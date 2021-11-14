/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class Grille {
    Cellule [][] CellulesJeu= new Cellule[6][7];
    
public Grille(){
    Cellule var=null;
    
    for (int i=0; i<7; i++){
        for (int j=0; j<6; j++){
            CellulesJeu[j][i]=var;
        }
    }
    // 
    //CellulesJeu=null;
}

public boolean ajouterJetonDansLaColonne(Jeton unJeton, int Colonne){
    
    int a=0;
    if (CellulesJeu[5][Colonne-1]!=null){
        return false;
    }
    else{
        while (CellulesJeu[a][Colonne-1]!=null){
            a++;
        }
        CellulesJeu[a][Colonne-1].jetonCourant=unJeton;
        return true;
    }
}
    
public boolean etreRemplie(){
    if (CellulesJeu[5][0]==null && CellulesJeu[5][1]!=null && CellulesJeu[5][2]!=null && CellulesJeu[5][3]!=null && CellulesJeu[5][4]!=null && CellulesJeu[5][5]!=null && CellulesJeu[5][6]==null){
        return true;
    }
    else{
        return false;
    }
}  

public void viderGrille(){
    CellulesJeu=null;
}

public void afficherGrilleSurConsole(){
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if (celluleOccupee(i, j)==true){
                    if (lireCouleurDuJeton(i, j)=="Rouge"){
                        System.out.print("\033[31m O  ");
                    }else{
                        System.out.print("\033[33m O  ");
                    }
                }else{
                    System.out.print("\033[37m O  ");
                }

            }
            System.out.println("");
        }

    }

public boolean celluleOccupee(int nb1, int nb2){
    if (CellulesJeu[nb1][nb2]!=null){
        return true;
    }
    else{
        return false;
    }
}

public String lireCouleurDuJeton(int num1, int num2){
    return CellulesJeu[num1-1][num2-1].jetonCourant.Couleur;
}

public boolean etreGagnantePourJoueur(Joueur joueur){
    int val=0;
    int j;
    int i;
    for(j=0;j<6;j++){
        if (val==1){
            break;
        }
        for(i=0;i<4;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j,i+1)==true && celluleOccupee(j,i+2)==true && celluleOccupee(j,i+3)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j][i+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j][i+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j][i+3].jetonCourant.Couleur==joueur.Couleur){
                    val=1;
                    break;
                }
            }
        }
    }
    for(j=0;j<3;j++){
        if (val==1){
            break;
        }
        for(i=0;i<4;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i)==true && celluleOccupee(j+2,i)==true && celluleOccupee(j+3,i)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i].jetonCourant.Couleur==joueur.Couleur){
                    val=1;
                    break;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        if (val==1){
            break;
        }
        for(i=0;i<4;i++){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i+1)==true && celluleOccupee(j+2,i+2)==true && celluleOccupee(j+3,i+3)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i+1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i+2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i+3].jetonCourant.Couleur==joueur.Couleur){
                    val=1;
                    break;
                }
            }
        }
    }
    
    for(j=0;j<3;j++){
        if (val==1){
            break;
        }
        for(i=6;i<3;i--){
            if (celluleOccupee(j,i)==true && celluleOccupee(j+1,i-1)==true && celluleOccupee(j+2,i-2)==true && celluleOccupee(j+3,i-3)==true){
                if (CellulesJeu[j][i].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+1][i-1].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+2][i-2].jetonCourant.Couleur==joueur.Couleur && CellulesJeu[j+3][i-3].jetonCourant.Couleur==joueur.Couleur){
                    val=1;
                    break;
                }
            }
        }
    }
    if (val==1){
        return true;
    }
    else{
        return false;
    }
}

public void tasserGrille(int num){
    
}

public boolean colonneRemplie(int col){
    
}

public boolean placerDesintegrateur(int lg, int cln){
    
}

public boolean placerTrouNoir(int lg, int cln){
    
}

public boolean supprimerJeton(int lg, int cln){
    
}

}

