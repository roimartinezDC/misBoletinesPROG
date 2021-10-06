
package boletin2_4;
/**
 *
 * @author dam1
 */
import java.util.Scanner;
public class Boletin2_4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        mostrar("Introduzca el 1er número :");
        double num1 = escaner.nextDouble();
        mostrar("Introduzca el 2º número :");
        double num2 = escaner.nextDouble();
        
        double suma = num1+num2;
        double resta = num1-num2;
        double producto = num1*num2;
        double cociente = num1/num2;
        
        mostrar("Suma : "+suma+"\nResta : "+resta+"\nProducto : "+producto+"\nCociente : "+cociente);
        
    }
    public static void mostrar(String str) {
        System.out.println(str);
    }
    
}