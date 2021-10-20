package boletin6_1;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique cuanto quiere que acelere el coche: ");
        int acel = sc.nextInt();
        System.out.println("Indique cuanto quiere que frene el coche: ");
        int fren = sc.nextInt();
        
        Coche coche = new Coche();
        coche.acelerar(acel);
        coche.frenar(fren);
        
        System.out.println("Velocidad: "+coche.getVelocidade());
        
    }
}
