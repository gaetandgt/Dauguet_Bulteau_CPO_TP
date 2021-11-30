/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_dauguet_bulteau;

import java.util.Random;

/**
 *
 * @author bulte
 */
public class FenetreDeJeu extends javax.swing.JFrame {

    /**
     * Creates new form FenetreDeJeu
     */
    Joueur[] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grillejeu = new Grille();

    public FenetreDeJeu() {
        initComponents();
        grillejeu.afficherGrilleSurConsole();
        panneau_infos_joueur.setVisible(false);
        panneau_info_partie.setVisible(false);
        // cela permet de cacher les différents panneaux avant que la partie ne démarre
        //On ne peut utiliser que le panneau sur lequel on entre les noms des joueurs
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grillejeu.CellulesJeu[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            //Il ne se passe rien si le cellule ne contient rien
                            return;
                        }

                        if (c.jetonCourant.Couleur.equals(joueurCourant.Couleur)) {
                            //.Couleur permet de regarder la couleur associé au jeton
                            // On vérifie si le pion sur lequel appartient au joueur courant
                            message.setText("le joueur " + joueurCourant.Nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            //On récupère le jeton du joueur
                            c.supprimerJeton();
                            // On enlève le jeton de la grille
                            joueursuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                message.setText("le joueur " + joueurCourant.Nom + " désintégre un jeton");
                                //  Ce message s'affiche dans le panneau message
                                c.supprimerJeton();
                                joueurCourant.nombreDesintegrateurs--;
                                //Lorsqu'un désintegrateur et utilisé on en retire 1 au nombreDesintegrateurs possédé par le joueur courant
                                joueursuivant();
                            } else {
                                return;
                            }

                        }
                        for (int tasse = 0; tasse < 7; tasse++) {
                            grillejeu.tasserGrille(tasse);
                            // On tasse toutes les colonnes de la grille

                        }
                        if (grillejeu.colonneRemplie(0) != true) {
                            btn_col_0.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(1) != true) {
                            btn_col_1.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(2) != true) {
                            btn_col_2.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(3) != true) {
                            btn_col_3.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(4) != true) {
                            btn_col_4.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(5) != true) {
                            btn_col_5.setEnabled(true);
                        }
                        if (grillejeu.colonneRemplie(6) != true) {
                            btn_col_6.setEnabled(true);
                        }
                        
                        // ces lignes permettent de réactiver les boutons en haut des colonnes dans le cas ou la colonne n'est plus rempli
                        
                        panneau_grille.repaint();// cette ligne réactualise la grille
                        lbl_J1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
                        lbl_J2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");
                        
                        panneau_grille.repaint();
                        boolean vict_j1 = grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]);
                        boolean vict_j2 = grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]);
                        // On vérifie à l'aide de la fonction etreGagnantePourJoueur() sil'un des joueurs a gagné
                        if (vict_j1 && !vict_j2) {
                            message.setText("Victoire de " + ListeJoueurs[0].Nom);
                            // On affiche dans la console message le nom du joueur qui a gagné
                        }
                        if (vict_j2 && !vict_j1) {
                            message.setText("Victoire de " + ListeJoueurs[1].Nom);
                            // On affiche dans la console message le nom du joueur qui a gagné 
                        }
                        if (vict_j1 && vict_j2) {
                            if (joueurCourant == ListeJoueurs[0]) {
                                message.setText("Victoire de " + ListeJoueurs[0].Nom);
                            } else {
                                message.setText("Victoire de " + ListeJoueurs[1].Nom);
                            }
                            //ici on vérifie que le joueur courant n'ai pas gagné en même temps que le joueur passif
                            // Dans le cas contraire c'est le joueur passif qui est déclaré comme gagnant
                        }
                        // On rajoute .Nom pour bien afficher le nom du joueur gagnant en string et non pas sous forme de Joueur ce qui est différent des noms entrés par les joueurs

                    }
                });

                panneau_grille.add(cellGraph);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur1 = new javax.swing.JTextField();
        nom_joueur2 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_5 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();
        panneau_infos_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_J1_desint = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_J1_nom = new javax.swing.JLabel();
        lbl_J1_couleur = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lbl_J2_desint = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_J2_nom = new javax.swing.JLabel();
        lbl_J2_couleur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 2:");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Nom joueur 1:");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        panneau_creation_partie.add(nom_joueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 100, -1));
        panneau_creation_partie.add(nom_joueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 100, -1));

        btn_start.setText("Démarrer Partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 210, 140));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Info jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        lbl_jcourant.setText("nomJoueur");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel12.setText("joueur courant:");
        panneau_info_partie.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 80));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 200, 150));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 25, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 25, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 25, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 25, -1, -1));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 25, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 25, -1, -1));

        panneau_infos_joueur.setBackground(new java.awt.Color(204, 255, 204));
        panneau_infos_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Info joueurs");
        panneau_infos_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jLabel4.setText("Desintegrateurs:");
        panneau_infos_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lbl_J1_desint.setText("nbdesintjoueur1");
        panneau_infos_joueur.add(lbl_J1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel6.setText("Couleur:");
        panneau_infos_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setText("Joueur 1:");
        panneau_infos_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lbl_J1_nom.setText("nomjoueur1:");
        panneau_infos_joueur.add(lbl_J1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lbl_J1_couleur.setText("couleurjoueur1");
        panneau_infos_joueur.add(lbl_J1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        panneau_infos_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));

        jLabel5.setText("Desintegrateurs:");
        panneau_infos_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lbl_J2_desint.setText("nbdesintjoueur2");
        panneau_infos_joueur.add(lbl_J2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel8.setText("Couleur:");
        panneau_infos_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel9.setText("Joueur 2:");
        panneau_infos_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lbl_J2_nom.setText("nomjoueur2:");
        panneau_infos_joueur.add(lbl_J2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        lbl_J2_couleur.setText("couleurjoueur2");
        panneau_infos_joueur.add(lbl_J2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        getContentPane().add(panneau_infos_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 210, 250));

        setBounds(0, 0, 1018, 681);
    }// </editor-fold>//GEN-END:initComponents
    //lorsque l'on clique sur un bouton, le code associé se réalise
    // Sur les lignes çi-dessous on peut retrouver différents exemples
    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        if (grillejeu.colonneRemplie(0) == true) {
            btn_col_0.setEnabled(false);
            //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_infos_joueur.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
        //Une fois que nous avons cliqué sur le bouton Start, il n'est plus cliquable et les autres boutons apparaissent
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        if (grillejeu.colonneRemplie(1) == true) {
            btn_col_1.setEnabled(false);
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(2);
        if (grillejeu.colonneRemplie(2) == true) {
            btn_col_2.setEnabled(false);
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        if (grillejeu.colonneRemplie(3) == true) {
            btn_col_3.setEnabled(false);
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(4);
        if (grillejeu.colonneRemplie(4) == true) {
            btn_col_4.setEnabled(false);
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(5);
        if (grillejeu.colonneRemplie(5) == true) {
            btn_col_5.setEnabled(false);
        }
        
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(6);
        if (grillejeu.colonneRemplie(6) == true) {
            btn_col_6.setEnabled(false);
        }
        joueursuivant();
        //On change de joueur une fois qu'il a joué
        //Si la colonne se retrouve remplie alors le bouton en haut est désactivé
    }//GEN-LAST:event_btn_col_6ActionPerformed

    int i = 0;
    int j = 0;
    int test = 0;

    public boolean jouerDansColonne(int indice_colonne) {
        Jeton Jet;
        
        if (joueurCourant.Couleur == "Rouge") {
            Jet = joueurCourant.ListeJetons[i];
            i++;
        } else {
            Jet = joueurCourant.ListeJetons[j];
            j++;
        }
        //On note dans un tableau le nb de pions de couleurs utilisés

        if (grillejeu.colonneRemplie(indice_colonne) != false) {
            System.out.println(indice_colonne);
            return false;
            //Si la colonne choisi est remplie alors on ne peut pas y jouer
        }
        grillejeu.ajouterJetonDansLaColonne(Jet, indice_colonne + 1);
        // Le +1 provient de l'ancienne version console ou le joueur entrait une valeur de colonne entre 1 et 7
        //ici le bouton renvoit une valeur entre 0 et 6 soit une différence de 1
        for (int x = 0; x < 6; x++) {
            // Au cours de cette partie on supprime le trou noir si il y en a un et on récupère le désintegrateur s'il était caché
            if (grillejeu.CellulesJeu[x][indice_colonne].presenceDesintegrateurs() && grillejeu.celluleOccupee(x, indice_colonne)) {
                grillejeu.CellulesJeu[x][indice_colonne].recupererDesintegrateur();
                joueurCourant.nombreDesintegrateurs++;
                //Si le joueur récupère un désintégrateur alors il a son nmbre de désintégrateur + 1
                System.out.println(joueurCourant.Nom);
                System.out.println(joueurCourant.nombreDesintegrateurs);
                // test utilisé pour vérifier le bon fonctionnement de l'algrithme
                
            }
            if (grillejeu.CellulesJeu[x][indice_colonne].presenceTrouNoir() && grillejeu.celluleOccupee(x, indice_colonne)) {
                grillejeu.CellulesJeu[x][indice_colonne].activerTrouNoir();
                //On active le trou noir ce qui supprime le pion joué dans la case et supprimme le trou noir
            }
            
        }
        for (int y = 0; y < 6; y++) {
            if (grillejeu.CellulesJeu[y][indice_colonne].presenceDesintegrateurs() && grillejeu.celluleOccupee(y, indice_colonne)) {
                grillejeu.CellulesJeu[y][indice_colonne].recupererDesintegrateur();
                // Dans le cas ou on retrouve un intégrateurs, le joueur courant le récupère
                joueurCourant.nombreDesintegrateurs++;
                System.out.println(joueurCourant.Nom);
                System.out.println(joueurCourant.nombreDesintegrateurs);
            }
        }

        panneau_grille.repaint();
        // On réctualise la grille
        lbl_J1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
        lbl_J2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");
        // Le .nombreDesintegrateurs permet de donner le nombre de désintegrateurs associé au joueur
        // On convertie le int en string grace au +""
        panneau_grille.repaint();
        boolean vict_j1 = grillejeu.etreGagnantePourJoueur(ListeJoueurs[0]);
        boolean vict_j2 = grillejeu.etreGagnantePourJoueur(ListeJoueurs[1]);
        if (vict_j1 && !vict_j2) {
            message.setText("Victoire de " + ListeJoueurs[0].Nom);
            // On affiche dans la console message le nom du joueur qui a gagné
        }
        if (vict_j2 && !vict_j1) {
            message.setText("Victoire de " + ListeJoueurs[1].Nom);
            // On affiche dans la console message le nom du joueur qui a gagné
        }
        if (vict_j1 && vict_j2) {
            if (joueurCourant == ListeJoueurs[1]) {
                message.setText("Victoire de " + ListeJoueurs[1].Nom);
            } else {
                message.setText("Victoire de " + ListeJoueurs[0].Nom);
                //ici on vérifie que le joueur courant n'ai pas gagné en même temps que le joueur passif
                // Dans le cas contraire c'est le joueur passif qui est déclaré comme gagnant
                        
            }
         
        }
        return true;
        // On rajoute .Nom pour bien afficher le nom du joueur gagnant en string et non pas sous forme de Joueur ce qui est différent des noms entrés par les joueurs
    }

    public void joueursuivant() {
        if (joueurCourant == ListeJoueurs[0]) {// on vérifie l'égalité
            joueurCourant = ListeJoueurs[1];
        } else {
            joueurCourant = ListeJoueurs[0];
        }
        lbl_jcourant.setText(joueurCourant.Nom);
        // Ici on change de joueur courant, on utilise cette fonction a chaque fin de tour
    }

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
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
                //Ici on affiche la fenetre de jeu globale
            }
        });
    }

    public void initialiserPartie() {
        String nomJoueur1 = nom_joueur1.getText();// permet de récupérer le nom tapé dans la cellule
        Joueur J1 = new Joueur(nomJoueur1);// On associe le nom du jouer dans la variable de type joueur
        String nomJoueur2 = nom_joueur2.getText();
        Joueur J2 = new Joueur(nomJoueur2);

        Random sort = new Random();
        int Joue;
        Joue = sort.nextInt(2);
        // On tire un int au hasard entre 1 et 2 pour attribuer le 1er à jouer au hasard
        if (Joue == 1) {
            ListeJoueurs[0] = J1;
            ListeJoueurs[1] = J2;
        } else {
            ListeJoueurs[0] = J2;
            ListeJoueurs[1] = J1;
        }
        joueurCourant = ListeJoueurs[0];
        attribuerCouleursAuxJoueurs();
        // On attribue une couleur au hasard aux joueurs
        lbl_J1_nom.setText(ListeJoueurs[0].Nom);
        lbl_J2_nom.setText(ListeJoueurs[1].Nom);
        lbl_J1_couleur.setText(ListeJoueurs[0].Couleur);
        lbl_J2_couleur.setText(ListeJoueurs[1].Couleur);
        lbl_J1_desint.setText(ListeJoueurs[0].nombreDesintegrateurs + "");
        lbl_J2_desint.setText(ListeJoueurs[1].nombreDesintegrateurs + "");//les guillemets sont là pour donner un string
        lbl_jcourant.setText(joueurCourant.Nom);
        //On utilise .setText pour afficher les informations dans les panneaux associés
        int compteur = 0;
        //on initialise la variable compteur pour créer les 5 trous noirs
        while (compteur < 5) {
            Random Aleat = new Random();
            int lg = Aleat.nextInt(6);// Tirage aléatoire entre 1 et 6
            int cln = Aleat.nextInt(7);// Tirage aléatoire entre 1 et 7
            if (grillejeu.CellulesJeu[lg][cln].presenceTrouNoir() == false) {
                grillejeu.placerTrouNoir(lg, cln);
                //On place le trou noir à des coordonnées aux hasard
                compteur = compteur + 1;
            }
            // Une fois les 5 trous noir placé on sort automatiquement de la boucle
        }

        int compteur2 = 0;
        while (compteur2 < 2) {
            Random Aleat = new Random();
            int lg = Aleat.nextInt(6);// Tirage aléatoire entre 1 et 6
            int cln = Aleat.nextInt(7);// Tirage aléatoire entre 1 et 7
            // On vérifie la présence trou noirs et de désintegrateurs
            if (grillejeu.CellulesJeu[lg][cln].presenceDesintegrateurs() == false && grillejeu.CellulesJeu[lg][cln].presenceTrouNoir() == true) {
                grillejeu.placerDesintegrateur(lg, cln);
                compteur2 = compteur2 + 1;
            }
            //Ici on place 2 désintegrateurs dans des zones ou on trouve des désintegrateurs 
        }

        int compteur3 = 0;
        while (compteur3 < 3) {
            Random Aleat = new Random();
            int lg = Aleat.nextInt(6);// Tirage aléatoire entre 1 et 6
            int cln = Aleat.nextInt(7);// Tirage aléatoire entre 1 et 7
            // On vérifie la présence trou noirs et de désintegrateurs
            if (grillejeu.CellulesJeu[lg][cln].presenceDesintegrateurs() == false && grillejeu.CellulesJeu[lg][cln].presenceTrouNoir() == false) {
                grillejeu.placerDesintegrateur(lg, cln);
                compteur3 = compteur3 + 1;
            }
            //On va placer les 3 derniers désintegrateurs dans des zonnes sans desintegrateurs ni trous noir
        }
        //ici on affiche les différentes informations sur les joueurs dans les cases correspondant au label appelé ex: lbl_J1_desint
        for (int i = 0; i < 21; i++) {
            Jeton Jeton1 = new Jeton("Rouge");
            Jeton Jeton2 = new Jeton("Jaune");
            // Ici on créer les 21 jetons pour chaque joueurs
            if (ListeJoueurs[0].Couleur == "Rouge") {
                ListeJoueurs[0].ListeJetons[i] = Jeton1;
                ListeJoueurs[1].ListeJetons[i] = Jeton2;
            } else {
                ListeJoueurs[1].ListeJetons[i] = Jeton1;
                ListeJoueurs[0].ListeJetons[i] = Jeton2;
            }
        }

    }

    public void attribuerCouleursAuxJoueurs() {
        int var;
        Random Aleat = new Random();
        var = Aleat.nextInt(2);// Tirage aléatoire entre 1 et 2
        // On attribue les couleurs au hasard pour les joueurs
        if (var == 1) {
            ListeJoueurs[0].Couleur = "Rouge";
            ListeJoueurs[1].Couleur = "Jaune";
        } else {
            ListeJoueurs[1].Couleur = "Rouge";
            ListeJoueurs[0].Couleur = "Jaune";
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_J1_couleur;
    private javax.swing.JLabel lbl_J1_desint;
    private javax.swing.JLabel lbl_J1_nom;
    private javax.swing.JLabel lbl_J2_couleur;
    private javax.swing.JLabel lbl_J2_desint;
    private javax.swing.JLabel lbl_J2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur1;
    private javax.swing.JTextField nom_joueur2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_partie;
    private javax.swing.JPanel panneau_infos_joueur;
    // End of variables declaration//GEN-END:variables
}
