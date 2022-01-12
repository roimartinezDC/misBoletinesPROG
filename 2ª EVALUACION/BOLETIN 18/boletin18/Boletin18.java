package boletin18;

/**
 * @author Roi Martínez
 */

public class Boletin18 {
    public static void main(String[] args) throws Exception {
        ConversorTemperaturas obj = new ConversorTemperaturas();
        try {
            obj.centAFharenheit();
        } catch (TemperaturaErradaExcepcion ex){
            System.out.println("Error 1: "+ex.toString());
        }
         try {
            obj.centAReamur();
        } catch (TemperaturaErradaExcepcion ex){
            System.out.println("Error 1: "+ex.toString());
        }
    }
    
}
