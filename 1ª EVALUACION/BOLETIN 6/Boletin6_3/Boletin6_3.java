package boletin6_3;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia: ");
        double radio = sc.nextDouble();
        
        Circulo circulo = new Circulo(radio);
        System.out.println("Área : "+circulo.calcularArea());
        System.out.println("Perímetro : "+circulo.calcularLonxitude());
    }
    
}
