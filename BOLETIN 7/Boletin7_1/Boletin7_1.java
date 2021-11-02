package boletin7_1;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros num = new Numeros();
        
        System.out.println("Introduzca un número");
        double num1 = sc.nextDouble();
        num.positivo(num1);
    }
    
}
