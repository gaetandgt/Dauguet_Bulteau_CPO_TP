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
    
public Grille (){
    for (int i=0;i<6;i++){
        for (int j=0;j<7;j++){
            CellulesJeu[i][j]=new Cellule();
        }
    }
}

public boolean ajouterJetonDansLaColonne(Jeton unJeton, int Colonne){
    
    int a=0;
    System.out.println("scqf");
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
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                if (celluleOccupee(i, j)==false){
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

public boolean colonneRemplie(int cln){
    
}

public boolean placerDesintegrateur(int lg, int cln){
    if(CellulesJeu[lg][cln].presenceDesintegrateurs()){
        CellulesJeu[lg][cln].placerDesintegrateur();
        return true;
    }
    else{
        return false;
    }
}

public boolean placerTrouNoir(int lg, int cln){
    if(CellulesJeu[lg][cln].presenceTrouNoir()){
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

