package boletin7_4;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce los datos de la persona nº1\nNombre:");
        String nom1 = sc.next();
        System.out.println("Peso:");
        double peso1 = sc.nextDouble();
        System.out.println("\nIntroduce los datos de la persona nº2\nNombre:");
        String nom2 = sc.next();
        System.out.println("Peso:\n");
        double peso2 = sc.nextDouble();
        
        Persona operar = new Persona();
        Persona pers1 = new Persona(nom1, peso1);
        Persona pers2 = new Persona(nom2, peso2);
        
        operar.pesos(pers1, pers2);
        
    }
    
}
