package boletin7_3;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numeros n = new Numeros();
        
        System.out.println("Introduzca un número");
        double num = sc.nextDouble();
        
        n.simbolos(num);
    }
    
}
