package boletin3_5;
/**
 * @author dam1
 */
import java.util.Scanner;
public class Boletin3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su sueldo fijo mensual:");
        double sFijo = sc.nextDouble();
        System.out.println("Introduzca su total de ventas del mes:");
        int tVentas = sc.nextInt();
        System.out.println("Introduzca los km recorridos en el mes:");
        double kmRecorridos = sc.nextDouble();
        System.out.println("Introduzca el nº de días los cuales se ha desplazado en el último mes:");
        int dDesplaz = sc.nextInt();
        
        double sBruto = sFijo;
        sBruto += tVentas*(5/100);
        sBruto += kmRecorridos*2;
        sBruto += dDesplaz*30;
        
        double sLiquido = sBruto-sBruto*0.18;
        sLiquido = sLiquido-36;
        
        System.out.println("Sueldo bruto: "+sBruto+"€\nSueldo líquido: "+sLiquido+"€");
        
    }
    
}
