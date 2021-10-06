package boletin3_1;
/**
 * @author dam1
 */
import java.util.Scanner;
public class Boletin3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la tarifa del producto :");
        double tarifa = sc.nextDouble();
        System.out.println("Introduzca el precio pagado : ");
        double pPagado = sc.nextDouble();
        
        double descuento = 100-(pPagado/tarifa*100);
        
        System.out.println("Descuento del : "+descuento+"%");
    }
    
}
