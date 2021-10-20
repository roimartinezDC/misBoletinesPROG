package boletin6_2;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el meridiano: ");
        double meridiano = sc.nextDouble();
        System.out.println("Introduzca el paralelo: ");
        double paralelo = sc.nextDouble();
        System.out.println("Introduzca la distancia de la tierra: ");
        double distancia = sc.nextDouble();
        
        Satelite satelite = new Satelite(meridiano, paralelo, distancia);
        satelite.verPosicion();
    }
    
}
