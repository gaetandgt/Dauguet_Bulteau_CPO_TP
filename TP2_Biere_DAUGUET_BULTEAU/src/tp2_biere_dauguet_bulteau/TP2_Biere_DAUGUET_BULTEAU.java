/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_biere_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class TP2_Biere_DAUGUET_BULTEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0, "Dubuisson") ;


        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe") ;
        BouteilleBiere Biere1 = new BouteilleBiere("Pelforth", 5.8,"ChampRoux");
        BouteilleBiere Biere2 = new BouteilleBiere("Desperados", 6.6, "LosSantos");
        BouteilleBiere Biere3 = new BouteilleBiere("Corona", 5.4,"Mexico");
        uneBiere.lireEtiquette();
        uneBiere.Decapsuler();
        uneBiere.Decapsuler();
        uneBiere.toString();
        System.out.println(uneBiere.ouverte);
        System.out.println(uneBiere);
        //System.out.println(uneBiere.toString);
    }
    
    
}
