
package boletin3_4;
/**
 * @author dam1
 */
import java.util.Scanner;
public class Boletin3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de euros :");
        double eur = sc.nextDouble();
        int euros = (int) Math.floor(eur);
        
        int b100 = (int) Math.floor(euros/100);
        euros = euros-b100*100;
        int b20 = (int) Math.floor(euros/20);
        euros = euros-b20*20;
        int b5 = (int) Math.floor(euros/5);
        int m1 = euros-b5*5;
        
        System.out.println("Billetes de 100: "+b100+"\nBilletes de 20: "+b20+"\nBilletes de 5: "+b5+"\nMonedas de 1: "+m1);
    }
    
}
