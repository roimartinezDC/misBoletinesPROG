package boletin7_5;
/**
 * @author Roi Martínez
 */
import javax.swing.JOptionPane;
public class Boletin7_5 {
    public static void main(String[] args) {
        Numeros n = new Numeros();
        
        double num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el 1 número:"));
        double num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el 2 número:"));
        double num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el 3 número:"));
        
        n.mayor(num1, num2, num3);
        
    }
    
}
