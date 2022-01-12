package boletin7_5;
/**
 * @author Roi Martínez
 */
import javax.swing.JOptionPane;
public class Numeros {
    
    public Numeros() {
    }
    
    public void mayor(double num1, double num2, double num3) {
        if(num1>num2&&num1>num3) {
            JOptionPane.showMessageDialog(null, "El mayor es: "+num1);
        }else if(num2>num3) {
            JOptionPane.showMessageDialog(null, "El mayor es: "+num2);
        }else {
            JOptionPane.showMessageDialog(null, "El mayor es: "+num3);
        }
    }
}
