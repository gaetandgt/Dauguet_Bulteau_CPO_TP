/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_dauguet_bulteau;

import java.util.Random;
import java.util.Scanner;

/**
 *TP1
 *Bulteau Etienne
 *Dauguet Gaetan
 */
public class GuessMyNumber_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        
        int n= generateurAleat.nextInt(100);
        
        
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Entrer un chiffre pour sélectionner le niveau de difficulté\n Taper 1 pour le niveau facile\n Taper 2 pour le niveau moyen (Vous avez un nombre de coup limité à 10)\n Taper 3 pour le niveau difficile (Vous avez un nombre de coup limité à 10 et l'intervalle est plus grand\n Taper 4 pour le niveau cauchemar, Attention ne soyez pas trop présomptueux");
        int mode;
        mode=sc.nextInt();
        while (mode<1 || mode>4){
            System.out.println("veuillez reselectionner le mode");
            
            mode = sc.nextInt();
        }
        int nombre;
        System.out.println("Entrez votre chiffre");
        nombre= sc.nextInt();
        if (mode==1){
            while(nombre!=n){
                if (nombre<n){
                    if (nombre+15<n){
                        System.out.println("Votre nombre est vraiment trop petit, essayez encore");
                    }
                    else{
                        System.out.println("Votre nombre est trop petit, essayez encore");
                    }
                }
                else{
                    if (nombre-15>n){
                        System.out.println("Votre nombre est vraiment trop grand, essayez encore");
                    }
                    else{
                        System.out.println("Votre nombre est trop grand, essayez encore"); 
                    }
                   
                }
                nombre= sc.nextInt();
            }
            System.out.println("Félicitations, vous avez gagné");
        }
        if (mode==2){
            int tour=0;
            while(nombre!=n && tour<10){
                tour++;
                if (nombre<n){
                    System.out.println("Votre nombre est trop petit, essayez encore");
                    nombre= sc.nextInt();
                }
                else{
                    System.out.println("Votre nombre est trop grand, essayez encore");
                    nombre= sc.nextInt();
                }
                
            }
            if (nombre==n){
                System.out.println("Félicitations, vous avez gagné");
            }
            else{
                System.out.println("Vous avez perdu, c'est dommage, essayez encore\n Votre nombre était"+ n);
            }
            
        }
        if (mode==3){
            n= generateurAleat.nextInt(300);
            int tour=0;
            while(nombre!=n && tour<10){
                tour++;
                if (nombre<n){
                    System.out.println("Votre nombre est trop petit, essayez encore");
                    nombre= sc.nextInt();
                }
                else{
                    System.out.println("Votre nombre est trop grand, essayez encore"); 
                    nombre= sc.nextInt();
                }
                
            }
            if (nombre==n){
                System.out.println("Félicitations, vous avez gagné");
            }
            else{
                System.out.println("Vous avez perdu, c'est dommage, essayez encore\n Votre nombre était"+ n);
            }
        }
        if (mode==4){
            n= generateurAleat.nextInt(300);
            int proba;
            
            int tour=0;
            while(nombre!=n && tour<10){
                tour++;
                proba= generateurAleat.nextInt(10);
                if (nombre<n){
                    if (proba<3){
                        System.out.println("Votre nombre est trop grand, essayez encore");
                        nombre= sc.nextInt();
                    }
                    else{
                        System.out.println("Votre nombre est trop petit, essayez encore");
                        nombre= sc.nextInt();
                    }
                    
                }
                else{
                    if (proba<4){
                        System.out.println("Votre nombre est trop petit, essayez encore"); 
                        nombre= sc.nextInt();
                    }
                    else{
                        System.out.println("Votre nombre est trop grand, essayez encore"); 
                        nombre= sc.nextInt();
                    }
                    
                }
                
            }
            if (nombre==n){
                System.out.println("Félicitations, vous avez gagné");
            }
            else{
                System.out.println("Vous avez perdu, vous avez peut être été trop présomptueux\nVotre nombre était"+n);
            }
        }
    }
    
}
