/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
class Convertisseur {
int nbConversions;

public Convertisseur(){
    nbConversions=0;
}

public double CelsiusVersKelvin(double tempCel){
    nbConversions++;
    double tempKel=tempCel+273;
    return tempKel;
}

public double CelsiusVersFarenheit(double tempCel){
    nbConversions++;
    double tempFar=(tempCel)*(9.0/5)+32;
    return tempFar;
}

public double KelvinVersCelsius(double tempKel){
    nbConversions++;
    double tempCel=tempKel-273;
    return tempCel;
}

public double KelvinVersFarenheit(double tempKel){
    nbConversions++;
    double tempFar=(tempKel-273)*(9.0*5)+32;
    return tempFar;
}

public double FarenheitVersCelsius(double tempFar){
    nbConversions++;
    double tempCel=(tempFar-32)*(5.0/9);
    return tempCel;
}

public double FarenheitVersKelvin(double tempFar){
    nbConversions++;
    double tempKel=(tempFar-32)*(5.0/9)+273;
    return tempKel;
}

@Override
public String toString(){
    return "Le nombre de conversions est :"+ nbConversions;
}
}
