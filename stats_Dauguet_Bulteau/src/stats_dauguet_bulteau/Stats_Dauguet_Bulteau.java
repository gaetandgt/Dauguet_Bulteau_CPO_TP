/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_dauguet_bulteau;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class Stats_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Tab = new int[6];
        double [] Tabl = new double[6];
        Scanner sc;
        sc= new Scanner(System.in);
        int m = sc.nextInt();
        Random generateurAleat = new Random();
        int n; 
        for (int i=0; i<m; i++){
            n= generateurAleat.nextInt(6);
            Tab[n]=Tab[n]+1;

        }

        for (int j=0; j<6;j++){
            double var=Tab[j];
            Tabl[j]=(var/m)*100;
            System.out.print(Tabl[j]+"   ");
        }


    }
    
}
