package controle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunocmc
 */
public class ConversorControle {
    
    public static String converter(String tempcelsius) {
            double tempfahr = modelo.ConversorTemperatura.converter(Double.parseDouble(tempcelsius));
            return Double.toString(tempfahr);
    }
     
    public static String converter2(String tempcelsius) {
            double tempkelvin = modelo.ConversorTemperatura.converter(Double.parseDouble(tempcelsius));
            return Double.toString(tempkelvin);
    }
    
   
    
}
