/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_dauguet_bulteau;

import java.util.Scanner;

/**
 *TP1
 *Dauguet
 *Bulteau
 */
public class ManipNombresInt_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercice 1
        
        int nb1;
        int nb2;
        
        Scanner sc;
        sc = new Scanner(System.in);
        nb1 = sc.nextInt();
        nb2 = sc.nextInt();
        System.out.println("addition : "+(nb1+ nb2));
        System.out.println("soustraction : "+(nb1-nb2));
        System.out.println("produit : "+(nb1*nb2));
        System.out.println("quotient : "+(nb1/nb2)+"        reste : "+(nb1%nb2));
    }
    
}
