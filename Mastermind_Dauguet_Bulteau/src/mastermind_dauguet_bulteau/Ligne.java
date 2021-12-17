/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
public class Ligne {
    
    public int CouleurCode (String []code, String []CodeYoko) {
        int Nbcommun=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                if (code[j]==CodeYoko[i]){
                    Nbcommun++;//tester si c'est fonctionnel si il y a plusieurs pion de la même couleur dans le code
                }
            }
        }
        return Nbcommun;
    }
    
    public int[] Placepareil (String []code, String []CodeYoko,int Nbcommun) {
        int[] Commun=new int [2];
        int Place=0;
        for (int i=0; i<4; i++){

            if (code[i]==CodeYoko[i]){
                Nbcommun--;
                Place++;
            }
            
        }
        Commun[0]=Nbcommun;
        Commun[1]=Place;
        return Commun;
    }
}
