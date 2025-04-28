package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunocmc
 */
public class ConversorTemperatura {
    
    public static double converter(double celsius) {
        return 1.8 * celsius + 32.0;
    }
        
    public static double converter2(double celsius) {
        return celsius + 273.15;
    }    
    
}
    

