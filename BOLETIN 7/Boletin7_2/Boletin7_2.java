package boletin7_2;
/**
 *
 * @author Roi Martínez
 */
import javax.swing.JOptionPane;
public class Boletin7_2 {
    public static void main(String[] args) {
        Numeros num = new Numeros();
        
        short num1 = Short.parseShort(JOptionPane.showInputDialog("Introduzca un número :")); 
        short num2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca otro número :"));
        num.operar(num1, num2);
    }
}
