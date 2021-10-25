/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_dauguet_bulteau;

/**
 *
 * @author bulte
 */
public class TP2_relation_1_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne Reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        //bob.liste_voitures[1] = uneMicra ;
        //bob.nbVoitures = 2 ;
        //uneMicra.Proprietaire = bob ;
        //System.out.println("la deuxième voiture de Bob est " + bob.liste_voitures[1] ) ;
        
        Reno.liste_voitures[0] = uneAutreClio ;
        Reno.nbVoitures = 1 ;
        uneAutreClio.Proprietaire = Reno ;
        System.out.println("la premiere voiture de Reno est " + Reno.liste_voitures[0] ) ;
        Reno.liste_voitures[1] = une2008 ;
        Reno.nbVoitures = 2 ;
        une2008.Proprietaire = Reno ; 
        System.out.println("la deuxième voiture de Reno est " + Reno.liste_voitures[1] ) ;
        
        boolean retour;
        retour=Reno.ajouter_voiture(uneMicra);
        System.out.println(retour);
        
        System.out.println(Reno.liste_voitures[1]);
        
    }
    
}
