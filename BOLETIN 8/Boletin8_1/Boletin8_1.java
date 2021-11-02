package boletin8_1;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Boletin8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del artículo :");
        String nombre = sc.next();
        System.out.println("Introduzca el nº de ventas anuales del artículo :");
        int ventas = sc.nextInt();
        
        Articulo articulo = new Articulo(nombre, ventas);
        
        articulo.tipo();
    }
    
}
