/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dauguet_bulteau;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class TP2_convertisseurObjet_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conversion1=new Convertisseur();
        Convertisseur conversion2=new Convertisseur();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Tapez la conversion à réaliser :\n1-De celsius vers kelvin\n2-De celsius vers farenheit\n3-De kelvin vers celsius\n4-De kelvin vers farenheit\n5-De farenheit vers celsius\n6-De farenheit vers kelvin");
        double operation=sc.nextInt();
        System.out.println("Tapez une température à convertir");
        double temp=sc.nextFloat();
        double tempRes;
    
        if(operation==1){ 
        tempRes=conversion1.CelsiusVersKelvin(temp);
        System.out.println(temp+"degrés Celsius valent "+tempRes+"degrés Kelvin");
        }
        
        if(operation==2){ 
        tempRes=conversion1.CelsiusVersFarenheit(temp);
        System.out.println(temp+"degrés Celsius valent "+tempRes+"degrés Farenheit");
        }
        
        if(operation==3){ 
        tempRes=conversion1.KelvinVersCelsius(temp);
        System.out.println(temp+"degrés Kelvin valent "+tempRes+"degrés Celsius");
        }
        
        if(operation==4){ 
        tempRes=conversion2.KelvinVersFarenheit(temp);
        System.out.println(temp+"degrés Kelvin valent "+tempRes+"degrés Farenheit");
        }
        
        if(operation==5){ 
        tempRes=conversion2.FarenheitVersCelsius(temp);
        System.out.println(temp+"degrés Farenheit valent "+tempRes+"degrés Celsius");
        }
        
        if(operation==6){ 
        tempRes=conversion2.FarenheitVersKelvin(temp);
        System.out.println(temp+"degrés Farenheit valent "+tempRes+"degrés Kelvin");
        }
        
        System.out.println(conversion1);
        System.out.println(conversion2);
}
    
}
