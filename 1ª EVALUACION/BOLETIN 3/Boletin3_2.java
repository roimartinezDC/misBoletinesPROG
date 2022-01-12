package boletin3_2;
/**
 *
 * @author dam1
 */
import java.util.Scanner;
public class Boletin3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nº de grados Cº :");
        double cent = sc.nextDouble();
        double fhar = cent*(9/5)+32;
        double kel = cent+273.15;
        System.out.println(cent+" Cº : \n"+fhar+" Fº \n"+kel+" Kº");
    }
}
