package boletin2_3;
/**
 *
 * @author dam1
 */
import java.util.Scanner;
public class Boletin2_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Introduzca el nº de euros : ");
        double euros = scaner.nextDouble();
        System.out.println("Introduzca el valor del dólar : ");
        Double vDollar = scaner.nextDouble();
        double res = euros * vDollar;
        
        System.out.println(euros+"€ = "+res+"$");
        
    }
    
}
