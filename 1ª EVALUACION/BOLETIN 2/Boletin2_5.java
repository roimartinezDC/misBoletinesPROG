package boletin2_5;
/**
 * @author dam1
 */
import java.util.Scanner;
public class Boletin2_5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        final int EQUIV = 1852;

        mostrar("Introduzca el nº de millas :");
        double millas = escaner.nextDouble();
        
        double metros = millas*EQUIV;
        
        mostrar(millas+" millas = "+metros+" m");
        
    }
     public static void mostrar(String str) {
        System.out.println(str);
    }
}