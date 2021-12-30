/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_dauguet_bulteau;

import javax.swing.ImageIcon;

/**
 *
 * @author bulte
 */
public class Fenetre_de_Jeu extends javax.swing.JFrame {
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu = new Grille();

    
        
        
    /**
     * Creates new form Fenetre_de_Jeu
     */
    int j=0;
    public Fenetre_de_Jeu() {
        initComponents();
        Panneau_grille.setVisible(true);
        jButton_Argent.setIcon(img_Argent);
        String []test= new String[4];
        CelluleGraphique cellGraph = new CelluleGraphique(grillejeu.CellulesJeu[i][j]);
        cellGraph.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            Cellule c = cellGraph.celluleAssociee;
            if (j!=4){
                test[j]=Boule;
                j++;
            }
            if (j==4){
                j=0;
                
            }
            
            

        }
        });
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panneau_grille = new javax.swing.JPanel();
        jButton_Vert = new javax.swing.JButton();
        jButton_Dore = new javax.swing.JButton();
        jButton_Bleu = new javax.swing.JButton();
        jButton_Violet = new javax.swing.JButton();
        jButton_Rouge = new javax.swing.JButton();
        jButton_Jaune = new javax.swing.JButton();
        jButton_Blanc = new javax.swing.JButton();
        jButton_Argent = new javax.swing.JButton();
        Panneau_verification = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panneau_grille.setForeground(new java.awt.Color(111, 111, 151));
        Panneau_grille.setToolTipText("");
        Panneau_grille.setPreferredSize(new java.awt.Dimension(900, 300));

        javax.swing.GroupLayout Panneau_grilleLayout = new javax.swing.GroupLayout(Panneau_grille);
        Panneau_grille.setLayout(Panneau_grilleLayout);
        Panneau_grilleLayout.setHorizontalGroup(
            Panneau_grilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Panneau_grilleLayout.setVerticalGroup(
            Panneau_grilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 900, 300));

        jButton_Vert.setText("jButton1");
        jButton_Vert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VertActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Vert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, 120));

        jButton_Dore.setText("jButton1");
        jButton_Dore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DoreActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Dore, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 120));

        jButton_Bleu.setText("jButton1");
        jButton_Bleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BleuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Bleu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 120));

        jButton_Violet.setText("jButton1");
        jButton_Violet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VioletActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Violet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, 120));

        jButton_Rouge.setText("jButton1");
        jButton_Rouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RougeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Rouge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 120));

        jButton_Jaune.setText("jButton1");
        jButton_Jaune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JauneActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Jaune, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 120));

        jButton_Blanc.setText("jButton1");
        jButton_Blanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BlancActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Blanc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 120));

        jButton_Argent.setText("jButton1");
        jButton_Argent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ArgentActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Argent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 120, 120));

        Panneau_verification.setForeground(new java.awt.Color(111, 111, 151));
        Panneau_verification.setToolTipText("");

        javax.swing.GroupLayout Panneau_verificationLayout = new javax.swing.GroupLayout(Panneau_verification);
        Panneau_verification.setLayout(Panneau_verificationLayout);
        Panneau_verificationLayout.setHorizontalGroup(
            Panneau_verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Panneau_verificationLayout.setVerticalGroup(
            Panneau_verificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(Panneau_verification, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 900, 70));

        setBounds(0, 0, 1243, 636);
    }// </editor-fold>//GEN-END:initComponents
    int i=0;
    String Boule;
    ImageIcon img_Argent = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleargent.png"));
    ImageIcon img_Blanche = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleblanche.png"));
    ImageIcon img_Bleu = new javax.swing.ImageIcon(getClass().getResource("Images/Boulebleu.png"));
    ImageIcon img_Dore = new javax.swing.ImageIcon(getClass().getResource("Images/Bouledore.png"));
    ImageIcon img_Jaune = new javax.swing.ImageIcon(getClass().getResource("Images/Boulejaune.png"));
    ImageIcon img_Rouge = new javax.swing.ImageIcon(getClass().getResource("Images/Boulerouge.png"));
    ImageIcon img_Verte = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleverte.png"));
    ImageIcon img_Violette = new javax.swing.ImageIcon(getClass().getResource("Images/Bouleviolette.png"));
    
    private void jButton_RougeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RougeActionPerformed
        // TODO add your handling code here:
        
        
        Boule="Rouge";
        i=i+1;
    }//GEN-LAST:event_jButton_RougeActionPerformed

    private void jButton_VertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VertActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Vert";
    }//GEN-LAST:event_jButton_VertActionPerformed

    private void jButton_DoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DoreActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Dore";
    }//GEN-LAST:event_jButton_DoreActionPerformed

    private void jButton_BleuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BleuActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Bleu";
    }//GEN-LAST:event_jButton_BleuActionPerformed

    private void jButton_JauneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JauneActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Jaune";
    }//GEN-LAST:event_jButton_JauneActionPerformed

    private void jButton_BlancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BlancActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Blanche";
    }//GEN-LAST:event_jButton_BlancActionPerformed

    private void jButton_VioletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VioletActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Violet";
    }//GEN-LAST:event_jButton_VioletActionPerformed

    private void jButton_ArgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ArgentActionPerformed
        // TODO add your handling code here:
        i++;
        Boule="Argent";
    }//GEN-LAST:event_jButton_ArgentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_Jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_Jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_Jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_Jeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Fenetre_de_Jeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panneau_grille;
    private javax.swing.JPanel Panneau_verification;
    private javax.swing.JButton jButton_Argent;
    private javax.swing.JButton jButton_Blanc;
    private javax.swing.JButton jButton_Bleu;
    private javax.swing.JButton jButton_Dore;
    private javax.swing.JButton jButton_Jaune;
    private javax.swing.JButton jButton_Rouge;
    private javax.swing.JButton jButton_Vert;
    private javax.swing.JButton jButton_Violet;
    // End of variables declaration//GEN-END:variables

    private void setIcon(ImageIcon img_Argent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

