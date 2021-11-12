/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_dauguet_bulteau;

/**
 *
 * @author gaeta
 */
public class Moussaka{
    public int nbCalories;

    public Moussaka (int cal){
        nbCalories=cal;
    }
    @Override
    public String toString(){
        return"Le nombre de calories est" + nbCalories;
    }
}
