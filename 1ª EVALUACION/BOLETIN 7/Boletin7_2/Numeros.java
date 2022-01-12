package boletin7_2;
/**
 * @author Roi Martínez
 */
import javax.swing.JOptionPane;
public class Numeros {
    public Numeros() {
    }
    
    public void operar(short num1, short num2) {
        float suma = num1+num2;
        JOptionPane.showMessageDialog(null, num1+"+"+num2+"="+suma);
        float resta;
        if(num1>=num2) {
            resta = num1-num2;
            JOptionPane.showMessageDialog(null, num1+"-"+num2+"="+resta);
        }
    }
}
