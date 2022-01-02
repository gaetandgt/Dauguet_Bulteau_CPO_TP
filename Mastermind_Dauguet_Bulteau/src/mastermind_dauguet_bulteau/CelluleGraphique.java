/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author bulte
 */

public class CelluleGraphique extends JButton{
    Cellule celluleAssociee;
    //ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/Image/celluleVide.png")) ;
    ImageIcon img_Argent = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleargent.png"));
    ImageIcon img_Blanche = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleblanche.png"));
    ImageIcon img_Bleu = new javax.swing.ImageIcon(getClass().getResource("Images/Boulebleu.png"));
    ImageIcon img_Dore = new javax.swing.ImageIcon(getClass().getResource("Images/Bouledore.png"));
    ImageIcon img_Jaune = new javax.swing.ImageIcon(getClass().getResource("Images/Boulejaune.png"));
    ImageIcon img_Rouge = new javax.swing.ImageIcon(getClass().getResource("Images/Boulerouge.png"));
    ImageIcon img_Verte = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleverte.png"));
    ImageIcon img_Violette = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleviolette.png"));
    
    ImageIcon img_Argent75 = new javax.swing.ImageIcon(getClass().getResource("Images/Argent.png"));
    ImageIcon img_Blanche75 = new javax.swing.ImageIcon(getClass().getResource("Images/Blanc.png"));
    ImageIcon img_Bleu75 = new javax.swing.ImageIcon(getClass().getResource("Images/Bleu.png"));
    ImageIcon img_Dore75 = new javax.swing.ImageIcon(getClass().getResource("Images/Dore.png"));
    ImageIcon img_Jaune75 = new javax.swing.ImageIcon(getClass().getResource("Images/Jaune.png"));
    ImageIcon img_Rouge75 = new javax.swing.ImageIcon(getClass().getResource("Images/Rouge.png"));
    ImageIcon img_Verte75 = new javax.swing.ImageIcon(getClass().getResource("Images/Vert.png"));
    ImageIcon img_Violette75 = new javax.swing.ImageIcon(getClass().getResource("Images/Violet.png"));
    ImageIcon img_Vide = new javax.swing.ImageIcon(getClass().getResource("Images/carre.png"));
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule ;
    }
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        //if (celluleAssocie.couleur)
        //si on met toutes les images on utilises celluleAssocie pour eemplir les cases
        if (celluleAssociee.lireCouleur()=="Dore"){
            setIcon(img_Dore75);
        }
        else if (celluleAssociee.lireCouleur()=="Argent"){
            setIcon(img_Argent75);
        }
        else if (celluleAssociee.lireCouleur()=="Jaune"){
            setIcon(img_Jaune75);
        }
        else if (celluleAssociee.lireCouleur()=="Rouge"){
            setIcon(img_Rouge75);
        }
        else if (celluleAssociee.lireCouleur()=="Bleu"){
            setIcon(img_Bleu75);
        }
        else if (celluleAssociee.lireCouleur()=="Vert"){
            setIcon(img_Verte75);
        }
        else if (celluleAssociee.lireCouleur()=="Violet"){
            setIcon(img_Violette75);
        }
        else if (celluleAssociee.lireCouleur()=="Blanc"){
            setIcon(img_Blanche75);
        }
        else{
            setIcon(img_Vide);
        }
    }
    
    
}
