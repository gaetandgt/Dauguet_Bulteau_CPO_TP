/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_dauguet_bulteau;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author bulte
 */


public class CelluleGraphique extends JButton{
    Cellule celluleAssociee;
    
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Image/celluleVide.png")) ;
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/Image/jetonJaune.png")) ;
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/Image/desintegrateur.png")) ;
    ImageIcon img_jetonRouge = new javax.swing.ImageIcon(getClass().getResource("/Image/jetonRouge.png")) ;
    ImageIcon img_trouNoir = new javax.swing.ImageIcon(getClass().getResource("/Image/trouNoir.png")) ;
    //On utilise ces lignes pour associer des images à des variables 
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule ;
    }

    @Override
    
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (celluleAssociee.presenceTrouNoir()){
            setIcon(img_trouNoir);//affiche un trou noir dans les cellules où on en a de présent
        }
        else if (celluleAssociee.presenceDesintegrateurs()){
            setIcon(img_desint);//affiche desintégrateur dans les cellules où on en a de présent
        }
        else{
            String couleur_jeton =celluleAssociee.lireCouleurDuJeton();
            //.lireCouleurDuJeton() permet de lire la couleur du jeton associé a une cellule du puissance 4, on aura null, Rouge  ou Jaune
            switch (couleur_jeton){
                case "vide":
                    setIcon (img_vide);//on affiche les images des cellules vides dans toutes les cellules dans ce cas
                    break;
                case "Rouge":
                    setIcon (img_jetonRouge);//on affiche les images de Jetons rouge dans toutes les cellules dans ce cas
                    break;
                case "Jaune":
                    setIcon (img_jetonJaune);//on affiche les images de Jetons Jaune dans toutes les cellules dans ce cas
                    break;
            }
        }
         //on affiche les images des cellules vides dans toutes les cellules
    }
}

