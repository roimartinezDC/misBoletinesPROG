package boletin3_3;
/**
 * @author dam1
 */
import java.util.Scanner;
public class Boletin3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nº de billetes de 100€ :");
        int b100 = sc.nextInt();
        System.out.println("Introduzca el nº de billetes de 20€ :");
        int b20 = sc.nextInt();
        System.out.println("Introduzca el nº de billetes de 5€ :");
        int b5 = sc.nextInt();
        System.out.println("Introduzca el nº de monedas de 1€ :");
        int m1 = sc.nextInt();
        
        int total = (b100*100)+(b20*20)+(b5*5)+(m1);
        
        System.out.println("La cantidad total es de : "+total+" €");
    }
    
}
