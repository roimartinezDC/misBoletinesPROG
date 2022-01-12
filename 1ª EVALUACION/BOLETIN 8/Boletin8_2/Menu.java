package boletin8_2;
/**
 * @author Roi Martínez
 */
import java.util.Scanner;
public class Menu {
    public Menu() {
    }
    
    public void opciones() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seleccione la opción que desee: ");
        System.out.println("1. Cuadrado \n2. Triangulo \n3. Circulo");
        int num = sc.nextInt();
        
        switch (num) {
            case 1: 
                System.out.println("Introduzca el tamaño del lado :");
                double lado = sc.nextDouble();
                double area1 = lado*lado;
                System.out.println("Área = "+area1);
                break;
            case 2:
                System.out.println("Introduzca el tamaño de la base :");
                double base = sc.nextDouble();
                System.out.println("Introduzca el tamaño de la altura :");
                double altura = sc.nextDouble();
                double area2 = (base*altura)/2;
                System.out.println("Área = "+area2);
                break;
            case 3:
                final double PI = 3.14159;
                System.out.println("Introduzca el tamaño del radio :");
                double radio = sc.nextDouble();
                double area3 = PI * Math.pow(radio, 2);
                System.out.println("Área = "+area3);
                break;
            default: 
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
