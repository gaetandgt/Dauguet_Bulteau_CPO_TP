/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertisseur_dauguet_bulteau;

import java.util.Scanner;

/**
 *TP1
 *Bulteau
 *Dauguet
 */
public class Convertisseur_Dauguet_Bulteau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercice 2
        double Degrés;
        System.out.println("Saisissez une valeur");
        double valeur;
        Scanner sc;
        sc = new Scanner(System.in);
        valeur= sc.nextFloat();
        System.out.println("Tapez 1 pour une conversion de celsius vers kelvin ");
        System.out.println("Tapez 2 pour une conversion de celsius vers fahrenheit ");
        System.out.println("Tapez 3 pour une conversion de fahrenheit vers kelvin ");
        System.out.println("Tapez 4 pour une conversion de kelvin vers fahrenheit");
        System.out.println("Tapez 5 pour une conversion de kelvin vers celsius ");
        System.out.println("Tapez 6 pour une conversion de fahrenheit vers celsius");
        int conversion;
        conversion= sc.nextInt();
        while (conversion<1 || conversion>6){
            System.out.println("Erreur, veuillez retaper une nouvelle valeur");
            conversion= sc.nextInt();
        }
        if  (conversion==1){
            System.out.println(valeur+ " degrés Celcius valent "+ CelsuisVersKelvin ( valeur)+ " Kelvin" );
        }
        if (conversion==2){
            System.out.println(valeur+ " degrés Celcius valent "+ CelsuisVersFahrenheit ( valeur)+ " Fahrenheit" );
        }
        if (conversion==3){
            System.out.println(valeur+ " Fahrenheit valent "+ FahrenheitVersKelvin ( valeur)+ " Kelvin" );
        }
        if (conversion==4){
            System.out.println(valeur+ " degrés Kelvin valent "+ KelvinVersFahrenheit ( valeur)+ " Fahrenheit" );
        }
        if (conversion==5){
            System.out.println(valeur+ " degrés Kelvin valent "+ KelvinVersCelsius ( valeur)+ " degrés Celsius" );
        }
        if (conversion==6){
            System.out.println(valeur+ " Fahrenheit valent "+ FahrenheitVersCelsius ( valeur)+ " degrés Celsius" );
        }
    }
    public static double CelsuisVersKelvin ( double temp){
        double Kelvin= 273.15+ temp;
        return Kelvin;
    }
    public static double CelsuisVersFahrenheit ( double temp){
        double Fahrenheit= temp*(9.0/5)+32;
        return Fahrenheit;
    }
    public static double FahrenheitVersKelvin ( double temp){
        double Kelvin= 273.15+ ((temp-32)*(5.0/9));
        return Kelvin;
    }
    public static double KelvinVersFahrenheit ( double temp){
        double Far= (temp-273.15)*(9.0/5)+ 32;
        return Far;
    }
    public static double KelvinVersCelsius ( double temp){
        double Celsuis= temp-273.15;
        return Celsuis;
    }
    public static double FahrenheitVersCelsius ( double temp){
        double Celsius= (temp-32)*(5.0/9);
        return Celsius;
    }
    
}
