/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author bulte
 */
public class CelluleGraphique {
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
    
    
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleAssociee = uneCellule ;
    }
    public void paintComponent (Graphics G){
        super.paintComponent(G);
    }
    void addActionListener(ActionListener actionListener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
