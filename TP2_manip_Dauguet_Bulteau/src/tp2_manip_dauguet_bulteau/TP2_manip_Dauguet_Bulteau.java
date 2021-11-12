/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
public class TP2_manip_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        System.out.println("Nombre de calories dans la deuxième assiette"+assiette2.nbCalories);
        System.out.println("Nombre de calories dans la troisième assiette"+assiette3.nbCalories);

        int varTemp;
        varTemp = assiette1.nbCalories;
        assiette1.nbCalories= assiette2.nbCalories;
        assiette2.nbCalories=varTemp;
        System.out.println("Nombre de calories dans la première assiette"+assiette1.nbCalories);
        System.out.println("Nombre de calories dans la deuxième assiette"+assiette2.nbCalories);

        Moussaka Tableau[] = new Moussaka [10];

        for (int i=0; i< Tableau.length; i++){
            Tableau[i] = new Moussaka(100*i);
        }

    }  
}
