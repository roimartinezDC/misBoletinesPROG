package boletin5;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Consumo coche1 = new Consumo();
        coche1.setLitros(50);
        coche1.setPgas(1.57);
        
        System.out.println("Introduzca los km recorridos: ");
        float km = sc.nextFloat();
        System.out.println("Introduzca los litros consumidos: ");
        float litros = sc.nextFloat();
        System.out.println("Introduzca la velocidad media: ");
        float vMed = sc.nextFloat();
        System.out.println("Introduzca el precio del carburante: ");
        double pGal = sc.nextFloat();
        
        Consumo coche2 = new Consumo(km, litros, vMed, pGal);
        
        System.out.println("Consumo medio de litros cada 100km del coche2: "+ coche2.consumoMedio());
        
        coche2.setLitros(85.6f);
        System.out.println("Velocidad media del coche2: "+coche2.getVmed());
        
        
    }
    
}
