/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mastermind_console;

/**
 *
 * @author bulte
 */
public class Mastermind_console {

    /**
     * @param args the command line arguments
     */
    /*
    Nous n'avons pu faire qu'un seul commit car gaetan a eu des problèmes en utilisant github
    et il n'a pas réussi a renvoyer le programme il m'a donc envoyé ce qu'il avait fais pour 
    que je puisse déposer l'algorithme sur github
    Il existe aussi une version graphique moins aboutit de ce programme
    */
    
    public static void main(String[] args) {
        
        System.out.println("Début de la partie"); // on affiche un message pour indiquer le début de la partie
        Master_Partie partie=new Master_Partie(); // on crée une nouvelle partie
        partie.initialiserPartie(); // on fait appelle à la fct initialiserPartie pour mettre en place la partie
        partie.debuterPartie();  // on commance la partie
    }  
}

